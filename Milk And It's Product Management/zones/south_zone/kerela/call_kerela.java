package zones.south_zone.kerela;
import zones.south_zone.kerela.thiru.*;
import zones.south_zone.kerela.kochi.*;
import zones.south_zone.kerela.kollam.*;
import zones.south_zone.kerela.thrissur.*;
import java.io.*;
public class call_kerela
{
    public void state()throws IOException 
    {
        try{
        BufferedReader c_kerela=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\nMake a choice of your city");
         try{Thread.sleep(300);}catch (Exception e){}
        System.out.print("\n[1]--> THIRUVANANTHPURAM");
         try{Thread.sleep(300);}catch (Exception e){}
        System.out.print("\n[2]--> KOCHI");
         try{Thread.sleep(300);}catch (Exception e){}
        System.out.print("\n[3]--> KOLLAM");
         try{Thread.sleep(300);}catch (Exception e){}
        System.out.print("\n[4]--> THRISSUR");
         try{Thread.sleep(300);}catch (Exception e){}
        System.out.print("\n");
        System.out.print("\n*************************************************_________________________________________**************************************************");
        try{Thread.sleep(300);}catch (Exception e){}
        System.out.print("\n");
        String i_kerela=c_kerela.readLine();
        int I_kerela=Integer.parseInt(i_kerela);
        switch(I_kerela)
        {
            case 1:
             thiru ob=new thiru();
            ob.cmpny();
            break;
            case 2:
            kochi ob1=new kochi();
            ob1.cmpny();
            break;
            case 3:
            kollam ob2=new kollam();
            ob2.cmpny();
            break;
            case 4:
            thrissur ob3=new thrissur();
            ob3.cmpny();
            break;
            default:System.out.println("Wrong input");
            try{Thread.sleep(1000);}catch(Exception e){};
            call_kerela oi=new call_kerela();
            oi.state();
        }
    }
    catch(Exception e) 
    {
    System.out.println("Wrong input");
            try{Thread.sleep(1000);}catch(Exception e1){};
            call_kerela oi=new call_kerela();
            oi.state();
        }
        }
    }
