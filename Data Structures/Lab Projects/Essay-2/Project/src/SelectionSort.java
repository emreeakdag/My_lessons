public class SelectionSort {

    public static void selection_sort(int[] array){


        // dışarıdaki döngü tüm array'i gezerken, içerideki döngü de geri kalan kısmı tarayıp en küçük elemanı bulmak için gezer.



        for(int i = 0; i < array.length; i++){

            int minimum_index = i; // o an bulunan en küçük eleman olarak alır. Her geçişte en küçük elemanın index'ini tutar.

            for(int j = i + 1; j < array.length ; j++) {

                if (array[j] < array[minimum_index]) {
                    minimum_index = j;
                }

            }

            // bulunan en küçük elemanı baştakiyle değiştirelim

            int temp = array[minimum_index];
            array[minimum_index] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] new_array = {2, 5, 7, 8, 3, 5,4, 1};


        System.out.print("Sıralamadan önce: ");

        for(int num : new_array){
            System.out.print(num + " ");
        }

        selection_sort(new_array);


        System.out.print("\nSıralamadan sonra: ");

        for(int num : new_array){
            System.out.print(num + " ");
        }



    }

}
