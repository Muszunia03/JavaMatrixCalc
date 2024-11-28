package pl.polsl.model;

import java.util.List;

/**
 * Record representing a matrix.
 * Stores matrix data and its dimensions.
 * 
 * @version 1.1
 * @param data the data from list
 * @param rows rows
 * @param columns columns
 * @author MIKOLAJ MACH
 */
public record MatrixRecord(List<List<Integer>> data, int rows, int columns) {

    /**
     * Retrieves the element at a specific row and column.
     * 
     * @param row The row index.
     * @param col The column index.
     * @return The value at the specified position.
     */
    public Integer get(int row, int col) {
        return data.get(row).get(col);
    }
}
