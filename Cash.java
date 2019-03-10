public class Cash extends Payment {


    public Cash(){};
    public Cash(int p, Date d)
    {
        super(p,d);

    }


    public void show_Cash(){

        System.out.println("Type of payment: Cash");



    }
}
