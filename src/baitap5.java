import java.util.StringTokenizer;
import java.util.Scanner;

public class baitap5 {
    public static String doiVT(String strInput){
        String str = strInput;
        StringTokenizer stringTokenizer = new StringTokenizer(str," ");
        String ho = stringTokenizer.nextToken();
        String hoDem = stringTokenizer.nextToken();
        String ten = stringTokenizer.nextToken();

        String strOutput = ten+" "+ho+" "+hoDem;
        return (strOutput);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào theo form họ-họ đệm-tên: ");
        String strInput = input.nextLine();
        System.out.println("Họ và tên được sắp xếp lại: "+doiVT(strInput));
    }
}
