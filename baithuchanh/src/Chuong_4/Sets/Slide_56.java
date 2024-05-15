package Chuong_4.Sets;

import java.util.HashSet;
import java.util.Scanner;

public class Slide_56 {
    public static void main(String[] args) {
        String name;
        HashSet<String> hashS = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        hashS.add("Oppa");
        hashS.add("Oni_chan");
        hashS.add("baka");
        hashS.add("dung");
        hashS.add("duc");
        hashS.add("duc");
        System.out.println("cac phan tu trong hashS :");
        System.out.println(hashS);
        System.out.println("nhap phan tu can xoa:");
        name=sc.nextLine();
        if(hashS.contains(name)){
            hashS.remove(name);
            System.out.println("xoa thanh cong:");
            System.out.println("Cac phan tu sau khi xoa :");
            System.out.println(hashS);
        } else{
            System.out.println("xoa khong thanh cong");
        }
    }
}
