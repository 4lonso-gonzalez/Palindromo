/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palindromo;

import java.util.Scanner;

/**
 *
 * @author alons
 */
public class Palindromo {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("MENU DETECTOR DE PALINDROMOS");
            System.out.println("1. Analizar palabra");
            System.out.println("2. Cerrar detector");
            System.out.println("Ingrese una opcion: ");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Escriba una palabra a analizar: ");
                    String caracter = leer.next();
                    Palabra analisis = new Palabra(caracter);
                    String pal = analisis.getPalindromo();
                    System.out.println("EL ANALISIS DIO ESTE RESULTADO: ");
                    System.out.println(pal);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("CERRANDO DETECTOR");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (opcion != 2);
    }
}
