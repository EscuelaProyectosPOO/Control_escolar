/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Archivos;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.util.regex.*;



/**
 *
 * @author tetil
 * Para que este archivo agregue y busque, cada columna debe estar separada por dos espacios, por ejemplo, Nombre  apellido1, Maria Juana  ApellidoDEMaria
 * se divide asi, porque los nombre y apellidos compuestos estan separados por un espacio
 * 
 */
public class ArchivosMetodosGenerales {
    
    private String nombre_archivo;
    private String ruta_archivo = "src\\BaseDatos\\";



    
    public void establecer_nombre_archivo(String nombre_archivo){
        //coloca el nombre del archivo en el sistema de la clase
        
        this.nombre_archivo = nombre_archivo;
    }
    
    public void escribir_linea_archivo(String sentencia){
        //escribe la linea en el archivo
        
        try{
            
            
            FileOutputStream ArchivoUsar = new FileOutputStream(ruta_archivo + nombre_archivo + ".dat", true);
            DataOutputStream ArchivoParaEscritura = new DataOutputStream(ArchivoUsar);
            
            ArchivoParaEscritura.writeUTF(sentencia);
            
            ArchivoParaEscritura.close();
            ArchivoUsar.close();
            
            
        }catch(IOException e){
            JOptionPane.showMessageDialog(null,
            "Error en en escribir_linea_archivo "+ e,
            "Error",
            JOptionPane.ERROR_MESSAGE);
            
		
        }
    
    }
    
    public  List<String> leer_almacenar_registros(){
        //lee todos los registros que se encuentran en el archivo y los almacena en forma de lista

        
        String linea;
        
        
        List<String> RegistrosObtenidosDeArchivo = new ArrayList<>();
        
        try{
            FileInputStream ArchivoUsar = new FileInputStream(ruta_archivo + nombre_archivo + ".dat");
            DataInputStream ArchivoParaLectura = new DataInputStream(ArchivoUsar);
            
            while(ArchivoParaLectura.available() > 0){
                
                
                
                linea = ArchivoParaLectura.readUTF();
                RegistrosObtenidosDeArchivo.add(linea);
	    
            }
            
            ArchivoParaLectura.close();
            ArchivoUsar.close();
            
	}catch(IOException e){
            JOptionPane.showMessageDialog(null,
            "Error en leer_almacenar_registros "+ e,
            "Error",
            JOptionPane.ERROR_MESSAGE);
            		
        }
        
        return RegistrosObtenidosDeArchivo;
    }
    
    public List<String> almacenar_registros_coincidan_con_un_identificador(List<String> arreglo_registros, int numero_de_columna, String identificador){
        
        // separa los registros en columnas, donde se podra buscar el identificado en la columna correspondiente y almacena en una lista aqueellos registros que
        //coincidan con el identificardo
        
        List<String> registros_que_coinciden = new ArrayList<>();
        String[] columnas;

    

        for (int i = 0; i < arreglo_registros.size(); i++) {

            columnas = arreglo_registros.get(i).split("  ");

            if(columnas[numero_de_columna].equalsIgnoreCase(identificador)){

                registros_que_coinciden.add(arreglo_registros.get(i));

            }

            
        }

        
        
        
        return registros_que_coinciden;
    }

    public List<String> buscar_registros_o_registro(int numero_de_columna, String identificador_registro){
        //lee y busca un registro o varios y despues los retorna
        List<String> registros_totales = new ArrayList<>();
        List<String> registros_que_coinciden = new ArrayList<>();

        registros_totales = leer_almacenar_registros();
        registros_que_coinciden = almacenar_registros_coincidan_con_un_identificador(registros_totales, numero_de_columna, identificador_registro);


        return registros_que_coinciden;


    }
    
    public List<String> encontrar_registro_coincida(String Palabra_buscar ){
        
        //le das la palbra que quieras que contenga el registro y busca
        
        List<String> RegistrosObtenidosDeArchivo = new ArrayList<>();
        List<String> RegistrosCoincidentes = new ArrayList<>();
        
        
        RegistrosObtenidosDeArchivo = leer_almacenar_registros();
        
        //escapar y agregar limites de palabra completa - case-insensitive
        //límites de palabra completa (\b) alrededor de la palabra buscada. Es decir que no esté precedida ni sucedida por letras, números o un guión bajo.
        Pattern reglas_coincidencia_palabra = Pattern.compile("\\b" + Pattern.quote(Palabra_buscar) + "\\b", Pattern.CASE_INSENSITIVE);
        Matcher palabra_comparacion;
        
        for(String registro : RegistrosObtenidosDeArchivo ){
            
            palabra_comparacion = reglas_coincidencia_palabra.matcher(registro);
            
            //si el registro tiene el texto 
            if(palabra_comparacion.find()){
                System.out.println(registro);
                
                RegistrosCoincidentes.add(registro);
                
            }
            

        }
        
        return RegistrosCoincidentes;

    }
    
    
    /*public static void main(String args[]) {
        
        ArchivosMetodosGenerales  m = new ArchivosMetodosGenerales ();
        m.establecer_nombre_archivo("prueba");
        //m.escribir_linea_archivo("Josefa Maria  Perez nn Z200");
        //m.escribir_linea_archivo("Maria Colar  Perez nn Z200");
        //m.escribir_linea_archivo("Jose colar  Joler  bbmns  Z20020020");
        m.encontrar_registro_coincida("MarIa");
    
    }*/
    
    
    
    
    
}
