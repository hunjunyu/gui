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
		
		int arr[] = new int[6];
		lol();
		btn();
		eventproc();
		
	}// end of buger
	
	void eventproc() {
		for(int i = 0; i<menu.length;i++) {
			menu[i] = new JButton(ma[i]);
		}
		for(int i = 0; i<price.length;i++) {
			price[i] = new JButton(String.valueOf(pr[i]));
		}
		menu[0] = new JButton("불고기 버거 2,300원", new ImageIcon("src//z_과제//bu//bul.png"));
		menu[1] = new JButton("빅맥 4,900원",new ImageIcon("src//z_과제//bu//big.png"));
		menu[2] = new JButton("상하이치킨 버거 4,900원",new ImageIcon("src//z_과제//bu//sang.png"));
		menu[3] = new JButton("베이컨디럭스 버거 5,800원",new ImageIcon("src//z_과제//bu//di.png"));
		menu[4] = new JButton("슈비 버거 5,800원",new ImageIcon("src//z_과제//bu//subi.png"));
		menu[5] = new JButton("1955 버거 6,000원",new ImageIcon("src//z_과제//bu//1955.png"));
		for (int i=0; i<menu.length; i++) {
		menu[i].setHorizontalTextPosition(JButton.CENTER);
		menu[i].setVerticalTextPosition(JButton.BOTTOM);
		}
		
	}
	
	void lol() {
		setLayout(new BorderLayout());    //레이아웃 세팅
		JPanel p = new JPanel();          //판넬
		p.setLayout(new GridLayout(2,3)); // 판넬 그리드로 출력
		p.add(bul);
		p.add(big);
		p.add(sang);
		p.add(dilux);
		p.add(subi);
		p.add(guoo);
		add(p, BorderLayout.CENTER);     // 판넬을 중간에 출력
		   // 텍스트를 아래에 출력
	}// end of lol
	
	void btn() {
		//bul 버튼 눌럿을때 이벤트 발생
		bul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
				
				
			}
		});
		//big 버튼 눌럿을때 이벤트 발생
		big.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				mt.ja.append("빅맥 : 4900원 "+"\n");
				
			}
		});
		//sang 버튼 눌럿을때 이벤트 발생
		sang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				mt.ja.append("상하이치킨 버거 : 4,900원 "+"\n");
			}
		});
		//dilux 버튼 눌럿을때 이벤트 발생
		dilux.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				mt.ja.append("베이컨디럭스 버거 : 5,800원 "+"\n");
			}
		});
		//subi 버튼 눌럿을때 이벤트 발생
		subi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				mt.ja.append("슈비 버거 : 5,800원 "+"\n");
			}
		});
		//guoo 버튼 눌럿을때 이벤트 발생
		guoo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				mt.ja.append("1955 버거 : 6,000원"+"\n");
			}
		});			
	}//end of btn;



}
