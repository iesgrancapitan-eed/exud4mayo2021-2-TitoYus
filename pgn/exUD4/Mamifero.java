
public class Mamifero {

  private int edad;
  private String nombre;

  public Mamifero() {
    super();
  }

  public void setAge(int edad) throws EdadErroneaException {
    if (edad < 0)
      throw new EdadErroneaException("La edad no puede ser negativa");
    this.edad = edad;
  }

  public int getEdad() {
    return this.edad;
  }

  public String getNombre() {
    return nombre;
  }

}
