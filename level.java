import javax.swing.*;
import java.awt.*;
//import java.awt.event.*;

public class level{
    private JFrame frame;
    private JPanel panel;
    //private JLabel label;
    //private JTextField textField;
    //private JTextArea ta;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;//bcheat,bcheat2;
    level(){
        frame= new JFrame("Puzzle Game");
        frame.setSize(255,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel=new JPanel();
        panel.setBackground(Color.black);
        Choice c = new Choice();   
        c.setBounds(80, 150, 75, 75);    
        c.add("Easy");    
        c.add("Intermediate");    
        c.add("Difficult");       
        frame.add(c);
        frame.getContentPane().add(BorderLayout.CENTER,panel);
        frame.setVisible(true);
    } 
    public static void main(String args[]){
        new level();
    }
}


