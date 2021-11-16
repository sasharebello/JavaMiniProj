import javax.swing.*;
import java.awt.*;

public class rulespage{
    JTextArea area;
    JFrame frame;
    JPanel panel;
    rulespage(){
		frame=new JFrame("Game Rules");
		frame.setSize(510,400);
        panel = new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);
        frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextArea area=new JTextArea("\n\nTo play Number Puzzle : " +
        "\n\n- Select a game level." +
        "\n- The higher the level the more blocks and the harder the puzzle is to arrange the numbers."+
        "\n- The blocks will initially show the order that you need to get them in to win the game. " +
        "\n- Click \"start game\" to begin the game."+
        "\n- Click on the box or number that you want to move to the blank spot."+ 
        "\n- This is how you move the numbers around to arrange them into order. "+
        "\n- Once you have all the numbers in order, you have solved the puzzle and won You Win!!!"); 
        area.setBackground(Color.LIGHT_GRAY); 
        area.setBounds(10,30, 200,200);  
        panel.add(area);  
        panel.setVisible(true);
        frame.setVisible(true); 
        area.setEditable(false);
    } 	   
public static void main(String args[])  
{  
new rulespage();  
}
}
