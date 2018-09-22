import javax.swing.*;
class frame
{
    public static void main(String args[]){
    JFrame f = new JFrame("application");
    JButton b=new JButton("click");
    b.setBounds(100,200,50,40);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.add(b);
    f.setSize(500,500);
    f.setVisible(true);
  }
}
