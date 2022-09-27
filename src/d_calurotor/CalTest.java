package d_calurotor;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.FileReader;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CalTest {

	//1. 멤버변수 선언
	JFrame f;
	JTextField tf;
	JButton []bnum = new JButton[10];//0~9
	JButton []bop = new JButton[4];//+,=,*,/
	JButton bequl;
	String op[] = {"+","-","*","/"};//부호를 넣기위한 또다른 배열

	int first,second;
	String oo;


	//2. 객체 생성
	CalTest(){
		bequl = new JButton("=");
		f = new JFrame("유치원 계산기");//창이름
		tf = new JTextField();
		for (int a = 0; a<bnum.length; a++) {
			bnum[a] = new JButton(String.valueOf(a)); 


			for (int i = 0;i<bop.length;i++) {//bop의 배열
				bop[i] = new JButton(op[i]); // bop에 op의 부호를 대입하기 위한 구문
			}


		}


	}//end of caltest

	//3. 화면 구성 및 화면 출력
	void addLayout() {
		f.setLayout(new BorderLayout());
		f.add(tf, BorderLayout.NORTH);

		Panel p = new Panel();
		p.add(bnum[1]);
		p.add(bnum[2]);
		p.add(bnum[3]);
		p.add(bnum[4]);
		p.add(bnum[5]);
		p.add(bnum[6]);
		p.add(bnum[7]);
		p.add(bnum[8]);
		p.add(bnum[9]);
		p.add(bop[0]);
		p.add(bnum[0]);
		p.add(bequl);
		p.add(bop[1]);
		p.add(bop[2]);
		p.add(bop[3]);
		p.setLayout(new GridLayout(5, 3));
		f.add(p, BorderLayout.CENTER);


		f.setBounds(100, 100, 800, 500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	}//end of addLaytout()

	//4. 이벤트 처리

	void eventproc() {
		//숫자 버튼이 눌렷을때
		for(int i = 0; i<bnum.length;i++) {
			bnum[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//이벤트가 발생한 컴포넌트의 참조를 얻어옴
					JButton ebtn = (JButton)e.getSource();
					String su = ebtn.getText();
					tf.setText(tf.getText()+su);
					
				}
			});

		}

		// 연산자 버튼이 눌렷을때
		for (int i = 0; i<bop.length;i++) {
			bop[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//
					JButton et = (JButton)e.getSource();
					oo = et.getText();
					first = Integer.parseInt(tf.getText());  
					tf.setText("");

				}
			});
		}
		//=버튼이 눌렸을때
		bequl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				second = Integer.parseInt(tf.getText());
				int result = 0;
				switch(oo) {
				case "+" : result= first + second;
				break;
				case "-" : result = first - second;
				break;
				case "*" : result = first * second;
				break;
				case "/" : result = first /second;
				break;

				}
				tf.setText(String.valueOf(result));
			}
		});



	}

	// end of eventproc()


	public static void main(String[] args) {

		CalTest cal = new CalTest();
		cal.addLayout();
		cal.eventproc();

	}


}
