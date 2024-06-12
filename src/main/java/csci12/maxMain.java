package csci12;
import Code12.Code12;
import Code12.Code12Program;
import Code12.GameImage;
public class maxMain extends Code12Program
{
   // Declare fields here
   GameImage img;
   
   // The main entry point
   public static void main(String[] args)
   {
      Code12.run(new maxMain()); 
   }
   
   // Start the program
   public void start()
   {
      ct.text( "Hello from Code12!", 50, 50, 15 );
   }
   
   // Update the display
   public void update()
   {
      // Draw the image
      //img.draw();
   }
}   // End of class
