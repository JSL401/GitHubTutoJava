import java.util.Locale;

import java.util.Scanner;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.Period;

public class tabeauDeBord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate[] tableauMois = new LocalDate[48];
		Scanner sc= new Scanner(System.in);
		tableauMois[0]=LocalDate.of(2016, 1, 1);
		Locale.setDefault(Locale.FRENCH);
		int j= 0,mois=0;
		int[] Ca2016= new int[]{84782,73244,69283,84874,93646,90374,73695,84534,90934,93058,105214,77651};
		int[] Ca2017= new int[12];
		int[] Ca2017Ugap= new int[12];
		LocalDate[] factureDate = new LocalDate[100];
		double[] factureMontant = new double[100];
		LocalDate[] factureFin = new LocalDate[100];
		double MontantARetirer=0,MontantARajouter=0;
		int Duree = 0; 
		
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
				Duree = sc.nextInt(); 
				factureFin[j] = factureDate[j].plusMonths(Duree); 
				System.out.println("la facturation se termine le : " + factureFin[j]);
				j++;
				System.out.println("Souhaitez vous ajouter une facture Ugap ? O/N");
				sc.nextLine();
				reponseUgap=sc.nextLine().charAt(0);		
				}
			}
		//récupération CA du Mois 
		System.out.println("Quel mois sommes nous ? (1,2...12)");
		mois=sc.nextInt();
		System.out.println("quel est le montant du mois ?");
		sc.nextLine();
		Ca2017[mois]=sc.nextInt();
		
		//calul montant du mois retraité
		//montant à retirer
		for (int k=0; k<factureDate.length;k++){
			if (factureDate[k]!=null){
				int test = factureDate[k].getMonthValue();
				if (test==mois){
					 MontantARetirer = MontantARetirer + factureMontant[k];
			}
			
			}
		}
		//montant à rajouter 
		for (int k=0; k<factureDate.length;k++){
			if (factureDate[k]!=null){
				int MoisDebut=factureDate[k].getMonthValue();
				int MoisFin=factureFin[k].getMonthValue();
				Period Periode=Period.between(factureDate[k], factureFin[k]);
				if (MoisFin>mois){
					MontantARajouter=MontantARajouter+factureMontant[k]/Periode.getMonths();
			}
			
			}
		}
		
		System.out.println(Ca2017[mois]-MontantARetirer+MontantARajouter);
		
		
		}
		
	}
