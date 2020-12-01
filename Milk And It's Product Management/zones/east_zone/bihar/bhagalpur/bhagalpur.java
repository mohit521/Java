package zones.east_zone.bihar.bhagalpur;
import zones.*;
import java.io.*;
public class bhagalpur 
{
   public void cmpny()throws IOException
   {
       try{
       BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
       System.out.println("[1]--> SAGAR");
       try{Thread.sleep(200);}catch(Exception e){}
       System.out.println("[2]--> SUDHA");
       try{Thread.sleep(200);}catch(Exception e){}
       System.out.println("[3]--> INDIAN DAIRY");
       try{Thread.sleep(200);}catch(Exception e){}
       int a=Integer.parseInt(br.readLine());
       switch (a)
       {
           case 1:
           SAGAR ob=new SAGAR();
           ob.prdcts();
           break;
           case 2:
           SUDHA ob1=new SUDHA();
           ob1.prdcts();
           break;
           case 3:
           INDIAN_DAIRY ob2=new INDIAN_DAIRY();
           ob2.prdcts();
           break;
           default: System.out.println("\nWrong input");
           try{Thread.sleep(500);}catch (Exception e){}
           System.out.println("\f");
           bhagalpur oi=new bhagalpur();
           oi.cmpny();
        }
    }catch(Exception e1)
    {
        System.out.println("\nWrong input");
           try{Thread.sleep(500);}catch (Exception e){}
           System.out.println("\f");
           bhagalpur oi=new bhagalpur();
           oi.cmpny();
        }
    }
}