import java.util.Scanner;

public class slide47 {
    public static void main(String[] args) {
        int a, tong =0 ;
        Scanner sc= new Scanner(System.in);
        while(tong <101 ){
            System.out.print("nhap so nguyen:");
            a=sc.nextInt();
            tong += a;
        }
        System.out.println("tong vua nhap la: "+tong);
    }
}