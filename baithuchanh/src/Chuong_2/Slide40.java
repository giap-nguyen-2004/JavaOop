package Chuong_2;

import java.util.Scanner;

public class Slide40 {
    public static void main(String[] args) {
        int ngay ;
        Scanner sc= new Scanner(System.in);
        do {
            System.out.print(" nhap so: ");
            ngay = sc.nextInt();
        } while (ngay<=0);
        switch(ngay){
            case 1:
            System.out.println(" chu nhat ");
            break;
            case 2:
            System.out.println(" thu hai ");
            break;
            case 3:
            System.out.println(" thu ba ");
            break;
            case 4:
            System.out.println(" thu tu ");
            break;
            case 5:
            System.out.println(" thu nam ");
            break;
            case 6:
            System.out.println(" thu sau ");
            break;
            case 7:
            System.out.println(" thu bay ");
            break;
            default:
            System.out.println(""+ngay+" ngay");
            break;
        }
    }
}
