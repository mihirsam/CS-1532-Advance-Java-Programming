package Swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandling
{
    EventHandling()
    {
        JFrame frame = new JFrame("Event Handling");
        JTextField textField = new JTextField(20);
        textField.setBounds(100, 200, 50, 50);

        JButton button1 = new JButton("Click Me (^.^)");
        JButton button2 = new JButton("Click Me Please <3");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button1.setBounds(100, 250, 100, 30);
        button2.setBounds(300, 400, 150, 50);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                textField.setText("WELCOME");
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textField.setText("YAY!");
            }
        });

        frame.add(button1);
        frame.add(button2);
        frame.add(textField);
        frame.setVisible(true);
        frame.setSize(500, 500);
    }

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run()
            {
                new EventHandling();
            }
        });
    }
}
