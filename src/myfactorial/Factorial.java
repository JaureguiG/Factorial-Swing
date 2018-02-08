/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfactorial;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class Factorial {
    //Lusta de atributos
    private int numero;
    
    //Constructores
    public Factorial(){
        setNumero(0);        
    }
    public Factorial(int numero){
        setNumero(numero);
    }
    
    //Setter´s y Getter´s
    public void setNumero(int numero){
        if (numero>0)   //encapsulamiento
            this.numero=numero;
        else
            JOptionPane.showMessageDialog(null,"no acepta negativos");
    }
    
    public int getNumero(){
        return numero;
    }
    public int calcular(){
        int acumulador=1;
        for(int i=getNumero(); i>1;i--){
            acumulador*=i;
        }
        return acumulador;
    }
}
