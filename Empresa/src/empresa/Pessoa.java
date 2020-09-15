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
public abstract class Pessoa {
    
    private String nome = "José";
    private String rg = "123456789";
    
 
    public String geNome(){
        return this.nome;
    }
    
    public String geRG(){
        return this.rg;
    }
}
