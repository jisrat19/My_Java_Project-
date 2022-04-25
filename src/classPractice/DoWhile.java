package classPractice;

public class DoWhile {

// do while loop
    // do while execute at least one time first then it will check the condition
    // do {code and iterator} while();

    public static void main(String[] args) {
//        int age = 22;
//
//        do {
//            System.out.println("Today's weather is beautiful");
//
//            age--; // to control the flow
//        } while (age > 18);
//
//        int num = 24;
//        do {
//            System.out.println("summer is coming");
//        } while (num > 32); // this will execute one time, and it will stop because condition is wrong

        System.out.println("****************************************");

       // DoWhile.wishOnBirthday(28, "Israt" );
//        DoWhile.wishOnBirthday1(6, "Magrib");
        boolean cakeIsAvailable = true;   // different ways to calling the loop to execute
        do {
            DoWhile.wishOnBirthday(28, "Israt");
        } while (cakeIsAvailable = false);


    }


    public static void wishOnBirthday(int age, String name) {
        do {
            System.out.println("Happy birthday to " + name);
            age--;
        } while (age > 18);

    }

//    public static void wishOnBirthday1(int age, String name) {
//        do {
//            System.out.println("Happy birthday to " + name);
//            ++age;
//        } while (age < 18 && name.equalsIgnoreCase("Magrib"));

   // }


}
