package Buger;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class dilux extends JFrame{
	JButton dilux,jumun,janB,manu;
	
	
	public dilux() {

		setBounds(300,150,350, 350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    	bord();
    	eventProc();
		
	}
	
	public void bord() {
		jumun = new JButton("주문하기");
		janB = new JButton("장바구니");
		manu = new JButton("메인메뉴로");
		dilux= new JButton();
		
		dilux = new JButton("베이컨디럭스 버거 5,800원",new ImageIcon("src//Buger//bu//di.png"));
		dilux.setHorizontalTextPosition(JButton.CENTER);
		dilux.setVerticalTextPosition(JButton.BOTTOM);
		
		setLayout(new BorderLayout());
		add(dilux, BorderLayout.CENTER);
		

		JPanel pan2 = new JPanel();
		pan2.setLayout(new GridLayout(1, 3,10,15));
		pan2.add(jumun);
		pan2.add(janB);
		pan2.add(manu);
		add(pan2 , BorderLayout.SOUTH);
	}

    
    void eventProc() {
        manu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		}); // end of addActionListener
        
        jumun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//new jumun();
				dispose();
			}
		}); // end of addActionListener
        janB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
        
        
        
        
    }
    
	public static void main(String[] args) {
		
		

	}

}
