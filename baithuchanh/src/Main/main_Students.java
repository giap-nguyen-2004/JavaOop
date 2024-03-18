package Main;

import java.util.Scanner;

import Person.Students;

public class main_Students {
    public static void main(String[] args) {
        Students std =new Students();
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for (int i=1;i<=n;i++){
            System.out.println("Hoc Sinh Thu:"+i+"");
            std.nhap_thong_tin_hs();
            std.nhap_diem();
            std.in_thong_tin_hs();
            System.out.println(" ");
        }
    }
}
