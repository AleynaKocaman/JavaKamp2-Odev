package methods;

public class methods {


	public static void main(String[] args) {
		
		/*
		say�Bulmaca();
		say�Bulmaca();
		say�Bulmaca();
		say�Bulmaca();
		*/
		
		String mesaj="Bug�n hava �ok g�zel";
		//mesaj.substring(0,2);
		//String yeniMesaj=mesaj.substring(0,2);
		//System.out.println(yeniMesaj); 
		
		String yeniMesaj=sehirVer();
		System.out.println(yeniMesaj); 
		int say�=topla(5,7);
		System.out.println(say�);
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
	
	public static void g�ncelle() {
		System.out.println("g�ncellendi");
	}
	
	public static int topla(int say�1, int say�2) {
		return say�1+say�2;
	}
	
	public static String sehirVer () {
		return "Ankara";
	}
	
	public static int topla2(int... say�lar) {
		int toplam=0;
		for(int say�:say�lar) {
			toplam+=say�;
		}
		return toplam;
	}
	
	public static void say�Bulmaca() {
		int[] say�lar=new int[] {1,2,5,7,9,0};
		int aranacakSay�=10;
		boolean varM�=false;
		
		for (int i = 0; i < say�lar.length; i++) {
			
			if(say�lar[i]==aranacakSay�) {
				varM�=true;
				break;
			}
			
		}
		
		String mesaj="";
		if(varM�) {
			//System.out.println("say� dizide bulunuyor: "+aranacakSay�);
			mesaj="say� mevcuttur: "+aranacakSay�;
			mesajVer(mesaj);
			
		}else {
			//System.out.println("say� dizide bulunmuyor: "+aranacakSay�);
			mesaj="say� dizide bulunmuyor: "+aranacakSay�;
			mesajVer(mesaj);
		}
 
	}
	
	public static void mesajVer(String mesaj) {
		//parametreli method
		System.out.println(mesaj);
		
		
	}

	
}
