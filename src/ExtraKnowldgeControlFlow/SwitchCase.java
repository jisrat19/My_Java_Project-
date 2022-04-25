package ExtraKnowldgeControlFlow;

import com.sun.jdi.Value;

import java.util.Scanner;

public class SwitchCase {


    // switchcase is alternative option for ifElse

    public static void main(String[] args) {

        SwitchCase obj= new SwitchCase();
        obj.restaurant();
        Scanner input = new Scanner(System.in);
        int number=input.nextInt();

        int foodSerial = input.nextInt();
        

    }
public void restaurant()

    {

        int foodSerial = 0;
//        Scanner input = new Scanner(System.in);
//        //int number=input.nextInt();
//
     //  int foodSerial = input.nextInt();
        String foodName;
        switch (foodSerial) {

            case 1:
                foodName = "Pizza";
                break;
            case 2:
                foodName = "burger";
                break;
            case 3:
                foodName = "Chicken fry";
                break;

            case 4:
                foodName = "pasta";
                break;

            case 5:
                foodName = "cake";
                break;

            default:
                foodName = "invalid food menu";
                break;


        }
        System.out.println("selecterd food menu: " + foodName);


     double num=28.56;
        int a= (int)num;
        System.out.println(a);





    }





}
