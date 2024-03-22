
import javax.swing.*;            //java extend swing package
public class Snakegame extends JFrame   // JFrame is a class of java extend swing package
{
    Snakegame()         //constructor, we do frame coding in constructor so jdk calls main function,fuction call construction and our frame load first
    {
        super("Snake Game"); 
        add(new Board());
        pack();        //super function calls the constructor of parent class with a title of a frame
       
        setLocationRelativeTo(null);//to set location of a frame
        setResizable(false);
    }
    public static void main(String args[])
    {
      new Snakegame().setVisible(true);  //anonymous object
    }
}