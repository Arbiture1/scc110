import javax.swing.*;   // loads operations to give me a full range of tools 
import java.awt.*;   // loads operations to give me a full range of tools 
import java.awt.Image;   // loads operations to give me a full range of tools 
import java.util.*;  // loads operations to give me a full range of tools 
import java.awt.event.*;   // loads operations to give me a full range of tools 

public class Square  // Creates a class called square 
{   
    private ImageIcon Square_colour; // creates an identifier for Icon called Square_Colour 
    public JButton button;// Add a button to the panel 

    public Square(int i) // sets square to except inputs of type int  wuth name num
    { 
      
      if (i == 0) // initalises a loop that will execute continuously as long as condition == true 
      {
         Square_colour = new ImageIcon(new ImageIcon("/home/lancs/smithb7/hdrive/scc110/java/drafts/pieces/empty.png").getImage().getScaledInstance(99,99, Image.SCALE_SMOOTH)) ;
         //assigns icon as the fill for the square class and sets its size equal to the square 
      }

      else if (i == 1)
      {
         Square_colour = new ImageIcon(new ImageIcon("/home/lancs/smithb7/hdrive/scc110/java/drafts/pieces/empty2.png").getImage().getScaledInstance(99,99, Image.SCALE_SMOOTH));
         //assigns icon as the fill for the square class and sets its size equal to the square 
      }

      button = new JButton(Square_colour);// puts a button inside of square

    }

 
      
   
  
}