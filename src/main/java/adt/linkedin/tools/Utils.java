/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adt.linkedin.tools;

/**
 *
 * @author dev
 */
public class Utils {
    
    public static boolean isNumeric(String sequence){
        for (char c : sequence.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
    
}
