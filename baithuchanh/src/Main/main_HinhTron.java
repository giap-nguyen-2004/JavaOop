package Main;

import java.util.Scanner;

import Hinh_Hoc.Hinh_Tron;

public class main_HinhTron {
    public static void main(String[] args) {
        Hinh_Tron hinh_tron = new Hinh_Tron();
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("So hinh tron can nhap:");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            hinh_tron.nhap_bankinh();
            hinh_tron.Tinh_chu_vi();
            hinh_tron.Tinh_dien_tich();
            hinh_tron.In_cv_dt_hinh_tron();
        }
    }
}
