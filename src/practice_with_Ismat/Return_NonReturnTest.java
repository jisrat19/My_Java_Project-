package practice_with_Ismat;

public class Return_NonReturnTest {

    public static void main(String[] args) {
        Return_NonReturnTest test=new Return_NonReturnTest();
        System.out.println("my result : " +test.returnParameter(45,55,66));
        test.nonReturnParameter(28,"israt",895566.90);

        test.nonReturnParameter1(34, 55, 66);
       test.returnWithoutParameter();

test.nonReturnWithoutParameter();
    }

   public double returnParameter( double num, double num1, double num3) {


        double math=num;
        double eng= num1;
        double history =num3;
        double avg =(num+num1+num3)/3;


        return avg;
   }

public void nonReturnParameter(int age, String name, double salary){

        int myAge=age;
        String myName= name;
        double mySalary= salary;


    System.out.println("my info"+age +name +salary);

}

    public void nonReturnParameter1(int age, int price, int salary){

        int age1= age;
        int price1=price;
        int salary1=salary;
        int total= age+price+salary;

        System.out.println(total);


    }

public String returnWithoutParameter(){

       String name ="israt";
       String address= "Bronx";
       String day="Sunday";
        String fullInfo=name+address+day;
    System.out.println(fullInfo);

       return fullInfo;
}

public void nonReturnWithoutParameter(){
        int age= 45;
        double salary= 67.90;
        double total= age*salary;
    System.out.println(total);


}
















}
