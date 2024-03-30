/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package palindromo;

/**
 *
 * @author alons
 */
public class Palabra {
    private String caracter;
    
    public Palabra(String Caracter){
        caracter = Caracter;
    }
    
    public void setCaracter(String Caracter){
        this.caracter = Caracter;
    }
    
    public String getPalindromo() {
        String alreves = "";
        for (int i = caracter.length() - 1; i >= 0; i--) {
            alreves += caracter.charAt(i);
        }
        if (caracter.toLowerCase().equals(alreves.toLowerCase())) {
            return "La palabra SI es un palíndromo";
        } 
        else {
            return "La palabra NO es un palíndromo";
        }
    }
}
