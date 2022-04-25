package method;

public class ReturnTypeMethodWithParameter {


    //Return Type of Method with parameter
    //AccessModifier datatype/class/Object methodName (  parameter )  { return ; }
    //Return Type: All type of Data, Void, Class type and object
    // dynamic parameterized method

    public String getStudentinfo (String name) {


        System.out.println("Student Name: " + name);

        return name;
    }


   public double doSummation(double num1, double num2){

       System.out.println();

       return num1+num2;


   }







    public static void main(String[] args) {

        ReturnTypeMethodWithParameter obj=new ReturnTypeMethodWithParameter();

        obj.getStudentinfo("abc");
        obj.getStudentinfo("def");
        obj.getStudentinfo("ghi");
        obj.doSummation(2,5);
        System.out.println( obj.doSummation(2,5));

    }
}
