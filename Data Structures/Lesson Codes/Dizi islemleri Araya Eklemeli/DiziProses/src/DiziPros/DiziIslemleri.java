package DiziPros;
import java.util.*;
//<>
public class DiziIslemleri {
	
	static void arayaElemanEkle(int[] dizi, int index, int yeni) {
		
		for(int i=dizi.length-2;i>=index;i--) {
			
			dizi[i+1]=dizi[i];	
		}
		dizi[index]=yeni;
	}
	static void elemanSil(int[] dizi, int index) {
		
		for(int i=index;i<dizi.length-1;i++) {
			dizi[i]=dizi[i+1];
		}
		
	}
	static void diziYaz(int[] array) {
		
		for(int i=0; i<array.length;i++) {
			System.out.println(i +". eleman: " +array[i]);
		}
		System.out.println("-----------");
	}
	
	public static void main(String[] args) {
		DiziStack ds=new DiziStack(3);
		//ds.stackYaz();
		ds.ekle(19);
		ds.stackYaz();
		ds.ekle(-4);
		ds.stackYaz();
		ds.ekle(6);
		ds.stackYaz();
		ds.ekle(8);
		ds.stackYaz();
		System.out.println("cekilen deger " + ds.cek());
		ds.stackYaz();
		System.out.println("cekilen deger " + ds.cek());
		ds.stackYaz();
		System.out.println("cekilen deger " + ds.cek());
		ds.stackYaz();
		System.out.println("cekilen deger " + ds.cek());
		ds.stackYaz();
		ds.ekle(17);
		ds.stackYaz();
		//int n;
		//System.out.print("dizinin boyutunu girin: ");
		//Scanner klavye=new Scanner(System.in);
		//n=klavye.nextInt();
		

	}

}
