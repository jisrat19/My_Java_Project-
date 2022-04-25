package practice_with_Ismat;

public class Practice_Constructor {


    //constructor: help us to develop something new. it helps us to create object.

// some rule for creating constructor
    //  name should be as same as class name
    //constructor has no return type
    //constructor is used to initialize object
    //constructor need to be created in class level. it can not be created in method level.

    // how to create constructor?
    //  AccessModifier class name or constructor name () {  }

    int num;
    String eidShopping;
    Double price;

   char size;



    private Practice_Constructor(){


    }

    //Accessmodifier class name () {   }


   public Practice_Constructor(String eidShopping) {
        System.out.println("My dress wil be "+ eidShopping);



        this.eidShopping = eidShopping;
    }


    public Practice_Constructor(String eidShopping, int num, double price){


        this.eidShopping = eidShopping;
        this.num=num;
        this.price=price;

        System.out.println("My eid shopping will be "+ eidShopping+ " "+ "Number of dress that i will buy " + num + " " + " My dress price is " + price);
    }


public Practice_Constructor(String eidShopping, int num, double price, char size){


        this.eidShopping=eidShopping;
        this.num=num;
        this.price=price;
        this.size=size;
    System.out.println("For my eid shoppinh i will buy " + eidShopping + " " + " Number of dress that i will buy " + num + " " + "The price of my dress will be "+ price+ " "+ "My dress size is "+ size);
}





    public static void main(String[] args) {

        Practice_Constructor lal = new Practice_Constructor("Sharee");
        Practice_Constructor lal1 = new Practice_Constructor("Sharee",2, 400);
        Practice_Constructor lal2 = new Practice_Constructor("Sharee",2, 400, 's');



    }

private static Practice_Constructor yellow= new Practice_Constructor();

    public static  Practice_Constructor blue1(){



        return yellow;

    }

    String name;
    int age;






//    private static Practice_Constructor yellow1= new Practice_Constructor();
//
//    public static  Practice_Constructor blue(){
//
//
//
//        return yellow1;
//
//    }


    public Practice_Constructor(String name , int age ) {


        this.name = name;
        this.age = age;
        System.out.println(" My name is israt " + name + " " + " my age is " + age);


    }



}
