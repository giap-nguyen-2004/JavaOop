package Chuong_4.Lits;

import java.util.LinkedList;

import Lop_Truu_Tuong.Abstract.main;

public class Slide_38 {
    public static void main(String[] args) {
        LinkedList<String> Linked = new LinkedList<String>();
        Linked.add("java");
        Linked.add("c++");
        Linked.add("PHP");
        Linked.add("java");
        System.out.println("vi du su dung phuong thuc");
        System.out.println("-------------------------");
        LinkedList<String> Linked1 = new LinkedList<String>();
        Linked1.addAll(Linked);
        System.out.print("Linked1:");
        showList(Linked1);
        System.out.println("\nvi du su dumg phuing thuc retainAll()");
        System.out.println("---------------------------------------");
        LinkedList<String> Linked2 =new LinkedList<String>();
        Linked2.add("java");
        Linked1.retainAll(Linked2);
        System.out.println("Linked1:");
        showList(Linked1);
        System.out.println("vi du phuong thuc removeAll()");
        System.out.println("-----------------------------");
        Linked.removeAll(Linked2);
        System.out.println("linked:");
        showList(Linked);
    }
    public static void showList(LinkedList<String> Linked){
        for (String obj :Linked){
            System.out.print("\t"+obj+",");
        }
        System.out.println();
    }
}
