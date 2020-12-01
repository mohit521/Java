package zones.east_zone.jharkhand.call_dhanbad;
import zones.*;
import java.io.*;
public class dhanbad 
{
   public void cmpny()throws IOException
   {
       try{
       BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
       System.out.println("[1]--> AMUL");
       try{Thread.sleep(200);}catch(Exception e){}
       System.out.println("[2]--> SUDHA");
       try{Thread.sleep(200);}catch(Exception e){}
       System.out.println("[3]--> MOTHER DAIRY");
       try{Thread.sleep(200);}catch(Exception e){}
       int a=Integer.parseInt(br.readLine());
       switch (a)
       {
           case 1:
           AMUL ob=new AMUL();
           ob.prdcts();
           break;
           case 2:
           SUDHA ob1=new SUDHA();
           ob1.prdcts();
           break;
           case 3:
           MOTHER_DAIRY ob2=new MOTHER_DAIRY();
           ob2.prdcts();
           break;
           default: System.out.println("\nWrong input");
           try{Thread.sleep(500);}catch (Exception e){}
           System.out.println("\f");
           dhanbad oi=new dhanbad();
           oi.cmpny();
        }
    }catch(Exception e1)
    {
        System.out.println("\nWrong input");
           try{Thread.sleep(500);}catch (Exception e){}
           System.out.println("\f");
           dhanbad oi=new dhanbad();
           oi.cmpny();
        }
    }
}