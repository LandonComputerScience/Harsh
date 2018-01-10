
 import java.awt.Color;
 import java.awt.Container;
 import java.awt.FlowLayout;
 import java.awt.event.ActionListener;
 import java.awt.event.ActionEvent;
 import javax.swing.JFrame;
 import javax.swing.JTextField;
 import javax.swing.JButton;
 
 

public class FortuneTeller extends JFrame implements ActionListener
 {
{

 // Fortune Teller



     private static final EasySound ding = new EasySound("ding.wav");

     // Declare an array of "fortunes" (strings):
     String[] fortuneArray = new String[3];
     fortuneArray[0]="You will go to college.";
     fortuneArray[1]="You will not go to college.";
     fortuneArray[2]="You will become a drunk.";
     fortuneArray[3]= "You will never drink alcohol.";

     private JTextField display;

     public FortuneTeller()
     {
         super("Fortune Teller");

         display = new JTextField("  Press \"Next\" to see your fortune...", 25);
         display.setBackground(Color.WHITE);
         display.setEditable(false);

         JButton go = new JButton("Next");
         go.addActionListener(this);

         Container c = getContentPane();
         c.setLayout(new FlowLayout());
         c.add(display);
         c.add(go);
     }

     public void actionPerformed(ActionEvent e)
     {
         // Pick and display a random fortune:
         x = math.random(e);
         display.setText("  " + x);
         ding.play();
     }

     public static void main(String[] args)
     {
         JFrame window = new FortuneTeller();
         window.setBounds(300, 300, 300, 100);
         window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         window.setResizable(false);
         window.setVisible(true);
     }
 }
}
