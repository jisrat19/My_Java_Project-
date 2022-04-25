package construtor;

public class PracticeConstructor {

    String name = "John";
    int age;
    String address;
    Double salary = 250000.00;

    public PracticeConstructor() {

        System.out.println("hello a");
        System.out.println("hello b");
        System.out.println("hello c");


    }


    public PracticeConstructor(String name) {

        this.name = name;
        System.out.println(name);

}

//public PracticeConstructor (String name,int age){


//}


        public static void main (String[]args){


            PracticeConstructor objOF = new PracticeConstructor();


            PracticeConstructor abc=new PracticeConstructor("day");



        }





}

