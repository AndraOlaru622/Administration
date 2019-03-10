import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.PriorityBlockingQueue;

public class Main {
    public static void main(String[] args) {
    Administration ad= new Administration();
    System.out.println("Menu");
    System.out.println("Press 1 for adding a new payment.");
    System.out.println("Press 2 for to see all the payments");
    System.out.println("Press 3 to finish session");
    int ok=0;
    Scanner sc=new Scanner(System.in);
    while (ok!=3){
        ok=sc.nextInt();
        if(ok==1)
        {
           System.out.println("Choose type of payment:");
           System.out.println("Press a for Cash");
           System.out.println("Press b for Check");
           System.out.println("Press c for Card");
           char command;
           command=sc.next().charAt(0);
            if(command=='a')
            { int pp;
              Date dd=new Date();
                System.out.print("Value of payment: ");
                pp=sc.nextInt();
                dd.read_date();
                Cash cash=new Cash(pp,dd);

                ad.add_payment(cash);
                System.out.println("Press 1 for adding a new payment.");
                System.out.println("Press 2 for to see all the payments");
                System.out.println("Press 3 to finish session");

            }
            else
                if(command=='b') {
                    int pp;
                    Date ddd=new Date();

                    System.out.print("Value of payment: ");
                    pp=sc.nextInt();
                    ddd.read_date();
                    System.out.print("Check code: ");
                    String code;
                    sc.nextLine();
                    code=sc.nextLine();
                    Check check=new Check(code,pp,ddd);
                    ad.add_payment(check);
                    System.out.println("Press 1 for adding a new payment.");
                    System.out.println("Press 2 for to see all the payments");
                    System.out.println("Press 3 to finish session");

                }
             else
                 if(command=='c'){

                     int pp;
                     Date dd=new Date();

                     System.out.print("Value of payment: ");
                     pp=sc.nextInt();
                     dd.read_date();
                     System.out.print("Card number: ");
                     String number;
                     sc.nextLine();
                     number=sc.nextLine();
                     Credit card=new Credit(number,pp,dd);
                     ad.add_payment(card);
                     System.out.println("Press 1 for adding a new payment.");
                     System.out.println("Press 2 for to see all the payments");
                     System.out.println("Press 3 to finish session");

                 }
                 else {
                     System.out.println("Please introduce a valid command");
                 }

        }
        else
            if(ok==2)
            {ad.show();
                System.out.println("Press 1 for adding a new payment.");
                System.out.println("Press 2 for to see all the payments");
                System.out.println("Press 3 to finish session");}
            else if(ok!=3)
            {System.out.println("Please insert a valid command");
                System.out.println("Press 1 for adding a new payment.");
                System.out.println("Press 2 for to see all the payments");
                System.out.println("Press 3 to finish session");}

    }



    }

}

