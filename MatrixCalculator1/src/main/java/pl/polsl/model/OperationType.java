/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package pl.polsl.model;

/**
 * Enum to represent matrix operations.
 * @author MIKOŁAJ MACH
 * @version 1.1
 */
public enum OperationType {
    /**
     * Addition in enum
     */
    ADDITION("Addition"),
    /**
     * Subtraction in enum
     */
    SUBTRACTION("Subtraction"),
    /**
     * Multiplication in enum
     */
    MULTIPLICATION("Multiplication");

    /**
     * Descritpion for enum
     */
    private final String description;

    /**
     * The Operation Type for enum operations
     * @param description desctiption of Operation Type
     */
    OperationType(String description) {
        this.description = description;
    }

    /**
     *  Getting Description for enum
     * @return description for enum
     */
    public String getDescription() {
        return description;
    }
}
