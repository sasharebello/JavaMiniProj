import javax.swing.*;
import java.awt.*;

public class MyPanel{
    MyPanel(){
        JFrame f= new JFrame();    
        Choice c = new Choice();   
        c.setBounds(100, 100, 75, 75);    
        c.add("Tea");    
        c.add("Coffee");    
        c.add("Juice");    
        c.add("Cola");    
        c.add("Water");    
        f.add(c);    
        f.setSize(400, 400);    
        f.setLayout(null);    
        f.setVisible(true);
    }

public static void main(String args[]){
    new MyPanel();
}
}