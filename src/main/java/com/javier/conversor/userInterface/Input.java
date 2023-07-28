
package com.javier.conversor.userInterface;

import javax.swing.JOptionPane;


public class Input{

    private Double valor;
   
    public void crearVentana() {
            Object input = JOptionPane.showInputDialog(null, 
                "Ingrese la cantidad de dinero a convertir:",
                0.0);
                
                valor = Double.parseDouble(input.toString());
                
    
    }

    public Double getValor(){
        return this.valor;
    
    }

}

