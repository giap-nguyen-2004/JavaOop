import java.util.Scanner;

public class bai11slide97 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("nhapn=");
            n=sc.nextInt();
        } while (n<=0);
        int a[] = new int[n];
        for (int i=0;i<n;i++){
            System.out.print("nhap phan tu thu "+(i+1)+":");
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++) {
            System.out.print(""+a[i]+" ");
        }
        for(int i= 0;i<n-1;i++){
            for(int j= i+1;j<n;j++){
                if (a[i]>a[j]){
                   int temp = a[j] ;
                    a[j]=a[i];
                    a[i]= temp;
                }
            } 
        }
        System.out.println("");
        for (int i=0;i<n;i++) System.out.print(""+a[i]+" ");
    }
}