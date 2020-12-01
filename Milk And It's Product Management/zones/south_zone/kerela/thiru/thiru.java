package zones.south_zone.kerela.thiru;
import zones.*;
import java.io.*;
public class thiru 
{
   public void cmpny()throws IOException
   {
       try{
       BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
       System.out.println("[1]--> AAVIN");
       try{Thread.sleep(200);}catch(Exception e){}
       System.out.println("[2]--> MILMA");
       try{Thread.sleep(200);}catch(Exception e){}
       System.out.println("[3]--> RED COW");
       try{Thread.sleep(200);}catch(Exception e){}
       int a=Integer.parseInt(br.readLine());
       switch (a)
       {
           case 1:
           AAVIN ob=new AAVIN();
           ob.prdcts();
           break;
           case 2:
           MILMA ob1=new MILMA();
           ob1.prdcts();
           break;
           case 3:
           RED_COW ob2=new RED_COW();
           ob2.prdcts();
           break;
           default: System.out.println("\nWrong input");
           try{Thread.sleep(500);}catch (Exception e){}
           System.out.println("\f");
           thiru oi=new thiru();
           oi.cmpny();
        }
    }catch(Exception e1)
    {
        System.out.println("\nWrong input");
           try{Thread.sleep(500);}catch (Exception e){}
           System.out.println("\f");
           thiru oi=new thiru();
           oi.cmpny();
        }
    }
}