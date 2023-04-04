import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;

class Start {
  JFrame frame = new JFrame();
  JButton startButton = new JButton("start");
  JButton closeButton = new JButton("close");
  JPanel panel = new JPanel();

  Start() {

    panel.add(startButton);

    frame.add(panel);
    frame.add(closeButton);
    frame.setSize(200, 200);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

}
