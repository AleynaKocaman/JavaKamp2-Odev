package classes;

public class D�rt��lem {

	public D�rt��lem() {
		// TODO Auto-generated constructor stub
	}
	
	public  int toplama(int... say�lar) {
		int topla=0;
		for (int say� : say�lar) {
			topla+=say�;
			
		}
		return topla;
	}
	
	public  int ��karma(int... say�lar) {
		int ��kar=0;
		for (int say� : say�lar) {
			��kar-=say�;
			
		}
		return ��kar;
	}

	public  int �arpma(int... say�lar) {
		int �arp=0;
		for (int say� : say�lar) {
			�arp*=say�;
			
		}
		return �arp;
	}
	
	public  int b�lme(int... say�lar) {
		int b�lme=0;
		for (int say� : say�lar) {
			b�lme/=say�;
			
		}
		return b�lme;
	}
	
	
}
