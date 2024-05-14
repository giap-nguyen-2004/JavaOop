package Chuong_4.Lits;

import java.util.ArrayList;

public class Slide_21 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>(3);
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Pink");
        colors.remove("Green");
        colors.add("Yellow");
        colors.add("Orange");
        System.out.println(colors.get(1));
        System.out.println(colors.contains("Orange"));
        System.out.println(colors.size());
        System.out.println(colors.get(0));
        System.out.println(colors);
    }
}
