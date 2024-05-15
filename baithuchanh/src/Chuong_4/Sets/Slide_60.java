package Chuong_4.Sets;

import java.util.LinkedHashSet;
import java.util.Set;

public class Slide_60 {
    public static void main(String[] args) {
        Set<String> LinkedHashSet = new LinkedHashSet<>();
        LinkedHashSet.add("JAVA");
        LinkedHashSet.add("C++");
        LinkedHashSet.add("JAVA");
        LinkedHashSet.add("PHP");
        LinkedHashSet.add("PASCAL");
        LinkedHashSet.add("PYTHON");
        LinkedHashSet.remove("PYTHON");
        LinkedHashSet.clear();
        for (String str : LinkedHashSet){
            System.out.println(str);
        }
        if(LinkedHashSet.isEmpty()){
            System.out.println("tap nay khong chuwa phan tu.....");
        };

    }
}
