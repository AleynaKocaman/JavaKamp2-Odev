package inheritanceDemo;

public class main {

	public main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	
		System.out.println("inheritance demo");
		
		//OgretmenKrediManager ogretmenKrediManager=new OgretmenKrediManager();
		//ogretmenKrediManager.hesapla();
		
		
		
		KrediUI krediUI=new KrediUI();
		krediUI.krediHesapla(new Tar�mKrediManager());
		
		
		//BaseKrediManager baseKrediManager=new BaseKrediManager();
		//baseKrediManager.hesapla();


	}

}
