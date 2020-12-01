import java.io.*;
import animation.*;
import FRANCHISE.*;
public class franchise
{
   public void open()throws IOException
   {
       call ld=new call();
       try{
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       System.out.print("\f");
       name ld1=new name();
       ld1.load(1);
       System.out.print("\nSelect your company\n");
       String company[]={"AMUL","SUDHA","RED COW","AAVIN","MOTHER DAIRY","INDIAN DAIRY","NANDANI"};
       for(int i=0;i<company.length;i++)
       {
           System.out.print("\n["+(i+1)+"]--> "+company[i]);
        }
        System.out.print("\n");
       int cmpny=Integer.parseInt(br.readLine());
       if(cmpny>0 && cmpny<8)
       {
          System.out.print("\f");
          ld.load_1();
          System.out.print("\nWelcome to "+company[cmpny-1]+"\n\n--> It provides a profit of "+profit.P[cmpny-1]+"%");
           System.out.println("\n\n--> It provides a land of "+area.A[cmpny-1]);
           System.out.println("\n--> Products supplied are :\n "+products.PR[cmpny-1]);
           System.out.println("\n--> The minimum investment should be Rs."+investment.I[cmpny-1]+"Lakh");
          System.out.println("\n\nPress 0 to proceed \n or\nPress * to go back\n");
          String enter=br.readLine();
          if (enter.equals("0"))
          {
              System.out.print("\f");
              System.out.print("\nEnter your name :");
              String name=br.readLine();
              System.out.println("\nEnter your father's name :");
              String name2=br.readLine();
              System.out.println("\nEnter your permanent address :");
              String add=br.readLine();
              System.out.println("\nEnter your phone no. :");
              int ph=Integer.parseInt(br.readLine());
              System.out.println("\nEnter your email address :");
              String email=br.readLine();
              System.out.println("\nYour current job :");
              String job=br.readLine();
              System.out.println("\nEnter the amount you would invest (in lakhs) :");
              double invst=Integer.parseInt(br.readLine());
              try{Thread.sleep(500);}catch (Exception e){}
              if(invst>=investment.I[cmpny-1])
              {
                  System.out.println("\f");
                  System.out.println("\nProcessing.............. . . .");
                  try{Thread.sleep(5000);}catch (Exception e){}
                  System.out.println("\f");
                  System.out.println("Request accepted. \nFurther information will be sent to you within 2 days.\nTHANK YOU.");
                  try{Thread.sleep(5000);}catch (Exception e){}
                }
                else
                {
                    System.out.println("Sorry your investment does not meet the minimum requirement.\nPlease increase your investment.\nTHANK YOU.");
                    try{Thread.sleep(300);}catch (Exception e){}
                    System.out.println("Press any key\n");
                    String key=br.readLine();
                    franchise ob=new franchise();
                    ob.open();
                }
            }
            else if(enter.equals("*"))
            {
                try{Thread.sleep(300);}catch (Exception e){}
                franchise ob=new franchise();
                ob.open();
            }
            else
            {
                System.out.println("Wrong input");
        try{Thread.sleep(500);}catch(Exception e1){}
        franchise ob=new franchise();
        ob.open();
    }
        }
        else
            {
                System.out.println("Wrong input");
        try{Thread.sleep(500);}catch(Exception e1){}
        franchise ob=new franchise();
        ob.open();
    }
    }

    catch(Exception e)
    {
        System.out.println("Wrong input");
        try{Thread.sleep(500);}catch(Exception e1){}
        franchise ob=new franchise();
        ob.open();
    }
}
}