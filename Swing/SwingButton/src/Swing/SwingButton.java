package Swing;
import javax.swing.*;

public class SwingButton
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("First Application");
        JButton button = new JButton("Click");

        button.setBounds(100, 120, 100, 30);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(button);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}
