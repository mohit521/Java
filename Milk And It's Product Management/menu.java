import zones.*;
import animation.*;
import java.io.*;
public class menu extends loading
{
    public void opsn()throws IOException
    {
        try{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\n_________________________________________________________________");
        System.out.print("\n                          MAIN  MENU                             ");
        System.out.print("\n_________________________________________________________________");
        System.out.println("\n\n[1]--> Franchise");
        System.out.println("\n[2]--> Shop");
        String s=br.readLine();
        int k=Integer.parseInt(s);
                switch(k)
        {
            case 1:
            franchise ob1=new franchise();
            ob1.open();
            break;
            case 2:
            shop ob2=new shop();
            ob2.states();
            try{Thread.sleep(1000);} catch (Exception e){}
            name ob4=new name();
            ob4.load(1);
            payment ob3=new payment();
            ob3.del();
            break;
            default:System.out.println("Wrong input");
            try{Thread.sleep(1000);}catch(Exception e){};
            menu oi=new menu();
            oi.opsn();
    }
}
catch(Exception e)
        {
          System.out.println("Wrong input");
             try{Thread.sleep(1000);}catch(Exception k){}
             menu oi=new menu();
             oi.opsn();
}
    }
}
