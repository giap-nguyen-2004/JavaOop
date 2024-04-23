package THUCHANH;

import util.Configs;

public class NhanVienFullTime extends nhanvien {
    private int ngay_lam_them;
    private int loaichucvu;
    void NhanVien_FullTime(String ten,int ngay_lam_them){
        this.ten=ten;
        this.ngay_lam_them=ngay_lam_them;
    }
    public  void setloaichucvu (int loaichucvu){
        this.loaichucvu=loaichucvu;
    }
    public String loainhanvien(){
        return "nhan vien chich thuc";
    }
    public void tinh_luong_ncct(){
        if (loaichucvu==1){
            luong=Configs.Luong_sep_cb+(Configs.luong_lam_them_moi_ngay*ngay_lam_them);
        }
        else{
            luong=Configs.Luong_linh_cb+(Configs.luong_lam_them_moi_ngay*ngay_lam_them);
        }
    }
}
