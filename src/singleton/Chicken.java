package singleton;

public class Chicken {

    private Chicken(){
        System.out.println("Hungry");
    }

    private static Chicken chick=new Chicken();

    public static Chicken eatChicken(){
        System.out.println("not hungry");
        return chick;
    }
    String food;
    int price;
    public Chicken (String food, int price){
        this.food=food;
        this.price=price;
    }






}
