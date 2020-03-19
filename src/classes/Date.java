/**
 * 
 */
package classes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/** Représentation 
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class Date {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Tests de dates 
		
		String europeanDatePattern = "dd.MM.yyyy";
		DateTimeFormatter europeanDateFormatter = DateTimeFormatter.ofPattern(europeanDatePattern);
		System.out.println(europeanDateFormatter.format(LocalDate.of(2016, 7, 31)));
		
		String input = "30/02/2015";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
LocalDate date = LocalDate.parse(input, formatter);
System.out.printf("%s%n", date);
	}

}
