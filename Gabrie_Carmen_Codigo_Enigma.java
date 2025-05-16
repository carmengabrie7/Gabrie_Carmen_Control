package Gabrie_Carmen_Codigo_Enigma;

import java.util.Scanner;
public class Gabrie_Carmen_Codigo_Enigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int opcion = 0;
        
        while (opcion != 3) {
            System.out.println("\nMenu: ");
            System.out.println("1. Encriptar texto");
            System.out.println("2. Desencriptar texto");
            System.out.println("3. Regresar");
            System.out.println("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            if (opcion == 1){
                    System.out.println("\nIngrese el texto a encripatar: ");
                    
                    String textoEncrip = scanner.nextLine();
                    String pares = "";
                    String impares = "";
                    
                    int i = 0;
                    while (i < textoEncrip.length()){
                        char chaEncrip = textoEncrip.charAt(i);
                        if (i % 2 == 0){
                            pares += chaEncrip;
                        } else {
                            impares += chaEncrip;
                        }
                        i++;
                    }
                    
                    String encriptedTxt = pares + impares;
                    System.out.println("Texto encriptado: " + encriptedTxt);
                    
            } else if (opcion == 2) {
                System.out.println("Ingrese el texto encriptado: ");
                String encripted = scanner.nextLine();
                int mitad = (encripted.length() +1)/ 2;
                String pares = "";
                String impares = "";
                
                int i = 0;
                while (i < encripted.length()) {
                    if (i < mitad) {
                        pares += encripted.charAt(i);
                    } else {
                        impares += encripted.charAt(i);
                    }
                    i++;
                }
                String original = "";
                // use j para no confundirlo con la i de ariba
                int j = 0;
                while (j < pares.length() || j < impares.length()){
                    if (j < pares.length()){
                        original += pares.charAt(j);
                    }
                    if (j < impares.length()){
                        original += impares.charAt(j);
                    }
                    j++;
                }
                
                System.out.println("Texto desencriptado es: " + original);
                
            } else if (opcion == 3) {
                System.out.println("Saliendo del programa...");
            } else {
                System.out.println("Opcion no valida");
            }

            
            
        }
    }
    
}
