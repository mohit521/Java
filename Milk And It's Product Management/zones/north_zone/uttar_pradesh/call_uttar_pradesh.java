package zones.north_zone.uttar_pradesh;
import java.io.*;
import zones.*;
import zones.north_zone.uttar_pradesh.agra.*;
import zones.north_zone.uttar_pradesh.kanpur.*;
import zones.north_zone.uttar_pradesh.varanasi.*;
import zones.north_zone.uttar_pradesh.lucknow.*;
public class call_uttar_pradesh
{
    public void state()throws IOException
    {
        try{
        BufferedReader c_up=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\nMake a choice of your city");
         try{Thread.sleep(300);}catch (Exception e){}
        System.out.print("\n[1]-->AGRA");
         try{Thread.sleep(300);}catch (Exception e){}
        System.out.print("\n[2]-->KANPUR");
         try{Thread.sleep(300);}catch (Exception e){}
        System.out.print("\n[3]-->LUCKNOW");
         try{Thread.sleep(300);}catch (Exception e){}
        System.out.print("\n[4]-->VARANASI");
         try{Thread.sleep(300);}catch (Exception e){}
        System.out.print("\n");
        System.out.print("\n*************************************************_________________________________________**************************************************");
        try{Thread.sleep(300);}catch (Exception e){}
        System.out.print("\n");
        String i_up=c_up.readLine();
        int I_up=Integer.parseInt(i_up);
        
        switch(I_up)
        {
            case 1:
            agra ob=new agra();
            ob.cmpny();
            break;
            case 2:
            kanpur ob1=new kanpur();
            ob1.cmpny();
            break;
            case 3:
            lucknow ob2=new lucknow();
            ob2.cmpny();
            break;
            case 4:
            varanasi ob3=new varanasi();
            ob3.cmpny();
            break;
            default:System.out.println("Wrong input");
            try{Thread.sleep(1000);}catch(Exception e){};
            call_uttar_pradesh oi=new call_uttar_pradesh();
            oi.state();
        }
    }
    catch(Exception e) 
    {
    System.out.println("Wrong input");
            try{Thread.sleep(1000);}catch(Exception e1){};
            call_uttar_pradesh oi=new call_uttar_pradesh();
            oi.state();
        }
        }
    }    