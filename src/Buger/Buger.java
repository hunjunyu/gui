package Buger;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Buger extends JPanel{
	
	JLabel la; 
	JButton btn,bul,big,sang,dilux,subi,guoo; //메뉴버튼
	MainTest mt;//메인테스트 출력
    int arr[];
    JButton []menu = new JButton[6];
    String[] ma = {"불고기 버거","빅맥","상하이치킨 버거","베이컨디럭스 버거","슈비 버거","1955 버거"};
    JButton [] price = new JButton[6];
    int []pr = {2300,4900,4900,5800,5800,6000};
    
	public Buger(MainTest maintest) {
		
		mt = maintest;
		eventproc();
		addLayout();
		
	}// end of buger
	
	void eventproc() {
		for(int i = 0; i<menu.length;i++) {
			menu[i] = new JButton(ma[i]);
		}
		for(int i = 0; i<price.length;i++) {
			price[i] = new JButton(String.valueOf(pr[i]));
		}
		menu[0] = new JButton("불고기 버거 2,300원", new ImageIcon("src//Buger//bu//bul.png"));
		menu[1] = new JButton("빅맥 4,900원",new ImageIcon("src//Buger//bu//big.png"));
		menu[2] = new JButton("상하이치킨 버거 4,900원",new ImageIcon("src//Buger//bu//sang.png"));
		menu[3] = new JButton("베이컨디럭스 버거 5,800원",new ImageIcon("src//Buger//bu//di.png"));
		menu[4] = new JButton("슈비 버거 5,800원",new ImageIcon("src//Buger//bu//subi.png"));
		menu[5] = new JButton("1955 버거 6,000원",new ImageIcon("src//Buger//bu//1955.png"));
		for (int i=0; i<menu.length; i++) {
		menu[i].setHorizontalTextPosition(JButton.CENTER);
		menu[i].setVerticalTextPosition(JButton.BOTTOM);
		}
		
		
	}
	
	void addLayout() {
		setLayout(new BorderLayout());
		JPanel j = new JPanel();
		j.setLayout(new GridLayout(2,3));
		for(int i = 0; i < menu.length;i++) {
			j.add(menu[i]);
		}
		add(j, BorderLayout.CENTER);
	}



}
