package zones.south_zone.tamil_nadu.madurai;
import zones.*;
import java.io.*;
public class madurai 
{
   public void cmpny()throws IOException
   {
       try{
       BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
       System.out.println("[1]--> AAVIN");
       try{Thread.sleep(200);}catch(Exception e){}
       System.out.println("[2]--> NANDANI");
       try{Thread.sleep(200);}catch(Exception e){}
       System.out.println("[3]--> MILMA");
       try{Thread.sleep(200);}catch(Exception e){}
       int a=Integer.parseInt(br.readLine());
       switch (a)
       {
           case 1:
           AAVIN ob=new AAVIN();
           ob.prdcts();
           break;
           case 2:
           NANDANI ob1=new NANDANI();
           ob1.prdcts();
           break;
           case 3:
           MILMA ob2=new MILMA();
           ob2.prdcts();
           break;
           default: System.out.println("\nWrong input");
           try{Thread.sleep(500);}catch (Exception e){}
           System.out.println("\f");
           madurai oi=new madurai();
           oi.cmpny();
        }
    }catch(Exception e1)
    {
        System.out.println("\nWrong input");
           try{Thread.sleep(500);}catch (Exception e){}
           System.out.println("\f");
           madurai oi=new madurai();
           oi.cmpny();
        }
    }
}