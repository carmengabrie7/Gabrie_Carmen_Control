package Gabrie_Carmen_Filtrar;

import java.util.Scanner;
public class Gabrie_Carmen_Filtrar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solisitar la frase completa
        System.out.println("Ingrese una frase: ");
        String fraseCompleta = scanner.nextLine();
        
        System.out.println("Ingrese un numero entero positivo que representara la longitud minima requerida.");
        int numeroF = scanner.nextInt();
        
        System.out.println("\nPalabras con una longitud mayor a " + numeroF + "son: ");
        
        String palabra = "";
        int contadorPalabras = 0;
        
        for (int i = 0; i < fraseCompleta.length(); i++ ){
            char chaFrase = fraseCompleta.charAt(i);
            
            if (chaFrase != ' '){
                if (Character.isLetterOrDigit(chaFrase)) {
                    palabra += chaFrase;
                }
            } else {
                if ( palabra.length() > numeroF) {
                    System.out.println(palabra);
                    contadorPalabras++;
                }
                palabra = "";
            } 
        }
        if (palabra.length() > numeroF){
            System.out.println(palabra);
            contadorPalabras++;
        }
        
        if (contadorPalabras == 0) {
            System.out.println("No se encontraron palabras con mayort longitud a la propocionada (" + numeroF + ")");
        } else {
            System.out.println("\n El total de palabras es: " + contadorPalabras);
        } 
    }
    
}

