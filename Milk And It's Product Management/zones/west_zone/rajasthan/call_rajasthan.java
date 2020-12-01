package zones.west_zone.rajasthan;
import zones.west_zone.rajasthan.jaipur.*;
import zones.west_zone.rajasthan.ajmer.*;
import zones.west_zone.rajasthan.jodhpur.*;
import zones.west_zone.rajasthan.udaipur.*;
import java.io.*;
public class call_rajasthan
{
    public void state()throws IOException 
    {
        try{
        BufferedReader c_rajasthan=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\nMake a choice of your city");
         try{Thread.sleep(300);}catch (Exception e){}
        System.out.print("\n[1]--> JAIPUR");
         try{Thread.sleep(300);}catch (Exception e){}
        System.out.print("\n[2]--> AJMER");
         try{Thread.sleep(300);}catch (Exception e){}
        System.out.print("\n[3]--> JODHPUR");
         try{Thread.sleep(300);}catch (Exception e){}
        System.out.print("\n[4]--> UDAIPUR");
         try{Thread.sleep(300);}catch (Exception e){}
        System.out.print("\n");
        System.out.print("\n*************************************************_________________________________________**************************************************");
        try{Thread.sleep(300);}catch (Exception e){}
        System.out.print("\n");
        String i_rajasthan=c_rajasthan.readLine();
        int I_rajasthan=Integer.parseInt(i_rajasthan);
        switch(I_rajasthan)
        {
            case 1:
             jaipur ob=new jaipur();
            ob.cmpny();
            break;
            case 2:
            ajmer ob1=new ajmer();
            ob1.cmpny();
            break;
            case 3:
            jodhpur ob2=new jodhpur();
            ob2.cmpny();
            break;
            case 4:
            udaipur ob3=new udaipur();
            ob3.cmpny();
            break;
            default:System.out.println("Wrong input");
            try{Thread.sleep(1000);}catch(Exception e){};
            call_rajasthan oi=new call_rajasthan();
            oi.state();
        }
    }
    catch(Exception e) 
    {
    System.out.println("Wrong input");
            try{Thread.sleep(1000);}catch(Exception e1){};
            call_rajasthan oi=new call_rajasthan();
            oi.state();
        }
        }
    }
