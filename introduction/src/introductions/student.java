package introductions;

public class student {
    String name= "rohit";
    int roll= 100;
      String course ="java";

    public static void main(String[] args) {
        student s= new student();
        System.out.println("name is :"+s.name);
        System.out.println("roll is :"+s.roll);
        System.out.println("course is :"+s.course);
         s.name ="sagar";
        s.course= "dsa";
        System.out.println("name :"+s.name);
        System.out.println("course :"+s.course);

        System.out.println("-------------------------------------------------");
        student s1= new student();
        System.out.println("name :"+s1.name);
        System.out.println("roll :"+s1.roll);
        System.out.println("course :"+s1.course);
        s1.name="anvi";
        s1.course="c++";
        System.out.println("name :"+s1.name);
        System.out.println("course :"+s1.course);
        s.show();

    }
    public void show(){

        String name ="GAUTAM";
        String course= "java";
        System.out.println("name "+name+  " course "+course);
    }}

