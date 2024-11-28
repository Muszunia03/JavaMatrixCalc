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
import java.util.Arrays;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import java.util.stream.IntStream;
import java.util.stream.Collectors;
/**
 * ViewUI class for the swing application
 * 
 * @version 1.0
 * @author MIKOLAJ
 */
public class ViewUI extends javax.swing.JFrame {
/**
 * Operation History
 */
    private final List<String> operationHistory = new ArrayList<>();

    /**
     * Matrix Model Call
     */
    private final MatrixCalculatorModel model;

    /**
     * Table model
     */
    private final DefaultTableModel tableModel;

    /**
     * The main ViewUI function that start the whole program
     */
    public ViewUI() {
        initComponents();
        this.model = new MatrixCalculatorModel();
        jTable1.setVisible(false);
        jScrollPane2.setVisible(false);
        //jButtonGoBack.setVisible(false);
        tableModel = new DefaultTableModel(new String[] { "History" }, 0);
        jTable1.setModel(tableModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenesrated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
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
        jSplitPane1 = new javax.swing.JSplitPane();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
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

        jButton1.setText("Show results history");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jSplitPane1.setRightComponent(jButton1);

        jButton2.setText("Go back to normal");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jSplitPane1.setLeftComponent(jButton2);

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(223, 223, 223))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonAddition)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonSubtraction)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonMultiplication)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelAddInfo1)
                        .addGap(120, 120, 120))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(133, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(133, Short.MAX_VALUE)))
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
                                    .addComponent(jLabelRow5)))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(37, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Button in pane to go back to normal view from seeing the results
     * @param evt the ActionEvent triggered by the button click
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
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
        //jButtonGoBack.setVisible(false);
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
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * Show the results history button in pane
     * @param evt the ActionEvent triggered by the button click
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
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
        //jButtonGoBack.setVisible(true);
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
            tableModel.addRow(new String[] { labeledResult });
            operationNumber++;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * Performs matrix addition when the "Addition" button is clicked.
     * Reads the matrix inputs from text fields, validates, and performs addition.
     * Displays an error if matrix dimensions don't match or if inputs are invalid.
     * 
     * @param evt the ActionEvent triggered by the button click
     */
    private void jButtonAdditionActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonAdditionActionPerformed
        // Reading Matrix1 from the fields into a List of Lists
        List<List<Integer>> matrix1 = readMatrixInputs(new JTextField[] {
                jTextMatrix1Row1, jTextMatrix1Row2, jTextMatrix1Row3, jTextMatrix1Row4, jTextMatrix1Row5
        });

        // Reading Matrix2 from the fields into a List of Lists
        List<List<Integer>> matrix2 = readMatrixInputs(new JTextField[] {
                jTextMatrix2Row1, jTextMatrix2Row2, jTextMatrix2Row3, jTextMatrix2Row4, jTextMatrix2Row5
        });

        if (matrix1 != null && matrix2 != null) {
            model.setMatrix1(matrix1);
            model.setMatrix2(matrix2);

            try {
                List<List<Integer>> result = model.addMatrices();
                displayMatrix(result);
            } catch (MatrixOperationException e) {
                JOptionPane.showMessageDialog(this,
                        "Invalid input! Numbers of rows or columns do not match between matrices.");
                displayErrorMessage("Error: " + e.getMessage());
            }
        }
    }// GEN-LAST:event_jButtonAdditionActionPerformed

    /**
     * Performs matrix multiplication when the "Multiplication" button is clicked.
     * Reads the matrix inputs, validates, and performs multiplication.
     * Displays an error if matrices are not compatible for multiplication.
     *
     * @param evt the ActionEvent triggered by the button click
     */
    private void jButtonMultiplicationActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonMultiplicationActionPerformed
        List<List<Integer>> matrix1 = readMatrixInputs(new JTextField[] {
                jTextMatrix1Row1, jTextMatrix1Row2, jTextMatrix1Row3, jTextMatrix1Row4, jTextMatrix1Row5
        });

        List<List<Integer>> matrix2 = readMatrixInputs(new JTextField[] {
                jTextMatrix2Row1, jTextMatrix2Row2, jTextMatrix2Row3, jTextMatrix2Row4, jTextMatrix2Row5
        });

        if (matrix1 != null && matrix2 != null) {
            // Convert to MatrixRecord instances
            MatrixRecord matrixRecord1 = new MatrixRecord(matrix1, matrix1.size(), matrix1.get(0).size());
            MatrixRecord matrixRecord2 = new MatrixRecord(matrix2, matrix2.size(), matrix2.get(0).size());

            try {
                // Call the modified multiplyMatrices method that accepts MatrixRecord
                MatrixRecord resultRecord = model.multiplyMatrices(matrixRecord1, matrixRecord2);

                // Display the resulting matrix data
                displayMatrix(resultRecord.data());
            } catch (MatrixOperationException e) {
                JOptionPane.showMessageDialog(this,
                        "Invalid input! The number of columns in Matrix1 must match the number of rows in Matrix2.");
                displayErrorMessage("Error: " + e.getMessage());
            }
        } // GEN-LAST:event_jButtonMultiplicationActionPerformed
    }

    /**
     * Performs matrix subtraction when the "Subtraction" button is clicked.
     * Reads the matrix inputs, validates, and performs subtraction.
     * Displays an error if matrix dimensions don't match or if inputs are invalid.
     *
     * @param evt the ActionEvent triggered by the button click
     */
    private void jButtonSubtractionActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonSubtractionActionPerformed
        List<List<Integer>> matrix1 = readMatrixInputs(new JTextField[] {
                jTextMatrix1Row1, jTextMatrix1Row2, jTextMatrix1Row3, jTextMatrix1Row4, jTextMatrix1Row5
        });

        List<List<Integer>> matrix2 = readMatrixInputs(new JTextField[] {
                jTextMatrix2Row1, jTextMatrix2Row2, jTextMatrix2Row3, jTextMatrix2Row4, jTextMatrix2Row5
        });

        if (matrix1 != null && matrix2 != null) {
            model.setMatrix1(matrix1);
            model.setMatrix2(matrix2);

            try {
                List<List<Integer>> result = model.subtractMatrices();
                displayMatrix(result);
            } catch (MatrixOperationException e) {
                JOptionPane.showMessageDialog(this,
                        "Invalid input! Numbers of rows or columns do not match between matrices.");
                displayErrorMessage("Error: " + e.getMessage());
            }
        }
    }// GEN-LAST:event_jButtonSubtractionActionPerformed

    /**
     * Matrix1 Row 1 operation
     * 
     * @param evt the ActionEvent triggered by the matrix row
     */
    private void jTextMatrix1Row1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextMatrix1Row1ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jTextMatrix1Row1ActionPerformed

    /**
     * Matrix2 Row 1 operation
     * 
     * @param evt the ActionEvent triggered by the matrix row
     */
    private void jTextMatrix2Row1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextMatrix2Row1ActionPerformed
        // TODO add your handling code here:

    }// GEN-LAST:event_jTextMatrix2Row1ActionPerformed

    /**
     * Matrix1 Row 2 operation
     * 
     * @param evt the ActionEvent triggered by the matrix row
     */
    private void jTextMatrix1Row2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextMatrix1Row2ActionPerformed
        // TODO add your handling code here:

    }// GEN-LAST:event_jTextMatrix1Row2ActionPerformed

    /**
     * Matrix1 Row 3 operation
     * 
     * @param evt the ActionEvent triggered by the matrix row
     */
    private void jTextMatrix1Row3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextMatrix1Row3ActionPerformed
        // TODO add your handling code here:

    }// GEN-LAST:event_jTextMatrix1Row3ActionPerformed

    /**
     * Matrix1 Row 4 operation
     * 
     * @param evt the ActionEvent triggered by the matrix row
     */
    private void jTextMatrix1Row4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextMatrix1Row4ActionPerformed
        // TODO add your handling code here:

    }// GEN-LAST:event_jTextMatrix1Row4ActionPerformed

    /**
     * Matrix1 Row 5 operation
     * 
     * @param evt the ActionEvent triggered by the matrix row
     */
    private void jTextMatrix1Row5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextMatrix1Row5ActionPerformed
        // TODO add your handling code here:

    }// GEN-LAST:event_jTextMatrix1Row5ActionPerformed

    /**
     * Matrix2 Row 2 operation
     * 
     * @param evt the ActionEvent triggered by the matrix row
     */
    private void jTextMatrix2Row2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextMatrix2Row2ActionPerformed
        // TODO add your handling code here:

    }// GEN-LAST:event_jTextMatrix2Row2ActionPerformed

    /**
     * Matrix2 Row 3 operation
     * 
     * @param evt the ActionEvent triggered by the matrix row
     */
    private void jTextMatrix2Row3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextMatrix2Row3ActionPerformed
        // TODO add your handling code here:

    }// GEN-LAST:event_jTextMatrix2Row3ActionPerformed

    /**
     * Matrix2 Row 4 operation
     * 
     * @param evt the ActionEvent triggered by the matrix row
     */
    private void jTextMatrix2Row4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextMatrix2Row4ActionPerformed
        // TODO add your handling code here:

    }// GEN-LAST:event_jTextMatrix2Row4ActionPerformed

    /**
     * Matrix2 Row 5 operation
     * 
     * @param evt the ActionEvent triggered by the matrix row
     */
    private void jTextMatrix2Row5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextMatrix2Row5ActionPerformed
        // TODO add your handling code here:

    }// GEN-LAST:event_jTextMatrix2Row5ActionPerformed

    /**
     * Clearing Button
     * 
     * @param evt the ActionEvent triggered by the matrix row
     */
    private void jMenuFile1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuFile1ActionPerformed
        // TODO add your handling code here:
    clearInputFields();

    operationHistory.clear();

    DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
    tableModel.setRowCount(0);

    jTable1.setVisible(false);
    jScrollPane2.setVisible(false);

    JOptionPane.showMessageDialog(this, "All data has been cleared!");
    }// GEN-LAST:event_jMenuFile1ActionPerformed

    /**
     * Button to clean matrix1
     * 
     * @param evt the ActionEvent triggered by the matrix row
     */
    private void jMenuMatrix1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuMatrix1ActionPerformed
        // TODO add your handling code here:
        jTextMatrix1Row1.setText("");
        jTextMatrix1Row2.setText("");
        jTextMatrix1Row3.setText("");
        jTextMatrix1Row4.setText("");
        jTextMatrix1Row5.setText("");
    }// GEN-LAST:event_jMenuMatrix1ActionPerformed

    /**
     * Button to show help
     * 
     * @param evt the ActionEvent triggered by the matrix row
     */
    private void jMenuHelpActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuHelpActionPerformed
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
    }// GEN-LAST:event_jMenuHelpActionPerformed

    /**
     * Button to clean matrix2
     * 
     * @param evt the ActionEvent triggered by the matrix row
     */
    private void jMenuMatrix2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuMatrix2ActionPerformed
        // TODO add your handling code here:
        jTextMatrix2Row1.setText("");
        jTextMatrix2Row2.setText("");
        jTextMatrix2Row3.setText("");
        jTextMatrix2Row4.setText("");
        jTextMatrix2Row5.setText("");
    }// GEN-LAST:event_jMenuMatrix2ActionPerformed

    /**
     * Button to show the menu
     * 
     * @param evt the ActionEvent triggered by the matrix row
     */
    private void jMenuOutputActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuOutputActionPerformed
        // TODO add your handling code here:
        jTextAreaOutput.setText("");
    }// GEN-LAST:event_jMenuOutputActionPerformed

    /**
     * Button to show the results 
     * 
     * @param evt the ActionEvent triggered by the matrix row
     */
    private void jMenuSeeResultsActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuSeeResultsActionPerformed
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
        //jButtonGoBack.setVisible(true);
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
            tableModel.addRow(new String[] { labeledResult });
            operationNumber++;
        }
    }// GEN-LAST:event_jMenuSeeResultsActionPerformed
    /**
     * function to  clear the inputs of user inside the matrixes
     */
    private void clearInputFields() {
        clearMatrixFields(new JTextField[] {
                jTextMatrix1Row1, jTextMatrix1Row2, jTextMatrix1Row3, jTextMatrix1Row4, jTextMatrix1Row5,
                jTextMatrix2Row1, jTextMatrix2Row2, jTextMatrix2Row3, jTextMatrix2Row4, jTextMatrix2Row5
        });
        jTextAreaOutput.setText("");
        operationHistory.clear();
        
    }

    /**
     * Clear matrix fields
     * @param fields fields of the matrix
     */
    private void clearMatrixFields(JTextField[] fields) {
    Arrays.stream(fields).forEach(field -> field.setText(""));
    }

    /**
     * Display error message function
     * @param message message to be shown
     */
    public void displayErrorMessage(String message) {
        System.out.println("Error: " + message);
    }

    /**
     * Display the given matrix
     * @param matrix the matrix
     */
    private void displayMatrix(List<List<Integer>> matrix) {
        if (matrix == null || matrix.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Matrix is empty.");
           return;
        }

        StringBuilder sb = new StringBuilder();
        matrix.forEach(row -> {
          String rowString = row.stream()
                              .map(String::valueOf)
                              .collect(Collectors.joining(" "));
         sb.append(rowString).append("\n");
        });

        jTextAreaOutput.setText(sb.toString());
        operationHistory.add(sb.toString());
    }

    /**
     * The Reading Matrix inputs function
     * @param fields fields of matrix
     * @return the matrix
     */
private List<List<Integer>> readMatrixInputs(JTextField[] fields) {
    List<List<Integer>> matrix = new ArrayList<>();
    int maxFilledRow = getMaxFilledRow(fields);

    boolean allEmpty = Arrays.stream(fields)
                             .allMatch(field -> field.getText().trim().isEmpty());

    if (allEmpty) {
        JOptionPane.showMessageDialog(this,
                "Error: All input fields are empty. Please enter values in at least one row.");
        return null;
    }

    for (int i = 0; i < maxFilledRow; i++) {
        String rowText = fields[i].getText().trim();

        if (rowText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Error: Row " + (i + 1) + " is missing.");
            return null;
        }

        List<Integer> row;
        try {
            row = Arrays.stream(rowText.split("\\s+"))
                        .map(Integer::parseInt)
                        .toList();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,
                    "Invalid input in Row " + (i + 1) + ". Please enter valid integers.");
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

    /**
     * Get max filled row in the UI
     * @param fields fields of matrix
     * @return lastFilledRow
     */
private int getMaxFilledRow(JTextField[] fields) {
    return IntStream.range(0, fields.length)
                    .filter(i -> !fields[i].getText().trim().isEmpty())
                    .map(i -> i + 1)
                    .max()
                    .orElse(0);
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
/**
 * Represents a button that performs the "Addition" operation.
 */
private javax.swing.JButton jButtonAddition;

/**
 * Represents a button that performs the "Multiplication" operation.
 */
private javax.swing.JButton jButtonMultiplication;

/**
 * Represents a button that performs the "Subtraction" operation.
 */
private javax.swing.JButton jButtonSubtraction;

/**
 * Represents an additional button for future functionality or actions.
 */
private javax.swing.JButton jButton1;

/**
 * Represents an additional button for future functionality or actions.
 */
private javax.swing.JButton jButton2;

/**
 * A label that provides additional information to the user.
 */
private javax.swing.JLabel jLabelAddInfo1;

/**
 * A label prompting the user to insert matrices as shown below the UI.
 */
private javax.swing.JLabel jLabelInsertAsBelow;

/**
 * Provides an insertion tip or guide for the user, Tip 1.
 */
private javax.swing.JLabel jLabelInsertionTip1;

/**
 * Provides an insertion tip or guide for the user, Tip 2.
 */
private javax.swing.JLabel jLabelInsertionTip2;

/**
 * Provides an insertion tip or guide for the user, Tip 3.
 */
private javax.swing.JLabel jLabelInsertionTip3;

/**
 * Provides an insertion tip or guide for the user, Tip 4.
 */
private javax.swing.JLabel jLabelInsertionTip4;

/**
 * Provides an insertion tip or guide for the user, Tip 6.
 */
private javax.swing.JLabel jLabelInsertionTip6;

/**
 * A label indicating Matrix 1 in the user interface.
 */
private javax.swing.JLabel jLabelMatrix1;

/**
 * A label indicating Matrix 2 in the user interface.
 */
private javax.swing.JLabel jLabelMatrix2;

/**
 * A label representing Row 1 for matrix input.
 */
private javax.swing.JLabel jLabelRow1;

/**
 * A label representing Row 2 for matrix input.
 */
private javax.swing.JLabel jLabelRow2;

/**
 * A label representing Row 3 for matrix input.
 */
private javax.swing.JLabel jLabelRow3;

/**
 * A label representing Row 4 for matrix input.
 */
private javax.swing.JLabel jLabelRow4;

/**
 * A label representing Row 5 for matrix input.
 */
private javax.swing.JLabel jLabelRow5;

/**
 * Represents the menu bar of the application.
 */
private javax.swing.JMenuBar jMenuBar1;

/**
 * Represents the "Edit" menu in the menu bar.
 */
private javax.swing.JMenu jMenuEdit;

/**
 * Represents the "File" menu in the menu bar.
 */
private javax.swing.JMenu jMenuFile;

/**
 * Represents a menu item under the "File" menu (potentially for opening files).
 */
private javax.swing.JMenuItem jMenuFile1;

/**
 * Represents a menu item to display help information.
 */
private javax.swing.JMenuItem jMenuHelp;

/**
 * Represents a menu item to handle Matrix 1 operations.
 */
private javax.swing.JMenuItem jMenuMatrix1;

/**
 * Represents a menu item to handle Matrix 2 operations.
 */
private javax.swing.JMenuItem jMenuMatrix2;

/**
 * Represents a menu item to handle output display settings.
 */
private javax.swing.JMenuItem jMenuOutput;

/**
 * Represents a menu item to view previous calculation results.
 */
private javax.swing.JMenuItem jMenuSeeResults;

/**
 * Represents a scroll pane containing some component, typically for scrolling large content.
 */
private javax.swing.JScrollPane jScrollPane1;

/**
 * Represents a second scroll pane containing additional scrollable content.
 */
private javax.swing.JScrollPane jScrollPane2;

/**
 * Represents a split pane that divides the UI into two resizable sections.
 */
private javax.swing.JSplitPane jSplitPane1;

/**
 * Represents a table that displays a history of operations and their results.
 */
private javax.swing.JTable jTable1;

/**
 * Represents a text area to display the output of matrix operations.
 */
private javax.swing.JTextArea jTextAreaOutput;

/**
 * Represents a text field for entering the first row of Matrix 1.
 */
private javax.swing.JTextField jTextMatrix1Row1;

/**
 * Represents a text field for entering the second row of Matrix 1.
 */
private javax.swing.JTextField jTextMatrix1Row2;

/**
 * Represents a text field for entering the third row of Matrix 1.
 */
private javax.swing.JTextField jTextMatrix1Row3;

/**
 * Represents a text field for entering the fourth row of Matrix 1.
 */
private javax.swing.JTextField jTextMatrix1Row4;

/**
 * Represents a text field for entering the fifth row of Matrix 1.
 */
private javax.swing.JTextField jTextMatrix1Row5;

/**
 * Represents a text field for entering the first row of Matrix 2.
 */
private javax.swing.JTextField jTextMatrix2Row1;

/**
 * Represents a text field for entering the second row of Matrix 2.
 */
private javax.swing.JTextField jTextMatrix2Row2;

/**
 * Represents a text field for entering the third row of Matrix 2.
 */
private javax.swing.JTextField jTextMatrix2Row3;

/**
 * Represents a text field for entering the fourth row of Matrix 2.
 */
private javax.swing.JTextField jTextMatrix2Row4;

/**
 * Represents a text field for entering the fifth row of Matrix 2.
 */
private javax.swing.JTextField jTextMatrix2Row5;

    // End of variables declaration//GEN-END:variables
}
