import java.util.Locale;
import java.util.Scanner;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class tabeauDeBord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate[] tableauMois = new LocalDate[48];
		Scanner sc= new Scanner(System.in);
		tableauMois[0]=LocalDate.of(2016, 1, 1);
		Locale.setDefault(Locale.FRENCH);
		
		// remplissage années et mois
		for(int i=1;i<47;i++){
			tableauMois[i]=tableauMois[0].plusMonths(i);
		}
		//Travail sur une Facture UGAP
		// date de la facture 
		System.out.println("Quel est la date de cette facture? (01/02/2016)");	
		LocalDate factureDate = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		sc.nextLine();
		System.out.println(factureDate);
		// montant de la facture
		System.out.println("Quel est le montant de cette facture? (en EUROS HT)");	
		double factureMontant = sc.nextDouble();
		sc.nextLine();
		System.out.println(factureMontant);
	
	}

}
