package zones.east_zone;
import zones.*;
import zones.east_zone.west_bengal.*;
import zones.east_zone.bihar.*;
import zones.east_zone.jharkhand.*;
import java.io.*;
public class east_zone
{
    public void zone() throws IOException
    {
        try{
        System.out.print("\f");
        System.out.println("\nSelect your state :");
        System.out.print("\n[1]-->JHARKHAND \n[2]-->WEST BENGAL \n[3]-->BIHAR\n");
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       String s=br.readLine();
       int states_no=Integer.parseInt(s);
       if(states_no==1)
       {
           call_jharkhand ob=new call_jharkhand();
           ob.state();
        }
        else if(states_no==2)
        {
            call_west_bengal ob=new call_west_bengal();
            ob.state();
        }
        else if(states_no==3)
        {
            call_bihar ob=new call_bihar();
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