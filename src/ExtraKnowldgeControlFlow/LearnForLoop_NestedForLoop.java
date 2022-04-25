package ExtraKnowldgeControlFlow;

public class LearnForLoop_NestedForLoop {
    //loop is allowing us to execute a statement or group of statements multiple times.

    //For loop
    //While loop
    //Do.. While Loop
    //For Each loop
    public static void main(String[] args) {

        // For loop: For loop is used where we already know about the number of times loop needs to be executed.
        // Typically, for an index used in Iteration.
        // for (Declaration: Expression){//statements}
        //for (Initialization; condition;Iteration){   }
        //Initialization=  Start point; condition=endpoint;   Iteration=Looping/Assign aging
        // if your condition is false itv will not check the Iteration
        for (int i = 0; i < 5; ++i) {

            System.out.println("hello");
            int num1 = 20;
            int num2 = 30;
            int total = num1 + num2;
            System.out.println(total);
++i;// increment by 1+1
        }

        for (int i = 0; i < 3; i++) {

            System.out.println("We are learning for loop"+i);
//            int num1 = 20;
//            int num2 = 30;
//            int total = num1 + num2;
//            System.out.println(total);


        }

// nested (for loop)

for (int i=2; i<=4; i++){
    //Parent Loop
    System.out.println("We love to eat pizza "+ i);



    for (int j=4; j<=7; j++){
        //child loop
        System.out.println("We love to eat bugger "+ j);



    }




}






    }













}