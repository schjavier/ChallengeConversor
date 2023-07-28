package com.javier.conversor.userInterface;

import javax.swing.JOptionPane;

public class MenuPrincipal {

    private Object[] opciones = new Object[]{"Conversor de Divisas"};
    private String seleccion;
    
    
    public void crearVentana() {
        
                Object menu = JOptionPane.showInputDialog(
                null,
                "Seleccione un conversor",
                "Menu",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                "Conversor de Divisas");
                seleccion = menu.toString();
    }

    public String getSeleccion(){
        return this.seleccion;
    }
    
    public Object[] getOpciones(){
        return this.opciones;
    }
    
    public String getOpcion(int indice){
        return this.opciones[indice].toString();
    }
}
