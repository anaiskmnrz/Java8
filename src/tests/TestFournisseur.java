package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import projPOO01.GestionAchat.Commande;
import projPOO01.GestionPersonnes.Fournisseur;

public class TestFournisseur {
	
	private Fournisseur f;
	private Commande c;
	private final String ointitule ="intitule";
	private final Integer oqte= new Integer(10);
	private  LocalDate od = null;
	private final String onom ="Personne";
	private final String oprenom ="Test";
	private final String oville ="Lyon";
	private final String oadresse ="Rue";
	private final String ocodepostal ="69000";
	private final int oidfournisseur = 1;
	private final int setidfournisseur = 10;
	private List<Commande> commandes= new ArrayList<Commande>();
	private final String ts= "Fournisseur [nom=" + onom + ", prenom=" + oprenom + ", adresse=" + oadresse + ", ville=" + oville
			+ ", codepostal=" + ocodepostal + "]" + "[idfournisseur=" + oidfournisseur + ", commandes=" + commandes.toString()+"]";

	
	@Before
	public void init() {
		f = new Fournisseur(onom,oprenom,oadresse,oville,ocodepostal,oidfournisseur);
		c = new Commande(od,ointitule,oqte);
		commandes.add(c);
	}
	@Test
	public void testToString() {
		assertEquals(ts,f.toString());
	}

	@Test
	public void testFournisseurStringStringStringStringStringInt() {
		assertNotNull(f);
	}

	@Test
	public void testGetIdfournisseur() {
		assertEquals(oidfournisseur,f.getIdfournisseur());
	}

	@Test
	public void testSetIdfournisseur() {
		f.setIdfournisseur(setidfournisseur);
		assertEquals(setidfournisseur,f.getIdfournisseur());
	}

	@Test
	public void testGetCommandes() {
		this.testCommande();
		assertEquals(commandes,f.getCommandes());
	}
	@Test
	public void testAchete() {
//		fail("Not yet implemented");
	}

	@Test
	public void testPaie() {
//		fail("Not yet implemented");
	}

	@Test
	public void testLivre() {
		assertTrue(f.livre());
	}

	@Test
	public void testCommande() {
		f.commande(commandes);
		assertEquals(commandes,f.getCommandes());
	}

	@Test
	public void testIsClient() {
		assertFalse(f.isClient());
	}

	@Test
	public void testIsFournisseur() {
		assertTrue(f.isFournisseur());
	}


}
