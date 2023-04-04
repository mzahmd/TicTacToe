import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

class Start {
  JFrame frame = new JFrame();
  JButton startButton = new JButton("start");
  JButton closeButton = new JButton("close");
  JLabel label = new JLabel();
  JPanel panel = new JPanel();

  Start() {
    label.setText("Want to play Tic Tac Toe ? " + '\n' + "Click Start");
    label.setFont(new Font("MV Boli", Font.BOLD, 17));
    label.setForeground(Color.WHITE);

    panel.add(startButton);
    panel.add(closeButton);
    panel.add(label);
    panel.setBackground(Color.BLACK);

    frame.add(panel);
    frame.setSize(400, 150);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

}
