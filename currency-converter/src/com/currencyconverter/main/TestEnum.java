/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.currencyconverter.main;

import com.currencyconverter.Enum.Country;

/**
 *
 * @author Usuario
 */
public class TestEnum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String currencyCode = "GTQ"; // Código de moneda a buscar

        Country country = getCountryByCurrencyCode(currencyCode);
        if (country != null) {
            String countryName = country.getCountryName();
            System.out.println("El país correspondiente al código de moneda " + currencyCode + " es: " + countryName);
        } else {
            System.out.println("No se encontró ningún país con el código de moneda " + currencyCode);
        }
    }
    private static Country getCountryByCurrencyCode(String currencyCode) {
        for (Country country : Country.values()) {
            if (country.getCurrencyCode().equals(currencyCode)) {
                return country;
            }
        }
        return null;
    }
    
}
