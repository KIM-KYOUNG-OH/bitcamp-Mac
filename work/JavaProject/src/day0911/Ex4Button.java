package day0911;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex4Button extends JFrame{

	Icon icon1 = new ImageIcon("/Users/kimgyeong-o/bitcampJAVA/image/swingimage/img10.gif");
	Icon icon2 = new ImageIcon("/Users/kimgyeong-o/bitcampJAVA/image/swingimage/LEFT.GIF");
	Icon icon3 = new ImageIcon("/Users/kimgyeong-o/bitcampJAVA/image/swingimage/leftDown.gif");
	JButton btn1, btn2;
	
	public Ex4Button(String title) {
		super(title);
		this.setBounds(700, 100, 300, 300); // 시작위치 x, y, 크기 w, h
//		this.getContentPane().setBackground(Color.DARK_GRAY); // 프레임 위에 있는 패널의 색상변경
		this.getContentPane().setBackground(new Color(211, 225, 208)); // 프레임 위에 있는 패널의 색상변경
		this.setDesign(); // 디자인 코드
		this.setVisible(true); // 보이게 하기
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로그램을 종료해주는 메서드
	}
	
	public void setDesign() {
		// Frame은 기본이 BorderLayout이다 (동서남북으로 배치되는 레이아웃 방식이다)
		btn1 = new JButton("My Button", icon1);
		// 프레임에 추가
//		this.add(btn1); // 프레임은 기본이 BorderLayout이라 위치를 지정하지 않으면 전체적으로 들어간다.
		this.add("North", btn1); // 문자열, 컴포넌트
		
//		btn2 = new JButton("My Button2");
		btn2 = new JButton(icon2);
		btn2.setPressedIcon(icon3);
//		btn2.setRolloverIcon(icon3);
		this.add(btn2, BorderLayout.SOUTH); // 컴포넌트, 상수
	}
	
	public static void main(String[] args) {
		Ex4Button s = new Ex4Button("버튼연습");
		s.setDesign();
	}
}
