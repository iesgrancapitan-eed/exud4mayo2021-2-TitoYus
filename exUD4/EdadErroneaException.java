package pgn.exUD4;

/**
 * Se lanzar� si la edad es err�nea
 * @author ryust
 *
 */
public class EdadErroneaException extends Exception {

  /**
   * Constructor predeterminado
   * @param string
   */
	public EdadErroneaException(String string) {
		super(string);
	}

}
