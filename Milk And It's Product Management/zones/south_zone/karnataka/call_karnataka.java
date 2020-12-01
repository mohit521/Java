package zones.south_zone.karnataka;
import zones.south_zone.karnataka.bengaluru.*;
import zones.south_zone.karnataka.bijapur.*;
import zones.south_zone.karnataka.mangalore.*;
import zones.south_zone.karnataka.mysore.*;
import java.io.*;
public class call_karnataka
{ 
    public void state()throws IOException 
    {
        try{
        BufferedReader c_karnataka=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\nMake a choice of your city");
         try{Thread.sleep(300);}catch (Exception e){}
        System.out.print("\n[1]-->BENGALURU");
         try{Thread.sleep(300);}catch (Exception e){}
        System.out.print("\n[2]-->BIJAPUR");
         try{Thread.sleep(300);}catch (Exception e){}
        System.out.print("\n[3]-->MANGALORE");
         try{Thread.sleep(300);}catch (Exception e){}
        System.out.print("\n[4]-->MYSORE");
         try{Thread.sleep(300);}catch (Exception e){}
        System.out.print("\n");
        System.out.print("\n*************************************************_________________________________________**************************************************");
        try{Thread.sleep(300);}catch (Exception e){}
        System.out.print("\n");
        String i_karnataka=c_karnataka.readLine();
        int I_karnataka=Integer.parseInt(i_karnataka);
        
        switch(I_karnataka)
        {
            case 1:
            bengaluru ob=new bengaluru();
            ob.cmpny();
            break;
            case 2:
            bijapur ob1=new bijapur();
            ob1.cmpny();
            break;
            case 3:
            mangalore ob2=new mangalore();
            ob2.cmpny();
            break;
            case 4:
            mysore ob3=new mysore();
            ob3.cmpny();
            break;
            default:System.out.println("Wrong input");
            try{Thread.sleep(1000);}catch(Exception e){};
            call_karnataka oi=new call_karnataka();
            oi.state();
        }
    }
    catch(Exception e) 
    {
    System.out.println("Wrong input");
            try{Thread.sleep(1000);}catch(Exception e1){};
            call_karnataka oi=new call_karnataka();
            oi.state();
        }
        }
    }    