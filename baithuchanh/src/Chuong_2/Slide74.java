package Chuong_2;

import java.util.Scanner;

public class Slide74 {
    public static void main(String[] args) {
        int n;
        int tong=0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("nhap so phan tu cua mang: ");
            n =sc.nextInt();
        } while (n<=0);
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("nhap phan tu thu "+(i+1)+" cua mang: ");
            a[i] = sc.nextInt();
            if( a[i]%2==0){
                tong +=a[i];
            }
           }
           System.out.print("tong cac so chan trong mang la: "+ tong );
    }
}
