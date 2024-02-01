import java.util.Scanner;

public class bai8slide95 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("nhap so luong so trong day:");
        int n;
        float tong=0;
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print("gia tri thu "+i+" trong day:");
            int x;
            x=sc.nextInt();
            tong +=x;
        }
        System.out.println("trung binh cong cua day la:"+(tong/n));
    }
}