package construtor;

public class Parent {

    String name = "Israt";
    int age = 21;
    double salary = 2500.00;

    public static void main(String[] args) {
        Child cobj = new Child();

        System.out.println("My age1 is : " + cobj.age1);
        System.out.println("My name1 is: " + cobj.name1);


    }


    public static class Child {


        String name1 = "jahan";
        int age1 = 22;
        double salary1 = 3500.00;
        //Parent p = new Parent();
        Parent p= new Parent();

        public static void main(String[] args) {
            //System.out.println("My name is: " +p.name);
            //System.out.println("my age is: " + p.age);
            //System.out.println("My age is: " + p.age);

        }
    }


}
