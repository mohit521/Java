package zones.south_zone;
import zones.*;
import zones.south_zone.karnataka.*;
import zones.south_zone.kerela.*;
import zones.south_zone.tamil_nadu.*;
import java.io.*;
public class south_zone
{
    public void zone() throws IOException
    {
        try{
        System.out.print("\f");
        System.out.println("\nSelect your state :");
        System.out.print("\n[1]--> TAMIL NADU \n[2]--> KARNATAKA \n[3]--> KERELA\n");
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       String s=br.readLine();
       int states_no=Integer.parseInt(s);
       if(states_no==1)
       {
           call_tamil_nadu ob=new call_tamil_nadu();
           ob.state();
        }
        else if(states_no==2)
        {
            call_karnataka ob=new call_karnataka();
            ob.state();
        }
        else if(states_no==3)
        {
            call_kerela ob=new call_kerela();
            ob.state();
        }
        else
        {
            System.out.println("\nwrong input");
            try{Thread.sleep(1000);}catch(Exception e){}
            System.out.println("\f");
            shop ob=new shop();
            ob.states();
        }
    }
    catch(Exception e1)
    {
         System.out.println("\nwrong input");
            try{Thread.sleep(1000);}catch(Exception e){}
            System.out.println("\f");
            shop ob=new shop();
            ob.states();
        }
    
}
}
