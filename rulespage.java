import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class rulespage{
    JTextArea area;
    JFrame frame;
    JPanel panel;
    rulespage(){
		frame=new JFrame("Game Rules");
		frame.setSize(510,400);
        //frame.setBackground(Color.LIGHT_GRAY);
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);
        panel = new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);
        frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        area=new JTextArea("\n\nTo play Number Puzzle : " +
        "\n\n- Select a game level." +
        "\n- The higher the level the more blocks and the harder the puzzle is to arrange the numbers."+
        "\n- The blocks will initially show the order that you need to get them in to win the game. " +
        "\n- Click \"start game\" to begin the game."+
        "\n- Click on the box or number that you want to move to the blank spot."+ 
        "\n- This is how you move the numbers around to arrange them into order. "+
        "\n- Once you have all the numbers in order, you have solved the puzzle and won You Win!!!"); 
        area.setBackground(Color.LIGHT_GRAY); 
        area.setBounds(10,30, 510,250);  
        frame.add(area);  
        panel.setVisible(true);
        area.setEditable(false);
        JButton play= new JButton("Play Game");
        play.setBounds(130, 290 ,120, 25);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().add(play);
		play.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				frame.dispose();
				new PuzzleGame();
			}
		});
        JButton bcheat=new JButton("");
        bcheat.setBounds(150,200,40,40);
        frame.add(play);
        frame.add(bcheat);
        bcheat.setVisible(false);
        bcheat.setEnabled(false);
        frame.setVisible(true); 

    } 	   
public static void main(String args[])  
{  
new rulespage();  
}
}
