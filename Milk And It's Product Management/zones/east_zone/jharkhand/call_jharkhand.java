package zones.east_zone.jharkhand;
import zones.east_zone.jharkhand.call_ranchi.*;
import zones.east_zone.jharkhand.call_bokaro.*;
import zones.east_zone.jharkhand.call_jamshedpur.*;
import zones.east_zone.jharkhand.call_dhanbad.*;
import zones.east_zone.jharkhand.call_hazaribagh.*;
import java.io.*;

public class call_jharkhand
{
    public void state()throws IOException 
    {
        try{
        BufferedReader c_jharkhand=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\nMake a choice of your city");
         try{Thread.sleep(300);}catch (Exception e){}
        System.out.print("\n[1]-->BOKARO STEEL CITY");
         try{Thread.sleep(300);}catch (Exception e){}
        System.out.print("\n[2]-->DHANBAD");
         try{Thread.sleep(300);}catch (Exception e){}
        System.out.print("\n[3]-->JAMSHEDPUR");
         try{Thread.sleep(300);}catch (Exception e){}
        System.out.print("\n[4]-->RANCHI");
         try{Thread.sleep(300);}catch (Exception e){}
         System.out.print("\n[5]-->Hazaribagh");
         try{Thread.sleep(300);}catch (Exception e){}
        System.out.print("\n");
        System.out.print("\n*************************************************_________________________________________**************************************************");
        try{Thread.sleep(300);}catch (Exception e){}
        System.out.print("\n");
        String i_jharkhand=c_jharkhand.readLine();
        int I_jharkhand=Integer.parseInt(i_jharkhand);
        switch(I_jharkhand)
        {
            case 1:
            bokaro ob1=new bokaro();
            ob1.cmpny();
            break;
            case 2:
            dhanbad ob2=new dhanbad();
            ob2.cmpny();
            break;
            case 3:
            jamshedpur ob3=new jamshedpur();
            ob3.cmpny();
            break;
            case 4:
            ranchi ob4=new ranchi();
            ob4.cmpny();
            break;
            case 5:
            hazaribagh ob=new hazaribagh();
            ob.cmpny();
            break;
            default:System.out.println("Wrong input");
            try{Thread.sleep(1000);}catch(Exception e1){};
            call_jharkhand oi=new call_jharkhand();
            oi.state();
        }
    }
    catch(Exception e) 
    {
    System.out.println("Wrong input");
            try{Thread.sleep(1000);}catch(Exception e2){};
            call_jharkhand oi=new call_jharkhand();
            oi.state();
        }
        }
    }

  