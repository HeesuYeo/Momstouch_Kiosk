import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Test2 {

    public static void main(String[] args) {
        new Test2();
    }

    private JPanel panel;

    public Test2() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                }

                //Declaring the buttons, panels, etc...
                JButton button = new JButton("Click");

                panel = new JPanel();
                panel.add(button);

                final JFrame frame = new JFrame("Button Pressed");
                frame.setSize(400, 200);
                frame.setVisible(true);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.add(panel);

                
                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        panel.add(new JLabel("You clicked me"));
                        panel.revalidate();
                    }
                });
            }
        });
    }
}
   

