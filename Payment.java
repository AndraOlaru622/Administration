public class Payment {
    private Date date;
    private double paid;

    public Payment(){};
    public Payment(int p, Date d){
        date=d;
        paid=p;
    }



    public void show_payment()
    {
        System.out.println("Time of payment");
        date.show_date();
        System.out.println("Value of payment= "+paid);

    }
}
