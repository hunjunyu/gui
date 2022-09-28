package e_tabbleplane.copy;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelA extends JPanel{
	
	JLabel aLa = new JLabel("판떼기 A");
	JButton aBtn = new JButton("A 버튼");

	public PanelA() {
		setBackground(new Color(255,0,0));  //RGB (Red, Green, Blue)
		addLayout();
		eventProc();
		
	}
	void addLayout() {
		add(aLa);
		add(aBtn);
		
	}
	void eventProc() {
		
	}
	
}
