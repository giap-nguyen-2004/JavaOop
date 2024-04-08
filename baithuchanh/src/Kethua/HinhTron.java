package Kethua;

import java.util.Scanner;

public class HinhTron extends Hinh_Hoc{
    public float banKinh;
    public void nhapBanKinh () {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ban kinh hinh tron : ");
        banKinh = sc.nextFloat();
    }
    public void tinhChuVi() {
        chuVi = 2 * PI * banKinh;
    }
    public void tinhDienTich() {
        dienTich = PI * banKinh * banKinh;
    }
}
