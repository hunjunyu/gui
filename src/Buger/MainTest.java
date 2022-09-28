package Buger;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class MainTest {
	JFrame f;
	Buger buger;
	
	public MainTest() {
		f = new JFrame("MCDONALD");
		buger = new Buger(this);
		
		
	}
	
	void addLayout() {
		
		f.setLayout(new BorderLayout());
		
		JTabbedPane jp = new JTabbedPane();
		jp.addTab("버거", buger);
		f.add(jp, BorderLayout.CENTER);
		
		
		
		f.setBounds(100,100,600,800);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
	}

	public static void main(String[] args) {
		
		MainTest test = new MainTest();
		test.addLayout();
		
		
	}

}
