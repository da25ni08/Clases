/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utils;

import java.util.regex.*;

/**
 *
 * @author kirin
 */
public class Utils {
    public static boolean checkDni(String dni) {
            Pattern pattern = Pattern.compile("[0-9]{8}[A-Z]");
            Matcher matcher =  pattern.matcher(dni);
            return matcher.matches();
        }
    
    public static boolean checkIban(String iban) {
            Pattern pattern = Pattern.compile("ES[0-9]{20}");
            Matcher matcher =  pattern.matcher(iban);
            return matcher.matches();
        }
}
