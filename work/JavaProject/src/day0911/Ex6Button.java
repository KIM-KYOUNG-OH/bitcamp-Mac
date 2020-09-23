package day0911;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex6Button extends JFrame implements ActionListener{
	JButton btn1, btn2, btn3;
	
	public Ex6Button(String title) {
		super(title);
		this.setBounds(700, 100, 300, 300); // 시작위치 x, y, 크기 w, h
//		this.getContentPane().setBackground(Color.DARK_GRAY); // 프레임 위에 있는 패널의 색상변경
		this.getContentPane().setBackground(new Color(211, 225, 208)); // 프레임 위에 있는 패널의 색상변경
		this.setDesign(); // 디자인 코드
		this.setVisible(true); // 보이게 하기
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로그램을 종료해주는 메서드
	}
	
	public void setDesign() {
		this.setLayout(null);
		btn1 = new JButton("버튼1");
		btn1.setBounds(30, 20, 100, 30);
		this.add(btn1);
		
		btn2 = new JButton("버튼2");
		btn2.setBounds(30, 70, 100, 30);
		this.add(btn2);
		
		btn3 = new JButton("버튼3");
		btn3.setBounds(30, 120, 100, 30);
		this.add(btn3);
		
		// 버튼3개의 이벤트추가
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource(); // 이벤트가 발생한 컴포넌트를 반환
		if(ob == btn1) {
			System.out.println("버튼1");
			this.getContentPane().setBackground(Color.magenta);
		}else if(ob == btn2) {
			System.out.println("버튼2");
			this.getContentPane().setBackground(Color.blue);
		}else {
			System.out.println("버튼3");
			this.getContentPane().setBackground(Color.orange);
		}
	}
	
	public static void main(String[] args) {
		Ex6Button s = new Ex6Button("버튼연습3");
	}

}
