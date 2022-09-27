package b_info;

import java.awt.*;
import javax.swing.*;

public class infoview {

	//1. 멤버변수 선언
	JFrame f; //프레임
	JTextField tfname,tfid,tfgender,tfage,tfhome,tftel; //지정한 크기만큼 한줄을 쓸수 잇는 공간
	JTextArea ta; // 지정한크기 만큼 쓸수잇는 공간
	JButton badd,bshow,bsearch,bdelete,bcancle,bexit; //버튼 



	//2. 멤버변수 객체생성
	infoview(){
		f= new JFrame("DBTest"); // 창의 이름 설정
		tfname = new JTextField(15);
		tfid = new JTextField(15);
		tftel = new JTextField(15);
		tfgender = new JTextField(15);
		tfage = new JTextField(15);
		tfhome = new JTextField(15);
		ta = new JTextArea(40,20);
		badd = new JButton("Add");
		bshow = new JButton("Show");
		bsearch = new JButton("Search");
		bdelete = new JButton("Delete");
		bcancle = new JButton("Cancel");
		bexit = new JButton("Exit");

	}

	//3. 화면구성하고 출력
	// 전체프레임 BorderLayout지정
	// west : panel 붙이기 (GridLayout()6,2)
	// center : 텍스트에어리어
	// south : JPanel 붙이기 - (GridLayout()1,6)
	public void addLayout() {
		f.setLayout(new BorderLayout()); // 동/서/남/북 으로 출력할 내용의 위치를 지정하여 출력하게 만드는 구문 
		JPanel p = new JPanel(); // 패널 구문
		p.setLayout(new GridLayout(6,2)); //출력시 지정한 행과 열로 출력되게 하는 구문 (그리드) 

		f.add(p , BorderLayout.WEST);// 텍스트 출력을 왼쪽에 하는 구문 
		p.add(new JLabel("Name",JLabel.CENTER)); // "Name"이라고 출력
		p.add(tfname);//텍스트 출력구문
		p.add(new JLabel("Id",JLabel.CENTER));// "Id"이라고 출력
		p.add(tfid);//텍스트 출력구문
		p.add(new JLabel("Tel",JLabel.CENTER));// "Tel"이라고 출력
		p.add(tftel);//텍스트 출력구문
		p.add(new JLabel("Sex",JLabel.CENTER));// "Sex"라고 출력
		p.add(tfgender);//텍스트 출력구문
		p.add(new JLabel("Age",JLabel.CENTER));// "Age"라고 출력
		p.add(tfage);//텍스트 출력구문
		p.add(new JLabel("Home",JLabel.CENTER));// "Home"이라고 출력
		p.add(tfhome);//텍스트 출력구문

		//p.add(new JLabel("Name, id ,tel"));
		JPanel j = new JPanel(); //새 패널 객체 생성
		j.setLayout(new GridLayout(1,6));
		f.add(j, BorderLayout.SOUTH);
		j.add(badd);
		j.add(bcancle);
		j.add(bdelete);
		j.add(bexit);
		j.add(bsearch);
		j.add(bshow);

		f.add(ta, BorderLayout.CENTER); // 에리어 텍스트를 가운데에 놓는구문

		f.setBounds(100,100,900,400); //창크기
		f.setVisible(true);// 창 출력문
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//x누르면 창이 꺼짐과함께 프로그램 종료하는 구문


	}

	public static void main(String[] args) {

		infoview info = new infoview(); // 객체 새롭게 지정하며 생성
		info.addLayout();// 출력구문

	}

}
