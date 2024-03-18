package Chuong_2;

import java.util.Scanner;

public class Slide81 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int m,n,max=0;
        do{System.out.print("nhap so cot cua ma tran: ");
        n=sc.nextInt();}while(n<=0);
        do{System.out.print("nhap so hang cua ma tran: ");
        m=sc.nextInt();}while(m<=0);
        int a[][]=new int[n][m];
        for(int i=0;i< n;i++){
            for(int j =0;j < m;j++){
                System.out.print("nhap phan tu thu ["+i+","+j+"]:");
                a[i][j]=sc.nextInt();
                if ((i==0)&&(j==0)){
                    max=a[i][j];
                }
                if ( max <a[i][j]){
                    max=a[i][j];
                }
            }
        }
        System.out.print("so lon nhat trong mang la: "+max);
    }
}
