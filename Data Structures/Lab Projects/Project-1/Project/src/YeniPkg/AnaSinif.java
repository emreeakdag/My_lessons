package YeniPkg;


import java.util.Scanner;


public class AnaSinif {

    public String isim ;
    public int numara ;
    public float boy;


    public AnaSinif(){
        this.isim = "";
        this.numara = 0;
        this.boy = 0;
    }

    public AnaSinif(String isim, int numara){
        this.isim = isim;
        this.numara = numara;
        this.boy = 0;
    }

    public AnaSinif(String isim, int numara, float boy){
        this.isim = isim;
        this.numara = numara;
        this.boy = boy;
    }


    public static void sayi_yazdir(int deger){

        System.out.println("Verilen deger :" + deger);
    }




    public static void IkinciSinifDegerYazdir(IkinciSinif iks){

        System.out.println("Arabanin ismi : "+ iks.getAraba_ismi());
        System.out.println("Arabanin yasi : " + iks.getAraba_yas());
        System.out.println("Araba kac km : " + iks.getAraba_km());

    }

    public static IkinciSinif ikinciSinifaDegerAta(String araba_ismi, int araba_yas, float araba_km){

        IkinciSinif ikinciden_ek_nesne = new IkinciSinif();

        ikinciden_ek_nesne.setAraba_ismi(araba_ismi);
        ikinciden_ek_nesne.setAraba_yas((araba_yas));
        ikinciden_ek_nesne.setAraba_km(araba_km);
        return ikinciden_ek_nesne;
    }

    public static void main(String[] args) {
        sayi_yazdir(42);

        IkinciSinif ikinciSinif = ikinciSinifaDegerAta("BMW", 2022, 1000);


        IkinciSinif[] ikinciSinifDizisi = new IkinciSinif[2];

        for (int i = 0; i < ikinciSinifDizisi.length; i++) {
            ikinciSinifDizisi[i] = new IkinciSinif();
        }

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < ikinciSinifDizisi.length; i++) {
            System.out.println("İkinciSinif nesnesi " + (i + 1) + " için:");

            System.out.print("Araba ismi: ");
            String araba_ismii = scanner.next();
            ikinciSinifDizisi[i].setAraba_ismi(araba_ismii);

            System.out.print("Araba yasi: ");
            int araba_yasi = scanner.nextInt();
            ikinciSinifDizisi[i].setAraba_yas(araba_yasi);



            System.out.print("Araba km: ");
            float araba_kmm = scanner.nextFloat();
            ikinciSinifDizisi[i].setAraba_km(araba_kmm);
        }

        System.out.println("\nGirilen İkinciSinif nesne bilgileri:");
        for (IkinciSinif iks : ikinciSinifDizisi) {
            ikinciSinifDegerYazdir(iks);
            System.out.println();
        }

        scanner.close();






        IkinciSinif ikinciden_nesne = new IkinciSinif();

        ikinciden_nesne.setAraba_ismi("Ford");
        ikinciden_nesne.setAraba_yas(1969);
        ikinciden_nesne.setAraba_km(2024);

        IkinciSinifDegerYazdir(ikinciden_nesne);


    }

    private static void ikinciSinifDegerYazdir(IkinciSinif iks) {
    }

}














