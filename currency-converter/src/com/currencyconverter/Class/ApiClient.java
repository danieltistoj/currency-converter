/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.currencyconverter.Class;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import org.json.JSONException;
import org.json.JSONObject;
import java.util.Iterator;
import java.util.List;
/**
 *
 * @author Usuario
 */
public class ApiClient {
    private HashMap<String,Object> hashmap;
    private String uri = "https://api.exchangerate-api.com/v4/latest/GTQ";
    private List<Currency> listCurrency;
    private String[] contries = {
        "Fiyi",
        "México",
        "Seychelles",
        "Tuvalu",
        "República Democrática del Congo",
        "Barbados",
        "Guatemala",
        "Chile",
        "Honduras",
        "Uganda",
        "Sudáfrica",
        "Túnez",
        "Santo Tomé y Príncipe",
        "Sierra Leona",
        "Bahamas",
        "Sierra Leona",
        "Sudán",
        "Irak",
        "Cuba",
        "Gambia",
        "Taiwán",
        "Serbia",
        "República Dominicana",
        "Comoras",
        "Malasia",
        "Islas Malvinas",
        "África Occidental Franco CFA",
        "Georgia",
        "Uruguay",
        "Marruecos",
        "Cabo Verde",
        "Tonga",
        "Azerbaiyán",
        "Omán",
        "Papúa Nueva Guinea",
        "Kenia",
        "Suecia",
        "Bután",
        "Ucrania",
        "Guinea Ecuatorial",
        "Eritrea",
        "Mozambique",
        "Argentina",
        "Catar",
        "Irán",
        "China",
        "Tailandia",
        "Uzbekistán",
        "Franco CFP",
        "Mauritania",
        "Bangladesh",
        "Libia",
        "Bermudas",
        "Kuwait",
        "Filipinas",
        "Rusia",
        "Paraguay",
        "Islandia",
        "Jamaica",
        "Colombia",
        "Estados Unidos",
        "Macedonia del Norte",
        "Argelia",
        "Panamá",
        "Guernsey",
        "Singapur",
        "Etiopía",
        "Jersey",
        "Kirguistán",
        "Somalia",
        "Vanuatu",
        "Laos",
        "Brunéi",
        "África Central Franco CFA",
        "Liberia",
        "Suiza",
        "Croacia",
        "Albania",
        "Yibuti",
        "Venezuela",
        "Zambia",
        "Tanzania",
        "Vietnam",
        "Australia",
        "Israel",
        "Ghana",
        "Guyana",
        "Bolivia",
        "Camboya",
        "Moldavia",
        "Indonesia",
        "Islas Caimán",
        "Armenia",
        "Botsuana",
        "Santa Elena, Ascensión y Tristán de Acuña",
        "Turquía",
        "Líbano",
        "Tayikistán",
        "Jordania",
        "Emiratos Árabes Unidos",
        "Hong Kong",
        "Ruanda",
        "Euro",
        "Islas Feroe",
        "Lesoto",
        "Dinamarca",
        "Canadá",
        "Islas Cocos",
        "Bulgaria",
        "Myanmar",
        "Mauricio",
        "Noruega",
        "Siria",
        "Isla de Man",
        "Zimbabue",
        "Gibraltar",
        "Rumania",
        "Sri Lanka",
        "Nigeria",
        "Costa Rica",
        "República Checa",
        "Pakistán",
        "Dólar del Caribe Oriental",
        "Antillas Neerlandesas",
        "Haití",
        "Baréin",
        "Kazajistán",
        "Surinam",
        "Suazilandia",
        "Arabia Saudita",
        "Trinidad y Tobago",
        "Yemen",
        "Maldivas",
        "Afganistán",
        "India",
        "Aruba",
        "Corea del Sur",
        "Nepal",
        "Japón",
        "Mongolia",
        "Angola",
        "Polonia",
        "Reino Unido",
        "Islas Salomón",
        "Bielorrusia",
        "Hungría",
        "Burundi",
        "Malaui",
        "Madagascar",
        "Derechos Especiales de Giro",
        "Belice",
        "Bosnia y Herzegovina",
        "Egipto",
        "Macao",
        "Namibia",
        "Sudán del Sur",
        "Nicaragua",
        "Perú",
        "Nueva Zelanda",
        "Samoa",
        "Turkmenistán",
        "Brasil"
    };

    public ApiClient() {
        listCurrency = new ArrayList<>();
    }
    /**
     * 
     * @return 
     */
    public List callApi(){
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(uri))
                .build();
        
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            
            int statusCode = response.statusCode();
            String responseBody = response.body();
            try {
                /**
                 * takes a JSON object, extracts a nested object and its associated 
                 * keys and values, and stores them in a HashMap for further use and 
                 * manipulation.
                 * 
                 * toma un objeto JSON, extrae un objeto anidado y sus claves y valores 
                 * asociados, y los almacena en un HashMap para su posterior uso y 
                 * manipulación.
                 */
                JSONObject json = new JSONObject(responseBody);
                JSONObject rates = (JSONObject) json.get("rates");
                
                Iterator keys = rates.keys();
                HashMap<String,Object> hashmap = new HashMap<>();
                while(keys.hasNext()){
                    String key = (String) keys.next();
                    Object value = rates.get(key);
                    hashmap.put(key, value);
                }
            /**
             * 
             * iterates over the elements of a HashMap and creates Currency 
             * objects from the keys and values of the 
             * HashMap, then adds these objects to a list called listCurrency . 
             * The end result is a list of Currency objects 
             * that represent the key-value pairs of the HashMap.
             * 
             * 
             * Itera sobre los elementos de un HashMap y crea objetos Currency a 
             * partir de las claves y los valores del HashMap, luego agrega estos 
             * objetos a una lista llamada listCurrency. El resultado final es una lista 
             * de objetos Currency que representa los pares clave-valor del HashMap.
             * 
             */
            hashmap.forEach((key,value)->{
                listCurrency.add(new Currency(key,Integer.parseInt(value.toString()))); 
                  
            });
            
           for(int i=0;i<this.contries.length;i++){
               listCurrency.get(i).setCountry(this.contries[1]);
           }
            
            } catch (JSONException ex) {
                System.out.println("Error");
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        return this.listCurrency;
    }
    
}
