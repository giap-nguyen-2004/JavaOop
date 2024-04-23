package THUCHANH;

public class nhanvien {
    protected String ten;
    protected long luong;
    public void NhanVien(){};
    public void NhanVien(String ten){
        this.ten=ten;
    }
    protected String loainhanvien(){
        return "";
    }
    public void xuatThongTin(){
        System.out.println("----------Nhan Vien :"+ten+"-----------");
        System.out.println("--- Loai Nhan Vien : "+loainhanvien());
        System.out.println("--- Luong : "+luong+" USD");
    }
}
