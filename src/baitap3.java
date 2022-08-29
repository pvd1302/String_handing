import java.util.Scanner;
public class baitap3 {
    String st;
    public void nhap(){
        System.out.println("Nhập xâu: ");
        st= new Scanner(System.in).nextLine();
    }
    public void hienThi() {
        System.out.println(st);
    }

    public void chuannHoa() {
        st=st.trim().toLowerCase();
        st = st.replaceAll("\\s+", " ");
        String[] temp= st.split(" ");
        st="";
        for(int i=0;i<temp.length;i++) {
            st+=String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
            if(i<temp.length-1)
                st+=" ";
        }
    }

    public static void main(String[] args) {
        baitap3 a =new baitap3();
        a.nhap();
        a.chuannHoa();
        System.out.println("Xâu sau khi chuẩn hóa: ");
        a.hienThi();
    }
}
