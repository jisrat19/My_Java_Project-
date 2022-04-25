package construtor;

public class LearConstructor {

//constructor: help us to develop something new. it help us to create object.

// some rule for creating constructor
    // constructor name should be as same as class name
    //constuctor has no return type
    //constructor is use to initialize object
    //constructor need to be created in class level. it can not be creaated in method level.

 // how to create constructor?
     //  AccessModifier class name or constructor name () {  }

    String name="Test";  //these are global instance variable because we did not said static
    int age ;// 30;
    String address;  //"Bronx ny";
    Double salary;

//
    public LearConstructor () {
       //this is called Default constructor: Default constructor is without any parameter

        System.out.println("hello");
        System.out.println("hello1");
        System.out.println("hello2");
    }


    //single parameterize constructor
    public LearConstructor(String name){



        this.name=  name ; // this is key word which calling global variable inside the constructor using "this"key word
                        //this.name is variable and name is a string variable
        System.out.println(this.name);

    }

//Multi parameterize constructor

public LearConstructor (String name, int age, String address) {

    this.name=  name ;
    this.age= age;
    this.address=address;
    System.out.println("Student name is:" +this.name+" "+ "Age is "+this.age+ " "+ "his address is " + this.address);
}
    public LearConstructor (String name, int age) {

        this.name=  name ;
        this.age= age;
        System.out.println("Student name is:" +this.name+" "+ "Age is "+this.age);
    }







    public static void main(String[] args) {

        //how to create object
        //classname objectName=new constructorOfClass();

        LearConstructor obj =new LearConstructor(); // LearConstructor(); this is another way of our default constructor.
       // Computer com=new Computer();

        //System.out.println(obj.name);


        System.out.println("*************************");

        LearConstructor dynamic= new LearConstructor("joly");//argument passing inside the constructor

        LearConstructor advanced = new LearConstructor("holy");


        LearConstructor sample = new LearConstructor("josh",23);
        LearConstructor source= new LearConstructor("james",35,"florida");



    }










}
