package methodHW;

public class ReturnTypeOfMethodWithParameter {

    //AccessModifier datatype/class/Object methodName (  parameter )  { return ; }


    public static void main(String[] args) {
        ReturnTypeOfMethodWithParameter obj= new ReturnTypeOfMethodWithParameter();
obj.getInfo(" My fullname is " + "israt hossain");
obj.getInfo("my first name is :"+"israt");
obj.getInfo("my last name is :"+"hossain");
doDivision(4,2);



System.out.println("summation value ;"+obj.doSummation(5,5,5,5));// in this line we created c
        // concetation and also we sysout in the main method instead of the variable method

obj.doSummation( 5,7,8,9,9);

        System.out.println("Total age: "+obj.age(20,30,50));

        System.out.println("Total multiplication: "+obj.multi(4,5,4));


        System.out.println(obj.pizzaAvaliability('s',6,"pizza"));


    }


public String getInfo (String name){

    System.out.println("Student Name: " + name);

    return name;



}


public double doSummation(double num1, double num2, double num3, double num4){



        return num1+num2+num3+num4;



}

    public double doSummation(double num1, double num2, double num3, double num4,double num5){


        System.out.println("total sum = "+(num1+num2+num3+num4+num5));

return num1+num2+num3+num4+num5;

    }



static float doDivision(float num1, float num2){


    System.out.println("total division: "+ num1/num2);

       return num1+num2;
}


protected int age(int age1,int age2,int age3){

        int myAge=age1;
        int yourAge=age2;
        int herAge= age3;

        int totalAge= age1+age2+age3;
        return totalAge;


}



public int multi(int num1,int num2, int num3){

        int multi1= num1;
        int multi2=num2;
        int multi3=num3;

        int total=num1*num2*num3;
        return total;



}

public boolean pizzaAvaliability( char size, int price, String name) {


    char pizzaSize = size;
    int pizzaPrice = price;
String pizzaName= "pizza";
    if (pizzaSize == 's') {

        System.out.println(" Yes we have this size ");
    }

    else {

        System.out.println(size+ " No we don't have this size");}

    System.out.println("your pizza price is: "+pizzaPrice);
    System.out.println("your pizza name is: "+pizzaName);

    return pizzaSize=='s';


    }





}
