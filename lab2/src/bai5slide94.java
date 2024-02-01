import java.util.Scanner;

public class bai5slide94 {
    public static void main(String[] args) {
        int n, tong = 0 ;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("nhap n :");
            n = sc.nextInt();
            tong = tong + n ;
        }while (tong <=100);
        System.out.print("tong cac so nguyen la:");
        System.out.println(tong);
    }
}