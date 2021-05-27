/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;
import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 *
 * @author Jesus Son
 */
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File Country = new File ( "C:\\Users\\Jesus Son\\Documents\\NetBeansProjects\\lab1\\src\\lab1\\Country.csv");
        File City = new File ( "C:\\Users\\Jesus Son\\Documents\\NetBeansProjects\\lab1\\src\\lab1\\City.csv");
        List<String> CountryLines = new ArrayList<>();
        List<String> CityLines = new ArrayList<>();
        List <Country> listCountry = new ArrayList<>();
        List <City> listCity = new ArrayList<>();
        try 
        {
            CountryLines = Files.readAllLines(Country.toPath());
            CityLines = Files.readAllLines(City.toPath());
        }
        catch( Exception e)
        { 
         System.out.println("can't read file");
         return;
        }
        Map<String,List<City>> Directory = new HashMap<>();
        for (int i=0;i<CountryLines.size();i++)
        {
            String line = CountryLines.get(i);
            String [] outWords = line.split(",");
            listCountry.add(new Country(outWords[0],outWords[1]));
            Directory.put(listCountry.get(i).getCountryCode(),new ArrayList<>());
           
        }
        for (int i=0;i<CityLines.size();i++)
        {
           String line = CityLines.get(i);
           String[] outWords = line.split(",");
        
            listCity.add(new City(outWords[0],outWords[1],outWords[2],Integer.parseInt(outWords[3]),Integer.parseInt(outWords[4])));
            System.out.println(listCity.get(i).CityContinent);
        }
         for (int i=0;i<listCity.size();i++){
             //System.out.println(listCity.get(i).CityContinent)
             List <City> final_list = Directory.get(listCity.get(i).CityCode);
             //System.out.println(listCity.get(i).CityCode);
             final_list.add(listCity.get(i));
             
             //System.out.println(final_list);
             Directory.put(listCity.get(i).CityCode, final_list);
             
          
           
         }
         System.out.println(Directory);
        
    }
    
    
}
