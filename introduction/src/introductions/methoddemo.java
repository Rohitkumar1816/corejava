package introductions;

public class methoddemo {
    public static void main(String[] args) {
        System.out.println("hellow");
        methoddemo m =new methoddemo();
        m.hellow();
        m.display("rohit");
       String res=m.otp();
//        System.out.println(res);  //rule 1
        System.out.println(m.otp());  //rule 2
       int reso= m.sum(4,6);
        System.out.println(reso); //=. rule 1
        System.out.println(m.sum(4,10)); // =>rule 2

    }
//       TYPE 1 (no parameter no return)
    public  void hellow(){
        System.out.println("good morning ");


    }

//    TYPE 2 (  Paremeter but no return)
    public  void  display(String name){
        System.out.println("name "+name);
    }

//    Type 3( NO peremeter but return )

    public  String  otp(){
        return "453256";
    }

//    TYPE 4 (PAREMTER AND RETURN;)
    public  int  sum(int a , int b){
        return a+b;
    }
}
