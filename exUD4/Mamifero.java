package pgn.exUD4;


/**
 * Contiene 3 métodos y un constructor predeterminado
 * setAge
 * getEdad
 * getNombre
 * 
 * @author ryust
 *
 */
public class Mamifero {

  /**
   * Edad del mamifero
   */
  private int edad;
  /**
   * Nombre del mamifero
   */
  private String nombre;

  /**
   * Constructor predeterminado
   */
  public Mamifero() {
    super();
  }

  /**
   * Permite cambiar la edad al mamifero
   * @param edad Edad del mamifero
   * @throws EdadErroneaException Si la edad es erronea será lanzada
   */
  public void setAge(int edad) throws EdadErroneaException {
    if (edad < 0)
      throw new EdadErroneaException("La edad no puede ser negativa");
    this.edad = edad;
  }

  /**
   * Devuelve la edad del mamifero
   * @return edad edad del mamifero
   */
  public int getEdad() {
    return this.edad;
  }

  /**
   * Devuelve nombre del mamifero
   * @return nombre nombre del mamifero
   */
  public String getNombre() {
    return nombre;
  }

}
