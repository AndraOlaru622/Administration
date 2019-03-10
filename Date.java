import java.util.Scanner;

public class Date {
    private int day;
    private int month;
    private int year;

   private int hour;
   private int minute;
   private int second;

   public Date(){}

 public void read_date()
 {
     Scanner sc;
     sc= new Scanner(System.in);
     System.out.println("Insert payment date (DD-MM-YYYY)");
     System.out.print("Day:");
     this.day=sc.nextInt();
     while (this.day>31||this.day<1)
     {
         System.out.println("Insert a day between 1 and 31  Day:");
         this.day=sc.nextInt();
     }
         System.out.print("Month:");
     this.month=sc.nextInt();
     while (this.month>12||this.month<1)
     {
         System.out.println("Insert a month between 1 and 12  Month:");
         this.month=sc.nextInt();
     }
     System.out.print("Year:");
     this.year=sc.nextInt();
     System.out.print("Hour:");
     this.hour=sc.nextInt();
     while (this.hour>23||this.hour<0)
     {
         System.out.println("Insert a hour between 0 and 23  Hour:");
         this.hour=sc.nextInt();
     }
     System.out.print("Minute:");
     this.minute=sc.nextInt();
     while (this.minute>59||this.minute<0)
     {
         System.out.println("Insert a minute between 0 and 59  Day:");
         this.minute=sc.nextInt();
     }
     System.out.print("Second:");
     this.second=sc.nextInt();

     while (this.second>59||this.second<0)
     {
         System.out.println("Insert a second between 0 and 59  Day:");
         this.second=sc.nextInt();
     }


 }

 public void show_date(){
     System.out.println("Date: "+ day+"-"+month+"-"+year);
     System.out.println("Time: "+hour+":"+minute+":"+second);
 }

}

