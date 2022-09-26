package a_sample;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BTest extends JFrame {

	JButton btn;
	
	BTest(){
		super("나의 두번째창");
		btn = new JButton("확인");	
	}
	
	void addLayout() {
		
		add(btn);
		
		
		setBounds(100,100,500,350);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
	public static void main(String[] args) {
	
		BTest b = new BTest();
		b.addLayout();
		

	}

}
