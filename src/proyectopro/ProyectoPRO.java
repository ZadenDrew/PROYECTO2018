
package proyectopro;

import tienda.Juegos;
import tienda.Metodos;
import ficheros.Escribir;
import ficheros.Leer;
import ficheros.Relleno;
import grafica.Administrar;
import java.io.File;
import java.util.ArrayList;
/**
 * 
 * @author Alex Gonzalez Gonzalez  y  Andrea Cabezas López
 */

public class ProyectoPRO {
    static Relleno r= new Relleno();
    static File fichero=new File("juegos.txt");
    static Leer l= new Leer();
    static Escribir e= new Escribir();
    static Metodos m= new Metodos();
    public static ArrayList <Juegos> listaJuegos=new ArrayList();
    public static void main(String[] args) {
        listaJuegos=r.rellenar(new File("juegos.txt"));
        Administrar admin= new Administrar();
        admin.setVisible(true);
    }
    
}
