package pl.polsl.model;

/**
 * Exception class for handling matrix operation errors.
 * 
 * @author MIKOŁAJ MACH
 * @version 1.0
 */
public class MatrixOperationException extends Exception {

    /**
     * The Matrix Operation exception function
     * @param message to of the exception
     */
    public MatrixOperationException(String message) {
        super(message);
    }
}
