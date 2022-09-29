package Buger;

import java.awt.BorderLayout;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.LayoutFocusTraversalPolicy;

public class MainTest {
	JFrame f;
	Buger buger;
	JTextArea ja;
	JButton bt;
	

	
	public MainTest() {
		f = new JFrame("MCDONALD");
		buger = new Buger(this);
		bt = new JButton("주문하기");
	}
	
	void addLayout() {
		
		ja = new JTextArea(10,30);
		
		f.setLayout(new BorderLayout());
		f.add(ja,BorderLayout.SOUTH);
		
		JTabbedPane jp = new JTabbedPane();
		jp.addTab("버거", buger);
		f.add(jp, BorderLayout.CENTER);
		
		JPanel j = new JPanel();
		j.add(bt);
		j.add(ja);
		f.add(j, BorderLayout.SOUTH);
		
		
		
		f.setBounds(100,100,600,800);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
	}
	

	public static void main(String[] args) {
		
		MainTest test = new MainTest();
		test.addLayout();
		
		
	}

}
