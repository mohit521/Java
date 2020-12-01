package zones.west_zone;
import zones.*;
import zones.west_zone.maharashtra.*;
import zones.west_zone.rajasthan.*;
import java.io.*;
public class west_zone
{
    public void zone() throws IOException
    {
        try{
        System.out.print("\f");
        System.out.println("\nSelect your state :");
        System.out.print("\n[1]-->MAHARASHTRA \n[2]-->RAJASTHAN \n");
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       String s=br.readLine();
       int states_no=Integer.parseInt(s);
       if(states_no==1)
       {
           call_maharashtra ob=new call_maharashtra();
           ob.state();
        }
        else if(states_no==2)
        {
            call_rajasthan ob=new call_rajasthan();
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