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
   public void start()
   {
      ct.text( "Hello from Code12!", 40, 10, 4, "red");
      ct.circle( 10, 10, 20, "blue");
      ct.rect(20, 20, 20, 10, "green");
   }
}   // End of class
