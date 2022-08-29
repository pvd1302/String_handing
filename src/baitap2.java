import java.util.Scanner;

public class baitap2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap chuoi:");
        String str = input.nextLine();
        xenke(str);
    }
    public static void xenke(String str) {
        char[] ch = str.toCharArray();
        String B[] = new String[256];
        for(int i=0; i<ch.length; i++) {
            B[i] = String.valueOf(ch[i]);
        }
        for(int i=0; i<ch.length; i++) {
            if(i%2 == 0) {
                B[i] = B[i].toUpperCase();
            }else {
                B[i] = B[i].toLowerCase();
            }
        }
        for(int i=0; i<ch.length; i++) {
            System.out.print(B[i]);
        }

    }
}
