package KeThua_Person;

import java.util.Scanner;

public class FullTime extends Employer{
    public int soNgayNghi;
    public int soLuotBanHang;
    public float tinhSoLuotBanHang;
    public float tienThuongFullTime;
    final float tienHoaHong = 1000000f;
    final float baohiem = 500000f;
    final float tienthuong = 1000000f;
    final float tienluongcung = 10000000f;
    public void nhapSoNgayNghi () {
        Scanner sc = new Scanner(System.in);
        super.nhapGiaTriEmployer();
        System.out.print("nhap so ngay nghi : ");
        soLuotBanHang = sc.nextInt();
  }
    public void tinhTienHoaHong() {
        tinhSoLuotBanHang = soLuotBanHang + tienHoaHong;
      }   
    public void tinhLuongFullTime () {
      if(soNgayNghi > 5) {
        tienThuongFullTime = tienluongcung - baohiem + tinhSoLuotBanHang;
      }else {
       
        tienThuongFullTime = tienluongcung + tienthuong +tinhSoLuotBanHang - baohiem;
      }
    }
    public void intinhLuongFullTime () {
      super.inGiaTriEmployer();
      System.out.println("luong nhan vien full time : %.0f" + tienThuongFullTime);
    }
}
