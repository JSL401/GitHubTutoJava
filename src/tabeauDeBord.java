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
		int j= 0; 
		
		// remplissage années et mois
		for(int i=1;i<47;i++){
			tableauMois[i]=tableauMois[0].plusMonths(i);
		}
		System.out.println("souhaitez vous ajouter une facture UGAP ? O/N");
		char reponseUgap = sc.nextLine().charAt(0);
		
		//Travail sur Facture UGAP
		// date de la facture 
		while (reponseUgap == 'O') {
		//initialisation des tableaux	
			LocalDate[] factureDate = new LocalDate[100];
			double[] factureMontant = new double[100];
			LocalDate[] factureFin = new LocalDate[100];
		
			if (j==100) {
				System.out.println("Prévenir developpeur qu'il n'y plus de place dans l'Array");
			} else {
				System.out.println("Quel est la date de cette facture? (01/02/2016)");	
				factureDate[j] = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				// montant de la facture
				System.out.println("Quel est le montant de cette facture? (en EUROS HT)");	
				factureMontant[j] = sc.nextDouble();
				//durée de la facture
				System.out.println("Quelle est la durée de cette facture? (en mois)"); 
				long duree = sc.nextLong(); 
				factureFin[j] = factureDate[j].plusMonths(duree); 
				System.out.println("la facturation se termine le : " + factureFin[j]);
				j++;
				System.out.println("Souhaitez vous ajouter une facture Ugap ? O/N");
				sc.nextLine();
				reponseUgap=sc.nextLine().charAt(0);
			
				}
			}
		
		
		}
		
	}

}
