package introductions;

import java.util.Scanner;

public class swtichdemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a value ");
        int n= sc.nextInt();
        switch (n){
            case 1:
                System.out.println("sunday");
                break;
            case 2:
                System.out.println("monday");
                break;
            case 3:
                System.out.println("tuesday");
                break;
            case 4:
                System.out.println("wed day");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("sat day");
                break;
            default:{
                System.out.println("no avl");
            }


        }



    }
}

