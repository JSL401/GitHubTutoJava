import java.util.Scanner;

public class tableaux {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
char tableauCaractere[] = {'a','b','c','d','e','f','g'};
int i = 0; 
char reponse,carac;
Scanner sc= new Scanner(System.in);

for (char car : tableauCaractere)
{
	System.out.println(car);
}
do {
	do  {
		i=0;
		System.out.println("Rentrez une lettre en minuscule, SVP");
		carac = sc.nextLine().charAt(0);
		
		while (i<tableauCaractere.length && carac!=tableauCaractere[i])
			i++;
		if (i< tableauCaractere.length)
			System.out.println("La lettre" +carac+ "se trouve bien dans le tableau !");
		else 
			System.out.println("la lettre" +carac+ "ne se trouve pas dans le tableau !");
	}while (i>= tableauCaractere.length);

do {
	System.out.println("Voulez-vous essayer à nouveau ? (O/N) ");
	reponse=sc.nextLine().charAt(0);
	}while(reponse != 'N' && reponse != 'O');
}while (reponse == '0');

	
	}
	
}
