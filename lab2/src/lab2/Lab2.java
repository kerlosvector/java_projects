/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Jesus Son
 */
public class Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String a="hi";
        String b="world";
        String c="12kk";
        
        // TODO code application logic here
        StringTestInterface isBetter = (n, m) -> (n.length()>m.length()) ; 
        StringCheck isletter = (n) -> (n.matches("^[a-zA-Z]*$")) ; 
if(isBetter.test(a, b)){
   System.out.println("first element is better and the first element is "+a);  
} 
if(!isBetter.test(a, b)){
   System.out.println("second element is better and the second element is "+b);  
}
if(isletter.check(a)){
   System.out.println("string contain only letters");  
} 
if(!isletter.check(a)){
   System.out.println("string not only contain  letters");  
} 

    }
    
}
