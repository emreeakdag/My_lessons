package BagliListe;

public class Eleman {
	String ad;
	String soyad;
	int dt;
	
	Eleman sonraki;
	
	Eleman(String ad, String soyad, int dt){
		this.ad=ad;
		this.soyad=soyad;
		this.dt=dt;
		
		sonraki=null;
		
	}

}
