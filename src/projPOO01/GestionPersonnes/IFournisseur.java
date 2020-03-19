package projPOO01.GestionPersonnes;

import java.util.List;

import projPOO01.GestionAchat.Commande;

public interface IFournisseur {
	
	/**
	 * @return false par défaut
	 */
	public default boolean livre() {
		return false;
	}
	
	public void commande(List<Commande> listcommande);
	
	/**
	 * @return true par défaut
	 */
	public default boolean isFournisseur() {
		return true;
	}
}
