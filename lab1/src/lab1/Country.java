/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Jesus Son
 */
public class Country {
    public Country (String countryCode ,String countryName){
    
     CountryCode =countryCode;
      CountryName = countryName ;
    } 

    public String getCountryName() {
        return CountryName;
    }

    public void setCountryName(String CountryName) {
        this.CountryName = CountryName;
    }

    public String getCountryCode() {
        return CountryCode;
    }

    public void setCountryCode(String CountryCode) {
        this.CountryCode = CountryCode;
    }
    String CountryCode;
    String CountryName;
   
    
}
