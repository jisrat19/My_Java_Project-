package scannerCalculatorHW;

import java.util.Scanner;

public class LearnCalculatorSecondHomework {




    public static void main(String[] args) {

        fullname();
        addition();
        LearnCalculatorSecondHomework obj= new LearnCalculatorSecondHomework();
        obj.substruction();
        multiplication();

        Scanner Divide= new Scanner(System.in);
        System.out.println("Please enter the number to divide");
        double num1= Divide.nextDouble();
        System.out.println("Please enter the number to divided by ");
        double num2= Divide.nextDouble();
        System.out.println("Your total division outcome is :"+ (num1/num2));




    }


    public static void addition(){
        Scanner add= new Scanner(System.in);

        System.out.println("Wellcome to Israt's Calculator");
        System.out.println("*********************************");

        System.out.println("Please enter the number to add");
        double num1= add.nextDouble();
        System.out.println("Please enter the number to added by ");
        double num2= add.nextDouble();
        System.out.println("Your total addition outcome is " +(num1+num2));

    }
public void substruction(){


    //LearnCalculatorSecondHomework obj= new LearnCalculatorSecondHomework();
    Scanner sub= new Scanner(System.in);

    System.out.println("Please enter number to substruct");
    double num1=sub.nextDouble();
    System.out.println("Please enter number to substructed by ");
    double num2=sub.nextDouble();
    System.out.println("Your total substruction number is: "+ (num1-num2));




}

    public static void multiplication  () {
        Scanner multi = new Scanner(System.in);

        System.out.println("Please enter numbers to Multiply");
        double num1 = multi.nextDouble();
        System.out.println("Please enter numbers to multiplied by");
        double num2 = multi.nextDouble();
        System.out.println("Your total multiplication is: " + (num1 * num2));


    }
    //public static final Scanner scan = new Scanner(System.in);

    private static void fullname (){
        Scanner printname = new Scanner(System.in);
        System.out.println("Please enter your first name :" );
        String firstName = printname.next();
        System.out.println("plaese enter your lastname");
        String lastName = printname.next();
        System.out.println("Your full name is : " +(firstName+lastName));


    }



}
