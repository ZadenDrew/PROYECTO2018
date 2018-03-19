package tienda;
/**
 * 
 * @author Alejandro Javier González González  y  Andrea Cabezas López
 * @version ALPHA
 * 
 */
public  class Juegos {

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
}
