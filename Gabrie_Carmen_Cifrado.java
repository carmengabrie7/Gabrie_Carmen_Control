package gabrie_carmen_cifrado;

import java.util.Scanner;

public class Gabrie_Carmen_Cifrado {

    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
        System.out.println("****************************");
    //en esta parte le pedimos al usuario los datos
        System.out.println("\nIngresa la frase a cifrar: ");
        String frase = input.nextLine();
        System.out.println("Ingresa el número de posiciones a desplazar: ");
        int posiciones = input.nextInt();
        
        System.out.println("\n****************************");
        //resultado (aqui usamos el método creado.)
        String resultado = cifrar_cesar(frase,posiciones);
        System.out.println("\nFrase cifrada: "+resultado);
        
    
    }
    
    /*
    !! cifrado cesar = se encarga de desplazar letras de una frase conforme al número ingresado.
    (para esto creamos un método.)     
    */
    
    public static String cifrar_cesar(String texto, int posiciones){
       String resultado= "";
       
       for (char c : texto.toCharArray()) {
           if (Character.isUpperCase(c)){
               /* c - 'A' se encarga de convertir la letra en un número del 0 al 25.
               luego le sumamos el desplazamiento, % 26 es para volver al inicio si se pasa del 25,
               'A' es para convertir ese número en letra.
               */
               char cifrado = (char) ((c - 'A' + posiciones) % 26 + 'A');
               resultado+= cifrado;
           } else if (Character.isLowerCase(c)){
               char cifrado = (char) ((c - 'a' + posiciones)% 26 + 'a');
               resultado+= cifrado;
           } else{  
              resultado += c; 
               
           }
       }
        return resultado.toString();
        
    }
        
         
    
}

