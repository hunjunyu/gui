package c_sample;

import java.awt.*;
import java.awt.event.*;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * 화면에 (JFframe)에 '확인' 버튼 하나 출력
 * 
 */
public class EventTest3 {
	JFrame f;
	JButton b;

	EventTest3(){
		f = new JFrame();
		b= new JButton("확인");

		//2 핸들러 객체 생성

		//3 이벤트 발생할 컴포넌트와 연결 
		b.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null, "이벤트 발생3");
			}
		});

	}
	//1 이벤트 핸들러 만들기
	//  핸들러 - 이벤트 처리 클래스


	public void pirnt () {

		JPanel j = new JPanel();
		j.add(b);
		f.add(j, BorderLayout.CENTER);


		f.setBounds(100, 100, 800, 350);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {

		EventTest3 e = new EventTest3();
		e.pirnt();



	}

}
