package Main;

import java.util.Scanner;

import Person.Nhan_Vien;

public class main_Nhan_vien {
    public static void main(String[] args) {
        Nhan_Vien nv=new Nhan_Vien();
        Scanner sc = new Scanner(System.in);
        int n;
        n=sc.nextInt();
        System.out.print("So nhan vien:");
        for(int i=1;i<=n;i++){
            System.out.println("Nhan Vien Thu "+i+" ");
            nv.nhap_than_phan_NV();
            nv.in_thong_tin_NV();
        }
    }
}
