package com.javier.conversor.userInterface;

import javax.swing.JOptionPane;

public class Continuar {

    private int confirmado;
    
    public void crearVentana(){
        confirmado = JOptionPane.showConfirmDialog(null,
                "Desea Continuar?");
        
    
    }
    
    public int getConfirmado(){
    return confirmado;
    }    
}
