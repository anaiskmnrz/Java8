package projPOO01.GestionPersonnes;

import java.util.List;

import projPOO01.GestionAchat.Achat;

public interface IClient {
	public void achete(List<Achat> listachat);
	
	/**
	 * @return false par d�faut
	 */
	public default boolean paie() {
		return false;
	}
	
	/**
	 * @return false par d�faut
	 */
	public default boolean isClient() {
		return false;
	}

}
