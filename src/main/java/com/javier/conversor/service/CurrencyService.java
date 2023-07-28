package com.javier.conversor.service;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import org.json.JSONException;
import org.json.JSONObject;

public class CurrencyService {


    private String amount;

//    constructor

    public CurrencyService() {
        
    }
        
    
    public String getAmount(){
        return amount;
    }
    

    
    /**
     * Metodo que se conecta, a la API y le hace una consulta mediante el verbo GET, 
     * @param baseCode String que representa la divisa que vamos a convertir.
     * @param targetCode String que reprensenta la divisa la cual vamos a convertir 
     * @return Un String del JSON completo traido de la API
     */
    
    public String conectarse(String baseCode, String targetCode, String amount) {
        StringBuilder informationString = new StringBuilder();
        String sAmount = String.valueOf(amount);
        try {
            URL url = new URL("https://v6.exchangerate-api.com/v6/7141b97dafbf959f196bc764/pair/" + baseCode + "/" + targetCode + "/" + sAmount);
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            request.setRequestMethod("GET");
            request.connect();

            int responseCode = request.getResponseCode();
            if (responseCode != 200) {
                throw new RuntimeException("Ocurrio un error " + responseCode);

            } else {

                Scanner scanner = new Scanner(url.openStream());
                while (scanner.hasNext()) {
                    informationString.append(scanner.nextLine());
                }

                scanner.close();

            }

        } catch (Exception error) {

            error.printStackTrace();
        }
        return convertir(informationString.toString());
    }
    
    public String convertir(String jsonString) {
        String conversionResult = "";
        
        try {
            JSONObject objeto1 = new JSONObject(jsonString);
            conversionResult = objeto1.getString("conversion_result");
        } catch (JSONException error) {
            System.out.println("Error en el Json, no se pudo convertir");
            error.printStackTrace();
        }
        return conversionResult;
    }
}
