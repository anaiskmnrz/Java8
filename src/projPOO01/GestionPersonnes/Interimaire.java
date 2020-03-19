/**
 * 
 */
package projPOO01.GestionPersonnes;

/** Représentation 
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class Interimaire extends Salarie{

	private Integer dureeMois;
	private String contratAgence; 
	
	public Interimaire(String nom, String prenom, String adresse, String ville, String codepostal, String secu,
			double salaire, Integer dureeMois, String contratAgence) {
		super(nom, prenom, adresse, ville, codepostal, secu, salaire);
		this.dureeMois = dureeMois;
		this.contratAgence = contratAgence;
	}

	/** Getter
	 *
	 * @return the dureeMois
	 */
	public Integer getDureeMois() {
		return dureeMois;
	}

	/** Setter
	 *
	 * @param dureeMois the dureeMois to set
	 */
	public void setDureeMois(Integer dureeMois) {
		this.dureeMois = dureeMois;
	}

	/** Getter
	 *
	 * @return the contratAgence
	 */
	public String getContratAgence() {
		return contratAgence;
	}

	/** Setter
	 *
	 * @param contratAgence the contratAgence to set
	 */
	public void setContratAgence(String contratAgence) {
		this.contratAgence = contratAgence;
	}

}
