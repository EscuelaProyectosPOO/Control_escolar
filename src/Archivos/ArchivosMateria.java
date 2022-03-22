
package Archivos;

import javax.swing.JOptionPane;

/**
 *AquÍ se mandan los datos para preparar la sentencia, las relaciones con alumnos
 * y maestros se hacen en los respectivos archivos
 * @author Ana
 */
public class ArchivosMateria extends ArchivosMetodosGenerales {

    public ArchivosMateria(){
        establecer_nombre_archivo("materia");
    }
    
    public void insertar(String nombre, String clave){
        String sentencia = nombre + "  " + clave + '\n';
        
        escribir_linea_archivo(sentencia);
        
        JOptionPane.showMessageDialog(null,  "Registro " + sentencia + " insertado correctamente", "Info", JOptionPane.INFORMATION_MESSAGE);
    }
}
