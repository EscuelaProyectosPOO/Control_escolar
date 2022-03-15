
package Archivos;

/**
 * AquÍ se mandan los datos para preparar la sentencia, de las materias, se deben 
 * mandar las claves en un solo string, separadas por un espacio
 * 
 *ya estoy hasta la chingada
 * @author AIGLL
 */
public class ArchivoAlumno {
    public ArchivosMetodosGenerales archivo = new ArchivosMetodosGenerales();
    
    public void insertar(String nombre, String ap1, String ap2, String nc ,String materias){
        String sentencia = nombre + "  " + ap1 + "  " + ap2 + "  " + nc + "  " + materias + '\n';
        archivo.establecer_nombre_archivo("alumnos.dat");
        archivo.escribir_linea_archivo(sentencia);
    }
}
