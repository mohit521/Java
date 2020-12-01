package zones.north_zone.delhi.ghaziabad;
import zones.*;
import java.io.*;
public class ghaziabad 
{
   public void cmpny()throws IOException
   {
       try{
       BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
       System.out.println("[1]--> RUPA DAIRY");
       try{Thread.sleep(200);}catch(Exception e){}
       System.out.println("[2]--> SHREEJI_MILK");
       try{Thread.sleep(200);}catch(Exception e){}
       System.out.println("[3]--> PARAS DAIRY");
       try{Thread.sleep(200);}catch(Exception e){}
       int a=Integer.parseInt(br.readLine());
       switch (a)
       {
           case 1:
           RUPA_DAIRY ob=new RUPA_DAIRY();
           ob.prdcts();
           break;
           case 2:
           SHREEJI_MILK ob1=new SHREEJI_MILK();
           ob1.prdcts();
           break;
           case 3:
           PARAS_DAIRY ob2=new PARAS_DAIRY();
           ob2.prdcts();
           break;
           default: System.out.println("\nWrong input");
           try{Thread.sleep(500);}catch (Exception e){}
           System.out.println("\f");
           ghaziabad oi=new ghaziabad();
           oi.cmpny();
        }
    }catch(Exception e1)
    {
        System.out.println("\nWrong input");
           try{Thread.sleep(500);}catch (Exception e){}
           System.out.println("\f");
           ghaziabad oi=new ghaziabad();
           oi.cmpny();
        }
    }
}