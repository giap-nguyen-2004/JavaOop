package Chuong_4.Lits;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListsDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> Arr_L = new ArrayList<Student>();
        System.out.println("nhap so luong sinh vien can bo sung : ");
        int n;
        n = sc.nextInt();
        for(int i = 0; i < n ; i++) {
            Student student = new Student();
            student.Nhap_thong_tin();
            Arr_L.add(student);
        }
        System.out.println("thong tin ban dau: ");
        for(int i = 0; i <= Arr_L.size();i++){
            Arr_L.get(i).In_thong_tin();
        }
        Arr_L.remove(Arr_L.size());
        System.out.println("------Sinh vien vua duoc them vao-------");
        for(int i = 0; i <= Arr_L.size();i++){
                System.out.println("in thong tin sau khi sua:");
                Arr_L.get(i).In_thong_tin();
            }
    }
}
