package Chuong_4.Lits;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Student> linkedlistPerson = new LinkedList<Student>();

         int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so luong sinh vien can chinh sua :");
        n = sc.nextInt();
        for(int i = 0; i < n ; i++) {
            Student st =new Student();
            st.Nhap_thong_tin();
            linkedlistPerson.add(st);
        }
        for(int i = 0; i < linkedlistPerson.size();i++){
            System.out.println("<------thong tin sinh vien ----->");
            linkedlistPerson.get(i).In_thong_tin();
        }
        linkedlistPerson.remove(0);
        for(int i = 0; i < linkedlistPerson.size();i++){
            System.out.println("<------sinh vien vua duoc loai bo ----->");
            linkedlistPerson.get(i).In_thong_tin();
        }
    }
}
