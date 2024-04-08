package Kethua;

public class MainKetThua {
    public static void main(String[] args) throws Exception {
        // Hinh Tron :
        HinhTron hinhtron = new HinhTron();
        hinhtron.nhapBanKinh();
        hinhtron.tinhChuVi();
        hinhtron.tinhDienTich();
        hinhtron.inChuVi();
        hinhtron.inDienTich();
        // Hinh Chu Nhat :
        HinhChuNhat hinhchunhat = new HinhChuNhat();
        hinhchunhat.nhapChieuDai();
        hinhchunhat.nhapChieuRong();
        hinhchunhat.tinhChuVi();
        hinhchunhat.tinhDienTich();
        hinhchunhat.inChuVi();
        hinhchunhat.inDienTich();
        // Hinh Tru Tron :
        HinhTruTron hinhtrutron = new HinhTruTron();
        hinhtrutron.nhapChieuCao();
        hinhtrutron.tinhTheTich() ;
        hinhtrutron.inTheTich();
        // Hinh Vuong :
        HinhVuong hinhvuong = new HinhVuong();
        hinhvuong.nhapCanh();
        hinhvuong.tinhChuVi();
        hinhvuong.tinhDienTich();
        hinhvuong.inChuVi();
        hinhvuong.inDienTich();
    }
}
