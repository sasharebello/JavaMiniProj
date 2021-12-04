import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class rulespage{
    JTextArea area;
    JFrame frame;
    JLabel label;
    rulespage(){
		frame=new JFrame("Game Rules");
		frame.setSize(520,370);
        frame.getContentPane().setBackground(Color.pink);
        frame.setLayout(null);
        label = new JLabel("\n\nTO PLAY THE NUMBER PUZZLE GAME : ");
        label.setBounds(10, 40, 300, 10);
        frame.add(label);
        area=new JTextArea(
        "\n\n- Select a game level." +
        "\n- The higher the level the more blocks and the harder the puzzle is to arrange the numbers."+
        "\n- The blocks will initially show the order that you need to get them in to win the game. " +
        "\n- Click \"start game\" to begin the game."+
        "\n- Click on the box or number that you want to move to the blank spot."+ 
        "\n- This is how you move the numbers around to arrange them into order. "+
        "\n- Once you have all the numbers in order, you have solved the puzzle and won the game!"); 
        area.setBackground(Color.pink); 
        Font f = new Font("Roman", Font.ITALIC, 12);         
        area.setFont(f);
        area.setBounds(10,50,510,145);  
        frame.add(area);  
        area.setEditable(false);
        JButton play= new JButton("Play Game");
        play.setBounds(180, 270 ,120, 25);
        play.setBackground(Color.white);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().add(play);
		play.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				frame.dispose();
				new PuzzleGame();
			}
		});

        frame.add(play);
        frame.setVisible(true); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    } 	   
public static void main(String args[])  
{  
new rulespage();  
}
}
