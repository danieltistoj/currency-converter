/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.currencyconverter.main;
import com.currencyconverter.Class.ApiClient;
import com.currencyconverter.Class.Currency;
import java.util.ArrayList;
import com.currencyconverter.Interface.MainInterface;
/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new MainInterface();
        /*
        ApiClient apiClient = new ApiClient();
        ArrayList<Currency> lista =  apiClient.callApi("GTQ");
        System.out.println(" ");
        /*
        lista.sort((Currency c1,Currency c2)-> 
                c1.getKey().compareTo(c2.getKey())
        );

        lista.forEach((currency)->
                System.out.println(currency.getCountry()));
 */   
                
}
   
    
}
