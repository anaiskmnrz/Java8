package projPOO01.Exceptions;

/** Exception concernant la durée en mois des interimaires
 *
 * @author KOMINIARZ Anaïs 18/03/2020
 *
 */
public class ExceptionDureeMois extends Exception {

	private static final long serialVersionUID = 1L;
	
	public ExceptionDureeMois(String message) {
		super(message);
	}
}
