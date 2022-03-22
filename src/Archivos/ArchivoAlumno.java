
package Archivos;

import javax.swing.JOptionPane;

/**
 * AquÍ se mandan los datos para preparar la sentencia, de las materias, se deben 
 * mandar las claves en un solo string, separadas por un espacio
 * 
 *ya estoy hasta la chingada
 * @author AIGLL
 */
public class ArchivoAlumno extends ArchivosMetodosGenerales{
    
    public ArchivoAlumno(){
        establecer_nombre_archivo("alumnos");
    }
    
    public void insertar(String nombre, String ap1, String ap2, String nc ,String materias){
        
        String sentencia = nombre + "  " + ap1 + "  " + ap2 + "  " + nc + "  " + materias + '\n';
        
        escribir_linea_archivo(sentencia);
        
        JOptionPane.showMessageDialog(null,  "Registro " + sentencia + " insertado correctamente", "Info", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
