package com.javier.conversor.userInterface;

import javax.swing.JOptionPane;

public class WindowError {

public void creaVentana(String mensaje){
    JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }
    
}
