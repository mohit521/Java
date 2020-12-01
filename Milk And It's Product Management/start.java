import animation.*;
import java.io.*;
public class start
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\nPRESS ANY KEY TO BEGIN");
        String word=br.readLine();
       name ob=new name();
       ob.title();
       ob.load(1);
       enter ab=new enter();
       ab.run();
       nameanim ob1=new nameanim();
       ob1.prjct();
    }
}
