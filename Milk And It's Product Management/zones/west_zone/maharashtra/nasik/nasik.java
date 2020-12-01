package zones.west_zone.maharashtra.nasik;
import zones.*;
import java.io.*;
public class nasik 
{
   public void cmpny()throws IOException
   {
       try{
       BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
       System.out.println("[1]--> PRABHAT");
       try{Thread.sleep(200);}catch(Exception e){}
       System.out.println("[2]--> DYNAMIX");
       try{Thread.sleep(200);}catch(Exception e){}
       System.out.println("[3]--> SURUCHI DAIRY");
       try{Thread.sleep(200);}catch(Exception e){}
       int a=Integer.parseInt(br.readLine());
       switch (a)
       {
           case 1:
           PRABHAT ob=new PRABHAT();
           ob.prdcts();
           break;
           case 2:
           DYNAMIX ob1=new DYNAMIX();
           ob1.prdcts();
           break;
           case 3:
           SURUCHI_DAIRY ob2=new SURUCHI_DAIRY();
           ob2.prdcts();
           break;
           default: System.out.println("\nWrong input");
           try{Thread.sleep(500);}catch (Exception e){}
           System.out.println("\f");
           nasik oi=new nasik();
           oi.cmpny();
        }
    }catch(Exception e1)
    {
        System.out.println("\nWrong input");
           try{Thread.sleep(500);}catch (Exception e){}
           System.out.println("\f");
           nasik oi=new nasik();
           oi.cmpny();
        }
    }
}