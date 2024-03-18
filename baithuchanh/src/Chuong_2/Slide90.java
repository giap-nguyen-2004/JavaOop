package Chuong_2;

import java.util.Scanner;

public class Slide90 {
    public static void main(String[] args) {
        String chuoi =new String();
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap chuoi:");
        chuoi=sc.nextLine();
        for(int i=0;i< chuoi.length();i++)
        System.out.println(chuoi.charAt(i));
    }
}
