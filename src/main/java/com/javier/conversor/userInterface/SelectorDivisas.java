package com.javier.conversor.userInterface;

import com.javier.conversor.model.Divisas;
import javax.swing.JOptionPane;

public class SelectorDivisas {
    
    private final Object[] options = Divisas.values();
    private String divisa; 
    
    public void crearVentana(String mensaje) {
          
            Object selector = JOptionPane.showInputDialog(
            null,
            mensaje,
            "Selector de Divisas", 
            JOptionPane.QUESTION_MESSAGE,
            null,
            options,
            "Seleccione una divisa");
            divisa = selector.toString();
         
    }
    
    

    public String getDivisa(){
        for (Divisas divisa : Divisas.values()){
            if (this.divisa == divisa.name()) {
                return divisa.codigo;
            }
        }  
        
            return this.divisa;
   
    }

    public SelectorDivisas() {
           }

    
    
}
