public class Reverse {

    static void ReverseMethod(char st[] , int index){
        if (index <0){
            return;
        }
        System.out.print(st[index]);
        ReverseMethod(st,index-1);
    }


    public static void main(String[] args) {
        char[] karakter = {'a', 'b', 'c'};
        ReverseMethod(karakter,karakter.length-1);
    }

}
