package scannerCalculatorHW;

import java.util.Scanner;

public class LearnCalculatorHomework {


    public static void main(String[] args) {

        doAddition();
        LearnCalculatorHomework LS=new LearnCalculatorHomework();
        LearnCalculatorHomework doDivision= new LearnCalculatorHomework();
        LS.doSubstruction();
        doMultiplication();
        LS.doDivision();
    }

    public static void doAddition() {
        Scanner da = new Scanner(System.in);
        System.out.println("Please Enter first number :");
        int number1 = da.nextInt();
        System.out.println("Please enter the number to be added :");
        int number2 = da.nextInt();
        int add = number1 + number2;

        System.out.println("Total sum is ;"+" "+add);
    }
public void doSubstruction(){
    Scanner ds = new Scanner(System.in);
    System.out.println("Please Enter first number :");
    int number3 = ds.nextInt();
    System.out.println("Please enter number to be substructed :");
    int number4 = ds.nextInt();
    int sub= number3 - number4;

    System.out.println("Total sum is ;"+" "+sub);



}

public static void doMultiplication(){

        Scanner dm= new Scanner(System.in);
    System.out.println("Please enter First Number ");
    double num1=dm.nextDouble();
    System.out.println("Please enter the number to multiply by");
      double num2=dm.nextDouble();
     double multiply=num1*num2;
    System.out.println("Total Outcome is: "+ multiply);

}

public void doDivision(){

  Scanner dd= new Scanner(System.in);

  System.out.println("Please Enter Your first Number:");
    int num1= dd.nextInt();
    System.out.println("Please enter the number to divided by:");
    double num2=dd.nextDouble();
    double division =num1/num2;
    System.out.println("Total outcome is " + division);


}















}




