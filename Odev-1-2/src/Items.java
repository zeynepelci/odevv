import java.util.Scanner;
import java.util.ArrayList;

public class Items {
  // a) ıtem adında özellikleri içeren bir class oluşturun.
  protected String UrunAdi;
  private String TedarikciAdi;
  protected double satisf;
  private double alisf;
  double karr =0;
  
  // b) constructor oluşturun.
  
  public Items(String UrunAdi , String TedarikciAdi , double satisf , double alisf) {
	  this.UrunAdi = UrunAdi;
	  this.TedarikciAdi = TedarikciAdi;
	  this.satisf = satisf;
	  this.alisf = alisf;
	  
  }
  
  
  
  
  // c) getter ve setterları oluşturun.
   public String getUrunAdi() {
	return UrunAdi;
}

public void setUrunAdi(String urunAdi) {
	UrunAdi = urunAdi;
}

public String getTedarikciAdi() {
	return TedarikciAdi;
}

public void setTedarikciAdi(String tedarikciAdi) {
	TedarikciAdi = tedarikciAdi;
}

public double getSatisf() {
	return satisf;
}

public void setSatisf(double satisf) {
	this.satisf = satisf;
}

public double getAlisf() {
	return alisf;
}

public void setAlisf(double alisf) {
	this.alisf = alisf;
}

// d) ürünün satış fiyatını %20 arttıran metodu yazınız.
  public void fiyatartir (double satisf)
  {
	  double a ;
	  a = this.satisf*0.2;
	  this.satisf = a + this.satisf;
	  System.out.println("yeni satisf: " + this.satisf);
  }
  
  // e) ürünün elde ettiği karı hesaplayan metodu yazınız.
  public void Karhesap (double karr)
  {
	  karr = satisf- alisf;
	  System.out.println("kar: " + karr);
  }
  
}
  

