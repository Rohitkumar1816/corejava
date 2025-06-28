package introduction;

public class impilicitcasting {
    public static void main(String[] args) {
        int  a =200;
        long b=a;  // int --> long no data loss

        short c=12;
        long d=c;  // short to > long  no data loss
        System.out.println(b);
        System.out.println(a);
        System.out.println(c);
        System.out.println(d);
    }
}
