import javax.swing.*;
import java.awt.*;

public class PuzzleGame{
    PuzzleGame(){
        JFrame f= new JFrame("Number Puzzle Game");
        f.setSize(400,400);
        f.setBackground(Color.WHITE);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JMenuBar mb= new JMenuBar();
        JMenu m1= new JMenu("Home");
        JMenu m2= new JMenu("Rules");
        mb.add(m1);
        mb.add(m2);
        f.add(mb);
        f.getContentPane().add(BorderLayout.NORTH,mb);
        Button b1,b2,b3,b4,b5,b6,b7,b8,b9,bcheat;
        b1=new Button("1");
        b1.setBounds(50,100,40,40);
        b2=new Button("2");
        b2.setBounds(100,100,40,40);
        b3=new Button("3");
        b3.setBounds(150,100,40,40);
        b4=new Button("4");
        b4.setBounds(50,150,40,40);
        b5=new Button("5");
        b5.setBounds(100,150,40,40);
        b6=new Button("6");
        b6.setBounds(150,150,40,40);
        b7=new Button("7");
        b7.setBounds(50,200,40,40);
        b8=new Button("8");
        b8.setBounds(100,200,40,40);
        b9=new Button("");
        b9.setBounds(150,200,40,40);
        bcheat=new Button("");
        bcheat.setBounds(150,200,40,40);

        JPanel p= new JPanel();
        JButton bstr= new JButton("Start");
        JButton bres= new JButton("Reset");

        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(bcheat);
        p.add(bstr);
        p.add(bres);
        f.getContentPane().add(BorderLayout.SOUTH,p);
        bcheat.setVisible(false);
        bcheat.setEnabled(false);
        f.setVisible(true);
    }
    
    public static void main(String args[]){
        new PuzzleGame();
    }
}


