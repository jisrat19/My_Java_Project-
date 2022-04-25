package method;

public class ReturnTypeMethodWithoutParameter {

    //Return Type of Method without parameter
    //AccessModifier datatype/class/Object methodName ()  { return ; }
    //Return Type: All type of Data, Void, Class type and object
    // method Name : Verb/Noun/Adjective
    //Method name should start with lower case


    void hello() {

        System.out.println("Hello Method");


    }

    public void getDisplay() { //this is non-return type of method. void is key word which indicate non-return type method of

        System.out.println("This is our display");

    }


    //AccessModifier datatype/class/Object methodName ()  { return ; }

    public int doSummation() {


        System.out.println("This is do summation");
        int num1 = 20;
        int num2 = 40;
        int total = num1 + num2;
        System.out.println("total Add value: " + (num1 + num2));
        return total;

    }

    public double doMultiplication() {


        System.out.println("This is do Multiplication");
        double num1 = 20;
        double num2 = 5;
        double totalMulti = num1 * num2;
        System.out.println("total Multi value: " + totalMulti);
        return totalMulti;

    }


    public String getStudentName(){

        String firstName = "John";
        String lastName = "Ali";
        String fullName = firstName+ " " + lastName;
        System.out.println("student full name is: "+ fullName);
        return fullName;


    }


public boolean isPizzaAvailable (){

        boolean pizza= true;

    System.out.println("pizza Avaliablity:"+pizza);
return pizza;
}




    public static void main(String[] args) {

//non-static method call by object name


        ReturnTypeMethodWithoutParameter obj1 = new ReturnTypeMethodWithoutParameter();
        obj1.getDisplay();

        obj1.doSummation();
        obj1.doMultiplication();
        obj1.getStudentName();
        obj1.isPizzaAvailable();
    }


}
