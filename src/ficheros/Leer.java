package ficheros;

import excepciones.Excepciones;
import tienda.Juegos;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alejandro Javier González González y Andrea Cabezas López
 */
public class Leer {

    String line = "", completo = "";
    Juegos j = new Juegos();

    /**
     *
     * @param fichero
     * @return
     * @throws excepciones.Excepciones
     */
    public String leer(File fichero) throws Excepciones {

        ArrayList<Juegos> lista = new ArrayList();
        try {
            try (BufferedReader reader = new BufferedReader(new FileReader(fichero))) {
                while ((line = reader.readLine()) != null) {
                    if (line == null) {
                     throw new Excepciones("El fichero está vacío ."); 
                    }
                    String[] sep = line.split(",");
                    j.setNombre(sep[0]);
                    j.setConsola(sep[1]);
                    j.setPrecio(Float.parseFloat(sep[2]));
                    j.setUnidades(Integer.parseInt(sep[3]));
                    completo = completo + line + "\n";
                    System.out.println(line);
                }
                lista.add(j);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Leer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Leer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return completo;
    }
}
