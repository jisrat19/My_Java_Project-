package practice_with_Ismat;

public class Return_NonReturn {


    public static void main(String[] args) {


        Return_NonReturn dd= new Return_NonReturn();

        dd.myInfo();

        Return_NonReturn.doSummation();

        dd.myPizza(2,20,2 );


        dd.myResult(49,45, 55);
        ///System.out.println(dd.myResult(49,45, 55));
}

public String myInfo(){ //return method without parameter


        String myName= "israt";
        String age= "28";
        String address= " Bronx Ny";
    String myinfo= myName + age + address;

        System.out.println(" my info " + myinfo);
        return myinfo;
    }

static void doSummation() {  // non-return method without parameter
    int num1 = 20;

    if (num1 >= 20) {

        System.out.println("My age is 20");

    } else {
        System.out.println("My age is not 20");
    }

    int num2 = 20;

    if (num2 < 10) {
        System.out.println(" Weather");
    } else {
        System.out.println("done");
    }


}
    public int myPizza(int num, int price, int numBox ){ // return methods with parameter
        int cal= num*price*numBox;
        System.out.println("my pizza info "+ cal);

        return cal;
    }



public void myResult(int math, int eng, int scince){


       int avg= ((math+eng+scince/3));

    System.out.println("total "+avg);


}










}


