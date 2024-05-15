package Chuong_4.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Slide_88 {
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
        System.out.println("que toi o :"+hash_M.get("VP"));
        System.out.println("toi dang hoc o :"+hash_M.get("HN"));
        if (hash_M.containsValue("Ha Noi")){
            System.out.println("co Ha Noi  trong hash_M");
        } else System.out.println("khong co Ha noi trong hash_M ; Can bo sung them");
        if (hash_M.containsKey("VP")){
            System.out.println("co Vinh Phuc trong hash_M");
        } else System.out.println("Khong tim thay Vinh Phuc bang tu khoa 'VP' de nghi bo sung nhanh");
    }
}
