package practice_with_Ismat;

public class Practice_DoWhile_In_Method {


    public static void main(String[] args) {

        Practice_DoWhile_In_Method.doWhile();
        Practice_DoWhile_In_Method.doWhile2("jahan", 28);
        Practice_DoWhile_In_Method.doWhile3(24, 30, 35, 40);
        Practice_DoWhile_In_Method java = new Practice_DoWhile_In_Method();
        java.doWhile4();
        java.doWhile5(3, 3, 4);
        Practice_DoWhile_In_Method.forElse(2,5);
    }


    public static void doWhile() {
        boolean x = true;
        do {
            System.out.println("Yes i am coming tomorrow");
        } while (x == false);

    }

    public static void doWhile2(String name, int age) {

        String name1 = "yes";


        do {
            System.out.println("Yes my name is israt" + name);
            break;
        } while (name1 == "yes");


    }


    public static void doWhile3(int num1, int num2, int num3, int num4) {

        int price1 = num1;
        int price2 = num2;
        int price3 = num3;
        int price4 = num4;
        int total = num1 + num2 + num3;

        do {
            System.out.println("total summation :" + total);

            price2--;
        } while (price2 > 25);


    }

    public double doWhile4() {
        double a = 50.40;
        double b = 49.80;
        double c = 45.89;
        double total = (a + b + c) / 3;
        do {
            System.out.println("i have complete my summation :" + total);
            --a;
        } while (a > 45);
        return total;
    }

    public float doWhile5(float num, float price, float salary) {

        float num1 = num;
        float price1 = price;
        float salary1 = salary;
        float total = (num * price) / salary;
        float reminder=(num * price)%salary;
        do {
            System.out.println("Total division is: " + reminder);
            num1++;
        } while (num1 < 5);

return reminder;
    }

 public static void forElse(int num1, int num2){

        for (num1 =0; num1>5; num1++){

            System.out.println("i am here");

        }









 }











}
