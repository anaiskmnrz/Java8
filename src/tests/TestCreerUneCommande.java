package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

import projPOO01.GestionAchat.Commande;

public class TestCreerUneCommande {
	
	private Commande c;
	private LocalDate od = null;
	private final String oi = "intitule";
	private final Integer oqte= new Integer(10);
	private String pattern = "dd-MM-yyyy";
	private SimpleDateFormat sd = new SimpleDateFormat(pattern);
	private final String ts = oi + "[date=" +sd.format(od) + ", quantite=" + oqte + "]";
	
	@Before
	public void init() {
		c = new Commande(od,oi,oqte);
	}
	
	
	@Test
	public void testCommande() {
		assertNotNull(c);
	}

	@Test
	public void testToString() {
		assertEquals(ts,c.toString());
	}

}
