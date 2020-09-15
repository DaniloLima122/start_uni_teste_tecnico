/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datavalida;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Datavalida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        int dia,mes,ano;
        
        int Anoatual = 2018;
        
        boolean valido = true;
        
        System.out.print("Em que dia você nasceu?: ");
        dia = Integer.parseInt(input.nextLine());
        
        System.out.print("Em que mês?: ");
        mes = Integer.parseInt(input.nextLine());
        
        System.out.print("E em qual ano?: ");
        ano = Integer.parseInt(input.nextLine());
        
        
        if(dia > 31 || dia < 1){
            
            System.err.println("Data inválida - O mês só tem 31 dias");
            valido = false;
        }
        if(mes > 12 || mes < 1){
            
            System.err.println("Data inválida - O ano só tem 12 meses");
            valido = false;
        }
        if(ano >= 2018 || ano < 1){
        
            System.err.println("Data inválida - Ano de nascimento maior ou igual o ano atual!");
            valido = false;
           
        }
       
        if(valido){
            
            System.err.println("Data válida!");
        }    
        
            
        
    }
    
}
