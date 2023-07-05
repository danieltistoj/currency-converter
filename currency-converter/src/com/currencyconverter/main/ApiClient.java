/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.currencyconverter.main;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Collections;
import java.util.HashMap;

import org.json.JSONException;
import org.json.JSONObject;
import java.util.Iterator;
/*
import com.google.gson.Gson;
import com.google.gson.JsonObject;
*/
public class ApiClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.exchangerate-api.com/v4/latest/GTQ"))
                .build();
        
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            
            int statusCode = response.statusCode();
            String responseBody = response.body();
            try {
                JSONObject json = new JSONObject(responseBody);
                JSONObject rates = (JSONObject) json.get("rates");
                Iterator keys = rates.keys();
                HashMap<String,Object> hashmap = new HashMap<>();
                while(keys.hasNext()){
                    String key = (String) keys.next();
                    Object value = rates.get(key);
                    hashmap.put(key, value);
                }
                
            hashmap.forEach((key,value)->System.out.println(key));
           
            System.out.println(hashmap.get("USD"));
            } catch (JSONException ex) {
                System.out.println("Error");
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}
