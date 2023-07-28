package com.javier.conversor;

import com.javier.conversor.model.Divisas;
import com.javier.conversor.service.CurrencyService;
import com.javier.conversor.userInterface.Continuar;
import com.javier.conversor.userInterface.Input;
import com.javier.conversor.userInterface.SelectorDivisas;
import com.javier.conversor.userInterface.Total;
import com.javier.conversor.userInterface.MenuPrincipal;
import com.javier.conversor.userInterface.Terminar;
import com.javier.conversor.userInterface.WindowError;

public class Conversor {

    public static void main(String[] args) {

        int continuacion = 0;

        while (continuacion == 0) {
            MenuPrincipal menu = new MenuPrincipal();
            menu.crearVentana();

            if (menu.getSeleccion() == "Conversor de Divisas") {
                String divisaBase;
                String divisaObjetivo;
                Double monto = 0.0;
                boolean seguir = true;

                SelectorDivisas selector = new SelectorDivisas();
                selector.crearVentana("Elija la moneda Base");
                divisaBase = selector.getDivisa();
                selector.crearVentana("Elija la moneda objetivo");
                divisaObjetivo = selector.getDivisa();

                Input input = new Input();

                while (seguir) {

                    try {

                        seguir = false;
                        input.crearVentana();
                        monto = input.getValor();

                    } catch (Exception exception) {
                        WindowError windowError = new WindowError();
                        windowError.creaVentana("Deberias ingresar un numero! Vuelve a Intentarlo");
                        seguir = true;
                    }

                }

                CurrencyService conversor = new CurrencyService();
                Total total = new Total();
                total.crearVentana(conversor.conectarse(divisaBase, divisaObjetivo, monto.toString()));
                
                Continuar continuar = new Continuar();
                continuar.crearVentana();

                continuacion = continuar.getConfirmado();
                
                if (continuacion == 1) {
                    Terminar terminar = new Terminar();
                    terminar.crearVentana();

                }
            }

        }

    }
}
