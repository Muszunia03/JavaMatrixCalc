package pl.polsl.matrixcalculator1;

import pl.polsl.model.MatrixCalculatorModel;
import pl.polsl.model.MatrixOperationException;
import pl.polsl.view.ViewClass;
import pl.polsl.view.ViewUI;
import java.util.List;

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
     * Calling the MatrixCalculatorModel
     */
    private final MatrixCalculatorModel model;

    /**
     * Calling the ViewClass
     */
    private final ViewClass view;

    /**
     * Constructor to create a MatrixCalculator1 instance.
     * Initializes the model and the view for the application.
     */
    public MatrixCalculator1() {
        this.model = new MatrixCalculatorModel();
        this.view = new ViewClass();
    }

    /**
     * Main method to start the application.
     * Command-line arguments can be used to configure initial parameters.
     * 
     * @param args command-line arguments, where the first argument (if provided)
     *             specifies the operation (1 for addition, 2 for subtraction, 3 for multiplication).
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
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
     * Method to start the UI
     */
    private static void showUI() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewUI().setVisible(true);
            }
        });
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
        int operationChoice = args.length > 0 ? Integer.parseInt(args[0]) : view.getOperationChoice();

        try {
            List<List<Integer>> matrix1 = view.readMatrix(1);
            List<List<Integer>> matrix2 = view.readMatrix(2);

            model.setMatrix1(matrix1);
            model.setMatrix2(matrix2);

            List<List<Integer>> result;
            switch (operationChoice) {
                case 1:
                    result = model.performOperation((m1, m2) -> model.addMatrices());
                    view.displayMatrix(result);
                    break;
                case 2:
                    result = model.performOperation((m1, m2) -> model.subtractMatrices());
                    view.displayMatrix(result);
                    break;
                case 3:
                    result = model.performOperation((m1, m2) -> model.multiplyMatrices());
                    view.displayMatrix(result);
                    break;
                default:
                    view.showError("Invalid choice. Please select 1, 2, or 3.");
                    continue;
            }

        } catch (MatrixOperationException e) {
            view.showError(e.getMessage());
        } catch (Exception e) {
            view.showError("An unexpected error occurred: " + e.getMessage());
        }

        if (!view.askContinue()) {
            break;
        }
    }
}
}
