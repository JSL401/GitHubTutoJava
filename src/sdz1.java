import java.io.InputStream;
import java.util.Scanner;

public class sdz1 {

	public static void main (String[] args) {
	Scanner sc = new Scanner(System.in); 
	
	String titre = "CONVERTISSEUR DEGRES CELSIUS ET DEGRES FAHRENHEIT";
	int num = titre.length();
	System.out.println(titre); 
	for (int i=0;i<num;i++){
		System.out.print("-");
	}
	System.out.println();
	System.out.println("Choisissez le mode de conversion : ");
	System.out.println("1- Convertisseur Celsius-Fahrenheit");
	System.out.println("2- Convertisseur Fahrenheit-Celsius");
	int i = sc.nextInt();
	sc.nextLine();
	//bien penser à remettre c comme variable pour la réponse (O/N)
	char c ='O';
	while (c=='O'){
	System.out.println("Température à convertir");
	double old = sc.nextDouble();
	if (i==1) {
		//de celsius à fahrenheit
	}
	else {
		//de fahrenheit à celsius
	}
	System.out.println("Souhaitez vous convertir une autre température ? (O/N)");
	String temp  = sc.nextLine();
	c = temp.charAt(0);
	}
	System.out.println("Au revoir !");
	}
	
	public static double arrondi(double A, int B) {
		return (double) ((int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B);
	}
}
	
	
