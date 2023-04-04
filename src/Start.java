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
    label.setText("Want to play Tic Tac Toe ? Click start");
    label.setFont(new Font("MV Boli", Font.BOLD, 17));
    label.setForeground(Color.WHITE);
    label.setVerticalAlignment(JLabel.TOP);

    closeButton.setFocusable(false);
    startButton.setFocusable(false);
    closeButton.addActionListener(e -> frame.dispose());
    startButton.addActionListener(e -> {
      frame.dispose();
      new TicTacToe();
    });

    panel.add(label);
    panel.add(startButton);
    panel.add(closeButton);
    panel.setBackground(Color.BLACK);

    frame.add(panel);
    frame.setSize(400, 150);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

}
