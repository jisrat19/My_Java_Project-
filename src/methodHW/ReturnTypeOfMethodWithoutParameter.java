package methodHW;

public class ReturnTypeOfMethodWithoutParameter {


    public static void main(String[] args) {

        ReturnTypeOfMethodWithoutParameter test = new ReturnTypeOfMethodWithoutParameter();


        test.myInformation();
        test.myAddition();
        myAnswer();
        myDivision();
        test.getSize();
    }

//AccessModifier datatype/class/Object methodName ()  { return ; }

    public String myInformation(){

        String  firstName= "Israt" ;
        String lastName = "Hossain";
        String fullName =firstName+ " "+ lastName;
        System.out.println("My full name: "+fullName);
        return fullName;




    }

public int myAddition(){

        int num1 = 10;
        int num =5;
    System.out.println(num+num1);
        return num1+num;




}


static boolean myAnswer(){

        boolean pizzaAvailable=true;
        boolean largePizza=false;
        boolean smallPizza= true;

    System.out.println(pizzaAvailable);
    System.out.println(largePizza);
    System.out.println(smallPizza);
    boolean largePizza1 = pizzaAvailable;
    //boolean smallPizza1= smallPizza;

    return largePizza1 ;


}


static double myDivision(){
     double num1=6;
     double num2=2;
     double num3=4;
     double num4= num1+num2+num3;
     double total =num4/6;
    System.out.println(total);
     return total;


    }


    private char getSize(){

        char size1= 's';
        char size2= 'm';
        char size3='l';
        //char size4 =size1;
        System.out.println(size1);
        System.out.println(size2);
        System.out.println(size3);

return size1;

    }













}

