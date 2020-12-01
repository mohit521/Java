package zones.east_zone.bihar;
import zones.east_zone.bihar.bhagalpur.*;
import zones.east_zone.bihar.gaya.*;
import zones.east_zone.bihar.muzzaffarpur.*;
import zones.east_zone.bihar.patna.*;
import java.io.*;
public class call_bihar
{   
    public void state()throws IOException 
    {
        try{
        BufferedReader c_bihar=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\nMake a choice of your city");
         try{Thread.sleep(300);}catch (Exception e){}
        System.out.print("\n[1]-->BHAGALPUR");
         try{Thread.sleep(300);}catch (Exception e){}
        System.out.print("\n[2]-->GAYA");
         try{Thread.sleep(300);}catch (Exception e){}
        System.out.print("\n[3]--MUZZAFFARPUR");
         try{Thread.sleep(300);}catch (Exception e){}
        System.out.print("\n[4]-->PATNA");
         try{Thread.sleep(300);}catch (Exception e){}
        System.out.print("\n");
        System.out.print("\n*************************************************_________________________________________**************************************************");
        try{Thread.sleep(300);}catch (Exception e){}
        System.out.print("\n");
        String i_bihar=c_bihar.readLine();
        int I_bihar=Integer.parseInt(i_bihar);
         switch(I_bihar)
        {
            case 1:
            bhagalpur ob=new bhagalpur();
            ob.cmpny();
            break;
            case 2:
            gaya ob1=new gaya();
            ob1.cmpny();
            break;
            case 3:
            muzzaffarpur ob2=new muzzaffarpur();
            ob2.cmpny();
            break;
            case 4:
            patna ob3=new patna();
            ob3.cmpny();
            break;
            default:System.out.println("Wrong input");
            try{Thread.sleep(1000);}catch(Exception e){};
            call_bihar oi=new call_bihar();
            oi.state();
        }
    }
    catch(Exception e) 
    {
    System.out.println("Wrong input");
            try{Thread.sleep(1000);}catch(Exception e1){};
            call_bihar oi=new call_bihar();
            oi.state();
        }
        }
    }    