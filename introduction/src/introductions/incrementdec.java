package introductions;

public class incrementdec {
    public static void main(String[] args) {
        int a =5;
        int res= a++ + ++a  + ++a + a++;
        System.out.println(a);
        System.out.println(res);
    }
}
