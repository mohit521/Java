package zones.north_zone.delhi;
import zones.north_zone.delhi.ghaziabad.*;
import zones.north_zone.delhi.gurgaon.*;
import zones.north_zone.delhi.new_delhi.*;
import zones.north_zone.delhi.noida.*;
import java.io.*;
public class call_delhi
{
    public void state()throws IOException
    { try{
        BufferedReader c_delhi=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\nMake a choice of your AREA");
         try{Thread.sleep(300);}catch (Exception e){}
        System.out.print("\n[1]-->GHAZIABAD");
         try{Thread.sleep(300);}catch (Exception e){}
        System.out.print("\n[2]-->GURGAON");
         try{Thread.sleep(300);}catch (Exception e){}
        System.out.print("\n[3]-->NEW DELHI");
         try{Thread.sleep(300);}catch (Exception e){}
        System.out.print("\n[4]-->NOIDA");
         try{Thread.sleep(300);}catch (Exception e){}
        System.out.print("\n");
        System.out.print("\n*************************************************_________________________________________**************************************************");
        try{Thread.sleep(300);}catch (Exception e){}
        System.out.print("\n");
        String i_delhi=c_delhi.readLine();
        int I_delhi=Integer.parseInt(i_delhi);
        
        switch(I_delhi)
        {
            case 1:
            ghaziabad ob=new ghaziabad();
            ob.cmpny();
            break;
            case 2:
            gurgaon ob1=new gurgaon();
            ob1.cmpny();
            break;
            case 3:
            new_delhi ob2=new new_delhi();
            ob2.cmpny();
            break;
            case 4:
            noida ob3=new noida();
            ob3.cmpny();
            break;
            default:System.out.println("Wrong input");
            try{Thread.sleep(1000);}catch(Exception e){};
            call_delhi oi=new call_delhi();
            oi.state();
        }
    }
    catch(Exception e) 
    {
    System.out.println("Wrong input");
            try{Thread.sleep(1000);}catch(Exception e1){};
            call_delhi oi=new call_delhi();
            oi.state();
        }
        }
    }    