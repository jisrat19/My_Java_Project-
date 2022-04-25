package practice_with_Ismat;

public class ConstructorPractice {
String name;
int age;
double salary;





private ConstructorPractice(){
//      int age =5;
//      int age2= 10;
//      int age3= 15;
//      double totalAge= age+age2+age3;
//
//    System.out.println("total age : "+ totalAge);

}

private static ConstructorPractice yes=new ConstructorPractice();

public static ConstructorPractice john(){
    //String name="joha";
    return yes;
}




    public ConstructorPractice(String name, int age, double salary ){

        this.name=name;
        this.age=age;
        this.salary=salary;
        System.out.println(name+age+salary);


    }











    public static void main(String[] args) {
        ConstructorPractice day= new ConstructorPractice();
        ConstructorPractice night=new ConstructorPractice("israt", 89, 780000.90);



    }


























}
