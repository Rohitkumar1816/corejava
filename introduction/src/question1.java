public class question1 {
    public static void main(String[] args) {

        question1  q =new question1();
//        System.out.println("Your oder ");
        int res= q.resturent("panner", "roti", "salad","dalmakhni", "water");
        System.out.println("MR Rohit sagar your bill is "+res +"\n Thanku");

    }
    public int resturent(String name , String name2, String name3, String name4 ,String name5 ){

//        System.out.println("Panner "+name + "Roti"+name2 +"dal makhni"+name3+ "salad"+name4+"water"+name5);
        int price = 130;
        int price2 = 20;
        int price3 = 10;
        int price4 = 150;
        int price5 = 20;

        System.out.println("your oder ");
        System.out.println(name+ "=> " +price);
        System.out.println(name2+ "=> " +price2);
        System.out.println(name3+ "=> " +price3);
        System.out.println(name4+ "=> " +price4);
        System.out.println(name5+ "=> " +price5);


        //total bill
        return price +price2+price3+price4+price5;

    }


}
