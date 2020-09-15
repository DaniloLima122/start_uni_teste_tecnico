/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

/**
 *
 * @author usuario
 */
public class Empresa {

    public static void main(String[] args) {

        float salario_Inicial = 1000f;

        int ano_atual = 2020;

        int anoContratacao = 2016;

        float aumentoPercentual = 0.015f;

        Funcionario func = new Funcionario();
        
        
        //Salario 2017
        func.setSalario_inicial(salario_Inicial);
        
        func.setPercentual(aumentoPercentual);
        
        func.setSalario_total(func.getSalario_inicial() + func.getSalario_inicial() * func.getPercentual());
        
        //Salario 2018
        aumentoPercentual = aumentoPercentual * 2;
        
        
        func.setSalario_total(func.getSalario_total() + func.getSalario_total() * aumentoPercentual);
        
        //Salario 2019
        aumentoPercentual = aumentoPercentual * 2;
        
        
        func.setSalario_total(func.getSalario_total() + func.getSalario_total() * aumentoPercentual);
        
        aumentoPercentual = aumentoPercentual * 2;
        

        func.setSalario_total(func.getSalario_total() + func.getSalario_total() * aumentoPercentual);
        
        
        //Salario 2020
        aumentoPercentual = aumentoPercentual * 2;
        
        
        func.setSalario_total(func.getSalario_total() + func.getSalario_total() * aumentoPercentual);
        
        aumentoPercentual = aumentoPercentual * 2;
        

        func.setSalario_total(func.getSalario_total() + func.getSalario_total() * aumentoPercentual);

        System.out.println("Nome: " + func.geNome());
        System.out.println("RG: " + func.geRG());
        System.out.println("Salario em 2020: " + func.getSalario_total());
        
        
    }

}
