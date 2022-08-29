import java.util.*;

public class baitap6 {
    public static void main(String[] args) {
        String s0 = new String();
        Scanner in = new Scanner(System.in);
        System.out.println("Nhập sâu: ");
        s0 = in.nextLine();
        sapxep(s0);
    }

    public static void sapxep(String s){
        StringTokenizer s1 = new StringTokenizer(s);
        ArrayList<String> arr = new ArrayList<>();
        int n = s1.countTokens();
        int i = 0;
        while (s1.hasMoreTokens()){
            String s2=s1.nextToken();
            arr.add(s2);
        }
        Collections.sort(arr);
           System.out.println(arr.toString());
    }
}
