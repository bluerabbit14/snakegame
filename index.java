

import javax.swing.*;            //java extend swing package
public class index extends JFrame   // JFrame is a class of java extend swing package
{
    index()         //constructor, we do frame coding in constructor so jdk calls main function,fuction call construction and our frame load first
    {
        super("Snake Game"); 
        add(new Board());
        pack();        //super function calls the constructor of parent class with a title of a frame
       
        setLocationRelativeTo(null);//to set location of a frame
        setResizable(false);
    }
    public static void main(String args[])
    {
      new index().setVisible(true);  //anonymous object
    }
}