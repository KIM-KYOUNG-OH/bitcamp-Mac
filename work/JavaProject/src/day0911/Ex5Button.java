package day0911;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class Ex5Button extends JFrame{

	Icon icon1 = new ImageIcon("/Users/kimgyeong-o/bitcampJAVA/image/swingimage/img10.gif");
	Icon icon2 = new ImageIcon("/Users/kimgyeong-o/bitcampJAVA/image/swingimage/LEFT.GIF");
	Icon icon3 = new ImageIcon("/Users/kimgyeong-o/bitcampJAVA/image/swingimage/RIGHT.GIF");
	JButton btn1, btn2, btn3;
	JLabel lblMsg;
	
	public Ex5Button(String title) {
		super(title);
		this.setBounds(700, 100, 300, 300); // 시작위치 x, y, 크기 w, h
//		this.getContentPane().setBackground(Color.DARK_GRAY); // 프레임 위에 있는 패널의 색상변경
		this.getContentPane().setBackground(new Color(211, 225, 208)); // 프레임 위에 있는 패널의 색상변경
		this.setDesign(); // 디자인 코드
		this.setVisible(true); // 보이게 하기
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로그램을 종료해주는 메서드
	}
	
	public void setDesign() {
		// 기본레이아웃을 무효화
		this.setLayout(null);
		btn1 = new JButton(icon2); //버튼생성
		btn1.setBounds(30, 50, 100, 100); // 위치, 크기 지정
		this.add(btn1); // 프레임에 추가
		btn2 = new JButton(icon3);
		btn2.setBounds(140, 50, 100, 100);
		this.add(btn2);
		
		// 라벨 생성
		lblMsg = new JLabel("Result", icon1, JLabel.LEFT);
		lblMsg.setBounds(20, 170, 250, 60);
		// border 지정
//		lblMsg.setBorder(new TitledBorder("Result Area"));
		lblMsg.setBorder(new LineBorder(Color.red, 5));
		lblMsg.setOpaque(true);
		lblMsg.setBackground(Color.green);
		lblMsg.setFont(new Font("Comic Sans MS", Font.BOLD|Font.ITALIC, 20));
		this.add(lblMsg);
		
		// 버튼1 이벤트 (익명 내부 클래스)
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				lblMsg.setText("Left Button Clicked!!");
			}
		});
		// 버튼2 이벤트 (내부 클래스)
		btn2.addActionListener(new MyButton());
	}
	
	class MyButton implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			lblMsg.setText("Right Button Clicked!!");
		}
		
	}
	
	public static void main(String[] args) {
		new Ex5Button("버튼연습2");
		
	}
}
