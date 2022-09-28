package b_info.copy2;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.Calendar;
import java.util.concurrent.Callable;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.util.*;
public class infoview {

	//1. 멤버변수 선언
	JFrame f; //프레임
	JTextField tfname,tfid,tfgender,tfage,tfhome,tftel; //지정한 크기만큼 한줄을 쓸수 잇는 공간
	JTextArea ta; // 지정한크기 만큼 쓸수잇는 공간
	JButton badd,bshow,bsearch,bdelete,bcancle,bexit; //버튼 
	Calendar c = Calendar.getInstance();
    
	ArrayList<PersonVO> list = new ArrayList();

	//2. 멤버변수 객체생성
	infoview(){
		f = new JFrame("DBTest"); // 창의 이름 설정
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

		bexit = new JButton("Exit(alt+x)",new ImageIcon("src//img//3.png"));//imageicon : 이미지가 있는 폴더의 좌표를 찍어서 불러온다. 
		bexit.setHorizontalTextPosition(JButton.CENTER);//텍스트 안의 이미지 위치 지정
		bexit.setVerticalTextPosition(JButton.BOTTOM);//텍스트안의 내용을 이미지 밑으로 지정
		bexit.setRolloverIcon(new ImageIcon("src//img//2.png"));// 이미지에 마우스 커서를 올릴때 해당 이미지로 변환하는 구문
		bexit.setPressedIcon(new ImageIcon("src//img//1.png"));// 이미지 클릭시 이미지 이미지 변경 
		bexit.setToolTipText("시스템을 종료합니다");
		bexit.setMnemonic('x');




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
		j.add(bsearch);
		j.add(bshow);
		j.add(bexit);

		f.add(ta, BorderLayout.CENTER); // 에리어 텍스트를 가운데에 놓는구문

		f.setBounds(100,100,900,400); //창크기
		f.setVisible(true);// 창 출력문
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//x누르면 창이 꺼짐과함께 프로그램 종료하는 구문


	}
	public void evenProc() {
		//ADD 버튼이 눌렷을때 이벤트 처리
		badd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				inputdata();
				JOptionPane.showMessageDialog(null, "저장완료");
				clearTextfield();
				selectall();
				
			}
		});
		bshow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				selectall();
				JOptionPane.showMessageDialog(null, "목록 출력");
			}
		});
		bsearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				selectbytel();
				
			}
		});
		tftel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				selectbytel();
			}
		});
		bdelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				deletByTel();
				JOptionPane.showMessageDialog(null, "삭제완료");
			}
		});
		bcancle.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				clearTextfield();
				JOptionPane.showMessageDialog(null, "삭제완료");
			}
		});
		
		//주민번호 입력창에서 엔터 쳤을때
		tfid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				jumininfo();
		
			}
		});// end of addActionListener
			
		
		// 주민번호에서 포커스 이벤트 발생했을때
		tfid.addFocusListener(new FocusListener() {

			public void focusGained(FocusEvent e) {
			}

			public void focusLost(FocusEvent e) {	
			}
			
			
		});
		//cancle 버튼이 눌렷을때
		
		}
	
		//end of addFocusListener	
	
	void clearTextfield() {
		//각각의 텍스트 필드와 텍스트 에어리어 값을 지우기
		ta.setText(null);
		tfage.setText(null);
		tfgender.setText(null);
		tfhome.setText(null);
		tfid.setText(null);
		tfname.setText(null);
		tftel.setText(null);
		
		
	}//end of clearTextfield

	// 함수명   : selectbytel()
	// 인자    : 없음
	// 리턴값   : void
	void selectbytel() {
		String te = tftel.getText();
		if(te.equals("")) {
			JOptionPane.showMessageDialog(null, "전화번호를 입력하세요");
			return;//받은값이 없다면 메세지만 띄우고바로 제어권을 반납하고 나가야한다.
		}
		//리스트에 저장된 personvo의 전화번호와 비교하여 해당 전화번호가 잇으면 그 내용을 각각의 텍스트플드에 출력
		for(PersonVO vo :list) {
			if(te.equals(vo.getTel())) {
			tfname.setText(vo.getName());
			tfage.setText(Integer.toString(vo.getAge()));
			tfgender.setText(vo.getGender());
		    tfid.setText(vo.getId());
		    tfhome.setText(vo.getHome());
			
			}
			
		}
		
	}

	// add버튼을 눌럿을때 텍스트 필드에 입력한 사용자의 값들을 PersonVO에 저장하기
	
	void inputdata () {
		//1. 각각의 텍스트 필드의 입력값을 얻어오기
		
		
		//2. 1번 값들을 personvo멤버 변수에 저장(setter/constructor)
		PersonVO vo = new PersonVO();
		vo.setAge(Integer.parseInt(tfage.getText()));
		vo.setTel(tftel.getText());
		vo.setHome(tfhome.getText());
		vo.setGender(tfgender.getText());
		vo.setId(tfid.getText());
		vo.setName(tfname.getText());
		
		list.add(vo);	
	}//end of inputdata
	
	//리스트에 저장된 정보를 모두 텍스트 에어리어에 출력
	void selectall() {
		ta.setText("-------------전체 목록-------------\n\n");
		for(PersonVO vo : list) {
			ta.append(vo.toString());
		}
		
	}// end of selecetall
	
	void deletByTel() {
		String te = tftel.getText();
		if(te.equals("")) {
			JOptionPane.showMessageDialog(null, "전화번호를 입력하세요");
			return;//받은값이 없다면 메세지만 띄우고바로 제어권을 반납하고 나가야한다.
		}
		//입력한 전화번호값을 얻어오기
	    //입력받은 전화번호가 공백이라면 "전화번호를 입력하세요"라는 메세지창을 출력
		//리스트에 저장된 personvo의 전화번호와 비교하여
		//해당 전화번호가 있으면 그 해당하는 personvo를 리스트에서 삭제
		// 참고 삭제하고나서 break로 반복문 끝내기
		for (PersonVO vo : list) {
			if(te.equals(vo.getTel())) {
				list.remove(vo);
			}break;
		}

	}

	
			
	
	void jumininfo() {
				String junin = tfid.getText();
				if(junin.length()<14|junin.length()>=15) {
				JOptionPane.showMessageDialog(null, " - 포함한 14자를 맞춰주세요");
                junin.charAt(7);
				
				return;	
				}
				
				if(junin.charAt(7)== '1') { 
					tfgender.setText("남자");
					
				}else{
					tfgender.setText("여자");
				}
				switch(junin.charAt(8)) {
				
				case '0' :
					tfhome.setText("서울");
					break;
				case '1' :
					tfhome.setText("인천/부산");
					break;
				case '2' :
					tfhome.setText("경기도");
					break;
				case '9' :
					tfhome.setText("제주도");
					break;
				
				}
				int year = c.get(Calendar.YEAR);
				String bir = junin.substring(0,2);
				int sbir = Integer.parseInt(bir);
				int bb = (year - (sbir+1900))+1;
				String rb = String.valueOf(bb);
				tfage.setText(rb);
				
	
		}

	public static void main(String[] args) {

		infoview info = new infoview(); // 객체 새롭게 지정하며 생성
		info.addLayout();// 출력구문
		info.evenProc();

		
		
	
		
		
		
	}

}
