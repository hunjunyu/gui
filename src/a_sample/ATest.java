package a_sample;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*
 *  자바의 GUI (화면)
 *  - AMT : 1.2버전
 *  -Swing : 
 *  
 */

public class ATest {

	JFrame f;
	JButton btn,bt2,b1,b2;
	JCheckBox cbjava,cboracle;
	JRadioButton man,woman;
	JTextField tf;
    JTextArea ta;

	ATest(){
		f = new JFrame("나의 첫창");
		btn = new JButton("클릭");
		bt2 = new JButton("취소");
		cbjava = new JCheckBox("자바");
		cboracle =  new JCheckBox("오라클"); // 체크박스는 다중선택시 사용
		man = new JRadioButton("남자");    // 라디오버튼은 하나만 선택해야 할때 사용
		woman = new JRadioButton("여자");
		ButtonGroup bg = new ButtonGroup();
		bg.add(man);
		bg.add(woman);
		tf = new JTextField(20);
		ta = new JTextArea(40,20);
	}
	void addLayout() {

		//f.setLayout(new FlowLayout());   //한줄로 나열하는것이 flowlayout
		//f.setLayout(new GridLayout(3,3));  // 지정된 행과 열로 나열하는것이 girdlayout
		f.setLayout(new BorderLayout());   // 동/서/남/북 가운데 배치 
		
		
		//붙이기 작업
		//f.add(cbjava);
		//f.add(cboracle);
		JPanel peast = new JPanel(); //패널은 판을 만들어 같이 묶는다.
		peast.add(man);
		peast.add(woman);
		f.add(peast ,BorderLayout.EAST); 
		f.add(btn, BorderLayout.NORTH);
		f.add(bt2, BorderLayout.SOUTH);
	    //f.add(woman,BorderLayout.EAST);
	    f.add(new JLabel("입력하세요"),BorderLayout.WEST);
       // f.add(tf,BorderLayout.EAST);
        f.add(ta,BorderLayout.CENTER);

		//화면출력
		f.setBounds(100,100,500,350);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		ATest a = new ATest();
		a.addLayout();	




	}

}
