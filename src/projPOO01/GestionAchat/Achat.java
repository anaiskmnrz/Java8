package projPOO01.GestionAchat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Achat {
	private LocalDate date;
	private String intitule;
	private int quantite;
	private String pattern = "dd-MM-yyyy";
	private SimpleDateFormat sd = new SimpleDateFormat(pattern);
	
	
	public Achat(LocalDate od, String i, int q) {
		// TODO Auto-generated constructor stub
		this.date =od;
		
		this.intitule =i;
		this.quantite =q;
	}

	@Override
	public String toString() {
			return intitule + "[date=" +sd.format(date) + ", quantite=" + quantite + "]";
		
		}
	
	
	

}
