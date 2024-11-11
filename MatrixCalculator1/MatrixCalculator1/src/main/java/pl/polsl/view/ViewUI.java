/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pl.polsl.view;
import javax.swing.JOptionPane;
import pl.polsl.model.MatrixCalculatorModel;
import pl.polsl.model.MatrixOperationException;
import pl.polsl.model.MatrixRecord;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
/**
 * ViewUI class for the swing application
 * @version 1.0
 * @author MIKOLAJ
 */
public class ViewUI extends javax.swing.JFrame {
    
    private final List<String> operationHistory = new ArrayList<>();

    private final MatrixCalculatorModel model;

    private final DefaultTableModel tableModel;
    public ViewUI() {
        initComponents();
        this.model = new MatrixCalculatorModel();
        jTable1.setVisible(false);
        jScrollPane2.setVisible(false);
        jButtonGoBack.setVisible(false);
        tableModel = new DefaultTableModel(new String[]{"History"}, 0);
        jTable1.setModel(tableModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenesrated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonAddition = new javax.swing.JButton();
        jButtonSubtraction = new javax.swing.JButton();
        jButtonMultiplication = new javax.swing.JButton();
        jTextMatrix1Row1 = new javax.swing.JTextField();
        jTextMatrix2Row1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaOutput = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabelMatrix1 = new javax.swing.JLabel();
        jLabelMatrix2 = new javax.swing.JLabel();
        jTextMatrix1Row2 = new javax.swing.JTextField();
        jTextMatrix1Row3 = new javax.swing.JTextField();
        jTextMatrix1Row4 = new javax.swing.JTextField();
        jTextMatrix1Row5 = new javax.swing.JTextField();
        jTextMatrix2Row2 = new javax.swing.JTextField();
        jTextMatrix2Row3 = new javax.swing.JTextField();
        jTextMatrix2Row4 = new javax.swing.JTextField();
        jTextMatrix2Row5 = new javax.swing.JTextField();
        jLabelInsertAsBelow = new javax.swing.JLabel();
        jLabelInsertionTip1 = new javax.swing.JLabel();
        jLabelInsertionTip2 = new javax.swing.JLabel();
        jLabelInsertionTip3 = new javax.swing.JLabel();
        jLabelInsertionTip4 = new javax.swing.JLabel();
        jLabelInsertionTip6 = new javax.swing.JLabel();
        jLabelRow1 = new javax.swing.JLabel();
        jLabelRow2 = new javax.swing.JLabel();
        jLabelRow3 = new javax.swing.JLabel();
        jLabelRow4 = new javax.swing.JLabel();
        jLabelRow5 = new javax.swing.JLabel();
        jLabelAddInfo1 = new javax.swing.JLabel();
        jButtonGoBack = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuFile = new javax.swing.JMenu();
        jMenuFile1 = new javax.swing.JMenuItem();
        jMenuHelp = new javax.swing.JMenuItem();
        jMenuSeeResults = new javax.swing.JMenuItem();
        jMenuEdit = new javax.swing.JMenu();
        jMenuMatrix1 = new javax.swing.JMenuItem();
        jMenuMatrix2 = new javax.swing.JMenuItem();
        jMenuOutput = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonAddition.setText("+");
        jButtonAddition.setToolTipText("addition");
        jButtonAddition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdditionActionPerformed(evt);
            }
        });

        jButtonSubtraction.setText("-");
        jButtonSubtraction.setToolTipText("subtraction");
        jButtonSubtraction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubtractionActionPerformed(evt);
            }
        });

        jButtonMultiplication.setText("*");
        jButtonMultiplication.setToolTipText("multiplication");
        jButtonMultiplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMultiplicationActionPerformed(evt);
            }
        });

        jTextMatrix1Row1.setToolTipText("insert row 1 of first matrix");
        jTextMatrix1Row1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextMatrix1Row1ActionPerformed(evt);
            }
        });

        jTextMatrix2Row1.setToolTipText("insert row 1 of second matrix");
        jTextMatrix2Row1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextMatrix2Row1ActionPerformed(evt);
            }
        });

        jTextAreaOutput.setEditable(false);
        jTextAreaOutput.setColumns(20);
        jTextAreaOutput.setRows(5);
        jTextAreaOutput.setToolTipText("output text");
        jScrollPane1.setViewportView(jTextAreaOutput);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "History"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jLabelMatrix1.setText("Matrix1");

        jLabelMatrix2.setText("Matrix2");

        jTextMatrix1Row2.setToolTipText("insert row 2 of first matrix");
        jTextMatrix1Row2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextMatrix1Row2ActionPerformed(evt);
            }
        });

        jTextMatrix1Row3.setToolTipText("insert row 3 of first matrix");
        jTextMatrix1Row3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextMatrix1Row3ActionPerformed(evt);
            }
        });

        jTextMatrix1Row4.setToolTipText("insert row 4 of first matrix");
        jTextMatrix1Row4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextMatrix1Row4ActionPerformed(evt);
            }
        });

        jTextMatrix1Row5.setToolTipText("insert row 5 of first matrix");
        jTextMatrix1Row5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextMatrix1Row5ActionPerformed(evt);
            }
        });

        jTextMatrix2Row2.setToolTipText("insert row 2 of second matrix");
        jTextMatrix2Row2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextMatrix2Row2ActionPerformed(evt);
            }
        });

        jTextMatrix2Row3.setToolTipText("insert row 3 of second matrix");
        jTextMatrix2Row3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextMatrix2Row3ActionPerformed(evt);
            }
        });

        jTextMatrix2Row4.setToolTipText("insert row 4 of second matrix");
        jTextMatrix2Row4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextMatrix2Row4ActionPerformed(evt);
            }
        });

        jTextMatrix2Row5.setToolTipText("insert row 5 of second matrix");
        jTextMatrix2Row5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextMatrix2Row5ActionPerformed(evt);
            }
        });

        jLabelInsertAsBelow.setText("Insert numbers as shown below :");

        jLabelInsertionTip1.setText("1 2 3 4 5");

        jLabelInsertionTip2.setText("1 2 3 4 5");

        jLabelInsertionTip3.setText("1 2 3 4 5");

        jLabelInsertionTip4.setText("1 2 3 4 5");

        jLabelInsertionTip6.setText("1 2 3 4 5");

        jLabelRow1.setText("Row1");
        jLabelRow1.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jLabelRow2.setText("Row2");

        jLabelRow3.setText("Row3");

        jLabelRow4.setText("Row4");

        jLabelRow5.setText("Row5");

        jLabelAddInfo1.setText("- The inputs do not clear automatically");

        jButtonGoBack.setText("Go Back To normal");
        jButtonGoBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGoBackActionPerformed(evt);
            }
        });

        jMenuFile.setText("Calculator Option");

        jMenuFile1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuFile1.setText("Reset All");
        jMenuFile1.setToolTipText("Reset Whole calculator");
        jMenuFile1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuFile1ActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuFile1);

        jMenuHelp.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuHelp.setText("Help");
        jMenuHelp.setToolTipText("Helpful info");
        jMenuHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuHelpActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuHelp);

        jMenuSeeResults.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuSeeResults.setText("Previous Results");
        jMenuSeeResults.setToolTipText("Show previous results");
        jMenuSeeResults.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSeeResultsActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuSeeResults);

        jMenuBar1.add(jMenuFile);

        jMenuEdit.setText("Single Matrix");

        jMenuMatrix1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuMatrix1.setText("Clear Matrix 1");
        jMenuMatrix1.setToolTipText("Clear Matrix 1");
        jMenuMatrix1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuMatrix1ActionPerformed(evt);
            }
        });
        jMenuEdit.add(jMenuMatrix1);

        jMenuMatrix2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuMatrix2.setText("Clear Matrix 2");
        jMenuMatrix2.setToolTipText("Clear Matrix 2");
        jMenuMatrix2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuMatrix2ActionPerformed(evt);
            }
        });
        jMenuEdit.add(jMenuMatrix2);

        jMenuOutput.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuOutput.setText("Clear Output");
        jMenuOutput.setToolTipText("Clear Output");
        jMenuOutput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuOutputActionPerformed(evt);
            }
        });
        jMenuEdit.add(jMenuOutput);

        jMenuBar1.add(jMenuEdit);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextMatrix1Row1)
                            .addComponent(jTextMatrix1Row2)
                            .addComponent(jTextMatrix1Row4)
                            .addComponent(jTextMatrix1Row5)
                            .addComponent(jTextMatrix1Row3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelRow2)
                                .addComponent(jLabelRow3)
                                .addComponent(jLabelRow4)
                                .addComponent(jLabelRow5))
                            .addComponent(jLabelRow1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(145, 145, 145)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelInsertionTip1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabelInsertionTip2)
                                .addComponent(jLabelInsertionTip3, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabelInsertionTip4, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabelInsertionTip6, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelMatrix1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelInsertAsBelow)
                        .addGap(108, 108, 108)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextMatrix2Row2)
                    .addComponent(jLabelMatrix2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextMatrix2Row3)
                    .addComponent(jTextMatrix2Row4)
                    .addComponent(jTextMatrix2Row5)
                    .addComponent(jTextMatrix2Row1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(285, 285, 285)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonGoBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonAddition)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonSubtraction)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonMultiplication)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelAddInfo1)
                .addGap(120, 120, 120))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelMatrix1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelRow1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelInsertionTip1, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jTextMatrix1Row1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelInsertionTip2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelInsertionTip3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelInsertionTip4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelInsertionTip6)
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButtonAddition)
                                    .addComponent(jButtonSubtraction)
                                    .addComponent(jButtonMultiplication)
                                    .addComponent(jLabelAddInfo1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelRow2)
                                    .addComponent(jTextMatrix1Row2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextMatrix1Row3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelRow3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextMatrix1Row4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelRow4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextMatrix1Row5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelRow5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonGoBack)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelMatrix2)
                            .addComponent(jLabelInsertAsBelow))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextMatrix2Row1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextMatrix2Row2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextMatrix2Row3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextMatrix2Row4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextMatrix2Row5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(144, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

 /**
 * Performs matrix addition when the "Addition" button is clicked.
 * Reads the matrix inputs from text fields, validates, and performs addition.
 * Displays an error if matrix dimensions don't match or if inputs are invalid.
 * 
 * @param evt the ActionEvent triggered by the button click
 */  
    private void jButtonAdditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdditionActionPerformed
        // Reading Matrix1 from the fields into a List of Lists
        List<List<Integer>> matrix1 = readMatrixInputs(new JTextField[]{
                jTextMatrix1Row1, jTextMatrix1Row2, jTextMatrix1Row3, jTextMatrix1Row4, jTextMatrix1Row5
        });

        // Reading Matrix2 from the fields into a List of Lists
        List<List<Integer>> matrix2 = readMatrixInputs(new JTextField[]{
                jTextMatrix2Row1, jTextMatrix2Row2, jTextMatrix2Row3, jTextMatrix2Row4, jTextMatrix2Row5
        });

        if (matrix1 != null && matrix2 != null) {
            model.setMatrix1(matrix1);
            model.setMatrix2(matrix2);

            try {
                List<List<Integer>> result = model.addMatrices();
                displayMatrix(result);
            } catch (MatrixOperationException e) {
                JOptionPane.showMessageDialog(this, "Invalid input! Numbers of rows or columns do not match between matrices.");
                displayErrorMessage("Error: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_jButtonAdditionActionPerformed
/**
 * Performs matrix multiplication when the "Multiplication" button is clicked.
 * Reads the matrix inputs, validates, and performs multiplication.
 * Displays an error if matrices are not compatible for multiplication.
 *
 * @param evt the ActionEvent triggered by the button click
 */
    private void jButtonMultiplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMultiplicationActionPerformed
        List<List<Integer>> matrix1 = readMatrixInputs(new JTextField[]{
                jTextMatrix1Row1, jTextMatrix1Row2, jTextMatrix1Row3, jTextMatrix1Row4, jTextMatrix1Row5
        });

        List<List<Integer>> matrix2 = readMatrixInputs(new JTextField[]{
                jTextMatrix2Row1, jTextMatrix2Row2, jTextMatrix2Row3, jTextMatrix2Row4, jTextMatrix2Row5
        });

        if (matrix1 != null && matrix2 != null) {
            model.setMatrix1(matrix1);
            model.setMatrix2(matrix2);

            try {
                List<List<Integer>> result = model.multiplyMatrices();
                displayMatrix(result);
            } catch (MatrixOperationException e) {
                JOptionPane.showMessageDialog(this, "Invalid input! The number of columns in Matrix1 must match the number of rows in Matrix2.");
                displayErrorMessage("Error: " + e.getMessage());
            }
    }//GEN-LAST:event_jButtonMultiplicationActionPerformed
    }
 /**
 * Performs matrix subtraction when the "Subtraction" button is clicked.
 * Reads the matrix inputs, validates, and performs subtraction.
 * Displays an error if matrix dimensions don't match or if inputs are invalid.
 *
 * @param evt the ActionEvent triggered by the button click
 */   
    private void jButtonSubtractionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubtractionActionPerformed
        List<List<Integer>> matrix1 = readMatrixInputs(new JTextField[]{
                jTextMatrix1Row1, jTextMatrix1Row2, jTextMatrix1Row3, jTextMatrix1Row4, jTextMatrix1Row5
        });

        List<List<Integer>> matrix2 = readMatrixInputs(new JTextField[]{
                jTextMatrix2Row1, jTextMatrix2Row2, jTextMatrix2Row3, jTextMatrix2Row4, jTextMatrix2Row5
        });

        if (matrix1 != null && matrix2 != null) {
            model.setMatrix1(matrix1);
            model.setMatrix2(matrix2);

            try {
                List<List<Integer>> result = model.subtractMatrices();
                displayMatrix(result);
            } catch (MatrixOperationException e) {
                JOptionPane.showMessageDialog(this, "Invalid input! Numbers of rows or columns do not match between matrices.");
                displayErrorMessage("Error: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_jButtonSubtractionActionPerformed

    /**
     * Matrix1 Row 1 operation
     * @param evt 
     */
    private void jTextMatrix1Row1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextMatrix1Row1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextMatrix1Row1ActionPerformed

    /**
     * Matrix2 Row 1 operation
     * @param evt 
     */
    private void jTextMatrix2Row1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextMatrix2Row1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextMatrix2Row1ActionPerformed

    /**
     * Matrix1 Row 2 operation
     * @param evt 
     */
    private void jTextMatrix1Row2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextMatrix1Row2ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextMatrix1Row2ActionPerformed

    /**
     * Matrix1 Row 3 operation
     * @param evt 
     */
    private void jTextMatrix1Row3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextMatrix1Row3ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextMatrix1Row3ActionPerformed

    /**
     * Matrix1 Row 4 operation
     * @param evt 
     */
    private void jTextMatrix1Row4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextMatrix1Row4ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextMatrix1Row4ActionPerformed

    /**
     * Matrix1 Row 5 operation
     * @param evt 
     */
    private void jTextMatrix1Row5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextMatrix1Row5ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextMatrix1Row5ActionPerformed

    /**
     * Matrix2 Row 2 operation
     * @param evt 
     */
    private void jTextMatrix2Row2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextMatrix2Row2ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextMatrix2Row2ActionPerformed

    /**
     * Matrix2 Row 3 operation
     * @param evt 
     */
    private void jTextMatrix2Row3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextMatrix2Row3ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextMatrix2Row3ActionPerformed

    /**
     * Matrix2 Row 4 operation
     * @param evt 
     */
    private void jTextMatrix2Row4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextMatrix2Row4ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextMatrix2Row4ActionPerformed

    /**
     * Matrix2 Row 5 operation
     * @param evt 
     */
    private void jTextMatrix2Row5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextMatrix2Row5ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextMatrix2Row5ActionPerformed

    /**
     * Clearing Button
     * @param evt 
     */
    private void jMenuFile1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuFile1ActionPerformed
        // TODO add your handling code here:
        clearInputFields();
    }//GEN-LAST:event_jMenuFile1ActionPerformed

    /**
     * Button to clean matrix1
     * @param evt 
     */
    private void jMenuMatrix1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuMatrix1ActionPerformed
        // TODO add your handling code here:
    jTextMatrix1Row1.setText("");
    jTextMatrix1Row2.setText("");
    jTextMatrix1Row3.setText("");
    jTextMatrix1Row4.setText("");
    jTextMatrix1Row5.setText("");
    }//GEN-LAST:event_jMenuMatrix1ActionPerformed

    /**
     * Button to show help
     * @param evt 
     */
    private void jMenuHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuHelpActionPerformed
        // TODO add your handling code here:
                    String helpMessage = "How to Use the Matrix Calculator:\n\n" +
                         "Matrix Entry:\n" +
                         " - Enter matrix values in the text fields provided.\n" +
                         " - Each row should have the same number of entries, separated by spaces.\n" +
                         " - You don’t need to fill all 5 rows if your matrix is smaller.\n\n" +
                         "Operations:\n" +
                         " - Addition/Subtraction: Matrices must have the same size.\n" +
                         " - Multiplication: The number of columns in Matrix1 must match the number of rows in Matrix2.\n\n" +
                         "Clear Inputs:\n" +
                         " - Click 'Clear Inputs' to reset all fields.\n";

    JOptionPane.showMessageDialog(this, helpMessage, "Help", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuHelpActionPerformed

    /**
     * Button to clean matrix2
     * @param evt 
     */
    private void jMenuMatrix2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuMatrix2ActionPerformed
        // TODO add your handling code here:
    jTextMatrix2Row1.setText("");
    jTextMatrix2Row2.setText("");
    jTextMatrix2Row3.setText("");
    jTextMatrix2Row4.setText("");
    jTextMatrix2Row5.setText("");
    }//GEN-LAST:event_jMenuMatrix2ActionPerformed

    /**
     * Button to show the menu
     * @param evt 
     */
    private void jMenuOutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuOutputActionPerformed
        // TODO add your handling code here:
    jTextAreaOutput.setText("");
    }//GEN-LAST:event_jMenuOutputActionPerformed

    
    /**
     * Button to show the results
     * @param evt 
     */
    private void jMenuSeeResultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSeeResultsActionPerformed
        // TODO add your handling code here:
    jTable1.setVisible(true);
    jScrollPane2.setVisible(true);
    jTextMatrix2Row1.setVisible(false);
    jTextMatrix2Row2.setVisible(false);
    jTextMatrix2Row3.setVisible(false);
    jTextMatrix2Row4.setVisible(false);
    jTextMatrix2Row5.setVisible(false);
    jTextMatrix1Row1.setVisible(false);
    jTextMatrix1Row2.setVisible(false);
    jTextMatrix1Row3.setVisible(false);
    jTextMatrix1Row4.setVisible(false);
    jTextMatrix1Row5.setVisible(false);
    jButtonAddition.setVisible(false);
    jButtonSubtraction.setVisible(false);
    jButtonMultiplication.setVisible(false);
    jTextAreaOutput.setVisible(false);
    jScrollPane1.setVisible(false);
    jLabelRow1.setVisible(false);
    jLabelRow2.setVisible(false);
    jLabelRow3.setVisible(false);
    jLabelRow4.setVisible(false);
    jLabelRow5.setVisible(false);
    jMenuFile.setVisible(false);
    jMenuEdit.setVisible(false);
    jButtonGoBack.setVisible(true);
    jLabelRow1.setVisible(false);
    jLabelRow2.setVisible(false);
    jLabelRow3.setVisible(false);
    jLabelRow4.setVisible(false);
    jLabelRow5.setVisible(false);
    jTextMatrix2Row1.setVisible(false);
    jTextMatrix2Row2.setVisible(false);
    jTextMatrix2Row3.setVisible(false);
    jTextMatrix2Row4.setVisible(false);
    jTextMatrix2Row5.setVisible(false);
    jTextMatrix1Row1.setVisible(false);
    jTextMatrix1Row2.setVisible(false);
    jTextMatrix1Row3.setVisible(false);
    jTextMatrix1Row4.setVisible(false);
    jTextMatrix1Row5.setVisible(false);
    jLabelRow1.setVisible(false);
    jLabelRow2.setVisible(false);
    jLabelRow3.setVisible(false);
    jLabelRow4.setVisible(false);
    jLabelRow5.setVisible(false);
    jLabelAddInfo1.setVisible(false);
    jLabelInsertAsBelow.setVisible(false);
    jLabelInsertionTip1.setVisible(false);
    jLabelInsertionTip2.setVisible(false);
    jLabelInsertionTip3.setVisible(false);
    jLabelInsertionTip4.setVisible(false);
    jLabelInsertionTip6.setVisible(false);
    jLabelMatrix1.setVisible(false);
    jLabelMatrix2.setVisible(false);
    if (operationHistory.isEmpty()) {
        JOptionPane.showMessageDialog(this, "No results to display.");
        return;
    }

    tableModel.setRowCount(0);

    int operationNumber = 1;
    for (String result : operationHistory) {
        String labeledResult = "Operation " + operationNumber + ": " + result;
        tableModel.addRow(new String[]{labeledResult});
        operationNumber++;
    }
    }//GEN-LAST:event_jMenuSeeResultsActionPerformed

    private void jButtonGoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGoBackActionPerformed
        // TODO add your handling code here:
    jTable1.setVisible(false);
    jScrollPane2.setVisible(false);
    jTextMatrix2Row1.setVisible(true);
    jTextMatrix2Row2.setVisible(true);
    jTextMatrix2Row3.setVisible(true);
    jTextMatrix2Row4.setVisible(true);
    jTextMatrix2Row5.setVisible(true);
    jTextMatrix1Row1.setVisible(true);
    jTextMatrix1Row2.setVisible(true);
    jTextMatrix1Row3.setVisible(true);
    jTextMatrix1Row4.setVisible(true);
    jTextMatrix1Row5.setVisible(true);
    jButtonAddition.setVisible(true);
    jButtonSubtraction.setVisible(true);
    jButtonMultiplication.setVisible(true);
    jTextAreaOutput.setVisible(true);
    jScrollPane1.setVisible(true);
    jLabelRow1.setVisible(true);
    jLabelRow2.setVisible(true);
    jLabelRow3.setVisible(true);
    jLabelRow4.setVisible(true);
    jLabelRow5.setVisible(true);
    jButtonGoBack.setVisible(false);
    jMenuFile.setVisible(true);
    jMenuEdit.setVisible(true);
    jLabelRow1.setVisible(true);
    jLabelRow2.setVisible(true);
    jLabelRow3.setVisible(true);
    jLabelRow4.setVisible(true);
    jLabelRow5.setVisible(true);
    jLabelAddInfo1.setVisible(true);
    jLabelInsertAsBelow.setVisible(true);
    jLabelInsertionTip1.setVisible(true);
    jLabelInsertionTip2.setVisible(true);
    jLabelInsertionTip3.setVisible(true);
    jLabelInsertionTip4.setVisible(true);
    jLabelInsertionTip6.setVisible(true);
    jLabelMatrix1.setVisible(true);
    jLabelMatrix2.setVisible(true);
    }//GEN-LAST:event_jButtonGoBackActionPerformed
 
  private void clearInputFields() {
        clearMatrixFields(new JTextField[]{
                jTextMatrix1Row1, jTextMatrix1Row2, jTextMatrix1Row3, jTextMatrix1Row4, jTextMatrix1Row5,
                jTextMatrix2Row1, jTextMatrix2Row2, jTextMatrix2Row3, jTextMatrix2Row4, jTextMatrix2Row5
        });
        jTextAreaOutput.setText("");
        operationHistory.clear();
    }

    private void clearMatrixFields(JTextField[] fields) {
        for (JTextField field : fields) {
            field.setText("");
        }
    }

    public void displayErrorMessage(String message) {
        System.out.println("Error: " + message);
    }

    private void displayMatrix(List<List<Integer>> matrix) {
        if (matrix == null || matrix.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Matrix is empty.");
            return;
        }

        StringBuilder sb = new StringBuilder();
        for (List<Integer> row : matrix) {
            for (Integer value : row) {
                sb.append(value).append(" ");
            }
            sb.append("\n");
        }

        jTextAreaOutput.setText(sb.toString());
        operationHistory.add(sb.toString());
    }

    private List<List<Integer>> readMatrixInputs(JTextField[] fields) {
        List<List<Integer>> matrix = new ArrayList<>();
        int maxFilledRow = getMaxFilledRow(fields);

        boolean allEmpty = true;
        for (JTextField field : fields) {
            if (!field.getText().trim().isEmpty()) {
                allEmpty = false;
                break;
            }
        }

        if (allEmpty) {
            JOptionPane.showMessageDialog(this, "Error: All input fields are empty. Please enter values in at least one row.");
            return null;
        }

        for (int i = 0; i < maxFilledRow; i++) {
            String rowText = fields[i].getText().trim();

            if (rowText.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Error: Row " + (i + 1) + " is missing.");
                return null;
            }

            String[] values = rowText.split("\\s+");
            List<Integer> row = new ArrayList<>();
            try {
                for (String value : values) {
                    row.add(Integer.parseInt(value));
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Invalid input in Row " + (i + 1) + ". Please enter valid integers.");
                return null;
            }

            if (matrix.isEmpty()) {
                matrix.add(row);
            } else if (row.size() != matrix.get(0).size()) {
                JOptionPane.showMessageDialog(this, "Error: All rows must have the same number of columns.");
                return null;
            } else {
                matrix.add(row);
            }
        }

        return matrix;
    }

    private int getMaxFilledRow(JTextField[] fields) {
        int lastFilledRow = 0;
        for (int i = 0; i < fields.length; i++) {
            if (!fields[i].getText().trim().isEmpty()) {
                lastFilledRow = i + 1;
            }
        }
        return lastFilledRow;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddition;
    private javax.swing.JButton jButtonGoBack;
    private javax.swing.JButton jButtonMultiplication;
    private javax.swing.JButton jButtonSubtraction;
    private javax.swing.JLabel jLabelAddInfo1;
    private javax.swing.JLabel jLabelInsertAsBelow;
    private javax.swing.JLabel jLabelInsertionTip1;
    private javax.swing.JLabel jLabelInsertionTip2;
    private javax.swing.JLabel jLabelInsertionTip3;
    private javax.swing.JLabel jLabelInsertionTip4;
    private javax.swing.JLabel jLabelInsertionTip6;
    private javax.swing.JLabel jLabelMatrix1;
    private javax.swing.JLabel jLabelMatrix2;
    private javax.swing.JLabel jLabelRow1;
    private javax.swing.JLabel jLabelRow2;
    private javax.swing.JLabel jLabelRow3;
    private javax.swing.JLabel jLabelRow4;
    private javax.swing.JLabel jLabelRow5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuEdit;
    private javax.swing.JMenu jMenuFile;
    private javax.swing.JMenuItem jMenuFile1;
    private javax.swing.JMenuItem jMenuHelp;
    private javax.swing.JMenuItem jMenuMatrix1;
    private javax.swing.JMenuItem jMenuMatrix2;
    private javax.swing.JMenuItem jMenuOutput;
    private javax.swing.JMenuItem jMenuSeeResults;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextAreaOutput;
    private javax.swing.JTextField jTextMatrix1Row1;
    private javax.swing.JTextField jTextMatrix1Row2;
    private javax.swing.JTextField jTextMatrix1Row3;
    private javax.swing.JTextField jTextMatrix1Row4;
    private javax.swing.JTextField jTextMatrix1Row5;
    private javax.swing.JTextField jTextMatrix2Row1;
    private javax.swing.JTextField jTextMatrix2Row2;
    private javax.swing.JTextField jTextMatrix2Row3;
    private javax.swing.JTextField jTextMatrix2Row4;
    private javax.swing.JTextField jTextMatrix2Row5;
    // End of variables declaration//GEN-END:variables
}
