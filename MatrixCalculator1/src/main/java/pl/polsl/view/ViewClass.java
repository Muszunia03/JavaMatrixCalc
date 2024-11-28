package pl.polsl.view;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import pl.polsl.model.OperationType;

/**
 * View class for user interaction. 
 * This class is responsible for reading input from the user and displaying output to the console.
 * 
 * @version 1.1
 * 
 * @author MIKOLAJ MACH
 */
@Getter
@Setter
public class ViewClass {

    /**
     * Scanner Object for reading user input.
     */
    private final Scanner scanner = new Scanner(System.in);

    /**
     * Reads a matrix (list of lists) from user input.
     * @param matrixNumber the matrix number (for display purposes)
     * @return a List of Lists representing the matrix
     */
    public List<List<Integer>> readMatrix(int matrixNumber) {

        int rows, cols;

        System.out.print("Enter the number of rows for matrix " + matrixNumber + ": ");
        if (scanner.hasNextInt()) {
            rows = scanner.nextInt();
            if (rows <= 0) {
                System.out.println("Error: Number of rows must be positive.");
                return null;
            }
        } else {
            System.out.println("Error: Invalid input. Please enter an integer.");
            scanner.next();
            return null;
        }

        System.out.print("Enter the number of columns for matrix " + matrixNumber + ": ");
        if (scanner.hasNextInt()) {
            cols = scanner.nextInt();
            if (cols <= 0) {
                System.out.println("Error: Number of columns must be positive.");
                return null;
            }
        } else {
            System.out.println("Error: Invalid input. Please enter an integer.");
            scanner.next();
            return null;
        }

        List<List<Integer>> matrix = new ArrayList<>();
        System.out.println("Enter the elements of matrix " + matrixNumber + ": ");
        for (int i = 0; i < rows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                if (scanner.hasNextInt()) {
                    row.add(scanner.nextInt());
                } else {
                    System.out.println("Invalid input. Please enter an integer.");
                    scanner.next();
                    j--;
                }
            }
            matrix.add(row);
        }
        return matrix;
    }

    /**
     * Displays a matrix.
     * @param matrix the matrix to display
     */
public void displayMatrix(List<List<Integer>> matrix) {
    System.out.println("Matrix result:");
    matrix.stream()
          .map(row -> row.stream()
                         .map(String::valueOf) 
                         .reduce((a, b) -> a + " " + b)
                         .orElse("")
          )
          .forEach(System.out::println); 
}

    /**
     * Displays an error message.
     * @param message the error message
     */
    public void showError(String message) {
        System.out.println("Error: " + message);
    }

    /**
     * Asks the user to choose an operation.
     * @return the chosen operation (1 for addition, 2 for subtraction, etc.)
     */
public OperationType getOperationChoice() {
    System.out.println("Choose an operation:");
    System.out.println("1. Addition");
    System.out.println("2. Subtraction");
    System.out.println("3. Multiplication");
    System.out.print("Enter your choice (1-3): ");
    if (scanner.hasNextInt()) {
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> { return OperationType.ADDITION; }
            case 2 -> { return OperationType.SUBTRACTION; }
            case 3 -> { return OperationType.MULTIPLICATION; }
            default -> {
                System.out.println("Invalid choice. Please select 1, 2, or 3.");
                return null;
            }
        }
    } else {
        scanner.next(); // Consume invalid input
        System.out.println("Invalid input. Please enter a number (1-3).");
        return null;
    }
}


    /**
     * Asks if the user wants to perform another operation.
     * @return true if the user wants to continue, false otherwise
     */
    public boolean askContinue() {
        System.out.print("Do you want to perform another operation? (yes/no): ");
        return scanner.next().equalsIgnoreCase("yes");
    }
    /**
     * Show info method
     * @param message massage for tests
     */
    public void showInfo(String message) {
    System.out.println("Info: " + message);
}

}
