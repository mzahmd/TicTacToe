import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.GridLayout;

class TicTacToe {

  JFrame frame = new JFrame();
  JPanel panel = new JPanel();
  JLabel label = new JLabel();
  JButton[] fields = new JButton[9];

  TicTacToe() {

    for(int i=0; i<fields.length; i++) {
      fields[i] = new JButton();
      frame.add(fields[i]);
    }

    label.setText("Tic Tac Toe");
    label.setVerticalTextPosition(JLabel.TOP);
    panel.add(label);

    frame.add(panel);
    frame.setLayout(new GridLayout(3, 3, 0, 0));
    frame.setSize(600, 600);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);

  }

}
