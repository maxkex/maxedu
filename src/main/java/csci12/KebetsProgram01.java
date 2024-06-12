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
      ct.text( "Roll !!!", 40, 10, 4, "red");
      GameObj ball = ct.circle( 10, 10, 20, "blue");
      ball.setYSpeed( .1);
      GameObj block = ct.rect(20, 20, 20, 10, "green");
      block.setText("Block");
      block.setXSpeed(.1);
      int xBoundary = 100;
      int yBoundary = 100;
   }
}   // End of class
