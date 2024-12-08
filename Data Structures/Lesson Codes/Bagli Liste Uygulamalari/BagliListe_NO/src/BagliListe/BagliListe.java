package BagliListe;

public class BagliListe {
	Eleman bas;
	Eleman son;

	
	BagliListe(){
		bas=null;
		son=null;
	}
	
	void basaEkle(Eleman yeni) {
		
		if(bas==null) {//liste boşsa
			bas=yeni;
			son=yeni;
			return;
		}
		//liste boş değil
		
		yeni.sonraki=bas;
		bas=yeni;
	}
	void bastanSil() {
		
		if(bas==null) {//liste boşsa
			System.out.println("Liste boş Silme yapılamaz ");
			return;
		}
		//liste boş değil
		
		bas=bas.sonraki;
	}
	
	void sonaEkle(Eleman yeni) {
		
		if(bas==null) {//liste boşsa
			bas=yeni;
			son=yeni;
			return;
		}
		//liste boş değil
		
		son.sonraki=yeni;
		son=yeni;
	}
	
	void listeYazdir() {
		
		Eleman temp=bas;
		while(temp!=null) {
			
			System.out.println(temp.ad +" " +temp.soyad +" " +temp.dt);
			temp = temp.sonraki;
			
		}
		System.out.println("--------------------");
	}
}
