package classes;

public class Dörtİşlem {

	public Dörtİşlem() {
		// TODO Auto-generated constructor stub
	}
	
	public  int toplama(int... sayılar) {
		int topla=0;
		for (int sayı : sayılar) {
			topla+=sayı;
			
		}
		return topla;
	}
	
	public  int çıkarma(int... sayılar) {
		int çıkar=0;
		for (int sayı : sayılar) {
			çıkar-=sayı;
			
		}
		return çıkar;
	}

	public  int çarpma(int... sayılar) {
		int çarp=0;
		for (int sayı : sayılar) {
			çarp*=sayı;
			
		}
		return çarp;
	}
	
	public  int bölme(int... sayılar) {
		int bölme=0;
		for (int sayı : sayılar) {
			bölme/=sayı;
			
		}
		return bölme;
	}
	
	
}
