package day0915;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

public class Ex1Choice extends JFrame{
	Choice choice;
	JComboBox<String> combo;
	
	String []title = {"빨강", "파랑", "초록" , "분홍", "오렌지", "검정"};
	Color []color = {Color.red, Color.blue, Color.green, Color.pink, Color.orange, Color.black};
	
	JLabel lblMessage;
	
	public Ex1Choice(String title) {
		super(title);
		this.setBounds(700, 100, 300, 500); // 시작위치 x, y, 크기 w, h
//		this.getContentPane().setBackground(Color.DARK_GRAY); // 프레임 위에 있는 패널의 색상변경
		this.getContentPane().setBackground(new Color(211, 225, 208)); // 프레임 위에 있는 패널의 색상변경
		this.setDesign(); // 디자인 코드
		this.setVisible(true); // 보이게 하기
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로그램을 종료해주는 메서드
	}
	
	public void setDesign() {
		this.setLayout(null);
		choice = new Choice();
		for(String t: title) {
			choice.add(t);
		}
		// 초기값 설정
		choice.select(5); // black으로
		choice.setBounds(20, 20, 90, 30);
		this.add(choice);
		
		combo = new JComboBox<String>(title);
		combo.setBounds(130, 20, 100, 30);
		this.add(combo);
		
		// label
		lblMessage = new JLabel("Choice & JComboBox", JLabel.CENTER);
		lblMessage.setBorder(new LineBorder(Color.gray, 3));
		lblMessage.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblMessage.setBounds(20, 150, 250, 50);
		this.add(lblMessage);
		
		// choice 이벤트
		choice.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				int idx = choice.getSelectedIndex();
				String item = choice.getSelectedItem();
				// 글자색 변경
				lblMessage.setForeground(color[idx]);
				// 메세지 출력
				lblMessage.setText("index : " + idx + " select");
				System.out.println(item);
			}
		});
		
		// combo 이벤트
		combo.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				int idx = combo.getSelectedIndex();
				String item = choice.getSelectedItem();
				lblMessage.setForeground(color[idx]);
//				System.out.println(item); // 두번출력
				System.out.println(idx);
			}
		});
	}
	
	public static void main(String[] args) {
		new Ex1Choice("Choice 컴포넌트");
	}
}
