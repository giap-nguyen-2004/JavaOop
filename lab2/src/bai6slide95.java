import java.util.Scanner;

public class bai6slide95 {
    public static void main(String[] args) {
        int n;
        long giaithua = 1;
        Scanner sc=new Scanner(System.in);
        do {
            System.out.print("nhap so:");
            n=sc.nextInt();
        } while (n<=0);
        for(int i=2;i<=n;i++){
            giaithua *= i;
        }
        System.out.println(""+n+"! = "+giaithua);
    }
}
