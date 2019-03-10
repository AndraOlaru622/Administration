public class Credit extends Payment {
    private String card_number;

    public Credit(){};
    public Credit(String code, int p, Date d)
    {
        super(p,d);
        this.card_number=code;
    }
    public void show_Credit(){

        System.out.println("Type of payment: Card");
        System.out.println("Card number: "+card_number);




    }
}
