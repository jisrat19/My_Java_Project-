package practice_with_Ismat;

public class Practice_For_Loop_Method {

    public static void main(String[] args) {

        Practice_For_Loop_Method hh=new Practice_For_Loop_Method();

hh.display();



        Practice_For_Loop_Method.learnloop(10,30);

        Practice_For_Loop_Method.para(5, 6, 7);
    }



    public void display() {


        for (int i = 0; i < 5; ++i)
            System.out.println("Display this");


        int age=34;  /// while loop
        while ( age>24  ){
           System.out.println("print this");

            --age;
        }
    }

public static void learnloop(int num1,int num2){

        for( int i =7; i<10; i++  ){

            int numA= num1;
            int numB= num2;
            int total= num1+num2;
            System.out.println("Total summation: " +total);
        }
}

public static int para( int exp, int exp2, int exp3 ){

        for (int i=20; i<10; i++ ){

            int dress1=exp;
            int dress2=exp2;
            int dress3=exp3;
            int total= (exp+exp3)/exp2;
            int remainder =(exp+exp3)%exp2;

            System.out.println("I don't want to go " +remainder );

        }
        return exp;






}


























}
