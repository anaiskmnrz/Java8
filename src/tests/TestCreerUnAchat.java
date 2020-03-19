package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

import projPOO01.GestionAchat.Achat;

public class TestCreerUnAchat {
	
	private Achat a;
	private final LocalDate od = null;
	private final String oi = "intitule";
	private final Integer oqte= new Integer(10);
	private String pattern = "dd-MM-yyyy";
	private SimpleDateFormat sd = new SimpleDateFormat(pattern);
	private final String ts = oi + "[date=" +sd.format(od) + ", quantite=" + oqte + "]";
	
	@Before
	public void init() {
		a = new Achat(od,oi,oqte);
	}
	
	@Test
	public void testAchat() {
		assertNotNull(a);
	}

	@Test
	public void testToString() {
		assertEquals(ts,a.toString());
	}

}