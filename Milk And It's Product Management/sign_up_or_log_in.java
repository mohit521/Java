import animation.*;
import java.io.*;
public class sign_up_or_log_in
{
    call ld=new call();
    public void sign_up() throws IOException
    {
        
        try{
        BufferedReader br =new BufferedReader (new InputStreamReader(System.in));
        System.out.print("\n_________________________________________________________________");
        System.out.print("\n                          SIGNUP  MENU                           ");
        System.out.print("\n_________________________________________________________________");
        for(int i=1;i>=1;i++)
        {System.out.print("\nEnter your name:");
        String nm=br.readLine();
        System.out.print("\nEnter your email:");
        String em=br.readLine();
        System.out.print("\nEnter your desired password[5 CHARACTERS]:");
        String pas=br.readLine();
        if(pas.length()==5)
        {
            System.out.println("Reenter your password :");
            String npas=br.readLine();
            if(npas.equals(pas))
            {
                String cp[]={"av62ka","own3ud","3b93gd","n1po3s","Wt4y0g","b40vbZ","t77zup","fgdb09","tr623m","po5t8y"};
                double d=Math.random();
                int pos=(int)(10*d);
                System.out.print("\n\n"+cp[pos]);
                System.out.println("\nEnter the captcha :");
                String cap=br.readLine();
                if(cap.equals(cp[pos]))
                {
                System.out.println("Enter your date of birth (DD) :");
                String a=br.readLine();
                int dd=Integer.parseInt(a);
                if(dd>0 && dd<32)
                {
                    System.out.println("Enter your birth month (MM) :");
                    String b=br.readLine();
                    int mm=Integer.parseInt(b);
                    if(mm>0 && mm<32)
                    {
                        System.out.println("Enter your birth year (YYYY) :");
                        String c=br.readLine();
                        int yy=Integer.parseInt(c);
                        if(yy>1900 && yy< 2016)
                        {
                            ld.load_1();
                            System.out.println("Sign up successful");
           System.out.println("__________________________________________________________________________________________________");
            System.out.print("\n\nACCOUNT CREATED");
            System.out.print("\n-->USERNAME: "+nm);
            System.out.print("\n-->EMAIL: "+em+"@gmail.com");
            System.out.print("\n-->PASSWORD: "+pas);
            System.out.print("\n-->DOB: " +dd+"/"+mm+"/"+yy);
            try{Thread.sleep(3000);}catch (Exception e){}
            System.out.println("\f");
             menu ao=new menu();
             ao.opsn();
             break;
        }
        else
        {
            ld.sign_up();
    }
}
 else
        {
            ld.sign_up();
    }
}
 else
        {
            ld.sign_up();
    }
}
 else
        {
            ld.sign_up();
    }
} else
        {
            ld.sign_up();
    }
}
else
        {
            ld.sign_up();
    }
}}catch(Exception e)
        {
          System.out.println("Wrong input");
             try{Thread.sleep(1000);}catch(Exception k){}
             System.out.println("\f");
             sign_up_or_log_in oi=new sign_up_or_log_in();
             oi.sign_up();
}
}

public void log_in()throws IOException
{
    int cnt=0;
    System.out.print("\n_________________________________________________________________");
    System.out.print("\n                          LOGIN  MENU                            ");
    System.out.print("\n_________________________________________________________________");
    BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        for(int i=1;i>=1;i++)
        {
        String email[]={"ankush@gmail.com","imtiaz@gmail.com"};
        String password[]={"12345","67890"};
        System.out.print("\nEnter your email address: ");
        String nam=ob.readLine();
        if(email[0].equals(nam) | email[1].equals(nam))
        {
            System.out.println("Enter password :");
            String pas=ob.readLine();
            if(password[0].equals(pas) | password[1].equals(pas))
            {
                 String cp[]={"bvj37A","3n4uU4","bZ93gd","ner8LT","md3JJ8","QWE928","rgbn9G","88GGjs","jQb6K1","Bf01yi"};
                double d=Math.random();
                int pos=(int)(10*d);
                System.out.print("\n\n"+cp[pos]);
                System.out.println("\nEnter the captcha :");
                String cap=ob.readLine();
                if(cap.equals(cp[pos]))
                {
               ld.load_1();
             menu ao=new menu();
             ao.opsn();
               break;
            }
           else{
            ld.sign_in();
            }}
            else{
                cnt=cnt+1;
                if(cnt==3)
                {
                    System.out.println("\f");
                    System.out.println("GENERATING OTP....");
                    try{Thread.sleep(1000);} catch(Exception e) {}
                    System.out.println("\f");
                    System.out.println("\nOTP has beed sent to your registered mobile number.");
                    double d1=Math.random();
                    int otp=(int)(1000000*d1);
                    try{Thread.sleep(500);} catch(Exception e) {}
                    System.out.println("Your OPT is "+otp+" for login to the requested application.\nThis OTP will expire after use or after 15 minutes");
                    try{Thread.sleep(400);} catch(Exception e) {}
                    System.out.println("Enter your OTP here :");
                    String otpas=ob.readLine();
                    int otp_no=Integer.parseInt(otpas);
                    if(otp_no==otp)
                    {
                        ld.sign_in();
             menu ao=new menu();
             ao.opsn();
            }
            else{
                        
            ld.sign_in();
    }}else{
                        
            ld.sign_in();
    }
}
}
       else{
           ld.sign_in();
            }}
}
}


