import java.util.Scanner;

public class Nhan_Vien {
    public String ho_ten = new String();
    public String Id_NhanVien = new String();
    public String Que_quan = new String();
    public int nam_sinh;
    public String chuc_vu =new String();
    public int so_ngay_lam;
    public int luong_ngay;
    public int bao_hiem;
    Scanner sc = new Scanner(System.in);
    public void nhap_than_phan_NV(){
        System.out.print("nhap ten:");
        ho_ten = sc.nextLine();
        System.out.print("nhap ma NV:");
        Id_NhanVien=sc.nextLine();
        System.out.print("nhap nam sinh:");
        nam_sinh=sc.nextInt();
        System.out.print("que quan:");
        Que_quan=sc.nextLine();
        System.out.print("chuc vu trong cong ty:");
        chuc_vu=sc.nextLine();
        System.out.print("nhap so ngay lam");
        so_ngay_lam=sc.nextInt();
        System.out.print("nhap tien luong theo ngay:");
        luong_ngay=sc.nextInt();
        System.out.print("nhap so tien bao hiem phai nop theo thang");
        bao_hiem=sc.nextInt();
    }
    public void in_thong_tin_NV(){
        System.out.println("ho va ten:"+ho_ten);
        System.out.println("ma nhan vien:"+Id_NhanVien);
        System.out.println("que quan:"+Que_quan);
        System.out.println("so tuoi:"+(2024-nam_sinh)+"  nam sinh:"+nam_sinh);
        System.out.println("luong ="+(so_ngay_lam*luong_ngay-bao_hiem));
    }
}