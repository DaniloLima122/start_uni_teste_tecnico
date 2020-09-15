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
public class Funcionario extends Pessoa{
    
    private float salario_inicial;
    private float percentual;
    private float salario_total;

    @Override
    public String geNome() {
        return super.geNome(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String geRG() {
        return super.geRG(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
 
    public float getSalario_inicial() {
        return salario_inicial;
    }

    public void setSalario_inicial(float salario_inicial) {
        this.salario_inicial = salario_inicial;
    }

    public float getPercentual() {
        return percentual;
    }

    public void setPercentual(float percentual) {
        this.percentual = percentual;
    }

    public float getSalario_total() {
        return salario_total;
    }

    public void setSalario_total(float salario_total) {
        this.salario_total = salario_total;
    }
    
    
      
}
