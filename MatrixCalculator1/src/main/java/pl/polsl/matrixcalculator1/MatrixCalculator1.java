package pl.polsl.matrixcalculator1;

import pl.polsl.model.MatrixCalculatorModel;
import pl.polsl.view.ViewClass;
import pl.polsl.view.ViewUI;
import pl.polsl.model.MatrixRecord;
import pl.polsl.model.OperationType;
import java.util.List;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * Main class for the matrix calculator application acting as the controller.
 * This class is responsible for executing the matrix calculator operations by
 * interacting with the model and the view.
 * 
 * @version 1.2
 * @author MIKOLAJ MACH
 */
public class MatrixCalculator1 {
/**
 * call of the MatrixCalculatorModel
 */
    private final MatrixCalculatorModel model;
    /**
     * call of the ViewClass
     */
    private final ViewClass view;
/**
 * Assigning correct values to the according class members
 */
    public MatrixCalculator1() {
        this.model = new MatrixCalculatorModel();
        this.view = new ViewClass();
    }
/**
 * Main function to start the UI or perform the operations inside the console
 * @param args args for the program to choose operation
 */
    public static void main(String[] args) {
        MatrixCalculator1 app = new MatrixCalculator1();

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        if (args.length > 0) {
            try {
                int operationChoice = Integer.parseInt(args[0]);
                if (operationChoice >= 1 && operationChoice <= 3) {
                    app.execute(args);
                } else {
                    showUI();
                }
            } catch (NumberFormatException e) {
                showUI();
            }
        } else {
            showUI();
        }
    }

    /**
     * function to show the UI from main()
     */
    private static void showUI() {
        java.awt.EventQueue.invokeLater(() -> new ViewUI().setVisible(true));
    }

        /**
     * Executes the matrix calculator application.
     * If a valid command-line argument is provided for the operation, it will be used.
     * Otherwise, it prompts the user to choose an operation.
     * Continuously prompts the user for matrices, performs selected operations,
     * and displays results until the user chooses to exit.
     * 
     * @param args command-line arguments for selecting the operation automatically
     */
public void execute(String[] args) {
    while (true) {
        try {
            OperationType operationChoice = null;
            if (args.length > 0) {
                try {
                    int choice = Integer.parseInt(args[0]);
                    switch (choice) {
                        case 1 -> operationChoice = OperationType.ADDITION;
                        case 2 -> operationChoice = OperationType.SUBTRACTION;
                        case 3 -> operationChoice = OperationType.MULTIPLICATION;
                        default -> view.showError("Invalid choice. Please select 1, 2, or 3.");
                    }
                } catch (NumberFormatException e) {
                    view.showError("Invalid operation choice. Please enter a number (1, 2, or 3).");
                }
            }
            
            if (operationChoice == null) {
                operationChoice = view.getOperationChoice();
            }

            if (operationChoice != null) {
                switch (operationChoice) {
                    case ADDITION -> {
                        List<List<Integer>> result = model.addMatricesFromConsole();
                        if (result != null) {
                            view.displayMatrix(result);
                        }
                    }
                    case SUBTRACTION -> {
                        List<List<Integer>> result = model.subtractMatricesFromConsole();
                        if (result != null) {
                            view.displayMatrix(result);
                        }
                    }
                    case MULTIPLICATION -> {
                        MatrixRecord result = model.multiplyMatricesFromConsole();
                        if (result != null) {
                            view.displayMatrix(result.data());
                        }
                    }
                    default -> view.showError("Invalid choice. Please select 1, 2, or 3.");
                }
            }

        } catch (Exception e) {
            view.showError("An unexpected error occurred: " + e.getMessage());
        }

        if (!view.askContinue()) {
            break;
        }
    }
}


}
