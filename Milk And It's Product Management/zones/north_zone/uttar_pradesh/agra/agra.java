package zones.north_zone.uttar_pradesh.agra;
import zones.*;
import java.io.*;
public class agra 
{
   public void cmpny()throws IOException
   {
       try{
       BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
       System.out.println("[1]--> PARAG DAIRY");
       try{Thread.sleep(200);}catch(Exception e){}
       System.out.println("[2]--> SUDHA");
       try{Thread.sleep(200);}catch(Exception e){}
       System.out.println("[3]--> UMANG");
       try{Thread.sleep(200);}catch(Exception e){}
       int a=Integer.parseInt(br.readLine());
       switch (a)
       {
           case 1:
           PARAG_DAIRY ob=new PARAG_DAIRY();
           ob.prdcts();
           break;
           case 2:
           SUDHA ob1=new SUDHA();
           ob1.prdcts();
           break;
           case 3:
           UMANG ob2=new UMANG();
           ob2.prdcts();
           break;
           default: System.out.println("\nWrong input");
           try{Thread.sleep(500);}catch (Exception e){}
           System.out.println("\f");
           agra oi=new agra();
           oi.cmpny();
        }
    }catch(Exception e1)
    {
        System.out.println("\nWrong input");
           try{Thread.sleep(500);}catch (Exception e){}
           System.out.println("\f");
           agra oi=new agra();
           oi.cmpny();
        }
    }
}