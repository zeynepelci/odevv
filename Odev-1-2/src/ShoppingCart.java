import java.util.Scanner;

public class ShoppingCart extends Items 
{

	public ShoppingCart(String UrunAdi, String TedarikciAdi, double satisf, double alisf) {
		super(UrunAdi, TedarikciAdi, satisf, alisf);
	}
	int sepettekiler=0;
	double sepet = 0;
	int UrunAdeti = 0;
	Scanner alim = new Scanner(System.in);
	
	public void SepetEkleyen() {
		
		System.out.println("Lütfen ürünlerinizin adetini giriniz: " );
		UrunAdeti = alim.nextInt();
		for(int i =0; i< UrunAdeti; i++)
		{
			System.out.println("Lütfen Ürünün adını giriniz: " );
			UrunAdi = alim.next();
			sepettekiler++;
			System.out.println("Sepetteki ürün adeti: " + sepettekiler);
		}
	}
	
	public void SepetToplami() {
	
		for(int j=0; j<UrunAdeti; j++)
		{
			System.out.println("Lütfen ürünlerinizin fiyatını giriniz: ");
			satisf = alim.nextDouble();
			sepet= sepet + satisf;
			System.out.println("sepet toplamı: " + sepet);
		}	
	}
}
