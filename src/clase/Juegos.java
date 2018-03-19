package clase;
/**
 * 
 * @author Alex Gonzalez Gonzalez  y  Andrea Cabezas López
 */
public class Juegos implements Comparable {

    private String nombre, consola;
    private float precio;
    private int unidades;

    public Juegos() {
    }
/**
 * 
 * @param nombre
 * @param consola
 * @param precio
 * @param unidades 
 */
    public Juegos(String nombre, String consola, float precio, int unidades) {
        this.nombre = nombre;
        this.consola = consola;
        this.precio = precio;
        this.unidades = unidades;
    }
/**
 * 
 * @return 
 */
    public String getNombre() {
        return nombre;
    }
/**
 * 
 * @param nombre 
 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/**
 * 
 * @return 
 */
    public String getConsola() {
        return consola;
    }
/**
 * 
 * @param consola 
 */
    public void setConsola(String consola) {
        this.consola = consola;
    }
/**
 * 
 * @return 
 */
    public float getPrecio() {
        return precio;
    }
/**
 * 
 * @param precio 
 */
    public void setPrecio(float precio) {
        this.precio = precio;
    }
/**
 * 
 * @return 
 */
    public int getUnidades() {
        return unidades;
    }
/**
 * 
 * @param unidades 
 */
    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }
/**
 * 
 * @return 
 */
    @Override
    public String toString() {
        return nombre + "," + consola + "," + precio + "," + unidades;
    }
/**
 * 
 * @param o
 * @return 
 */
    @Override
    public int compareTo(Object o) {
        Juegos j = (Juegos) o;
        if (nombre.compareToIgnoreCase(j.getNombre()) > 0) {
            return 1;
        } else if (nombre.compareToIgnoreCase(j.getNombre()) == 0) {
            return 0;
        } else {
            return -1;
        }
    }

}
