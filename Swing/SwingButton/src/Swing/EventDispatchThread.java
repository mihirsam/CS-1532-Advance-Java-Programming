package Swing;
import javax.swing.*;

public class EventDispatchThread
{
    EventDispatchThread()
    {
        JFrame frame = new JFrame("Event Dispatch Listener");
        JLabel label = new JLabel("Java Application");
        label.setBounds(100, 250, 100, 50);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(label);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run()
            {
                new EventDispatchThread();
            }
        });
    }
}
