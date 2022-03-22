
package Archivos;

import javax.swing.JOptionPane;

/**
 * AquÍ se mandan los datos para preparar la sentencia, de las materias, se deben 
 * mandar las claves en un solo string, separadas por un espacio
 * @author Ana
 */
public class ArchivoDocente extends ArchivosMetodosGenerales{
   
    public ArchivoDocente(){
        establecer_nombre_archivo("maestros");
    }

    public void insertar(String nombre, String ap1, String ap2, String materia){
        String sentencia = nombre + "  " + ap1 + "  " + ap2 + "  " + materia + '\n';
        
        escribir_linea_archivo(sentencia);
        JOptionPane.showMessageDialog(null,  "Registro " + sentencia + " insertado correctamente", "Info", JOptionPane.INFORMATION_MESSAGE);
    }
}
