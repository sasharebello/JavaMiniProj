import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class PuzzleGame2 extends Frame implements ActionListener {
    private JFrame frame;
    private JPanel panel;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25;

    PuzzleGame2() {
        frame = new JFrame("Puzzle Game");
        frame.setSize(255, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new JPanel();
        panel.setBackground(Color.black);
        String[] buttons = { "1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","" };
        
        b1 = new Button(buttons[0]);
        b1.setBounds(50, 100, 40, 40);
        b2 = new Button(buttons[1]);
        b2.setBounds(100, 100, 40, 40);
        b3 = new Button(buttons[2]);
        b3.setBounds(150, 100, 40, 40);
        b4 = new Button(buttons[3]);
        b4.setBounds(50, 150, 40, 40);
        b5 = new Button(buttons[4]);
        b5.setBounds(100, 150, 40, 40);
        b6 = new Button(buttons[5]);
        b6.setBounds(150, 150, 40, 40);
        b7 = new Button(buttons[6]);
        b7.setBounds(50, 200, 40, 40);
        b8 = new Button(buttons[7]);
        b8.setBounds(100, 200, 40, 40);
        b9 = new Button(buttons[8]);
        b9.setBounds(150, 200, 40, 40);
        b10 = new Button(buttons[9]);
        b10.setBounds(50, 200, 40, 40);
        b11 = new Button(buttons[10]);
        b11.setBounds(100, 100, 40, 40);
        b12 = new Button(buttons[11]);
        b12.setBounds(150, 100, 40, 40);
        b13 = new Button(buttons[12]);
        b13.setBounds(150, 100, 40, 40);
        b14 = new Button(buttons[13]);
        b14.setBounds(50, 150, 40, 40);
        b15 = new Button(buttons[14]);
        b15.setBounds(100, 150, 40, 40);
        b16 = new Button(buttons[15]);
        b16.setBounds(150, 150, 40, 40);
        b17 = new Button(buttons[16]);
        b17.setBounds(50, 200, 40, 40);
        b18 = new Button(buttons[17]);
        b18.setBounds(100, 200, 40, 40);
        b19 = new Button(buttons[18]);
        b19.setBounds(150, 200, 40, 40);
        b20 = new Button(buttons[19]);
        b20.setBounds(50, 100, 40, 40);
        b21 = new Button(buttons[20]);
        b21.setBounds(150, 200, 40, 40);
        b22 = new Button(buttons[21]);
        b22.setBounds(100, 100, 40, 40);
        b23 = new Button(buttons[22]);
        b23.setBounds(150, 100, 40, 40);
        b24 = new Button(buttons[23]);
        b24.setBounds(50, 150, 40, 40);
        b25 = new Button(buttons[24]);
        b25.setBounds(50, 150, 40, 40);

        // bcheat=new Button("");
        // bcheat.setBounds(150,200,40,40);

        JButton bstr = new JButton("Start");
        bstr.setBounds(40, 280, 70, 25);
        bstr.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                shuffleArray(buttons);
                b1.setLabel(buttons[0]);
                b2.setLabel(buttons[1]);
                b3.setLabel(buttons[2]);
                b4.setLabel(buttons[3]);
                b5.setLabel(buttons[4]);
                b6.setLabel(buttons[5]);
                b7.setLabel(buttons[6]);
                b8.setLabel(buttons[7]);
                b9.setLabel(buttons[8]);
                b10.setLabel(buttons[9]);
                b11.setLabel(buttons[10]);
                b12.setLabel(buttons[11]);
                b13.setLabel(buttons[12]);
                b14.setLabel(buttons[13]);
                b15.setLabel(buttons[14]);
                b16.setLabel(buttons[15]);
                b17.setLabel(buttons[16]);
                b18.setLabel(buttons[17]);
                b19.setLabel(buttons[18]);
                b20.setLabel(buttons[19]);
                b21.setLabel(buttons[20]);
                b22.setLabel(buttons[21]);
                b23.setLabel(buttons[22]);
                b24.setLabel(buttons[23]);
                b25.setLabel(buttons[24]);

                //Collections.shuffle();
            }
        });

        JButton brul = new JButton("Rules");
        brul.setBounds(130, 280, 70, 25);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.getContentPane().add(brul);
        brul.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                frame.dispose();
                new rulespage();
            }
        });

        // bcheat2=new Button("");
        // bcheat2.setBounds(150,200,40,40);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);
        b19.addActionListener(this);
        b20.addActionListener(this);
        b21.addActionListener(this);
        b22.addActionListener(this);
        b23.addActionListener(this);
        b24.addActionListener(this);
        b25.addActionListener(this);





        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
        frame.add(b7);
        frame.add(b8);
        frame.add(b9);
        frame.add(b10);
        frame.add(b11);
        frame.add(b12);
        frame.add(b13);
        frame.add(b14);
        frame.add(b15);
        frame.add(b16);
        frame.add(b17);
        frame.add(b18);
        frame.add(b19);
        frame.add(b20);
        frame.add(b21);
        frame.add(b22);
        frame.add(b23);
        frame.add(b24);
        frame.add(b25);

        // frame.add(bcheat);
        frame.add(bstr);
        frame.add(brul);
        // frame.add(bcheat2);
        frame.getContentPane().add(BorderLayout.CENTER, panel);
        // bcheat.setVisible(false);
        // bcheat.setEnabled(false);
        // bcheat2.setVisible(false);
        // bcheat2.setEnabled(false);

        frame.setVisible(true);
    }

    static void shuffleArray(String[] ar) {
        // If running on Java 6 or older, use `new Random()` on RHS here
        Random rnd = ThreadLocalRandom.current();
        for (int i = ar.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            String a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b1) {
            String label = b1.getLabel();
            if (b2.getLabel().equals("")) {
                b2.setLabel(label);
                b1.setLabel("");
            }
            if (b4.getLabel().equals("")) {
                b4.setLabel(label);
                b1.setLabel("");
            }
        }
        if (e.getSource() == b2) {
            String label = b2.getLabel();
            if (b1.getLabel().equals("")) {
                b1.setLabel(label);
                b2.setLabel("");
            }
            if (b3.getLabel().equals("")) {
                b3.setLabel(label);
                b2.setLabel("");
            }
            if (b5.getLabel().equals("")) {
                b5.setLabel(label);
                b2.setLabel("");
            }
        }
        if (e.getSource() == b3) {
            String label = b3.getLabel();
            if (b2.getLabel().equals("")) {
                b2.setLabel(label);
                b3.setLabel("");
            }
            if (b6.getLabel().equals("")) {
                b6.setLabel(label);
                b3.setLabel("");
            }
        }
        if (e.getSource() == b4) {
            String label = b4.getLabel();
            if (b1.getLabel().equals("")) {
                b1.setLabel(label);
                b4.setLabel("");
            }
            if (b7.getLabel().equals("")) {
                b7.setLabel(label);
                b4.setLabel("");
            }
            if (b5.getLabel().equals("")) {
                b5.setLabel(label);
                b4.setLabel("");
            }
        }
        if (e.getSource() == b5) {
            String label = b5.getLabel();
            if (b2.getLabel().equals("")) {
                b2.setLabel(label);
                b5.setLabel("");
            }
            if (b6.getLabel().equals("")) {
                b6.setLabel(label);
                b5.setLabel("");
            }
            if (b4.getLabel().equals("")) {
                b4.setLabel(label);
                b5.setLabel("");
            }
            if (b8.getLabel().equals("")) {
                b8.setLabel(label);
                b5.setLabel("");
            }
        }
        if (e.getSource() == b6) {
            String label = b6.getLabel();
            if (b9.getLabel().equals("")) {
                b9.setLabel(label);
                b6.setLabel("");
            }
            if (b3.getLabel().equals("")) {
                b3.setLabel(label);
                b6.setLabel("");
            }
            if (b5.getLabel().equals("")) {
                b5.setLabel(label);
                b6.setLabel("");
            }
        }
        if (e.getSource() == b7) {
            String label = b7.getLabel();
            if (b4.getLabel().equals("")) {
                b4.setLabel(label);
                b7.setLabel("");
            }
            if (b8.getLabel().equals("")) {
                b8.setLabel(label);
                b7.setLabel("");
            }
        }
        if (e.getSource() == b8) {
            String label = b8.getLabel();
            if (b9.getLabel().equals("")) {
                b9.setLabel(label);
                b8.setLabel("");
            }
            if (b7.getLabel().equals("")) {
                b7.setLabel(label);
                b8.setLabel("");
            }
            if (b5.getLabel().equals("")) {
                b5.setLabel(label);
                b8.setLabel("");
            }
        }
        if (e.getSource() == b9) {
            String label = b9.getLabel();
            if (b6.getLabel().equals("")) {
                b6.setLabel(label);
                b9.setLabel("");
            }
            if (b8.getLabel().equals("")) {
                b8.setLabel(label);
                b9.setLabel("");
            }
        }


        // congrats code
        if (b1.getLabel().equals("1") && b2.getLabel().equals("2") && b3.getLabel().equals("3")
                && b4.getLabel().equals("4") && b5.getLabel().equals("5") && b6.getLabel().equals("6")
                && b7.getLabel().equals("7") && b8.getLabel().equals("8") && b9.getLabel().equals("9") 
                && b10.getLabel().equals("10") && b11.getLabel().equals("11") && b12.getLabel().equals("12")
                && b13.getLabel().equals("13") && b14.getLabel().equals("14") && b15.getLabel().equals("15")
                && b16.getLabel().equals("16") && b17.getLabel().equals("17") && b18.getLabel().equals("18") 
                && b19.getLabel().equals("19") && b20.getLabel().equals("20") && b21.getLabel().equals("21")
                && b22.getLabel().equals("22") && b23.getLabel().equals("23") && b24.getLabel().equals("24") && b25.getLabel().equals("")) {
            JOptionPane.showMessageDialog(this, "Congratulations! You won.");
        }
    }

    public static void main(String args[]) {
        new PuzzleGame2();
    }
}
