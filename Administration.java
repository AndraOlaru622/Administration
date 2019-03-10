public class Administration<T> {
    private int nr_receipts;
    private Payment []reciepts=new Payment[200];
    Administration(){nr_receipts=0;}
    public void show(){
        for(int i=0; i<nr_receipts ;i++)
        {
         if(reciepts[i].getClass()==Check.class)

                 ((Check)reciepts[i]).show_Check();

          else
              if(reciepts[i].getClass()==Credit.class)
                  ((Credit)reciepts[i]).show_Credit();
              else
                  ((Cash)reciepts[i]).show_Cash();

            reciepts[i].show_payment(); }
        }


    public  void add_payment(Payment x) {
        this.reciepts[nr_receipts]=x;
        this.nr_receipts+=1;
    }
}
