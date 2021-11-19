import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class shuffle {

    public static void main(String[] args) {
        new shuffle();
    }

    public shuffle() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                }

                final PuzzelPane puzzelPane = new PuzzelPane();
                JButton shuffle = new JButton("Shuffel");
                shuffle.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        puzzelPane.shuffle();
                    }
                });

                JFrame frame = new JFrame("Testing");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLayout(new BorderLayout());
                frame.add(puzzelPane);
                frame.add(shuffle, BorderLayout.SOUTH);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }

    public class PuzzelPane extends JPanel {

        private List<JLabel> labels;

        public PuzzelPane() {
            setLayout(new GridLayout(3, 3));
            labels = new ArrayList<>(9);
            for (int index = 1; index < 9; index++) {
                JLabel label = new JLabel(String.valueOf(index));
                label.setHorizontalAlignment(JLabel.CENTER);
                labels.add(label);
            }
            shuffle();
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(200, 200);
        }

        public void shuffle() {
            removeAll();
            Collections.shuffle(labels);
            for (JLabel label : labels) {
                add(label);
            }
            revalidate();
        }
    }

}
