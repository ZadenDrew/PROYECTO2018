package clase;

import ficheros.Escribir;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Alex Gonzalez Gonzalez y Andrea Cabezas López
 */
public class Metodos {

    PrintWriter pw;
    Escribir e = new Escribir();
    String completo = "";
    String linea = "";
    Scanner sc;
    String[] lista = new String[4];
    Juegos j1 = new Juegos();

    /**
     *
     * @return
     */
    public Juegos nuevoJuego() {

        j1.setNombre(JOptionPane.showInputDialog("Nombre del Juego"));
        j1.setConsola(JOptionPane.showInputDialog("Consola"));
        j1.setPrecio(Float.parseFloat(JOptionPane.showInputDialog("Precio")));
        j1.setUnidades(Integer.parseInt(JOptionPane.showInputDialog("Unidades")));
        return j1;
    }
/**
 * 
 * @param pf 
 */
    public void eliminarJuego(File pf) {
        try {
            File tempf = new File(pf.getAbsolutePath() + ".tmp");
            sc = new Scanner(new FileInputStream("juegos.txt"));
            pw = new PrintWriter(new FileWriter(tempf));
            while (sc.hasNextLine()) {
                linea = sc.nextLine();
                lista = linea.split("\\s*,\\s*");
                j1 = new Juegos(lista[0], lista[1], Float.parseFloat(lista[2]), Integer.parseInt(lista[3]));
                if ((j1.getUnidades() != 0)) {
                    pw.println(linea);
                    pw.flush();
                }
            }
            pw.close();
            sc.close();
            //Elimina el fichero original
            if (!pf.delete()) {
                System.out.println("No es posible eliminar el fichero");
                return;
            }

            //Renombrar el nuevo fichero con el nombre del original
            if (!tempf.renameTo(pf)) {
                System.out.println("No se puede renombrar el fichero");

            }

        } catch (FileNotFoundException ex) {
            System.out.println("\nNo existe el fichero .\n");

        } catch (IOException ex) {
            System.out.println("\nError.\n");
        }

    }
/**
 * 
 * @param nombre 
 */
    public void buscarJuego(String nombre) {

        try {

            sc = new Scanner(new FileInputStream("juegos.txt"));
            while (sc.hasNextLine()) {
                linea = sc.nextLine();
                lista = linea.split("\\s*,\\s*");
                j1 = new Juegos(lista[0], lista[1], Float.parseFloat(lista[2]), Integer.parseInt(lista[3]));
                if (j1.getNombre().equalsIgnoreCase(nombre)) {
                    System.out.println(j1.toString());
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("\nNo existe el ejemplar en la libreria .\n");
        } finally {
            sc.close();
        }
    }
/**
 * 
 * @param nombre
 * @param precio 
 */
    public void modificarPrecio(String nombre, float precio) {

        try {
            File pf2 = new File("juegos.txt");
            File tempf2 = new File(pf2.getAbsolutePath() + ".tmp");
            sc = new Scanner(new FileInputStream("juegos.txt"));
            pw = new PrintWriter(new FileWriter(tempf2));
            while (sc.hasNextLine()) {
                linea = sc.nextLine();
                lista = linea.split("\\s*,\\s*");
                j1 = new Juegos(lista[0], lista[1], Float.parseFloat(lista[2]), Integer.parseInt(lista[3]));
                if (j1.getNombre().equalsIgnoreCase(nombre)) {
                    System.out.println(j1.getNombre() + " Precio antiguo: " + j1.getPrecio());
                    j1 = new Juegos(lista[0], lista[1], precio, Integer.parseInt(lista[3]));
                    System.out.println(j1.getNombre() + " Precio nuevo: " + j1.getPrecio());
                    pw.println(j1.toString());
                } else {
                    pw.println(linea);
                }
            }
            sc.close();
            pw.close();
            if (!pf2.delete()) {
                System.out.println("No es posible eliminar el fichero");
                return;
            }

            //Renombrar el nuevo fichero con el nombre del original
            if (!tempf2.renameTo(pf2)) {
                System.out.println("No se puede renombrar el fichero");

            }

        } catch (FileNotFoundException ex) {
            System.out.println("\nNo existe el ejemplar en la libreria .\n");
        } catch (IOException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            sc.close();
        }

    }
/**
 * 
 * @param nombre
 * @param unidades 
 */
    public void modificarUnidades(String nombre, int unidades) {
        try {
            File pf2 = new File("juegos.txt");
            File tempf2 = new File(pf2.getAbsolutePath() + ".tmp");
            sc = new Scanner(new FileInputStream("juegos.txt"));
            pw = new PrintWriter(new FileWriter(tempf2));
            while (sc.hasNextLine()) {
                linea = sc.nextLine();
                lista = linea.split("\\s*,\\s*");
                j1 = new Juegos(lista[0], lista[1], Float.parseFloat(lista[2]), Integer.parseInt(lista[3]));
                if (j1.getNombre().equalsIgnoreCase(nombre)) {
                    System.out.println(j1.getNombre() + " Unidades antiguas: " + j1.getUnidades());
                    j1 = new Juegos(lista[0], lista[1], Float.parseFloat(lista[2]), unidades);
                    System.out.println(j1.getNombre() + " Nuevas Unidades: " + j1.getUnidades());
                    pw.println(j1.toString());
                } else {
                    pw.println(linea);
                }
            }
            sc.close();
            pw.close();
            if (!pf2.delete()) {
                System.out.println("No es posible eliminar el fichero");
                return;
            }

            //Renombrar el nuevo fichero con el nombre del original
            if (!tempf2.renameTo(pf2)) {
                System.out.println("No se puede renombrar el fichero");

            }

        } catch (FileNotFoundException ex) {
            System.out.println("\nNo existe el ejemplar en la libreria .\n");
        } catch (IOException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            sc.close();
        }
    }
}
