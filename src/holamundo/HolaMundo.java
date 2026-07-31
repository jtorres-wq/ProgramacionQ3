/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holamundo;

/**
 *
 * @author Josue Torres
 */
public class HolaMundo {
    //Comentario de una sola linea
    /*     
    Pleca asterisco - Para abrir bloque
    Asterisco Pleca - Para cerrar bloque
    Todo lo que esta entre ello, se toma 
    como comentario.
    */

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Sensible a Mayusculas - Minusculas
        /*Objetivo
    1. Imprimir en la pantalla 
        a. Diferentes formas para poder imprimir en pantalla
        b. Caracteres de escape
    2. Captura de Datos por parte del usuario.    
        */ 
    
    System.out.println("Hola...como estas!!");
    System.out.println("Este es mi primer programa");
    System.out.println("Yujuuu...estoy con Java");
    
    System.out.print("Josue Torres");
    System.out.print("Soy el profe de progra");
    System.out.print("Mucho gusto");
    
    System.out.println("");
    
    System.out.printf("Esto es la clase de %s\n ","Programacion");
    //System.out.println("");
    // Alt + 92 - \
    
    System.out.printf("Esto es %s la clase de\n","Programacion");
     //System.out.println("");
     
    System.out.printf("%s Esto es la clase de\n","Programacion");
     //System.out.println("");
     
     System.out.printf("Hola \n Como \n estas\n en la clase %s\n?","Programacion");
     System.out.printf("Hola \t Como \t estas\t en la clase %s\t?","Programacion");

    //Variables
    int tiempo; //Tipo Entero
    double promedio; //Tipo Decimal
    String nombre; //Tipo Cadena
    char inicial; //Tipo Caracter
    boolean estado; //Tipo Booleano
    
    
    
    tiempo = 3;
    nombre = "Josue";
    inicial = 'A';
    
    System.out.printf("Tu nombre es: %s \n" ,nombre);
    System.out.printf("%d veces a la semana recibes la clase\n" ,tiempo);
    System.out.printf("Te llamare %c inicial" ,inicial);

    
    }//Fin de la funcion MAIN
    
}
