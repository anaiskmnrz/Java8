package projPOO01.affichages;

import java.util.ArrayList;

import projPOO01.Programme;
import projPOO01.GestionPersonnes.Personne;
import projPOO01.Menu.Menus;
import projPOO01.saisie.Saisir;

/** Gère les différents affichages
 *
 * @author KOMINIARZ Anaïs 18/03/2020
 *
 */
public class Affichages {

	/**
	 * Gère l'affichage du menu et l'affichage de ce que l'on a choisi dans le menu
	 * 
	 */
	public static void Afficher() {
		
		int choix;
		ArrayList<Personne> listpatron = new ArrayList<Personne>();
		listpatron.add(Saisir.patron);
		
		System.out.println("Taper 1 pour afficher toutes les données");
		System.out.println("Taper 2 pour afficher les salariés");
		System.out.println("Taper 3 pour afficher les clients");
		System.out.println("Taper 4 pour afficher les fournisseur");
		System.out.println("Taper 5 pour afficher le patron");
		System.out.println("Taper 6 pour afficher les interimaires");
		System.out.println("Taper 7 pour retourner au menu");
		
		choix=Menus.sc.nextInt();
		
		switch(choix) {
		case 1 : AfficherCommun(Affichages.GrouperAffichage());
		break;
		case 2 : AfficherCommun(Saisir.listsalarie);
		break;
		case 3 : AfficherCommun(Saisir.listclient);
		break;
		case 4 : AfficherCommun(Saisir.listfournisseur);
		break;
		case 5 : AfficherCommun(listpatron);
		break;
		case 6 : AfficherCommun(Saisir.listinterimaire);
		break;
		case 7 : Menus.Menu();
		break;
		default : Afficher();
		break;
		}
	}
	
	
	public static void AfficherCommun(ArrayList<Personne> list ) {
		for(Personne p:list) {
			System.out.println(p.toString());
		}
	}
	
	public static ArrayList<Personne> GrouperAffichage() {
		ArrayList<Personne> list = new ArrayList<Personne>();
		list.addAll(Saisir.listsalarie);
		list.addAll(Saisir.listclient);
		list.addAll(Saisir.listfournisseur);
		list.addAll(Saisir.listinterimaire);
		list.add(Saisir.patron);
		
		return list;
	}
	
}
