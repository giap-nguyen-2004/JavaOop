package Chuong_3;

import java.util.Scanner;

public class Chuong3Side28 {
    float cv;
    float dientich;
    float bankinh;
    final float PI = 3.14f;

    public void nhapGiaTri () {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ban kinh : ");
        bankinh = sc.nextFloat();
    }
    public void tinhDienTich () {
        dientich = PI * bankinh * bankinh;
    }

    public float getBankinh () {
        return bankinh;
    }

    public float tinhChuVi () {
        cv = 2 * PI * bankinh ;
        return cv;
    }

   Boolean vongTronLon () {
    if( bankinh > 10) {
        return true;
    }else {
        return false;
    }
   }
}
