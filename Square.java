import javax.swing.*;
import java.awt.*;
import java.awt.Image;
import java.util.*;
import java.awt.event.*;

public class Square // Creates a class called square 
{   
    public ImageIcon Square_colour; 
    public JButton button;

    public Square(int i) // sets square to except inputs of type int  wuth name num
   { 
      
      if (i == 0) 
      {
         Square_colour = new ImageIcon(new ImageIcon("/home/lancs/smithb7/hdrive/scc110/java/drafts/pieces/empty.png").getImage().getScaledInstance(99,99, Image.SCALE_SMOOTH)) ;
      }

       else if (i == 1)
      {
         Square_colour = new ImageIcon(new ImageIcon("/home/lancs/smithb7/hdrive/scc110/java/drafts/pieces/empty2.png").getImage().getScaledInstance(99,99, Image.SCALE_SMOOTH));
      }

      button = new JButton(Square_colour);// puts a button inside of square

   }

 
      
   
  
}