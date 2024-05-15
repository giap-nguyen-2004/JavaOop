package Chuong_4.Sets;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Slide_69 {
    public static void main(String[] args) {
        int number;
        TreeSet<Integer> Tree_S = new TreeSet<>();
        TreeSet<Integer> Tree_S1 = new TreeSet<>();
        Tree_S1.add(34);
        Tree_S1.add(99);
        Scanner sc = new Scanner(System.in);
        Tree_S.add(0);
        Tree_S.add(3);
        Tree_S.add(1);
        Tree_S.add(4);
        Tree_S.add(2);
        Tree_S.add(8);
        System.out.println("cac phan tu trong Tree_S :");
        System.out.println(Tree_S);
        System.out.println("nhap phan tu can them:");
        number=sc.nextInt();
        if(!Tree_S.contains(number)){
            Tree_S.add(number);
            System.out.println("them thanh cong:");
            System.out.println("Cac phan tu sau khi them :");
            System.out.println(Tree_S);
        } else{
            System.out.println("phan tu "+number+" Da ton tai");
        }
        Tree_S.addAll(Tree_S1);
        System.out.println(Tree_S);
    }
}
