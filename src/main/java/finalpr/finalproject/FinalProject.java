package finalpr.finalproject;

import java.util.Arrays;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author Andrea
 */
public class FinalProject {

    public static void main(String[] args) {
        String cadena = JOptionPane.showInputDialog("Ingrese una cadena"); 
   
   
        //Dividimos la cadena por espacios en un array
        String [] arrayPalabras = cadena.split("\\s+");
        
        String [] arrayResultado = new String[arrayPalabras.length];
        
        
        //Recorremos cada palabra para buscar el inner content
        for (int i = 0; i < arrayPalabras.length; i++) {
            
            //Solo si la palabra es mayor a 3 buscamos inner content
            if(arrayPalabras[i].length()>3){
                //Aqui conseguimos el inner content
                String innerContent =conseguirInnerContent(arrayPalabras[i]);
                
                //Aqui juntamos la palabras de nuevo es decir primer caracter y ultimo con el inner en orden descendente
                String palabraCompletaFinal = ordernarDescendente(innerContent,arrayPalabras[i]);
                arrayResultado[i]=palabraCompletaFinal;
            }
            else{
                arrayResultado[i]=arrayPalabras[i];
            }
        }
        
        mostrarRespuesta(arrayResultado);
    }
    
    public static String conseguirInnerContent(String palabra){
        return palabra.substring(1, palabra.length()-1);
    }
    
    public static String ordernarDescendente(String innerContent, String palabraOriginal){
         String[] arrayCaracter=innerContent.split("");
         Arrays.sort(arrayCaracter, Collections.reverseOrder());
         
         String innerContentDes = unirLetras(arrayCaracter);
         String primeraletra=String.valueOf(palabraOriginal.charAt(0));
         String ultimaletra = String.valueOf(palabraOriginal.charAt(palabraOriginal.length()-1));
         String palabraCompleta = primeraletra.concat(innerContentDes).concat(ultimaletra);
         
         return palabraCompleta;
    } 
    
    public static String unirLetras(String [] caracteres){
        String respuesta ="";
        for (int i = 0; i < caracteres.length; i++) {
            respuesta = respuesta+caracteres[i];
        }
        return respuesta;
    }
    
    public static void mostrarRespuesta(String [] arrayResultado){
        String cadenaCompleta ="";
        for (int i = 0; i < arrayResultado.length; i++) {
            //System.out.print(arrayResultado[i]+" ");
            cadenaCompleta=cadenaCompleta+arrayResultado[i]+ " ";
        }
        
        JOptionPane.showMessageDialog(null,cadenaCompleta);   
    }
}
