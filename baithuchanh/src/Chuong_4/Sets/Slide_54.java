package Chuong_4.Sets;

import java.util.HashSet;
import java.util.Scanner;

public class Slide_54 {
    public static void main(String[] args) {
        int number;
        HashSet<Integer> hashS = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        hashS.add(0);
        hashS.add(3);
        hashS.add(1);
        hashS.add(4);
        hashS.add(2);
        hashS.add(8);
        System.out.println("cac phan tu trong hashS :");
        System.out.println(hashS);
        System.out.println("nhap phan tu can them:");
        number=sc.nextInt();
        if(!hashS.contains(number)){
            hashS.add(number);
            System.out.println("them thanh cong:");
            System.out.println("Cac phan tu sau khi them :");
            System.out.println(hashS);
        } else{
            System.out.println("phan tu "+number+" Da ton tai");
        }
    }
}
