public class bai1slide92 {
    public static void main(String[] args) {
        float a,b;
        Scanner sc = new Scanner (System.in);
        System.out.print("nhap so thu nhat:");
        a=sc.nextInt();
        System.out.print("nhap so thu hai:");
        b=sc.nextInt();
        System.out.println(" "+a+" + "+b+" = "+(a+b));
        System.out.println(" "+a+" - "+b+" = "+(a-b));
        System.out.println(" "+a+" * "+b+" = "+(a*b));
        System.out.println(" "+a+" : "+b+" = "+(a/b));
        System.out.println(" "+a+" : "+b+" = "+(a/b)+" du "+(a%b));
        System.out.println(" "+b+" : "+a+" = "+(b/a)+" du "+(b%a));
        if (a>b) {
            System.out.println(" "+a+" > "+b+" ");
        } else {
            if (a==b) {
                System.out.println(" "+a+" = "+b+" ");
            } else {
                System.out.println(" "+a+" < "+b+" ");
            }
        }
    }
}
