package naissances;
import java.time.LocalDate;
import java.util.Date;

/**
 * 
 */

/** Représentation d'un fichier contenant les différentes naissances.
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class Naissance {

	/** annee de naissance **/
	private long annee;
	/** date de la naissance **/
	private LocalDate dateEvenement;
	/** nombre de naissance le même jour **/
	private long nombre;
	
	
	
	
	/** Constructeur
	 *
	 * @param annee 		annee de naissance 
	 * @param dateEvenement date de la naissance
	 * @param nombre 		nombre de naissance le même jour
	 */
	public Naissance(long annee, LocalDate dateEvenement, long nombre) {
		super();
		this.annee = annee;
		this.dateEvenement = dateEvenement;
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return nombre + " naissances en " + annee + " le " + dateEvenement;
	}
	
	/** Getter
	 *
	 * @return the annee
	 */
	public long getAnnee() {
		return annee;
	}
	/** Setter
	 *
	 * @param annee the annee to set
	 */
	public void setAnnee(long annee) {
		this.annee = annee;
	}
	/** Getter
	 *
	 * @return the dateEvenement
	 */
	public LocalDate getDateEvenement() {
		return dateEvenement;
	}
	/** Setter
	 *
	 * @param dateEvenement the dateEvenement to set
	 */
	public void setDateEvenement(LocalDate dateEvenement) {
		this.dateEvenement = dateEvenement;
	}
	/** Getter
	 *
	 * @return the nombre
	 */
	public long getNombre() {
		return nombre;
	}
	/** Setter
	 *
	 * @param nombre the nombre to set
	 */
	public void setNombre(long nombre) {
		this.nombre = nombre;
	}
}
