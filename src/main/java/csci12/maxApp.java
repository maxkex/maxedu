package csci12;
import Code12.Code12;
import Code12.Code12Program;
public class maxApp extends Code12Program
{
   // The main entry point
   public static void main(String[] args)
   {
      Code12.run(new maxApp()); 
   }
   // Start the program
   @Override
   public void start()
   {
      ct.text( "Hello from Code12!", 50, 50, 15 );
   }
}   // End of class
