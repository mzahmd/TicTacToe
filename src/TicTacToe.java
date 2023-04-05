import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class TicTacToe implements ActionListener {

  JFrame frame = new JFrame();
  JPanel button_panel = new JPanel();
  JPanel title_panel = new JPanel();
  JLabel title_label = new JLabel();
  JButton[] fields = new JButton[9];
  boolean turn;

  TicTacToe() {

    for(int i=0; i<fields.length; i++) {
      fields[i] = new JButton();
      fields[i].setFocusable(false);
      fields[i].addActionListener(this);
      button_panel.add(fields[i]);
    }

    title_label.setText("Tic Tac Toe");
    title_label.setVerticalTextPosition(JLabel.TOP);
    title_label.setHorizontalAlignment(JLabel.CENTER);

    title_panel.setBackground(Color.RED);
    title_panel.add(title_label);
    button_panel.setLayout(new GridLayout(3, 3, 0, 0));

    frame.add(title_panel);
    frame.add(button_panel);
    frame.setSize(600, 600);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);

  }

  @Override
  public void actionPerformed(ActionEvent e) {
    for (JButton field : fields) {
      if (e.getSource() == field) {
        if ("".equals(field.getText())) {
          if (turn) {
            field.setText("X");
            turn = !turn;
          } else {
            field.setText("O");
            turn = !turn;
          }
          break;
        }
      }
    }
  }
}
