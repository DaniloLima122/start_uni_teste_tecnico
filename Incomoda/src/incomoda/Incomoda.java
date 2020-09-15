/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package incomoda;

import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Incomoda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite um valor inteiro: ");
        
        int vezes = Integer.parseInt(input.nextLine());
        
        String frase = String.join(" ", Collections.nCopies(vezes, "Incomoda")) + " muito mais";
        
        
        System.out.println(frase);
        
    }
    
}
