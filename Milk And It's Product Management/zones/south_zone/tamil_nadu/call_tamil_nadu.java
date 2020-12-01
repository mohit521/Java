package zones.south_zone.tamil_nadu;
import zones.south_zone.tamil_nadu.chennai.*;
import zones.south_zone.tamil_nadu.coimbatore.*;
import zones.south_zone.tamil_nadu.madurai.*;
import zones.south_zone.tamil_nadu.vellore.*;
import java.io.*;
public class call_tamil_nadu
{
    public void state()throws IOException
    {
        try{
        BufferedReader c_tn=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\nMake a choice of your city");
         try{Thread.sleep(300);}catch (Exception e){}
        System.out.print("\n[1]-->CHENNAI");
         try{Thread.sleep(300);}catch (Exception e){}
        System.out.print("\n[2]-->COIMBATORE");
         try{Thread.sleep(300);}catch (Exception e){}
        System.out.print("\n[3]-->MADURAI");
         try{Thread.sleep(300);}catch (Exception e){}
        System.out.print("\n[4]-->VELLORE");
         try{Thread.sleep(300);}catch (Exception e){}
        System.out.print("\n");
        System.out.print("\n*************************************************_________________________________________**************************************************");
        try{Thread.sleep(300);}catch (Exception e){}
        System.out.print("\n");
        String i_tn=c_tn.readLine();
        int I_tn=Integer.parseInt(i_tn);
        
        switch(I_tn)
        {
            case 1:
            chennai ob1=new chennai();
            ob1.cmpny();
            break;
            case 2:
            coimbatore ob2=new coimbatore();
            ob2.cmpny();
            break;
            case 3:
            madurai ob3=new madurai();
            ob3.cmpny();
            break;
            case 4:
            vellore ob4=new vellore();
            ob4.cmpny();
            break;
            default:System.out.println("Wrong input");
            try{Thread.sleep(1000);}catch(Exception e){};
            call_tamil_nadu oi=new call_tamil_nadu();
            oi.state();
        }
    }
    catch(Exception e) 
    {
    System.out.println("Wrong input");
            try{Thread.sleep(1000);}catch(Exception e1){};
            call_tamil_nadu oi=new call_tamil_nadu();
            oi.state();
        }
        }
    }
