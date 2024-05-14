package Chuong_4.Lits;

import java.util.Scanner;

public class Student {
    public String FullName = new String();
    public int age;
    public void Nhap_thong_tin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten ");
        FullName=sc.nextLine();
        System.out.println("nhap tuoi ");
        age=sc.nextInt();
    }
    public void In_thong_tin(){
        System.out.println("ten la :"+FullName);
        System.out.println("tuoi la :"+age);
    }
}
