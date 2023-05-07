/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package No_2;

/**
 *
 * @author HP
 */


import java.lang.*;
import java.io.*;
import java.util.*;


public class ReverseString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
 
        String input = "Pemrograman";
 
        // getBytes() method to convert string
        // into bytes[].
        byte[] strAsByteArray = input.getBytes();
 
        byte[] result = new byte[strAsByteArray.length];
 
        // Store result in reverse order into the
        // result byte[]
        for (int i = 0; i < strAsByteArray.length; i++)
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];
 
        System.out.println(new String(result));
    }
}
        
        
        
        
   
 
