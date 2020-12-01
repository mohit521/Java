package zones.west_zone.maharashtra;
import zones.west_zone.maharashtra.mumbai.*;
import zones.west_zone.maharashtra.nagpur.*;
import zones.west_zone.maharashtra.nasik.*;
import zones.west_zone.maharashtra.pune.*;
import java.io.*;
public class call_maharashtra
{
    public void state()throws IOException
    {
        try{
   BufferedReader c_maharashtra=new BufferedReader(new InputStreamReader(System.in));
   System.out.print("\nMake a choice of your city");
    try{Thread.sleep(300);}catch (Exception e){}
   System.out.print("\n[1]-->MUMBAI");
    try{Thread.sleep(300);}catch (Exception e){}
   System.out.print("\n[2]-->NAGPUR");
    try{Thread.sleep(300);}catch (Exception e){}
   System.out.print("\n[3]-->NASIK");
    try{Thread.sleep(300);}catch (Exception e){}
   System.out.print("\n[4]-->PUNE");
    try{Thread.sleep(300);}catch (Exception e){}
   System.out.print("\n");
   System.out.print("\n*************************************************_________________________________________**************************************************");
   try{Thread.sleep(300);}catch (Exception e){}
   System.out.print("\n");
   String i_maharashtra=c_maharashtra.readLine();
   int I_maharashtra=Integer.parseInt(i_maharashtra);
   
        switch(I_maharashtra)
         {
            case 1:
            mumbai ob=new mumbai();
            ob.cmpny();
            break;
            case 2:
            nagpur ob1=new nagpur();
            ob1.cmpny();
            break;
            case 3:
            nasik ob2=new nasik();
            ob2.cmpny();
            break;
            case 4:
            pune ob3=new pune();
            ob3.cmpny();
            break;
            default:System.out.println("Wrong input");
            try{Thread.sleep(1000);}catch(Exception e){};
            call_maharashtra oi=new call_maharashtra();
            oi.state();
        }
    }
    catch(Exception e) 
    {
    System.out.println("Wrong input");
            try{Thread.sleep(1000);}catch(Exception e1){};
            call_maharashtra oi=new call_maharashtra();
            oi.state();
        }
        }
    }    