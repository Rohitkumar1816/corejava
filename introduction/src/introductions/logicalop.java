package introductions;

public class logicalop {
    public static void main(String[] args) {
        boolean a= true;
        boolean b= false;
        System.out.println("a&&b "+ (a&&b));
        System.out.println("a||b "+ (a||b));
        System.out.println("a!b "+ (!b));

        // ternary opertor;

        int marks =35;
        String res =(marks>33) ? "pass" : "fail";
        System.out.println(res);

    }
}
