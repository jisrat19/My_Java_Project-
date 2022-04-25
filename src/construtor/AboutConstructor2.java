package construtor;

public class AboutConstructor2 {

    String name;
    int age;
    double salary;
    char size;

    public AboutConstructor2() { // default constructor
        name = "israt";


    }




    public AboutConstructor2(String name, int age) { //this is parameter
        this.name = name;
        this.age = age;
        System.out.println("My name is : " + this.name + " " + "and " + "My age is : " + this.age);
        //System.out.println("Student name is:" +this.name+" "+ "Age is "+this.age);


    }


    public AboutConstructor2(Double salary, int age, String name) {

        this.salary = salary;
        this.age = age;
        this.name = name;
        System.out.println(" what is your salary? My salary is " + this.salary + " and " + "what is your age? My age is: " + this.age + " and " + "what is your name? My name is: " + this.name);

    }


    public static void main(String[] args) {
        AboutConstructor2 monday = new AboutConstructor2();
        System.out.println(monday.name);


        AboutConstructor2 yy = new AboutConstructor2("Israt", 28);

        AboutConstructor2 jj = new AboutConstructor2(45.00, 26, "israt");

    }


}
