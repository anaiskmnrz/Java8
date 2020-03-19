package projPOO01.actions;

import java.util.ArrayList;
import java.util.List;

import projPOO01.GestionPersonnes.IClient;
import projPOO01.GestionPersonnes.IFournisseur;
import projPOO01.GestionPersonnes.Personne;
import projPOO01.affichages.Affichages;

/** Représentation des regroupements
 *
 * @author KOMINIARZ Anaïs 18/03/2020
 *
 */
public class Regrouper {
	
	public static List<IClient> listeclient = new ArrayList<IClient>();
	public static List<IFournisseur> listifournisseur = new ArrayList<IFournisseur>();

	/**
	 * Méthode permettant de regrouper les IClient 
	 * 
	 * @return List<IClient>  pour qui isClient() est vrai
	 * 
	 */
	public static void RegrouperIClient() {
		List<IClient> list = new ArrayList<IClient>();
		ArrayList<Personne> plist = new ArrayList<Personne>();
		plist= Affichages.GrouperAffichage();
		listeclient.clear();
		for(Personne p: plist) {
			if(p instanceof IClient)  {
				list.add((IClient)p);
			}
		}
		
		for(IClient c:list) {
			if(c.isClient()) {
				listeclient.add(c);
			}
		}
		
	}
	
	/**
	 * Méthode permettant de regrouper les IFournisseur
	 * 
	 * @return List<IFournisseur>  pour qui isFournisseur() est vrai
	 * 
	 * @author KOMINIARZ Anaïs 18/03/2020
	 */
	public static void RegrouperIFournisseur() {
		List<IFournisseur> list = new ArrayList<IFournisseur>();
		ArrayList<Personne> plist = new ArrayList<Personne>();
		plist= Affichages.GrouperAffichage();
		listifournisseur.clear();
		for(Personne p: plist) {
			if(p instanceof IFournisseur)  {
				list.add((IFournisseur)p);
			}
		}
		
		for(IFournisseur f:list) {
			if(f.isFournisseur()) {
				listifournisseur.add(f);
			}
		}
		
	}

}
