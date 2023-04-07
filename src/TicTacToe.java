import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.BorderLayout;
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
  String winner;
  int counter = 0;
  boolean x_turn;

  TicTacToe() {

    for(int i=0; i<fields.length; i++) {
      fields[i] = new JButton();
      fields[i].setFocusable(false);
      fields[i].addActionListener(this);
      button_panel.add(fields[i]);
    }

    title_label.setText("Tic Tac Toe");
    title_label.setFont(new Font("Arial", Font.BOLD, 20));
    title_label.setVerticalTextPosition(JLabel.TOP);
    title_label.setHorizontalAlignment(JLabel.CENTER);

    title_panel.setBackground(Color.LIGHT_GRAY);
    title_panel.add(title_label);
    button_panel.setLayout(new GridLayout(3, 3, 0, 0));

    frame.add(title_panel, BorderLayout.NORTH);
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
          if (x_turn) {
            field.setText("X");
            field.setFont(new Font("MV Boli", Font.PLAIN, 40));
            field.setForeground(Color.RED);
          } else {
            field.setText("O");
            field.setFont(new Font("MV Boli", Font.PLAIN, 40));
            field.setForeground(Color.BLUE);
          }
          counter++;
          check();
          x_turn = !x_turn;
          break;
        }
      }
    }
  }

  void check() {
    winner = x_turn ? "X" : "O";

    if(winner.equals(fields[0].getText()) && winner.equals(fields[1].getText()) && winner.equals(fields[2].getText())) {
      endgame(0, 1, 2);
    }
    if(winner.equals(fields[3].getText()) && winner.equals(fields[4].getText()) && winner.equals(fields[5].getText())) {
      endgame(3, 4, 5);
    }
    if(winner.equals(fields[6].getText()) && winner.equals(fields[7].getText()) && winner.equals(fields[8].getText())) {
      endgame(6, 7, 8);
    }

    if(winner.equals(fields[0].getText()) && winner.equals(fields[3].getText()) && winner.equals(fields[6].getText())) {
      endgame(0, 3, 6);
    }
    if(winner.equals(fields[1].getText()) && winner.equals(fields[4].getText()) && winner.equals(fields[7].getText())) {
      endgame(1, 4, 7);
    }
    if(winner.equals(fields[2].getText()) && winner.equals(fields[5].getText()) && winner.equals(fields[8].getText())) {
      endgame(2, 5, 8);
    }

    if(winner.equals(fields[0].getText()) && winner.equals(fields[4].getText()) && winner.equals(fields[8].getText())) {
      endgame(0, 4, 8);
    }
    if(winner.equals(fields[2].getText()) && winner.equals(fields[4].getText()) && winner.equals(fields[6].getText())) {
      endgame(2, 4, 6);
    }
    if (counter == 9) {
      draw();
    }
  }

  void endgame(int x, int y, int z) {
    fields[x].setBackground(Color.GREEN);
    fields[y].setBackground(Color.GREEN);
    fields[z].setBackground(Color.GREEN);

    for (JButton field : fields) {
      field.setEnabled(false);
    }
    title_label.setText(winner + " winner");
  }

  void draw() {
    for (JButton field : fields) {
      field.setEnabled(false);
    }

    title_label.setText("draw");
  }

}
