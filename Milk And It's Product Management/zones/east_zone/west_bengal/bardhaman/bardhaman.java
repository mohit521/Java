package zones.east_zone.west_bengal.bardhaman;
import zones.*;
import java.io.*;
public class bardhaman 
{
   public void cmpny()throws IOException
   {
       try{
       BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
       System.out.println("[1]--> RED COW");
       try{Thread.sleep(200);}catch(Exception e){}
       System.out.println("[2]--> DELIGHT DAIRY");
       try{Thread.sleep(200);}catch(Exception e){}
       System.out.println("[3]--> SUDHA");
       try{Thread.sleep(200);}catch(Exception e){}
       int a=Integer.parseInt(br.readLine());
       switch (a)
       {
           case 1:
           RED_COW ob=new RED_COW();
           ob.prdcts();
           break;
           case 2:
           DELIGHT_DAIRY ob1=new DELIGHT_DAIRY();
           ob1.prdcts();
           break;
           case 3:
           SUDHA ob2=new SUDHA();
           ob2.prdcts();
           break;
           default: System.out.println("\nWrong input");
           try{Thread.sleep(500);}catch (Exception e){}
           System.out.println("\f");
           bardhaman oi=new bardhaman();
           oi.cmpny();
        }
    }catch(Exception e1)
    {
        System.out.println("\nWrong input");
           try{Thread.sleep(500);}catch (Exception e){}
           System.out.println("\f");
           bardhaman oi=new bardhaman();
           oi.cmpny();
        }
    }
}