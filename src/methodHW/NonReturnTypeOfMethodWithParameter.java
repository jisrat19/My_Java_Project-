package methodHW;

public class NonReturnTypeOfMethodWithParameter {


    public static void main(String[] args) {

        NonReturnTypeOfMethodWithParameter test=new NonReturnTypeOfMethodWithParameter();

   doSum(5,4,5);

   test.name("Israt"+ " ","Jahan"+" ","Hossain");

   test.substruction(7,6,7);
   test.division(5,7,8);
test.multi(6,5,7);


    }

    //Non-Return type of method with parameter: void type

    static void doSum(int num1, int num2, int num3) {

        int total = num1 + num2+ num3;
        System.out.println("total value: " + total);


    }

    public void name(String firstName, String middleName, String lastName){


        String fullName= firstName+middleName+lastName;
        System.out.println(fullName);


    }

public void substruction(double num1, double num2, double num3){

        double sub= num1-num2-num3;
    System.out.println("total substruction is : "+sub);




}

public void division (double num1, double num2, double num3){


        double divide= num1/num2/num3;
    System.out.println("Total value is: "+ divide);





}

public void multi (int num1, int num2, int num3){


        int multi= num1*num2*num3;
    System.out.println("Total multi value is : "+ multi);


}













    }
