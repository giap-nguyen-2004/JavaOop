package Chuong_3;

public class MainChuong3Side28 {
    public static void main(String[] args) throws Exception {
        Chuong3Side28 A = new Chuong3Side28();
        A.nhapGiaTri();
        if (A.vongTronLon()){
            System.out.println("hinh tron co ban kinh la: "+A.getBankinh());
        }
        else{
            float chuvi=A.tinhChuVi();
            System.out.println("chi vi hinh tron bang: "+chuvi);
        }
    }
}
