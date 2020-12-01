package animation;
public abstract class loading_2
{
   public void load_1()
   {
       System.out.print("\f");
             try{Thread.sleep(200);}catch (Exception e){}
              for(int qwe=0;qwe<=100;qwe++)
      {System.out.println("LOADING  "+qwe+"%");
          for(int qwet=0;qwet<=qwe;qwet++)
          {System.out.print("_");}
          try{Thread.sleep(50);}catch (Exception e) {}System.out.println("\f");}
       System.out.println("LOADING  100%");
       System.out.println("____________________________________________________________________________________________________");
       System.out.println("\f");
           System.out.print("\nSuccesfully loaded");
            try{Thread.sleep(200);}catch (Exception e){}
            System.out.println("\f");
        }
        public void sign_up()
        {
            for(int qwe=0;qwe<=100;qwe++)
      {System.out.println("Signup failed\nRedirecting to the Signup Screen  "+qwe+"%");
          for(int qwet=0;qwet<=qwe;qwet++)
          {System.out.print("_");}
          try{Thread.sleep(50);}catch (Exception e) {}System.out.println("\f");}
       System.out.println("Redirecting  100%");
       System.out.println("____________________________________________________________________________________________________");
       System.out.println("\f");
      }
    public void sign_in()
    {
        for(int qwe=0;qwe<=100;qwe++)
      {System.out.println("Signin failed\nRedirecting to the Signin Screen  "+qwe+"%");
          for(int qwet=0;qwet<=qwe;qwet++)
          {System.out.print("_");}
          try{Thread.sleep(50);}catch (Exception e) {} System.out.println("\f");}
       System.out.println("Redirecting  100%");
       System.out.println("____________________________________________________________________________________________________");
        System.out.println("\f");
    }
}
