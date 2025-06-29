package OPPs;
// abstraction
public class Atm { private String accountholdername;
   private   double blance;
Atm(String name ,double blance){
    this.accountholdername=name;
    this.blance=blance;
}

    public static void main(String[] args) {
        Atm atm= new Atm("Rohit", 10000);
        atm.showbl();
    }
    void  showbl(){
        System.out.println("your blance is : "+blance);
    }

}
