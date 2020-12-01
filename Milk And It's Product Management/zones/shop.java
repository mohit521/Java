package zones;
import zones.east_zone.*;
import zones.west_zone.*;
import zones.north_zone.*;
import zones.south_zone.*;
import java.io.*;
public class shop
{
    public void states() throws IOException
    {
        try{
        System.out.print("\f");
        System.out.println("\nSelect your state :");
        System.out.print("\n[1]-->EAST ZONE \n[2]-->WEST ZONE \n[3]-->NORTH ZONE \n[4]-->SOUTH ZONE \n");
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       String s=br.readLine();
       int zone_no=Integer.parseInt(s);
       if(zone_no==1)
       {
           east_zone ob=new east_zone();
           ob.zone();
        }
        else if(zone_no==2)
        {
            west_zone ob=new west_zone();
            ob.zone();
        }
        else if(zone_no==3)
        {
            north_zone ob=new north_zone();
            ob.zone();
        }
        else if(zone_no==4)
        {
            south_zone ob=new south_zone();
            ob.zone();
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