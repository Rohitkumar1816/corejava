package OPPs;

public class constructorbasic {
    String name="Rohit";
    int dursation =4;
    constructorbasic(){
        System.out.println("const call...............");



    }
    public static void main(String[] args) {
        // here no need to pass value in side the obj
        //2. jvm call default value //
        System.out.println("before call.....");
        constructorbasic c= new constructorbasic();
        System.out.println("after calll...........");
    }
}


