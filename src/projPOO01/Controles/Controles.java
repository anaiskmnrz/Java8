package projPOO01.Controles;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import projPOO01.Exceptions.ExceptionDate;
import projPOO01.Exceptions.ExceptionInt;

public class Controles {

	public static LocalDate CtrlDate(String d) throws ExceptionDate{
		
		String pattern = "dd/MM/yyyy";
		DateTimeFormatter sd = DateTimeFormatter.ofPattern(pattern);		
	
		LocalDate dt;
		try {
			dt = LocalDate.parse(d, sd); 
			//dt =sd.parse(d);
			
		}catch(Exception e) {
			throw new ExceptionDate("Mauvais format de date saisi");
		}
		return dt;
	}
	
	public static void CtrlInt(String ns) throws ExceptionInt{
		int n=0;
		try {
			 n = Integer.parseInt(ns);
			
		}catch(Exception e) {
			throw new ExceptionInt("Veuillez saisir un entier");
		}
		
		}
	
}
