package zones.west_zone.rajasthan.jaipur;
import zones.*;
import java.io.*;
public class jaipur 
{
   public void cmpny()throws IOException
   {
       try{
       BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
       System.out.println("[1]--> PAYAS");
       try{Thread.sleep(200);}catch(Exception e){}
       System.out.println("[2]--> SARAS");
       try{Thread.sleep(200);}catch(Exception e){}
       System.out.println("[3]--> LOTUS DAIRY");
       try{Thread.sleep(200);}catch(Exception e){}
       int a=Integer.parseInt(br.readLine());
       switch (a)
       {
           case 1:
           PAYAS ob=new PAYAS();
           ob.prdcts();
           break;
           case 2:
           SARAS ob1=new SARAS();
           ob1.prdcts();
           break;
           case 3:
           LOTUS_DAIRY ob2=new LOTUS_DAIRY();
           ob2.prdcts();
           break;
           default: System.out.println("\nWrong input");
           try{Thread.sleep(500);}catch (Exception e){}
           System.out.println("\f");
           jaipur oi=new jaipur();
           oi.cmpny();
        }
    }catch(Exception e1)
    {
        System.out.println("\nWrong input");
           try{Thread.sleep(500);}catch (Exception e){}
           System.out.println("\f");
           jaipur oi=new jaipur();
           oi.cmpny();
        }
    }
}