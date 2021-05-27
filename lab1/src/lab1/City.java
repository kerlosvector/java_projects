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
public class City {
    public City(String cityCode,String cityName,String cityContinent,Integer citySurfaceArea,Integer cityPopulation){
       
       CityCode = cityCode;
       CityName = cityName;
       CityContinent = cityContinent;
       CitySurfaceArea = citySurfaceArea;
       CityPopulation = cityPopulation;
    }

    public String getCityName() {
        return CityName;
    }

    public void setCityName(String CityName) {
        this.CityName = CityName;
    }

    public String getCityCode() {
        return CityCode;
    }

    public void setCityCode(String CityCode) {
        this.CityCode = CityCode;
    }

    public Integer getCitySurfaceArea() {
        return CitySurfaceArea;
    }

    public void setCitySurfaceArea(Integer CitySurfaceArea) {
        this.CitySurfaceArea = CitySurfaceArea;
    }

    public String getCityContinent() {
        return CityContinent;
    }

    public void setCityContinent(String CityContinent) {
        this.CityContinent = CityContinent;
    }

    public Integer getCityPopulation() {
        return CityPopulation;
    }

    public void setCityPopulation(Integer CityPopulation) {
        this.CityPopulation = CityPopulation;
    }
    
    String CityName;
    String CityCode;
    Integer CitySurfaceArea;
    String CityContinent;
    Integer CityPopulation;
    
    
    
            
}
