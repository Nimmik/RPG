import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class awt implements ActionListener {
	Frame f = new Frame("RPG");
	TextField tf1 = new TextField("", 100);
	TextArea ta1 = new TextArea();
	JButton btn1 = new JButton("¥¯¿¸¿‘¿Â");
	Label lbl1 = new Label();
	Panel pnl1 = new Panel();
	Label lbl2 = new Label();
	Panel pnl2 = new Panel();
	Label lbl1_sub = new Label("HP");
	Label lbl2_sub = new Label("MP");

	awt() {
		f.setLayout(null);
		f.setSize(814, 614);
		f.setVisible(true);

		ta1.setBounds(7, 400, 800, 200);
		f.add(ta1);

		btn1.setBounds(7 + 200 * 0, 367, 200, 40);
		f.add(btn1);
		btn1.addActionListener(this);

		lbl1.setBounds(7 + 10, 7 + 70, 200, 20);
		lbl1.setBackground(Color.red);
		f.add(lbl1);

		pnl1.setBounds(7 + 10, 7 + 70, 200, 20);
		pnl1.setBackground(Color.yellow);
		f.add(pnl1);

		lbl2.setBounds(7 + 10, 7 + 140, 200, 20);
		lbl2.setBackground(Color.blue);
		f.add(lbl2);

		pnl2.setBounds(7 + 10, 7 + 140, 200, 20);
		pnl2.setBackground(new Color(100, 255, 0));
		f.add(pnl2);

		lbl1_sub.setBounds(7 + 10, 7 + 40, 40, 30);
		lbl1_sub.setFont(new Font("±º∏≤", Font.BOLD, 20));
		lbl1_sub.setForeground(Color.red);
		f.add(lbl1_sub);

		lbl2_sub.setBounds(7 + 10, 7 + 110, 40, 30);
		lbl2_sub.setFont(new Font("±º∏≤", Font.BOLD, 20));
		lbl2_sub.setForeground(Color.blue);
		f.add(lbl2_sub);
	}

	public void addText(String text) {
		tf1.setText(text);
		ta1.append(tf1.getText() + "\n");
	}

	public void setHealthBar(double maxHealth, double health) {
		lbl1.setSize((int) ((health / maxHealth) * 200), 20);
		lbl1.setText((int) health + " / " + (int) (maxHealth));
	}

	public void setManaBar(double maxMana, double mana) {
		lbl2.setSize((int) ((mana / maxMana) * 200), 20);
		lbl2.setText((int) (mana) + " / " + (int) (maxMana));
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn1) {
			tf1.setText("πˆ∆∞ ¥≠∑¡¡¸");
			ta1.append(tf1.getText() + "\n");
		}
	}

}
