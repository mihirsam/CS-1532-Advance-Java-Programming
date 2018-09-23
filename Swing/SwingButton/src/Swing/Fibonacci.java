package Swing;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fibonacci
{
    Fibonacci()
    {
        JFrame frame = new JFrame("Fibonacci Series");
        JButton button = new JButton("Get Series");
        JLabel label = new JLabel("Display Series");
        JTextField textField = new JTextField(20);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textField.setBounds(100, 200, 100, 30);
        button.setBounds(300, 250, 100, 30);
        label.setBounds(500, 300, 200, 50);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                textField.setText("Enter Number Of Elements");

                int a = 0, b = 1, c;
                String s = " ";

                s = s + String.valueOf(a) + " " + String.valueOf(b);

                for(int i=0; i<5; i++)
                {
                    c = a + b;
                    s = s + " " + String.valueOf(c);
                    a = b;
                    b = c;
                }

                label.setText(s);
            }
        });

        frame.add(button);
        frame.add(label);
        frame.add(textField);
        frame.setVisible(true);
        frame.setSize(500, 500);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                new Fibonacci();
            }
        });
    }
}
