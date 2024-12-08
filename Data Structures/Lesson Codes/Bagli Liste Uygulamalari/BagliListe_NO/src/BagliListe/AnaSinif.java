package BagliListe;

public class AnaSinif {

	public static void main(String[] args) {
		Eleman kisi1=new Eleman("Ali", "Kara", 1995);
		Eleman kisi2=new Eleman("Osman", "Kaplan", 2007);
		Eleman kisi3=new Eleman("Kadir", "Arlan", 2011);
		
		BagliListe bl=new BagliListe();
		
		bl.listeYazdir();
		
		bl.basaEkle(kisi1);
		bl.listeYazdir();
		
		bl.basaEkle(kisi2);
		bl.listeYazdir();
		
		bl.sonaEkle(kisi3);
		bl.listeYazdir();
		
		bl.bastanSil();
		bl.listeYazdir();
		bl.bastanSil();
		bl.listeYazdir();
		bl.bastanSil();
		bl.listeYazdir();
		bl.bastanSil();
		bl.listeYazdir();
		

	}

}
