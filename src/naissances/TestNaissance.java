package naissances;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

/**
 * 
 */

/** Test d'un fichier de naissances
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class TestNaissance {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		// lecture du fichier naissances_depuis_1900.csv et sauvegarde de celui dans listeNaissances
		File file = new File("D:/temp/naissances_depuis_1900.csv");
		List<String> lignes = FileUtils.readLines(file, "UTF-8");
		LocalDate dateEvenement = null;
		
		ArrayList<Naissance> listeNaissances = new ArrayList<>();
		for (int ligne = 1; ligne < lignes.size(); ++ligne) {

			String[] morceaux = lignes.get(ligne).split(";");
			long annee = Long.parseLong(morceaux[1]);
			long nombre = Long.parseLong(morceaux[3]);
			dateEvenement = LocalDate.parse(morceaux[2], DateTimeFormatter.ofPattern("yyyyMMdd"));
			
			Naissance naissance = new Naissance(annee, dateEvenement, nombre);
			listeNaissances.add(naissance);
			
		}
		//Toutes les naissances en 1900
		listeNaissances.stream().filter(f -> f.getAnnee() == 1900).forEach(System.out::println);
		
		//Le nombre de naissance en 1900
		long somme = listeNaissances.stream().filter(f -> f.getAnnee() == 1900).map(f -> f.getNombre()).reduce((f1, f2) -> f1 + f2 ).get();
		System.out.println("\nNombre de naissances en 1900 : " + somme);
		
		//La moyenne du nombre de naissances par jour en 1971
		Double moyenne = listeNaissances.stream().filter(f -> f.getAnnee()  == 1971).mapToLong(f -> f.getNombre()).average().getAsDouble();
		System.out.println("\nMoyenne du nombre de naissances par jour en 1971 : " + moyenne);
		
	}

}
