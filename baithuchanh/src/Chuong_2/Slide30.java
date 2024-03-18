package Chuong_2;

import java.util.Scanner;

public class Slide30 {
    public static int sum (int n ){
        if (n<10) return n;
        return sum(n/10)+sum(n%10);
    }
    public static void main(String[] args) {
        int n;
        int tong;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print(" nhap so nguyen duong n: ");
            n= sc.nextInt();
        } while (n<=0);
        tong = sum(n); 
        System.out.println("tong cac chu so la:" + tong); 
    }
}
