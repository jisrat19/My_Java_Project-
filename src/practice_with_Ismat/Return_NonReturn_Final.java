package practice_with_Ismat;

public class Return_NonReturn_Final {
    // create return without parameter
    // create non-return parameter
    //create return parameter
    //create non-return without parameter

    public static void main(String[] args) {
        Return_NonReturn_Final demo=new Return_NonReturn_Final();

        System.out.println("Total summation: "+ demo.doSummation());
        demo.doMulti(5,6,3);
        System.out.println(demo.sub(68,45,100));
        demo.division();

    }
    // create return without parameter
    public int doSummation(){

        int num1=67;
        int num2=45;
        int num3=78;
        int total = num1+num2+num3;
        return total;
    }
// create non-return parameter
    public void doMulti(int num1, int num2, int num3){

        int num4 =num1;
        int num5=num2;
        int num6= num3;
        double total=num1*num2*num3;
        System.out.println("total multi : "+total);

    }
//create return parameter

    public Double sub(double num1, double num2, double num3){

        double num4=num1;
        double num5= num2;
        double num6= num3;
        double total=(num1+num2)-num3;

        return total;
    }

//create non-return without parameter
    public void division(){

        int num1=7;
        int num2=6;
        int num3= 5;
        int total=(num1+num2)/num3;
        System.out.println("total division "+ total);
    }










































}
