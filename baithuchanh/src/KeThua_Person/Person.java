package KeThua_Person;

import java.util.Scanner;

public class Person {
    public String hoTen;
    public String maCCCD;
    public int namSinh;
    public void nhapGiaTri () {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ho va ten : ");
        hoTen = sc.nextLine();
        System.err.print("ma can cuoc cong dan : ");
        maCCCD = sc.nextLine();
        System.out.print("nhap nam sinh : ");
        namSinh = sc.nextInt();
    }
    public void inGiaTri () {
        System.out.println("ho va ten = " + hoTen);
        System.out.println("can cuoc cong dan = " + maCCCD);
        System.out.println("nam sinh = " + namSinh);
    }
}
