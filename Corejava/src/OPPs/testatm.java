package OPPs;

public class testatm {
    public static void main(String[] args) {
        Atm atm= new Atm("rohit ", 2000);
//        atm.blance= 20;
//here balance value is change its not good  for protect this we use privet inside the class thats call abstraction
        atm.showbl();
    }
}
