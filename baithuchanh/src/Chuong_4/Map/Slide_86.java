package Chuong_4.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Slide_86 {
    public static void main(String[] args) {
        HashMap<String,String> hash_M =new HashMap<>();
        hash_M.put("HN","Ha Noi");
        hash_M.put("VP","Vinh Phuc");
        hash_M.put("DB","Dien Bien");
        hash_M.put("CB","Cao Bang");
        hash_M.put("PX","Phu Xuyen");
        Set<Map.Entry<String,String>> set_HashMap = hash_M.entrySet();
        System.out.println("cac entry co trong Set_hashMap");
        System.out.println(set_HashMap);
    }
}
