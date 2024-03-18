package Person;

import java.util.Scanner;

public class Students {
    public String ho_ten = new String();
    public String  Id_student = new String ();
    public int naw_sinh;
    Scanner sc = new Scanner(System.in);
    public void nhap_thong_tin_hs (){
        System.out.print("ho va ten ");
        ho_ten=sc.nextLine();
        System.out.print("ma simh vien ");
        Id_student=sc.nextLine();
        System.out.print("nam sinh");
        naw_sinh=sc.nextInt();
    }
    public int diem_A;
    public int diem_B;
    public int diem_C;
    public void nhap_diem(){
        System.out.print("nhap diem A=");
        diem_A=sc.nextInt();
        System.out.print("nhap diem B=");
        diem_B=sc.nextInt();
        System.out.print("nhap diem C=");
        diem_C=sc.nextInt();
    }
    public void in_thong_tin_hs(){
        System.out.println("ho Va ten :"+ho_ten);
        System.out.println("ma sing vien :"+Id_student);
        System.out.println("nam sinh :"+naw_sinh);
        System.out.println("diem trung binh :"+((diem_A*6/10)+(diem_B*3/10)+(diem_C/10)));
    }
}
