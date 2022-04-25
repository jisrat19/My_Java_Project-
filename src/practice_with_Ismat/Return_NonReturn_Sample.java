package practice_with_Ismat;

public class Return_NonReturn_Sample {
    // make return parameter method
    //make non-return parameter method
    //make return method without parameter
    //make non-return method without parameter

    public static void main(String[] args) {

        Return_NonReturn_Sample learn= new Return_NonReturn_Sample();
        //learn.eidExpenses(2,2, 2, 2);
        System.out.println(learn.eidExpenses(2,2, 2, 2));
        learn.invitation("Hossain",4);
        learn.foodBuget();
        System.out.println(learn.foodBuget());
        learn.houseExpenses();


    }
    // make return parameter method

    public int eidExpenses( int item1,int item2, int item3, int item4 ){

        int dressIsrat= item1;
        int shirtMosharaf=item2;
        int dressDoaa=item3;
        int shirtMagrib=item4;
        int totalItemCount=item1+item2+item3+item4;
        return totalItemCount;

    }
    //make non-return parameter method
    public void invitation(String familyName, int people){

        String name= familyName;
        int totalFamily= people;

        System.out.println(totalFamily+name);


    }

    //make return method without parameter

    public int foodBuget(){

        int rice=60;
        int fish=30;
        int beef=50;
        int totalCost=(rice+fish+beef);
        //System.out.println(totalCost);

        return totalCost;
    }
//make non-return method without parameter
    public void houseExpenses(){

        double cleaningCost=30.90;
        double bedCoverCost=30.78;
        double makeUp=80.87;
        double totalCost=cleaningCost+bedCoverCost+makeUp;

        System.out.println(totalCost);
    }





































}
