package Buger;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class Buger extends JPanel{
	
	JLabel la;
	JButton btn,bul,big,sang,dilux,subi,guoo;
	MainTest mt;
	JTextField text;
	
	public Buger(MainTest maintest) {
		
		mt = maintest;
		addLayout();
		text= new JTextField(100);
		
		lol();
	}
	void addLayout() {
	
		
		bul = new JButton("불고기 버거",new ImageIcon("src//Buger//bu//bul.png"));
		bul.setHorizontalTextPosition(JButton.CENTER);
		bul.setVerticalTextPosition(JButton.BOTTOM);
		bul.setHorizontalTextPosition(JButton.BOTTOM);
		big = new JButton("빅맥",new ImageIcon("src//Buger//bu//big.png"));
		big.setHorizontalTextPosition(JButton.CENTER);
		big.setVerticalTextPosition(JButton.BOTTOM);
		sang = new JButton("상하이치킨 버거",new ImageIcon("src//Buger//bu//sang.png"));
		sang.setHorizontalTextPosition(JButton.CENTER);
		sang.setVerticalTextPosition(JButton.BOTTOM);
		dilux = new JButton("베이컨토마토디럭스 버거",new ImageIcon("src//Buger//bu//di.png"));
		dilux.setHorizontalTextPosition(JButton.CENTER);
		dilux.setVerticalTextPosition(JButton.BOTTOM);
		subi = new JButton("슈비 버거",new ImageIcon("src//Buger//bu//subi.png"));
		subi.setHorizontalTextPosition(JButton.CENTER);
		subi.setVerticalTextPosition(JButton.BOTTOM);
		guoo = new JButton("1955 버거",new ImageIcon("src//Buger//bu//1955.png"));
		guoo.setHorizontalTextPosition(JButton.CENTER);
		guoo.setVerticalTextPosition(JButton.BOTTOM);
		text = new JTextField(50);
	
		
		
	}
	void lol() {
		setLayout(new BorderLayout());
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(2,3));
		p.add(bul);
		p.add(big);
		p.add(sang);
		p.add(dilux);
		p.add(subi);
		p.add(guoo);
		add(p, BorderLayout.CENTER);
		add(text, BorderLayout.SOUTH);
	}
	

}
