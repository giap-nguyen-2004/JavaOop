import java.util.Scanner;

public class person {
    public String ho_Ten;
    public String soCCCD;
    public int nam_Sinh , tuoi;


    public void nhapGiaTri () {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ho va ten : ");
        ho_Ten = sc.nextLine();
        System.err.print("so can cuoc cong dan : ");
        soCCCD = sc.nextLine();
        System.out.print("nhap nam sinh : ");
        nam_Sinh = sc.nextInt();
    }


    public int tinhTuoi () {
        tuoi = 2024 - nam_Sinh;
        return tuoi;
    }
    public void inGiaTri () {
        System.out.println("ho va ten = " + ho_Ten);
        System.out.println("can cuoc cong dan = " + soCCCD);
        System.out.println("nam sinh = " + nam_Sinh);
    }

    public void inGiaTri ( String name, String number, int age) {
        System.out.println("\nho va ten = " + name);
        System.out.println("can cuoc cong dan = " + number);
        System.out.println("nam sinh = " + age);
    }
    public person()
    {
        ho_Ten = "Nguyen Van A";
        soCCCD = "0123456789";
        nam_Sinh = 2004;
    }
    public void HienThi () {
        System.out.println("ho va ten = " + ho_Ten);
        System.out.println("can cuoc cong dan = " + soCCCD);
        System.out.println("nam sinh = " + nam_Sinh);
    }
}