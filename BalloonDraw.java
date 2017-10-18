import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;
import javax.swing.JFrame;
public class BalloonDraw extends JPanel

{public void paintComponent(Graphics g)
{
    super.paintComponent(g);

g.setColor(Color.red);
g.setColor(Color.yellow);
g.fillOval(200,40,200,200);
g.setColor(Color.black);
g.setColor(Color.red);
g.drawRect(50, 50, 50, 50);
g.drawRect(50, 121, 70, 25);
g.drawRect(121, 78, 25, 70);
g.setColor(Color.blue);
g.fillOval(300, 260, 50, 100);


}
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        BalloonDraw tdPanel = new BalloonDraw();
        JFrame window = new JFrame("Third Graphics");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.add(tdPanel);
        window.setSize(450, 450);
        window.setVisible(true);
    }

}

