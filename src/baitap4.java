import java.util.*;

public class baitap4 {
    public static void TimXau(String strInput){
        StringTokenizer stringTokenizer = new StringTokenizer(strInput," ,\t,\r");
        int Max, i = 1, lengStr;
        Max = stringTokenizer.nextToken().length();
        int vitriMax=i;
        while (stringTokenizer.hasMoreTokens()){
            lengStr = stringTokenizer.nextToken().length();
            i++;
            if (Max < lengStr){
                Max = lengStr;
                vitriMax = i;
            }
        }
        System.out.println("Độ dài xâu lớn nhất là: "+Max+" ở vị trí "+vitriMax);
    }

    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Nhập vào 1 xâu: ");
        String strInput = input.nextLine();
        TimXau(strInput);
    }
}
