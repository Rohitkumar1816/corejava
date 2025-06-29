package OPPs;

public class StudentQ {
    String name;
    int id;
    int roll;
    String course;
StudentQ(){
//  this();
}
    StudentQ(String name, int id, int roll, String course){
        this.name=name;
        this.id=id;
        this.roll=roll;
        this.course=course;
    }

    public static void main(String[] args) {
    StudentQ s3= new StudentQ();
        StudentQ s =new StudentQ("Rohit", 10084, 37,"java");
        StudentQ s1 =new StudentQ("Rahul ", 10083, 34, "dsa");

        System.out.println("name " +s.name);
        System.out.println("Id " +s.id);
        System.out.println("Roll " +s.roll);
        System.out.println("course " +s.course);
        System.out.println("--------------------------------------------------");
        s.dis(s1);
        System.out.println("------------------------------------------------------");

}

    void dis(StudentQ s1){
        System.out.println("name " +s1.name);
        System.out.println("Id " +s1.id);
        System.out.println("Roll " +s1.roll);
        System.out.println("course " +s1.course);
display(this);
    }
    void  display(StudentQ s3){
        System.out.println("hellow "+name);
    }

}




//   public void  skill (StudentQ s) {
//       System.out.println("we are learn " + s.name);
//
//   }}