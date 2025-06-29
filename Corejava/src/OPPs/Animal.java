package OPPs;

class birds{
    void fly(){
        System.out.println("birds are fly.......");


    }
}


public class Animal extends birds {
    @Override
    void fly() {
        System.out.println("not supported");
    }

    void  eat(){

        System.out.println("animal is eating......");
        System.out.println(" making sound......");

    }
}
class  dog extends Animal {

dog(){
    
}

    @Override
    void eat() {
        System.out.println("dog making bhkk bhkkkk");
    }
}

