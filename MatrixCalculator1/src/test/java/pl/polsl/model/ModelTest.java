package pl.polsl.model;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Model Testing Test Class for MatrixCalculatorModel.
 * This class contains unit tests to validate the functionality of 
 * matrix addition, subtraction, and multiplication in the model.
 * 
 * @version 1.2
 * @author MIKOLAJ
 */
class ModelTest {

    /**
     * Matrix calculator constructor 
     */
    private MatrixCalculatorModel model;

    /**
     * Set up operations before running all tests in this class.
     */
    @BeforeAll
    public static void setUpClass() {
        System.out.println("Starting tests for MatrixCalculatorModel...");
    }

    /**
     * Tear down operations after running all tests in this class.
     */
    @AfterAll
    public static void tearDownClass() {
        System.out.println("All tests for MatrixCalculatorModel finished.");
    }

    /**
     * Set up the model before each test.
     */
    @BeforeEach
    public void setUp() {
        model = new MatrixCalculatorModel();
    }

    /**
     * Clean up the model after each test.
     */
    @AfterEach
    public void tearDown() {
        model = null;
    }

    /**
     * Parameterized test for correct addition of matrices.
     *
     * @param matrix1  the first matrix
     * @param matrix2  the second matrix
     * @param expected the expected result of matrix addition
     * @throws MatrixOperationException if matrix sizes are incompatible
     */
    @ParameterizedTest
    @MethodSource("provideMatricesForAddition")
    void testAddMatrices(List<List<Integer>> matrix1, List<List<Integer>> matrix2, List<List<Integer>> expected) throws MatrixOperationException {
        model.setMatrices(matrix1, matrix2);
        List<List<Integer>> result = model.addMatrices();
        assertEquals(expected, result, "Addition of matrices is incorrect.");
    }

    /**
     * Provides matrices for testing correct addition.
     *
     * @return a 2D array of test matrices and expected results
     */
    private static Object[][] provideMatricesForAddition() {
        return new Object[][]{
                {
                        Arrays.asList(Collections.singletonList(1)),
                        Arrays.asList(Collections.singletonList(2)),
                        Arrays.asList(Collections.singletonList(3))
                },
                {
                        Arrays.asList(
                                Arrays.asList(1, 2),
                                Arrays.asList(3, 4)
                        ),
                        Arrays.asList(
                                Arrays.asList(5, 6),
                                Arrays.asList(7, 8)
                        ),
                        Arrays.asList(
                                Arrays.asList(6, 8),
                                Arrays.asList(10, 12)
                        )
                },
                {
                        Arrays.asList(
                                Arrays.asList(1, 2, 3),
                                Arrays.asList(4, 5, 6),
                                Arrays.asList(7, 8, 9)
                        ),
                        Arrays.asList(
                                Arrays.asList(9, 8, 7),
                                Arrays.asList(6, 5, 4),
                                Arrays.asList(3, 2, 1)
                        ),
                        Arrays.asList(
                                Arrays.asList(10, 10, 10),
                                Arrays.asList(10, 10, 10),
                                Arrays.asList(10, 10, 10)
                        )
                }
        };
    }

    /**
     * Parameterized test for matrix addition with incompatible sizes.
     *
     * @param matrix1 the first matrix
     * @param matrix2 the second matrix
     */
    @ParameterizedTest
    @MethodSource("provideIncompatibleMatricesForAddition")
    void testAddMatricesWithIncompatibleSizes(List<List<Integer>> matrix1, List<List<Integer>> matrix2) {
        model.setMatrices(matrix1, matrix2);
        assertThrows(MatrixOperationException.class, model::addMatrices, "Expected MatrixOperationException for incompatible matrix sizes.");
    }

    /**
     * Provides matrices for testing addition with incompatible sizes.
     *
     * @return a 2D array of test matrices
     */
    private static Object[][] provideIncompatibleMatricesForAddition() {
        return new Object[][]{
                {
                        Arrays.asList(Collections.singletonList(1)),
                        Arrays.asList(Collections.singletonList(1), Collections.singletonList(1))
                },
                {
                        Arrays.asList(
                                Arrays.asList(1, 2),
                                Arrays.asList(3, 4)
                        ),
                        Arrays.asList(
                                Arrays.asList(5),
                                Arrays.asList(6, 7, 8)
                        )
                },
                {
                        Arrays.asList(Collections.singletonList(1)),
                        Arrays.asList(Collections.emptyList())
                }
        };
    }

    /**
     * Parameterized test for correct subtraction of matrices.
     *
     * @param matrix1  the first matrix
     * @param matrix2  the second matrix
     * @param expected the expected result of matrix subtraction
     * @throws MatrixOperationException if matrix sizes are incompatible
     */
    @ParameterizedTest
    @MethodSource("provideMatricesForSubtraction")
    void testSubtractMatrices(List<List<Integer>> matrix1, List<List<Integer>> matrix2, List<List<Integer>> expected) throws MatrixOperationException {
        model.setMatrices(matrix1, matrix2);
        List<List<Integer>> result = model.subtractMatrices();
        assertEquals(expected, result, "Subtraction of matrices is incorrect.");
    }

    /**
     * Provides matrices for testing correct subtraction.
     *
     * @return a 2D array of test matrices and expected results
     */
    private static Object[][] provideMatricesForSubtraction() {
        return new Object[][]{
                {
                        Arrays.asList(Collections.singletonList(5)),
                        Arrays.asList(Collections.singletonList(3)),
                        Arrays.asList(Collections.singletonList(2))
                },
                {
                        Arrays.asList(
                                Arrays.asList(6, 5),
                                Arrays.asList(4, 3)
                        ),
                        Arrays.asList(
                                Arrays.asList(1, 2),
                                Arrays.asList(3, 4)
                        ),
                        Arrays.asList(
                                Arrays.asList(5, 3),
                                Arrays.asList(1, -1)
                        )
                }
        };
    }

    /**
     * Parameterized test for matrix subtraction with incompatible sizes.
     *
     * @param matrix1 the first matrix
     * @param matrix2 the second matrix
     */
    @ParameterizedTest
    @MethodSource("provideIncompatibleMatricesForAddition")
    void testSubtractMatricesWithIncompatibleSizes(List<List<Integer>> matrix1, List<List<Integer>> matrix2) {
        model.setMatrices(matrix1, matrix2);
        assertThrows(MatrixOperationException.class, model::subtractMatrices, "Expected MatrixOperationException for incompatible matrix sizes.");
    }

    /**
     * Parameterized test for matrix multiplication.
     *
     * @param matrix1  the first matrix as a MatrixRecord
     * @param matrix2  the second matrix as a MatrixRecord
     * @param expected the expected result as a MatrixRecord
     * @throws MatrixOperationException if matrix dimensions are incompatible
     */
    @ParameterizedTest
    @MethodSource("provideMatricesForMultiplication")
    void testMultiplyMatrices(MatrixRecord matrix1, MatrixRecord matrix2, MatrixRecord expected) throws MatrixOperationException {
        MatrixRecord result = model.multiplyMatrices(matrix1, matrix2);
        assertEquals(expected.data(), result.data(), "Multiplication of matrices is incorrect.");
    }

        /**
     * Parameterized test for invalid matrices containing non-numeric values.
     * This test checks whether the application handles invalid inputs like letters.
     *
     * @param matrix1 the first matrix containing invalid entries
     * @param matrix2 the second matrix containing invalid entries
     */
    @ParameterizedTest
    @MethodSource("provideMatricesWithInvalidEntries")
    void testMatricesWithInvalidEntries(List<List<String>> matrix1, List<List<String>> matrix2) {
        Exception exception = assertThrows(NumberFormatException.class, () -> {
            model.setMatrices(
                parseMatrix(matrix1), 
                parseMatrix(matrix2)
            );
            model.addMatrices();
        });

        assertTrue(exception.getMessage().contains("For input string"), 
                   "Expected NumberFormatException for non-numeric input.");
    }

    /**
     * Provides matrices containing invalid (non-numeric) entries.
     *
     * @return a 2D array of test matrices
     */
    private static Object[][] provideMatricesWithInvalidEntries() {
        return new Object[][]{
                {
                        Arrays.asList(
                                Arrays.asList("1", "2", "a"), // Invalid: "a"
                                Arrays.asList("4", "5", "6")
                        ),
                        Arrays.asList(
                                Arrays.asList("7", "8", "9"),
                                Arrays.asList("d", "11", "12") // Invalid: "d"
                        )
                },
                {
                        Arrays.asList(
                                Arrays.asList("1", "2"),
                                Arrays.asList("x", "4") // Invalid: "x"
                        ),
                        Arrays.asList(
                                Arrays.asList("5", "6"),
                                Arrays.asList("7", "y") // Invalid: "y"
                        )
                },
                {
                        Arrays.asList(
                                Arrays.asList("1", "b"), // Invalid: "b"
                                Arrays.asList("3", "4")
                        ),
                        Arrays.asList(
                                Arrays.asList("c", "6"), // Invalid: "c"
                                Arrays.asList("7", "8")
                        )
                }
        };
    }

    /**
     * Helper method to parse a matrix of strings into a matrix of integers.
     * This method attempts to convert all elements to integers, simulating
     * the behavior of the model when processing input.
     *
     * @param matrix the matrix of strings to parse
     * @return a parsed matrix of integers
     * @throws NumberFormatException if any entry is non-numeric
     */
    private List<List<Integer>> parseMatrix(List<List<String>> matrix) {
        return matrix.stream()
                .map(row -> row.stream()
                        .map(Integer::parseInt) // Attempt to parse each element
                        .toList()
                )
                .toList();
    }
    
    /**
     * Provides matrices for testing correct multiplication.
     *
     * @return a 2D array of test matrices and expected results
     */
    private static Object[][] provideMatricesForMultiplication() {
        return new Object[][]{
                {
                        new MatrixRecord(
                                Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4)),
                                2,
                                2
                        ),
                        new MatrixRecord(
                                Arrays.asList(Arrays.asList(2, 0), Arrays.asList(1, 2)),
                                2,
                                2
                        ),
                        new MatrixRecord(
                                Arrays.asList(Arrays.asList(4, 4), Arrays.asList(10, 8)),
                                2,
                                2
                        )
                },
                {
                        new MatrixRecord(
                                Arrays.asList(
                                        Arrays.asList(2, 3, 4),
                                        Arrays.asList(1, 0, 0)
                                ),
                                2,
                                3
                        ),
                        new MatrixRecord(
                                Arrays.asList(
                                        Arrays.asList(0, 1000),
                                        Arrays.asList(1, 100),
                                        Arrays.asList(0, 10)
                                ),
                                3,
                                2
                        ),
                        new MatrixRecord(
                                Arrays.asList(
                                        Arrays.asList(3, 2340),
                                        Arrays.asList(0, 1000)
                                ),
                                2,
                                2
                        )
                }
        };
    }

    /**
     * Parameterized test for matrix multiplication with incompatible sizes.
     *
     * @param matrix1 the first matrix as a MatrixRecord
     * @param matrix2 the second matrix as a MatrixRecord
     */
    @ParameterizedTest
    @MethodSource("provideIncompatibleMatricesForMultiplication")
    void testMultiplyMatricesWithIncompatibleSizes(MatrixRecord matrix1, MatrixRecord matrix2) {
        assertThrows(MatrixOperationException.class, () -> model.multiplyMatrices(matrix1, matrix2),
                "Expected MatrixOperationException for incompatible matrix sizes.");
    }

    /**
     * Provides matrices for testing multiplication with incompatible sizes.
     *
     * @return a 2D array of test matrices
     */
    private static Object[][] provideIncompatibleMatricesForMultiplication() {
        return new Object[][]{
                {
                        new MatrixRecord(
                                Arrays.asList(Collections.singletonList(1)),
                                1,
                                1
                        ),
                        new MatrixRecord(
                                Arrays.asList(
                                        Arrays.asList(1, 2),
                                        Arrays.asList(3, 4)
                                ),
                                2,
                                2
                        )
                },
                {
                        new MatrixRecord(
                                Arrays.asList(
                                        Arrays.asList(2, 3, 4),
                                        Arrays.asList(1, 0, 0)
                                ),
                                2,
                                3
                        ),
                        new MatrixRecord(
                                Arrays.asList(Collections.singletonList(5)),
                                1,
                                1
                        )
                }
        };
    }
}
