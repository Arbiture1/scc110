import javax.swing.*;
import java.awt.*;

public class Board // Creates a class called Board 
{
  public Board()
  {
    JPanel panel = new JPanel(); // Creates an instance of jpanel called panel inside of Board 
    JFrame  window = new JFrame (); //Creates an instance of JFrame called  window insode of board
  }
 public static void main (String args[]) // This method is exucutd first when Board is run 
  {
    JPanel panel = new JPanel(); // Creates an instance of jpanel called panel inside of Board 
    JFrame  window = new JFrame (); //Creates an instance of JFrame called  window insode of board
    Square [] Pattern = new Square[100]; 
    GridLayout Gridzy_Boi= new GridLayout(8,8);
    int count = 0;
    for(int i=1; i<=64;i++)// initalises and counts through a for loop for the 1D array 
    {
      
      if ((count) % 2  == 0 && (count) % 8 != 0) // set condition for loop if  the integer is evenly divisable by 2 hence even and count is not divisible by 8 hence not end row   
      {
        Pattern[i]= new Square(0);// if conditions met creates a new square with an value of 0 to be fed to the square constructor 
        
      }
      else if ((count) % 2 != 0 ) // if integer not evenly divisible by 2 and hence not even 
      {
        Pattern[i]= new Square(1);// creates square with a value of 1 to feed to th constructor 
        
      }
     else if ((count)%8 == 0)
     {
      count++;
       
       Pattern[i]= new Square(1);
       
     }
      panel.add(Pattern[i].button); 
      count++;
      System.out.println("i:" + i);     
      System.out.println("count: " + count);
    }

    for (int i=0; i<=63;i++)// initalises and counts through a for loop for the 1D array 
   
   {
      System.out.println(Pattern[i]);

    }
    window.setContentPane(panel);  
    window.setVisible(true);// makes window visible 
    window.setSize(800,800);// set window size 
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exits program on close 
    panel.setVisible(true);// makes panel visible 
    panel.setLayout(Gridzy_Boi);
  
  
  }



}