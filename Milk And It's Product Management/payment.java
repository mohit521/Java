import java.io.*;
import java.util.Calendar;
public class payment
{
    static int dd,dd1,mm,mm1;
   public String name;
    public int pincode;
    public String address;
    public void del()throws IOException
    {
        try{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        for(int i=1;i>=1;i++)
        {
        System.out.print("\nFILL IN YOUR DETAILS");
        System.out.print("\nEnter your name:");
        name=br.readLine();
        System.out.print("\nEnter pincode(6 DIGITS):");
        String pncode=br.readLine();
        pincode=Integer.parseInt(pncode);
        if(pncode.length()==6)
        {
          System.out.print("\nEnter your address:");
          address=br.readLine();
          System.out.print("\nEnter phone no.(10 or 11 DIGITS)");
          String p_no=br.readLine();
        if(p_no.length()==10 | p_no.length()==11)
        {
            System.out.println("Enter your date of birth (DD) :");
                String a=br.readLine();
                dd=Integer.parseInt(a);
                if(dd>0 && dd<32)
                {
                    System.out.println("Enter your birth month (MM) :");
                    String b=br.readLine();
                    mm=Integer.parseInt(b);
                    if(mm>0 && mm<13)
                    {
                        System.out.println("Enter your birth year (YYYY) :");
                        String c=br.readLine();
                        int yy=Integer.parseInt(c);
                        if(yy>1900 && yy< 2016)
                        {
                            System.out.println("Enter delivery date (DD) :");
                String a1=br.readLine();
                 dd1=Integer.parseInt(a1);
                if(dd1>0 && dd1<32)
                {
                    System.out.println("Enter delivery month (MM) :");
                    String b1=br.readLine();
                     mm1=Integer.parseInt(b1);
                    if(mm1>0 && mm1<13)
                    {
                        System.out.println("Enter delivery year (YYYY) :");
                        String c1=br.readLine();
                        int yy1=Integer.parseInt(c1);
                        if(yy1>2015 && yy1< 2099)
                        {
                            System.out.println("\f");
                            System.out.println("Entries accepted.......");
                            try{Thread.sleep(200);}catch(Exception e) {}
                            System.out.println("\n\nYou accessed our site at :");
                            payment time=new payment();
                            time.load();
                            try{Thread.sleep(200);}catch(Exception e) {}
                            System.out.println("\nName : "+name);
                            try{Thread.sleep(200);}catch(Exception e) {}
                            System.out.println("Pincode :"+pncode);
                            try{Thread.sleep(200);}catch(Exception e) {}
                            System.out.println("Address :"+address);
                            try{Thread.sleep(200);}catch(Exception e) {}
                            System.out.println("Phone no. :"+p_no);
                            try{Thread.sleep(200);}catch(Exception e) {}
                            System.out.println("DOB :"+a+"/"+b+"/"+c);
                            try{Thread.sleep(800);}catch(Exception e) {}
                            System.out.println("Delivery date :"+a1+"/"+b1+"/"+c1);
                            try{Thread.sleep(2000);}catch(Exception e) {}
                            break;
                        }
                            else{
System.out.print("\nWRONG INPUT");
    try{Thread.sleep(500);}catch (Exception e){}
}}else{
System.out.print("\nWRONG INPUT");
    try{Thread.sleep(500);}catch (Exception e){}
}}else{
System.out.print("\nWRONG INPUT");
    try{Thread.sleep(500);}catch (Exception e){}
}}else{
System.out.print("\nWRONG INPUT");
    try{Thread.sleep(500);}catch (Exception e){}
}}else{
System.out.print("\nWRONG INPUT");
    try{Thread.sleep(500);}catch (Exception e){}
}}else{
System.out.print("\nWRONG INPUT");
    try{Thread.sleep(500);}catch (Exception e){}
}}else{
System.out.print("\nWRONG INPUT");
    try{Thread.sleep(500);}catch (Exception e){}
}}else{
System.out.print("\nWRONG INPUT");
    try{Thread.sleep(500);}catch (Exception e){}
}}
                            System.out.println("\f");
                            System.out.print("\nSelect your MODE of payment");
                            System.out.print("\n[1]--> CREDIT CARD"+"\n[2]--> DEBIT CARD"+"\n[3]--> NET BANKING"+"\n[4]--> CASH ON DELIVERY \n");
                            String mode_input=br.readLine();
                            int real_input=Integer.parseInt(mode_input);
                        switch(real_input)
                       {
                       case 1:
                       for(int aa=1;aa>=1;aa++)
                        {
                            System.out.print("\nYour Choice:Credit Card");
                     System.out.print("\nEnter card number:");
                     String no=br.readLine();
                     long real_no=Long.parseLong(no);
                     System.out.print("\nEnter month of expiry(MM):");
                     String month=br.readLine();
                     int real_month=Integer.parseInt(month);
 if(real_month>0 && real_month<13)
 {
     System.out.print("\nYear of expiry(YYYY):");
     String year=br.readLine();
     int real_year=Integer.parseInt(year);
     if(real_year<2099 && real_year>2015)
     {
   System.out.print("\nEner CVV(3 DIGITS):");
   String cvv=br.readLine();
   int real_cvv=Integer.parseInt(cvv);
   if(cvv.length()==3)
   {
 System.out.print("\nEntry Accepted");
 try{Thread.sleep(500);}catch (Exception e){}
 System.out.print("\f");
 System.out.print("\nYOUR TRANSACTION IS BEING PROCESSED.........");
 try{Thread.sleep(5000);}catch (Exception e){}
 System.out.print("\f\nREQUEST COMPLETED");
 System.out.print("\nTHANK YOU. PLEASE DO COME AGAIN");
 try{Thread.sleep(2000);}catch (Exception e){}
 delivery ob=new delivery();
 ob.dlvry();
 if(dd==dd1 &&mm==mm1)
 {
     delivery ob1=new delivery();
     ob.card();
     break;
    }
    else{
    break;
    }
 }
    else
    {
  System.out.print("\nWromg Pin"+"\nEnter Again");
   try{Thread.sleep(500);}catch (Exception e){}
 System.out.print("\f");
    }
}
     else
     {
   System.out.print("\nWrong input of year"+"\nEnter again");
    try{Thread.sleep(500);}catch (Exception e){}
 System.out.print("\f");
}
  }
  else
  {
System.out.print("\nWrong Input Of Month"+"\nEnter Again");
 try{Thread.sleep(500);}catch (Exception e){}
 System.out.print("\f");
  }
    }
    
    break;
  case 2:for(int j=1;j>=1;j++)
  {
System.out.print("\nYour Choice:Debit Card");
   System.out.print("\nEnter card number:");
   String no1=br.readLine();
   long real_no1=Long.parseLong(no1);
   System.out.print("\nEnter month of expiry(MM):");
   String month1=br.readLine();
   int real_month1=Integer.parseInt(month1);
   if(real_month1<13 && real_month1>0)
  {
System.out.print("\nYear of expiry(YYYY):");
String year=br.readLine();
int real_year=Integer.parseInt(year);
if(real_year<2099 && real_year>2015)
{
    System.out.print("\nEner CVV(3 DIGITS):");
    String cvv=br.readLine();
    int real_cvv=Integer.parseInt(cvv);
    if(cvv.length()==3)
    {
   System.out.print("\nEntry Accepted");
   try{Thread.sleep(500);}catch (Exception e){}
   System.out.print("\f");
   System.out.print("\nYOUR TRANSACTION IS BEING PROCESSED.........");
   try{Thread.sleep(5000);}catch (Exception e){}
   System.out.print("\f\nREQUEST COMPLETED");
   System.out.print("\nTHANK YOU. PLEASE DO COME AGAIN");
 try{Thread.sleep(2000);}catch (Exception e){}
 delivery ob=new delivery();
 ob.dlvry();
 if(dd==dd1 &&mm==mm1)
 {
     delivery ob1=new delivery();
     ob.card();
     break;
    }
    else{
        break;
    }
    }
else
  {
     System.out.print("\nWrong input"+"\nEnter again");
      try{Thread.sleep(500);}catch (Exception e){}
 System.out.print("\f");
  }
}
  else
  {
System.out.print("\nWrong Input Of year"+"\nEnter Again");
 try{Thread.sleep(500);}catch (Exception e){}
 System.out.print("\f");
  }
 }
 else
  {
System.out.print("\nWrong Input Of year"+"\nEnter Again");
 try{Thread.sleep(500);}catch (Exception e){}
 System.out.print("\f");
  }
}
  break;
  case 3:
  for(int k=1;k>=1;k++)
  {
  System.out.print("\nYour Choice:Net Banking");
   System.out.print("\nSelect Your Bank:");
   String bank[]={"Allahabad Bank","Axis Bank","Bank Of India","Bank Of Baroda","Bank Of Maharashtra","Canara Bank","Central Bank","Citi Bank","Federal Bank","HDFC Bank","ICICI Bank","IDBI Bank","Indian Bank","Karnataka Bank","Kotak Bank","Punjab National Bank","State Bank Of Maharashtra","State Bank Of India","Syndicate Bank","Union Bank Of India"};
   int bank_len=bank.length;
   System.out.println("\f");
   
   for(int bnk=0;bnk<bank_len;bnk++)
   {
 System.out.print("\n["+(bnk+1)+"]-->"+bank[bnk]);
  }
 System.out.print("\n"); 
  
  String nm_bank=br.readLine();
  int real_bank=Integer.parseInt(nm_bank);
  if(real_bank>0 && real_bank<21)
  {
  System.out.print("\nYour Choice:"+bank[real_bank-1]);
  System.out.print("\nPress any key to continue");
  String any_key=br.readLine();
  System.out.print("\nEnter Username:");
  String u_nm=br.readLine();
  System.out.print("\nEnter password:");
  String p_bank=br.readLine();
 System.out.print("\f");
 System.out.print("\nYOUR TRANSACTION IS BEING PROCESSED..........");
 try{Thread.sleep(5000);}catch (Exception e){}
 System.out.print("\f\nYOUR REQUEST IS COMPLETED");
 System.out.print("\nTHANK YOU. PLEASE DO COME AGAIN");
 try{Thread.sleep(2000);}catch (Exception e){}
 delivery ob=new delivery();
 ob.dlvry();
 if(dd==dd1 &&mm==mm1)
 {
     delivery ob1=new delivery();
     ob.card();
     break;
    }

else {
    break;
}
}
else
{
    System.out.print("\nWRONG INPUT");
    try{Thread.sleep(500);}catch (Exception e){}
}
}
break;
  case 4:
  for (int pp=1;pp>=1;pp++)
  {
      System.out.print("\nYour Choice:Cash On Delivery");
   System.out.print("\nEnter your pincode(6 DIGITS) :");
   String pcode=br.readLine();
   int pncod=Integer.parseInt(pcode);
   double pin[]={827001,827004,827005,827006,827007,827009};
   if(pcode.length()==6)
   {
        int sm=0;
        int l=pin.length-1;
        int m=0;
        while(sm<=l)
        {
            m=(sm+l)/2;
            if(pncod>pin[m])
            {
            sm=m+1;
        }
            else if(pncod<pin[m])
            {
                l=m-1;
            }
            else if(pncod==pin[m])
            {
 System.out.print("\f\nYOUR TRANSACTION IS BEING PROCESSED..........");
 try{Thread.sleep(5000);}catch (Exception e){}
 System.out.print("\f\nYOUR REQUEST IS COMPLETED");
 System.out.print("\nTHANK YOU. PLEASE DO COME AGAIN");
 try{Thread.sleep(2000);}catch (Exception e){}
 delivery ob=new delivery();
 ob.dlvry();
 if(dd==dd1 &&mm==mm1)
 {
     delivery ob1=new delivery();
     ob.card();
     break;
    }
    else{
 break;
}
}
else
{
    System.out.print("\nSorry this facility is not available in this particular town");
    try{Thread.sleep(500);}catch (Exception e){}
}
}}
else
{
    System.out.print("\nWRONG INPUT");
    try{Thread.sleep(500);}catch (Exception e){}
}
}
break;
}
}catch(Exception e1)
{System.out.print("\nWRONG INPUT");
    try{Thread.sleep(500);}catch (Exception e){}
    payment oe=new payment();
    oe.del();
}
    }



static int a,b,c;   
    public void load()throws IOException
    {
     String months[]={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};                            //SHOWING SYSTEM DATE
     Calendar calendar=Calendar.getInstance();
     System.out.println();
     System.out.println("");
     System.out.print("Date: ");
     System.out.print(months[calendar.get(Calendar.MONTH)]);
     System.out.print(" "+calendar.get(Calendar.DATE)+" ");
     System.out.println(calendar.get(Calendar.YEAR));
     System.out.print("Time: ");                                                                                           //SHOWING SYSTEM TIME  
     b=calendar.get(Calendar.HOUR);
     System.out.print(b+":");
     c=calendar.get(Calendar.MINUTE);
     if(c<10)
     {
     System.out.print("0"+c+":");
    }
    else
    {
        System.out.print(c+":");
    }
     a=calendar.get(Calendar.SECOND);
      if(a<10)
     {
     System.out.print("0"+a+"");
    }
    else
    {
        System.out.print(a+" ");
    }
    }
       }      