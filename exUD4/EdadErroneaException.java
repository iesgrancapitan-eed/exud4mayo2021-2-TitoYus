package pgn.exUD4;

/**
 * Se lanzará si la edad es errónea
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
