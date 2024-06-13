package csci12;
import Code12.Code12;
import Code12.Code12Program;
import Code12.GameObj;
public class KebetsProgram01 extends Code12Program
{
   // The main entry point for code12 runner in Visual Studio Code
   public static void main(String[] args)
   {
      Code12.run(new KebetsProgram01()); 
   }
   // Start the program
   public void start()
   {
      Integer xMin = 2; // Left boundary of the screen
      Integer xMax = 300; // Right boundary of the screen
      Integer yMin = 2; // Top boundary of the screen
      Integer yMax = 300; // Bottom boundary of the screen
      // Set up the screen with text
      ct.text( "Bounce!", 20, yMin, 4, "red");
      ct.line(xMin, yMin+6, xMax, yMin+7,"orange");
      // Create a ball and a block shapes and set their speed
      Integer ballD = 20; // Height/Diameter of the ball
      GameObj ball = ct.circle( xMin+ballD, yMin+ballD, ballD, "blue");
      ball.setYSpeed( .1);
      Integer blockH = 10;
      Integer blockW = 20;
      GameObj block = ct.rect( xMin+blockW, yMin+blockH, blockW, blockH, "green");
      block.setText("Block");
      block.setXSpeed(.1);
   }
}   // End of class
