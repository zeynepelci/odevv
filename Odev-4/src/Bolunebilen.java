
public class Bolunebilen {
 	
		public void sayiAlma(int sayi)
		{
			int i;
			for(i=1; i<=100; i++)
			{
			{
			if(i% 3 == 0)
			{
			System.out.println("Sayi 3'e tam bölünüyor " + i);
			}
			}
			for(i=1; i<=100; i++) 
			{
			if (i% 5 == 0) 
			{
			System.out.println("Sayi 5'e tam bölünüyor " + i);
			}
			}
			
			
			for(i=1; i<=100; i++)
			{
				if(i% 3 == 0 && i%5 == 0 ) 
			{
				System.out.println("sayi 3'e ve 5'e tam bölünüyor " +i);
			}
			}
			}
		}
}
		

