package zones.east_zone.jharkhand.call_hazaribagh;
import java.io.*;
import zones.*;
public class hazaribagh
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
       System.out.println("[3]--> RED COW");
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
           case 4:
           RED_COW ob3=new RED_COW();
           ob3.prdcts();
           break;
           default: System.out.println("\nWrong input");
           try{Thread.sleep(500);}catch (Exception e){}
           System.out.println("\f");
           hazaribagh oi=new hazaribagh();
           oi.cmpny();
        }
    }catch(Exception e1)
    {
        System.out.println("\nWrong input");
           try{Thread.sleep(500);}catch (Exception e){}
           System.out.println("\f");
           hazaribagh oi=new hazaribagh();
           oi.cmpny();
        }
    }
}
