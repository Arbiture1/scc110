import javax.swing.*;
import java.awt.*;
/**  Creates a class called Board that represent the game board  */
public class Board 
{
  /** Method used to place components on the board */
  public Board()
  {
    /** Creates an instance of jpanel called panel inside of Board */ 
    JPanel panel = new JPanel(); 
     /**Creates an instance of JFrame called  window insode of board*/ 
    JFrame  window = new JFrame (); //Creates an instance of JFrame called  window insode of board
  }
  
  /**This method is exucuted first when Board is run and is used to control the behaviour of things in board */ 
  public static void main (String args[]) 
  { /** Creates an instance of jpanel called panel inside of Board */
    JPanel panel = new JPanel(); 
    /**Creates an instance of JFrame called  window insode of board*/
    JFrame  window = new JFrame (); 
    /**Creates an array of squares and calls it pattern  */
    Square [] Pattern = new Square[100]; 
    /**Sets the layout type to Grid type and calls it Grid  */
    GridLayout Grid= new GridLayout(8,8);
    
    /**initalises count to 0 */
    int count = 0;

    /**initalises and counts through a for loop for the 1D array  */
    for(int i=1; i<=64;i++) 
    {
      /** set condition for loop if  the integer is evenly divisable by 2 hence even and count is not divisible by 8 hence not end row */
      if ((count) % 2  == 0 && (count) % 8 != 0)   
      {
        /**if conditions met creates a new square with an value of 0 to be fed to the square constructor  */
        Pattern[i]= new Square(0);  
        
      }

      /** if integer not evenly divisible by 2 and hence not even */
      else if ((count) % 2 != 0 )
      {
        /**creates square with a value of 1 to feed to the constructor */
        Pattern[i]= new Square(1);  
        
      }

      /**when count is evenly divisible by 8  it is at the end of the 8x8 grid thus this is the last tile in a row  */
      else if ((count)%8 == 0) 
      {
       /**Creates an offset for the next row */
       count++;

      
       Pattern[i]= new Square(1); 
        
      }

      /**adds a button to the panel */
      panel.add(Pattern[i].button); 

      /**increments count */
      count++;  

      /**returns value for interger */
      System.out.println("i:" + i); 
      /**returns values for */
      System.out.println("count: " + count); 

    }
     /**initalises and counts through a for loop for the 1D array */
    for (int i=0; i<=63;i++) 
   
    {
      /**prints the array*/
      System.out.println(Pattern[i]);  
    }

    /**sets the pane to panel */
    window.setContentPane(panel);  
    /** makes window visible */
    window.setVisible(true);  
    /** set window size*/
    window.setSize(800,800);  
    /** exits program on close*/
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    /**makes panel visible */
    panel.setVisible(true);  
    /**sets layout to Grid type */
    panel.setLayout(Grid);  
  
  
  }



}