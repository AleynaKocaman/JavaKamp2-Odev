package methods;

public class methods {


	public static void main(String[] args) {
		
		/*
		sayýBulmaca();
		sayýBulmaca();
		sayýBulmaca();
		sayýBulmaca();
		*/
		
		String mesaj="Bugün hava çok güzel";
		//mesaj.substring(0,2);
		//String yeniMesaj=mesaj.substring(0,2);
		//System.out.println(yeniMesaj); 
		
		String yeniMesaj=sehirVer();
		System.out.println(yeniMesaj); 
		int sayý=topla(5,7);
		System.out.println(sayý);
		int toplam=topla2(2,5,7,45,6);
		System.out.println(toplam);
		int toplam2=topla2();
		System.out.println(toplam2);

		
		

	}
	
	public static void ekle() {
		System.out.println("Eklendi");
	}
	
	public static void sil() {
		System.out.println("silindi");
	}
	
	public static void güncelle() {
		System.out.println("güncellendi");
	}
	
	public static int topla(int sayý1, int sayý2) {
		return sayý1+sayý2;
	}
	
	public static String sehirVer () {
		return "Ankara";
	}
	
	public static int topla2(int... sayýlar) {
		int toplam=0;
		for(int sayý:sayýlar) {
			toplam+=sayý;
		}
		return toplam;
	}
	
	public static void sayýBulmaca() {
		int[] sayýlar=new int[] {1,2,5,7,9,0};
		int aranacakSayý=10;
		boolean varMý=false;
		
		for (int i = 0; i < sayýlar.length; i++) {
			
			if(sayýlar[i]==aranacakSayý) {
				varMý=true;
				break;
			}
			
		}
		
		String mesaj="";
		if(varMý) {
			//System.out.println("sayý dizide bulunuyor: "+aranacakSayý);
			mesaj="sayý mevcuttur: "+aranacakSayý;
			mesajVer(mesaj);
			
		}else {
			//System.out.println("sayý dizide bulunmuyor: "+aranacakSayý);
			mesaj="sayý dizide bulunmuyor: "+aranacakSayý;
			mesajVer(mesaj);
		}
 
	}
	
	public static void mesajVer(String mesaj) {
		//parametreli method
		System.out.println(mesaj);
		
		
	}

	
}
