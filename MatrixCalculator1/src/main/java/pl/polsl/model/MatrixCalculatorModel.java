package pl.polsl.model;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import java.util.ArrayList;
import java.util.List;
import pl.polsl.view.ViewClass;
import java.util.stream.IntStream;

/**
 * The MatrixCalculatorModel class provides functionalities for performing matrix operations
 * such as addition, subtraction, and multiplication. It supports two matrices and uses 
 * Lombok to reduce boilerplate code.
 * 
 * @author Mikołaj Mach
 * @version 1.1
 */
@Getter
@Setter
@NoArgsConstructor
public class MatrixCalculatorModel {

    /** The first matrix used in calculations. */
    private List<List<Integer>> matrix1;
    
    /** The second matrix used in calculations. */
    private List<List<Integer>> matrix2;

    /**
     * Adds two matrices (matrix1 and matrix2) element-wise.
     *
     * @return a new matrix representing the element-wise addition of matrix1 and matrix2.
     * @throws MatrixOperationException if the matrices are not set or if their dimensions do not match.
     */
public List<List<Integer>> addMatrices() throws MatrixOperationException {
    if (matrix1 == null || matrix2 == null) {
        throw new MatrixOperationException("Matrices are not set.");
    }

    int rows = matrix1.size();
    int cols = matrix1.get(0).size();

    if (matrix2.size() != rows || matrix2.get(0).size() != cols) {
        throw new MatrixOperationException("Matrices must have the same dimensions for addition.");
    }

    return IntStream.range(0, rows)
            .mapToObj(i -> 
                IntStream.range(0, cols)
                         .map(j -> matrix1.get(i).get(j) + matrix2.get(i).get(j))
                         .boxed()
                         .toList() 
            )
            .toList();
}


    /**
     * Subtracts matrix2 from matrix1 element-wise using a stream operation.
     *
     * @return a new matrix representing the element-wise subtraction of matrix2 from matrix1.
     * @throws MatrixOperationException if the matrices do not have the same dimensions.
     */
public List<List<Integer>> subtractMatrices() throws MatrixOperationException {
    if (matrix1 == null || matrix2 == null) {
        throw new MatrixOperationException("Matrices are not set.");
    }

    if (matrix1.isEmpty() || matrix2.isEmpty()) {
        throw new MatrixOperationException("Matrices cannot be empty.");
    }

    if (matrix1.size() != matrix2.size()) {
        throw new MatrixOperationException("Matrices must have the same number of rows.");
    }

    for (int i = 0; i < matrix1.size(); i++) {
        if (matrix1.get(i).size() != matrix2.get(i).size()) {
            throw new MatrixOperationException("Matrices must have the same number of columns in row " + (i + 1) + " for subtraction.");
        }
    }

    return IntStream.range(0, matrix1.size())
            .mapToObj(i -> IntStream.range(0, matrix1.get(i).size())
                    .mapToObj(j -> matrix1.get(i).get(j) - matrix2.get(i).get(j))
                    .toList()
            )
            .toList();
}


    /**
     * Multiplies two matrices (matrix1 and matrix2) following matrix multiplication rules.
     *
     * @param matrix1 the first matrix record to multiply.
     * @param matrix2 the second matrix record to multiply.
     * @return a MatrixRecord representing the result of the matrix multiplication.
     * @throws MatrixOperationException if the number of columns in matrix1 does not match the number of rows in matrix2.
     */
public MatrixRecord multiplyMatrices(MatrixRecord matrix1, MatrixRecord matrix2) throws MatrixOperationException {
    if (matrix1.columns() != matrix2.rows()) {
        throw new MatrixOperationException("Matrix multiplication is not possible. The number of columns in Matrix 1 must equal the number of rows in Matrix 2.");
    }
    List<List<Integer>> result = new ArrayList<>();
    for (List<Integer> row : matrix1.data()) {
        List<Integer> resultRow = new ArrayList<>();
        for (int j = 0; j < matrix2.columns(); j++) {
            int sum = 0;
            for (int k = 0; k < matrix1.columns(); k++) {
                sum += row.get(k) * matrix2.get(k, j);
            }
            resultRow.add(sum);
        }
        result.add(resultRow);
    }
    return new MatrixRecord(result, matrix1.rows(), matrix2.columns());
}
    /**
     * Method to set matrixes
     * @param matrix1 matrix1 parameters
     * @param matrix2 matrix2 parameters
     */
    public void setMatrices(List<List<Integer>> matrix1, List<List<Integer>> matrix2) {
    this.matrix1 = matrix1;
    this.matrix2 = matrix2;
}

        /**
     * Console method for performing addition.
     * Reads matrices from console and adds them.
     *
     * @return the result of the matrix addition
     */
public List<List<Integer>> addMatricesFromConsole() {
    /**
     * view Class call
     */
    ViewClass view = new ViewClass();

    matrix1 = view.readMatrix(1); 
    matrix2 = view.readMatrix(2);

    try {
        return addMatrices();
    } catch (MatrixOperationException e) {
        view.showError(e.getMessage());
        return null;
    }
}

    /**
     * Console method for performing subtraction.
     * Reads matrices from console and subtracts them.
     *
     * @return the result of the matrix subtraction
     */
    public List<List<Integer>> subtractMatricesFromConsole() {
     /**
     * view Class call
     */
        ViewClass view = new ViewClass();
        matrix1 = view.readMatrix(1);
        matrix2 = view.readMatrix(2);

        try {
            return subtractMatrices();
        } catch (MatrixOperationException e) {
            view.showError(e.getMessage());
            return null;
        }
    }

    /**
     * Console method for performing multiplication.
     * Reads matrices from console and multiplies them.
     *
     * @return the result of the matrix multiplication
     */
    public MatrixRecord multiplyMatricesFromConsole() {
     /**
     * view Class call
     */
        ViewClass view = new ViewClass();
        matrix1 = view.readMatrix(1);
        matrix2 = view.readMatrix(2);

        try {
            return multiplyMatrices(new MatrixRecord(matrix1, matrix1.size(), matrix1.get(0).size()), new MatrixRecord(matrix2, matrix2.size(), matrix2.get(0).size()));
        } catch (MatrixOperationException e) {
            view.showError(e.getMessage());
            return null;
        }
    }
    
}
