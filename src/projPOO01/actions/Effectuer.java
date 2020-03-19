package projPOO01.actions;

import java.util.List;

import projPOO01.GestionAchat.Achat;
import projPOO01.GestionAchat.Commande;
import projPOO01.GestionPersonnes.IClient;
import projPOO01.GestionPersonnes.IFournisseur;
import projPOO01.Menu.Menus;
import projPOO01.saisie.Saisir;

/** Représentation des différentes actions
 *
 * @author KOMINIARZ Anaïs 18/03/2020
 *
 */
public class Effectuer {
	
	/**
	 * Effectue un achat
	 * 
	 * author KOMINIARZ Anaïs 18/03/2020
	 */
	public static void EffectuerAchat() {
		Regrouper.RegrouperIClient();
		IClient client = Choisir.ChoisirIClient(Regrouper.listeclient);
		List<Achat> a = Saisir.SaisirAchat();
		client.achete(a);
		client.paie();
		Menus.Menu();	
	}
	
	
	/**
	 * Effectue une commande
	 * 
	 * author KOMINIARZ Anaïs 18/03/2020
	 */
	public static void EffectuerCommande() {
		Regrouper.RegrouperIFournisseur();
		IFournisseur f = Choisir.ChoisirIFournisseur(Regrouper.listifournisseur);
		List<Commande> c = Saisir.SaisirCommande();
		f.commande(c);
		f.livre();
		Menus.Menu();	
	}
}
