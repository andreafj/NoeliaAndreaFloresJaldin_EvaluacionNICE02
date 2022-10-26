package finalpr.finalproject;

import javax.swing.JOptionPane;

/**
 *
 * @author Andrea
 */
public class FinalProject {

    public static void main(String[] args) {
        //System.out.println("Hello World! :D");
        
        String cadena = JOptionPane.showInputDialog("Digite una cadena");
        
   
        //Dividimos la cadena por espacios en un array
        String [] arrayPalabras = cadena.split("\\s+");
        
        String [] arrayResultado = new String[arrayPalabras.length];
        
        
        //Recorremos cada palabra para buscar el inner content
        for (int i = 0; i < arrayPalabras.length; i++) {
            
            //Solo si la palabra es mayor a 3 buscamos inner content
            if(arrayPalabras[0].length()>3){
                //Aqui conseguimos el inner content
                String innerContent =conseguirInnerContent(arrayPalabras[0]);
                //Aqui juntamos la palabras de nuevo es decir primer caracter y ultimo con el inner en orden descendente
                String ordenDescendente = ordernarDescendente(innerContent,arrayPalabras[0])
                
            }
            else{
                arrayResultado[i]=arrayPalabras[i];
            }
        }
        
        
        
    }
    
     
}
