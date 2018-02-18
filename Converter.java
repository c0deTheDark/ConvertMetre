import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Converter implements ActionListener{
  private JFrame frame;
  private JTextField metre;
  private JButton btn;
  private JLabel cm;
  private Double centi;

  public Converter(){
    frame = new JFrame("Converter");
    frame.setLayout(new FlowLayout());

    metre = new JTextField(5);
    frame.add(metre);

    btn = new JButton("Convert");
    btn.addActionListener(this);
    frame.add(btn);

    cm = new JLabel("Centi metre");
    frame.add(cm);

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
  }
  public static void main(String[] args) {
    Converter metreCon = new Converter();
  }
  public void actionPerformed(ActionEvent evt){
    String metreString = metre.getText();
    Double metreDou = Double.parseDouble(metreString);
    centi = metreDou * 100;
    cm.setText(centi+" cm");
  }
}
