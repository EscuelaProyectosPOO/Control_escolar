
package Archivos;

/**
 * AquÍ se mandan los datos para preparar la sentencia, de las materias, se deben 
 * mandar las claves en un solo string, separadas por un espacio
 * @author Ana
 */
public class ArchivoDocente {
    public ArchivosMetodosGenerales archivo = new ArchivosMetodosGenerales();
    
    public void insertar(String nombre, String ap1, String ap2, String materia){
        String sentencia = nombre + "  " + ap1 + "  " + ap2 + "  " + materia + '\n';
        archivo.establecer_nombre_archivo("maestros.dat");
        archivo.escribir_linea_archivo(sentencia);
    }
}
