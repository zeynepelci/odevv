
public class main {

	 public static void main ( String [] args ) {
		
		 Items Items1 = new Items (null, null, 20, 10) ;
		 
		 ShoppingCart ShoppingCart1 = new ShoppingCart(null, null, 0, 0);
		 
		 
		 
	
		Items1.Karhesap(0);
		Items1.fiyatartir(0);
		 
		ShoppingCart1.SepetEkleyen();
		ShoppingCart1.SepetToplami();
		
		 
		 
	 }
}
