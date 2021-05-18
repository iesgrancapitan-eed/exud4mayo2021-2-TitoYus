package pgn.exUD4;

/**
 * Gato que hereda de la clase Mamifero
 * @author ryust
 *
 */
public class Gato extends Mamifero {
  /**
   * Maullido del gato
   */
  private static final String MIAUUUUUUUUUUUUU = "Miauuuuuuuuuuuuu";
  
  /**
   * Constructor de la clase Gato
   * @param nombre Nombre del Gato
   * @param edad Edad del Gato
   * @throws EdadErroneaException Si la edad es erronea se lanzará
   */
  public Gato(String nombre, int edad) throws EdadErroneaException {
    setAge(edad);
    this.nombre = nombre;
  }

  /**
   * Metodo que devuelve un parametro estático
   * @return MIAUUUUUUUUUU
   */
  public String maullar() {
    return MIAUUUUUUUUUUUUU;
  }

}
