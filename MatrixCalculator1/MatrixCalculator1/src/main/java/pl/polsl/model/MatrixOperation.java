/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pl.polsl.model;

import java.util.List;

@FunctionalInterface
public interface MatrixOperation {
    List<List<Integer>> apply(List<List<Integer>> matrix1, List<List<Integer>> matrix2) throws MatrixOperationException;
}

