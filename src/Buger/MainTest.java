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
	sdddd sd;
	JTextArea ja;
	JButton bt;
	
	HashMap<String, Integer> menu;
	
	public MainTest() {
		f = new JFrame("MCDONALD");
		buger = new Buger(this);
		sd = new sdddd(this);	
		bt = new JButton("주문하기");
		menu = new HashMap<String, Integer>();
		setmenu();
	}
	
	void addLayout() {
		
		ja = new JTextArea(10,50);
		
		f.setLayout(new BorderLayout());
		f.add(ja,BorderLayout.SOUTH);
		
		JTabbedPane jp = new JTabbedPane();
		jp.addTab("버거", buger);
		jp.addTab("rhdqor", sd);
		f.add(jp, BorderLayout.CENTER);
		
		JPanel j = new JPanel();
		j.add(bt);
		j.add(ja);
		f.add(j, BorderLayout.SOUTH);
		
		
		
		f.setBounds(100,100,600,800);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
	}
	void setmenu() {
		menu.put("불고기버거", 2300);
		menu.put("빅맥", 4900);
		menu.put("상하이치킨 버거", 4900);
		menu.put("베이컨디럭스 버거", 5800);
		menu.put("슈비 버거", 5800);
		menu.put("1955 버거", 6000);
	}

	public static void main(String[] args) {
		
		MainTest test = new MainTest();
		test.addLayout();
		
		
	}

}
