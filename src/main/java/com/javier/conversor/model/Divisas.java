/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.javier.conversor.model;

/**
 *
 * @author schja
 */
public enum Divisas {
    
    PESO_ARGENTINO ("ARS"), 
    DOLAR_EEUU ("USD"),
    EURO ("EUR"),
    PESO_URUGUAYO ("UYU"),
    GUARANI ("PYG"),
    REAL_BRASILERO ("BRL"),
    SOL_PERUANO ("PEN"),
    PESO_COLOMBIANO ("COP"),
    PESO_CHILENO ("CLP"),
    BOLIVIANO ("BOB"),
    BOLIVAR_VENEZOLANO ("VES"),
    PESO_CUBANO ("CUB"),
    COLON_COSTARICA ("CRC"),
    PESO_DOMINICANO ("DOP"),
    PESO_MEXICANO ("MXN");
    
   public final String codigo;
   
   
   Divisas(String codigo){
   this.codigo = codigo;
   }
   
}
