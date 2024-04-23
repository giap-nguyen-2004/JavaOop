package THUCHANH;

import util.Configs;

public class NhanVienPartTime extends nhanvien{
    private int gio_lam;
    public void NhanvienParttime(String ten,int gio_lam){
        this.ten=ten;
        this.gio_lam=gio_lam;
    }
    @Override
    public String loainhanvien(){
        return "nhan vien thoi vu";
    }
    public void TinhLuong(){
        luong=Configs.luong_nhan_vien_PT_moi_gio*gio_lam;
    }
}
