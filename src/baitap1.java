import java.util.Scanner;

public class baitap1 {
    public static void main(String[] args) {
        ktra();
    }
    static boolean thuanNghich(String s){
        for (int i = 0; i < s.length()/2; i++)
            if (s.charAt(i) != s.charAt(s.length()-1-i)) return false;
        return true;
    }
    static void ktra(){
        int dem = 0;
        for (int i = 100000; i <= 999999; i++){
            String s = "";
            s+= i;
            if (thuanNghich(s)){
                System.out.printf("%10d", i);
                if(dem++ %10 == 0 ) System.out.println("");
            }
        }
        System.out.println("");
    }
}
