package excepciones;

/**
 *
 * @author Alejandro Javier González González  y  Andrea Cabezas López
 */
public class Excepciones extends Exception {

    public Excepciones() {
        super(" El fichero está vacío ... ");
    }
/**
 * 
 * @param mensaxe 
 */
    public Excepciones(String mensaxe) {
        super(mensaxe);

    }
}
