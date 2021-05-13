/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g4s21p6jrlr;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Admin
 */
public class G4S21P6jrlr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       ArrayList<String> Lista = new ArrayList<String>(Arrays.asList("A","B","C","D"));
       System.out.println("desplegando contenido por medio de forech...\n");
       Lista.forEach(contenido ->{
       System.out.println("el contenido del arreglo" + contenido);
       });
       Lista.add("F");
       Lista.add("Ignacio");
       Lista.add("Esta es una linea de texto");
       
       System.out.println("desplegando contenido con for \n");
       for (String contenido1 : Lista){
           System.out.println("El contenido del arreglo" + contenido1); 
           
       }
       
       Lista.add("G");
       Lista.add("H");
       Lista.add("I"); 
       System.out.println("desplegando contenido con stream\n");
       
       Lista.stream().forEach(contenido2 ->{
       System.out.println("el contenido del arreglo " + contenido2 );
       
       });
       String cadena1 = "variable1";
       String cadena2 = "variable2";
       String cadena3 = "variable3";
       
       Lista.add(cadena1);
       Lista.add(cadena2);
       Lista.add(cadena3);
       //Lista.add(4)'; tipo de dato no valido
       Lista.add(String.valueOf(512));
       System.out.println("desplegando el contenido que se agrego con variables");
       for (String contenido3 : Lista){
       System.out.println("el contenido del arreglo es" + contenido3);
       }
       System.out.println("\n buscando un valor /n");
       Lista.forEach(contenido4->{
       if(contenido4.equals("Z")){
       System.out.println("el valor fue encontrado");
       }
       
       });
    }
    
}
