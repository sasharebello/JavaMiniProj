import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules implements ActionListener{
    private JFrame frame;
    private JPanel panel;
    Menu m1,m2;
    Rules(){
        frame= new JFrame("Puzzle Game");
        frame.setSize(255,400);
        frame.setBackground(Color.WHITE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel=new JPanel();
        panel.setBackground(Color.WHITE);
        JMenuBar mb= new JMenuBar();
        JMenu m1= new JMenu("Home");
        m1.addActionListener(this);
        JMenu m2= new JMenu("Rules");
        mb.add(m1);
        mb.add(m2);
        frame.add(mb);
        frame.getContentPane().add(BorderLayout.NORTH,mb);
    }
    public void actionPerformed(ActionEvent e){  
        if(e.getSource()==m1){
            Home();
        }
    public static void main(String args[]){
        new Rules();
    }
}
