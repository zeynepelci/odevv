import java.util.Scanner;

public class DikSinif {

	public void alanhesap()
	{
		Scanner kenar = new Scanner(System.in);
		
		
		
		System.out.println("lütfen dikdörtgenin kisa kenar uzunluğunu metre cinsinden giriniz: ");
		
		int kısak = kenar.nextInt();
		
		System.out.println("lütfen dikdörtgenin uzun kenar uzunluğunu metre cinsinden giriniz: ");
		
		int uzunk = kenar.nextInt();
		
		System.out.println("Dikdörtgenin Alanı: " + kısak*uzunk);
		System.out.println("Dikdörtgenin çevresi: " + 2*(kısak+uzunk));
		
	}
	
	
}
