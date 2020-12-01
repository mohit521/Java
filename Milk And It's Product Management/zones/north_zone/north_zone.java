package zones.north_zone;
import zones.*;
import zones.north_zone.delhi.*;
import zones.north_zone.uttar_pradesh.*;
import java.io.*;
public class north_zone
{
    public void zone() throws IOException
    {
        try{
        System.out.print("\f");
        System.out.println("\nSelect your state :");
        System.out.print("\n[1]--> DELHI \n[2]--> UTTAR PRADESH \n");
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       String s=br.readLine();
       int states_no=Integer.parseInt(s);
       if(states_no==1)
       {
           call_delhi ob=new call_delhi();
           ob.state();
        }
        else if(states_no==2)
        {
            call_uttar_pradesh ob=new call_uttar_pradesh();
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