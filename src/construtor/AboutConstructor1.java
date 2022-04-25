package construtor;

public class AboutConstructor1 {


    public static void main(String[] args) {


      AboutConstructor2 AC2= new AboutConstructor2();
    System.out.println(AC2.name); //this will show me null value because this default constructor doesn't set any of its value on the object

        AboutConstructor2 gg= new AboutConstructor2("isrart",23);
        AboutConstructor2 nn= new AboutConstructor2(250.00,22,"israt");

        //System.out.println(gg.salary, "name");


    }

}
