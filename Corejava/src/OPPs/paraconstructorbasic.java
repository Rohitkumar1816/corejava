package OPPs;

public class paraconstructorbasic {
    String name ;
    int age ;
    paraconstructorbasic(String name, int age){
this.name=name;
this.age=age;
    }
    public static void main(String[] args) {
        // in paraconstructor we need to pass value is obj
        // In paraconstructor jvm not get default value;
        paraconstructorbasic pc =new paraconstructorbasic("Rohit",21);
        System.out.println("name "+pc.name);
        System.out.println("name "+pc.age);
    }

}
