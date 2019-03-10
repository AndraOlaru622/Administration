public class Check extends Payment {
    private String ch_code;

    public Check(){}
    public Check(String code, int p, Date d)
    {
        super(p,d);
        this.ch_code=code;
    }
    public void show_Check(){

    System.out.println("Type of payment: Check");
    System.out.println("Check code: "+ch_code);



    }
}
