import java.util.Scanner;

public class bai10slide96 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String chuoi =new String();
        String kytu=new String();
        int dem=0;
        do{
            System.out.print("nhap chuoi ky tu: ");
            chuoi=sc.nextLine();
        }while(chuoi.length()>80);
        do{
            System.out.print("nhap ky tu: ");
            kytu=sc.nextLine();
        }while (kytu.length() != 1);
        int x=0;
        while (( chuoi.indexOf(kytu,x))>=0) {
            dem++; 
            x= chuoi.indexOf(kytu,x)+1;  
        }
        System.out.println("co "+dem+" ki tu giong '"+kytu+"' trong chuoi");
    }
}