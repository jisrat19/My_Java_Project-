package methodHW;

public class NonReturnTypeMethodWithoutParameter {
    //Non-return type of Method without Parameter:




    public static void main(String[] args) {

        NonReturnTypeMethodWithoutParameter obj= new NonReturnTypeMethodWithoutParameter();
        obj.countryName();

        addition();
        obj.size();
        obj.hello();
        obj.multi();
    }

    //***Non-return type of Method without Parameter:
    //AccessModifier returnType methodName() { }
    //Return type is void always
    public void countryName() {

        System.out.println("USA is a country name");


    }

static void addition(){
        int num1=4;
        int num2=5;
        int num3=6;
int total= num1+num2+num3;
    System.out.println("total value: "+total);

}


private void size(){

   char pizza ='s';
   char letter= 'm';

    System.out.println(pizza);
    System.out.println(letter);


}


public void hello (){

        boolean myNameIsIsrat= true;
        boolean myNamneIsJava=false;
    System.out.println(myNameIsIsrat);
    System.out.println(myNamneIsJava);


    }


protected void multi(){


    float num1=5;
    float num2=5;
    float total=num1*num2;

    System.out.println(total);


}









}

