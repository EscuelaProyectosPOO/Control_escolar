
package Archivos;

/**
 *AquÍ se mandan los datos para preparar la sentencia, las relaciones con alumnos
 * y maestros se hacen en los respectivos archivos
 * @author Ana
 */
public class ArchivosMateria {
    public ArchivosMetodosGenerales archivo = new ArchivosMetodosGenerales();
    
    public void insertar(String nombre, String clave){
        String sentencia = nombre + "  " + clave + '\n';
        archivo.establecer_nombre_archivo("maestros.dat");
        archivo.escribir_linea_archivo(sentencia);
    }
}
