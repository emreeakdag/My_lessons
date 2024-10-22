public class ArrayProcess {






    public static void diziYaz(int[] dizi){

        for(int i = 0; i < dizi.length; i++){

            System.out.print(dizi[i]+",");
        }

    }

    static int[] elemanEkle(int[] array, int yeni){
            int [] yeniArray=new int[array.length+1];
            for (int i=0 ; i<array.length;i++){
                yeniArray[i]=array[i];
            }
            yeniArray[array.length]=yeni;
                return yeniArray;
    }


    static int[] elemanSil(int[]dizi) {

        int[] yeniArray = new int[dizi.length - 1];

        for (int i = 0; i < yeniArray.length; i++) {
            yeniArray[i] = dizi[i+1];
        }
        return yeniArray;

    }

    static int diziElemanSay(int[] dizi, int aranan){
        int sayac=0;

        for (int i=0;i<dizi.length;i++){
            if (dizi[i] == aranan){
                sayac++;
            }
        }
        return  sayac;
    }


    static int[] diziArananElemanIndeks(int[] dizi, int aranan){
        int [] index=new int[dizi.length];
        int yeniDiziIndex=0;
        for (int i=0;i<dizi.length;i++){

            if (dizi[i] == aranan){
                index[yeniDiziIndex]=i;
                yeniDiziIndex++;
            }
        }
        return index;
    }

    static void recDiziGezinme(int[] dizi, int index){
        if (index >= dizi.length){
            return;
        }else{
            System.out.print(dizi[index]+",");
            recDiziGezinme(dizi,index+1);
        }
    }



    public static void main(String[] args){

        int[] dizi= {9,3,5,6,3,1,4,1,10};
        System.out.println("******************");

        diziYaz(elemanEkle(dizi,75));

        System.out.println("\n******************");

        diziYaz(elemanSil(dizi));

        System.out.println("\n******************");

        System.out.println(diziElemanSay(dizi,1));

        System.out.println("\n******************");

        diziYaz(diziArananElemanIndeks(dizi,1));

        System.out.println("\n******************");

        recDiziGezinme(dizi,0);


    }

}
