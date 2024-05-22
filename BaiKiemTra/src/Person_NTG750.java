import java.util.ArrayList;
import java.util.Scanner;

public class Person_NTG750 {
    public int tuoi;
    public String HoTen;
    public Float Luong;

    public void Nhap_thong_Tin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tuoi Person:");
        tuoi=sc.nextInt();
        System.out.println("Nhap ho va ten person:");
        HoTen=sc.nextLine();
        System.out.println("Nhap tien Luong cua Person:");
        Luong=sc.nextFloat();
    }
    
    public void In_thong_tin(){
        System.out.println("Ho ten:"+HoTen);
        System.out.println("Tuoi:"+tuoi);
        System.out.println("Luong:"+Luong);
    }
}
