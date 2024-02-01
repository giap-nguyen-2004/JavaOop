public class bai3slide93 {
    public static void main(String[] args) {
        String ten;
        int tuoi ;
        Scanner sc= new Scanner(System.in);
        System.out.print(" nhap ten:");
        ten=sc.nextLine();
        System.out.print(" nhap tuoi: ");
        tuoi = sc.nextInt();
        if(tuoi<16){
            System.out.println("ban "+ ten+ " o do tuoi vi thanh nien ");
        }
        else if(tuoi>=16 && tuoi <18){
            System.out.println(" ban "+ ten+ " o do tuoi truong thanh");
        }
        else {
            System.out.println("ban "+ ten +" da gia");
        }
    }
}
