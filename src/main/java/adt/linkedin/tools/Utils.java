/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adt.linkedin.tools;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author dev
 */
public class Utils {
    
    public static final String FONT = "Liberation Sans";
    public static final String USERNAME_REGEX = "^[a-z]+$";
    public static final String PASSWORD_REGEX = "^[a-zA-Z\\d]{8,}$";
    public static final String PHONE_REGEX = "^[6-9][0-9]{8}$";
    public static final String EMAIL_REGEX = "^[A-Za-z0-9.]+@[a-z.]+[a-z]{2,}$";
    public static final String MEANSCORE_REGEX = "^(?:10|\\d(?:[.,]\\d{1,2})?|0?[.,]\\d[0-9][.,]\\d)$";
    
    
    public static final Color PURPLE = new Color(153,102,255);
    
    public static boolean matchesUsernameRegex(String username){
        return username.matches(USERNAME_REGEX);
    }
    public static boolean matchesPasswordRegex(String password, String repeat){
        return password.matches(PASSWORD_REGEX) && password.equals(repeat);
    }
    public static boolean matchesEmailRegex(String email){
        return email.matches(EMAIL_REGEX);
    }
    public static boolean matchesPhoneRegex(String phone){
        return phone.matches(PHONE_REGEX);
    }
    
    public static boolean isNumeric(String sequence){
        for (char c : sequence.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
    
    public static void mouseEntered(JLabel label){
        label.setFont(new Font(Utils.FONT, 1, label.getFont().getSize()));
    }
    
    public static void mouseExited(JLabel label){
        label.setFont(new Font(Utils.FONT, 0, label.getFont().getSize()));
    }
    
    public static void mouseEntered(JTextField field){
        field.setFont(new Font(Utils.FONT, 1, field.getFont().getSize()));
    }
    
    public static void mouseExited(JTextField field){
        field.setFont(new Font(Utils.FONT, 0, field.getFont().getSize()));
    }
    
}
