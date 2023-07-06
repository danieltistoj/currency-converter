/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.currencyconverter.Class;
import com.currencyconventer.Enum.Country;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.HashMap;

import org.json.JSONException;
import org.json.JSONObject;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author Usuario
 */
public class ApiClient {
    private String uri = "https://api.exchangerate-api.com/v4/latest/";
    private ArrayList<Currency> listCurrency;
   
    public ApiClient() {
        listCurrency = new ArrayList<>();
    }
    /**
     * 
     * @return 
     */
    public ArrayList callApi(String code) {
        if (this.getCountryByCurrencyCode(code) != null) {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(uri + code))
                    .build();

            try {
                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

                int statusCode = response.statusCode();
                String responseBody = response.body();
                try {
                    /**
                     * takes a JSON object, extracts a nested object and its
                     * associated keys and values, and stores them in a HashMap
                     * for further use and manipulation.
                     *
                     * toma un objeto JSON, extrae un objeto anidado y sus
                     * claves y valores asociados, y los almacena en un HashMap
                     * para su posterior uso y manipulación.
                     */
                    JSONObject json = new JSONObject(responseBody);
                    JSONObject rates = (JSONObject) json.get("rates");

                    Iterator keys = rates.keys();

                    while (keys.hasNext()) {
                        String key = (String) keys.next();
                        Object value = rates.get(key);
                        listCurrency.add(new Currency(key, Double.parseDouble(value.toString())));
                        //hashmap.put(key, value);
                    }

                    listCurrency.forEach((currency)
                            -> {
                        Country country = this.getCountryByCurrencyCode(currency.getKey());
                        if (country != null) {
                            currency.setCountry(country.getCountryName());
                        }
                    });

                } catch (JSONException ex) {
                    System.out.println("Error");
                }
            } catch (IOException | InterruptedException e) {
                System.out.println("Error");
            }
        }else{
            System.out.println("the currency code does not exist");
        }

        return this.listCurrency;
    }
    /**
     * 
     * @param currencyCode
     * @return 
     */
    private Country getCountryByCurrencyCode(String currencyCode) {
        for (Country country : Country.values()) {
            if (country.getCurrencyCode().equals(currencyCode)) {
                return country;
            }
        }
        return null;
    }
}
