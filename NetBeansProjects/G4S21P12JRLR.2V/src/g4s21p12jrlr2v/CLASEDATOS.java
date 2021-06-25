/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g4s21p12jrlr2v;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author manny
 */
public class CLASEDATOS {
    private final String NomArch = "Datos.txt";
    List<CLASEDATOS> Datos = new ArrayList<>();
    
    public boolean VerificaArch(){
        File arhivo = new File(NomArch);
        if (!arhivo.exists()) return false;
        else return true;
    }
    
    public boolean Grabar(List<CLASEDATOS> datos, int accion){
              // 0 = anexa informacion
              // 1 = reactualiza informacion
              FileWriter archivo;
        try{
            if (accion == 0){
                archivo = new FileWriter(NomArch, true);
            }else{
                archivo = new FileWriter(NomArch);
            }
            archivo = new FileWriter(NomArch, true);      
            try(BufferedWriter bw = new BufferedWriter(archivo)){
                    for(CLASEDATOS dato : datos){
                    bw.write(Conviertegson(dato) + "\n");
                }
                bw.close();
            }
            archivo.close();
        }catch(Exception ex){
            return false;
        }
         return true;
        
    } 
    
    public boolean Leer(){
        String cadena = " ";
        try{
            FileReader archivo = new FileReader(NomArch);
            BufferedReader br = new BufferedReader(archivo);
            while((cadena = br.readLine())!= null){
                Datos.add(ConvierteClase(cadena));
            }
            br.close();
            archivo.close();
        }catch(Exception ex){
            return false;
        }
        return true;
    }
    
    public void Agregar(CLASEDATOS dato){
        Datos.add(dato);
    }
    
    private String Conviertegson(CLASEDATOS dato){
        Gson gson = new Gson();
        return gson.toJson(dato);
        
    }
    
    private CLASEDATOS ConvierteClase(String dato){
        Gson gson = new Gson();
        return gson.fromJson(dato, CLASEDATOS.class);
        
    }
    
    public List<CLASEDATOS> getDatos(){
        return Datos;
    }
}
