package Chuong_4.Map;

import java.util.LinkedHashMap;
import java.util.Map;
public class Slide_94 {
    public static void main(String[] args) {
        LinkedHashMap<Integer , String> Hash_M = new LinkedHashMap<Integer , String>();
        Hash_M.put(100, "Mo");
        Hash_M.put(101, "Dia");
        Hash_M.put(102, "Chat");
        for(Map.Entry<Integer,String> m:Hash_M.entrySet())
            System.out.println(m.getKey()+"  "+m.getValue());
        System.out.println("Truoc khi xoa phuong thuc :" +Hash_M);
        System.out.println("sau khi xoa phuong thuc" +Hash_M);
    }
}
