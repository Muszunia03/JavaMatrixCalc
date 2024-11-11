package pl.polsl.model;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MatrixCalculatorModel {

    private List<List<Integer>> matrix1;
    private List<List<Integer>> matrix2;

public List<List<Integer>> addMatrices() throws MatrixOperationException {
    if (matrix1 == null || matrix2 == null) {
        throw new MatrixOperationException("Matrices are not set.");
    }

    if (matrix1.size() != matrix2.size() || matrix1.get(0).size() != matrix2.get(0).size()) {
        throw new MatrixOperationException("Matrices must have the same dimensions for addition.");
    }

    List<List<Integer>> result = new ArrayList<>();
    for (List<Integer> row1 : matrix1) {
        List<Integer> row2 = matrix2.get(matrix1.indexOf(row1));
        List<Integer> resultRow = new ArrayList<>();
        for (int j = 0; j < row1.size(); j++) {
            resultRow.add(row1.get(j) + row2.get(j));
        }
        result.add(resultRow);
    }
    return result;
}


public List<List<Integer>> subtractMatrices() throws MatrixOperationException {
    return performOperation((m1, m2) -> {
        if (m1.size() != m2.size() || m1.get(0).size() != m2.get(0).size()) {
            throw new MatrixOperationException("Matrices must have the same dimensions for subtraction.");
        }

        return m1.stream()
                .map(row1 -> {
                    int rowIndex = m1.indexOf(row1);
                    List<Integer> row2 = m2.get(rowIndex);
                    return row1.stream()
                            .map(value1 -> value1 - row2.get(row1.indexOf(value1)))
                            .toList();
                })
                .toList();
    });
}


    public List<List<Integer>> multiplyMatrices() throws MatrixOperationException {
        return performOperation((m1, m2) -> {
            int rows1 = m1.size();
            int cols1 = m1.get(0).size();
            int rows2 = m2.size();
            int cols2 = m2.get(0).size();
            if (cols1 != rows2) {
                throw new MatrixOperationException("Matrix multiplication is not possible. The number of columns in Matrix 1 must equal the number of rows in Matrix 2.");
            }
            List<List<Integer>> result = new ArrayList<>();
            for (int i = 0; i < rows1; i++) {
                List<Integer> resultRow = new ArrayList<>();
                for (int j = 0; j < cols2; j++) {
                    int sum = 0;
                    for (int k = 0; k < cols1; k++) {
                        sum += m1.get(i).get(k) * m2.get(k).get(j);
                    }
                    resultRow.add(sum);
                }
                result.add(resultRow);
            }
            return result;
        });
    }

    public List<List<Integer>> performOperation(MatrixOperation operation) throws MatrixOperationException {
        if (matrix1 == null || matrix2 == null) {
            throw new MatrixOperationException("Matrices are not set.");
        }
        return operation.apply(matrix1, matrix2);
    }
}
