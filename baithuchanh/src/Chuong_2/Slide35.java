package Chuong_2;

import java.util.Scanner;

public class Slide35 {
    public static void main(String[] args) {
        int a, b ;
        Scanner sc =new Scanner(System.in);
        System.out.print("nhap so a:");
        a=sc.nextInt();
        System.out.print("nhap so b:");
        b=sc.nextInt();
        if(a>b){
            System.out.println("so be hon la b= "+ b);
        }
        else if ( b>a){
            System.out.println("so be hon la a= "+ a);
        }
        else{
            System.out.println("a=b= "+a );
        }
    }
}
