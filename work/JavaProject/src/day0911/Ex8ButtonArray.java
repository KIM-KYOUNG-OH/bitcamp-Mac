package day0911;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

public class Ex8ButtonArray extends JFrame implements ActionListener{
	JButton []btn = new JButton[7];
	JLabel lblColor;
	String []btnTitle = {"Red", "Blue", "Green", "Magenta", "Yellow", "Orange", "Pink"};
	Color []color = {Color.red, Color.blue, Color.green, Color.magenta, Color.yellow, Color.orange
			, Color.pink};
	
	public Ex8ButtonArray(String title) {
		super(title);
		this.setBounds(700, 100, 300, 350); // 시작위치 x, y, 크기 w, h
//		this.getContentPane().setBackground(Color.DARK_GRAY); // 프레임 위에 있는 패널의 색상변경
		this.getContentPane().setBackground(new Color(211, 225, 208)); // 프레임 위에 있는 패널의 색상변경
		this.setDesign(); // 디자인 코드
		this.setVisible(true); // 보이게 하기
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로그램을 종료해주는 메서드
	}
	
	public void setDesign() {
		
		int yPos = 20;
		// 레이아웃 무효화
		this.setLayout(null);
		// 7개의 버튼 생성 및 이벤트
		for(int i=0; i<btn.length; i++) {
			// 버튼 생성
			btn[i] = new JButton(btnTitle[i]);
			// 위치, 크기 지정
			btn[i].setBounds(20, yPos, 100, 30);
			// 글자색을 해당 색상으로 변경
			btn[i].setForeground(color[i]);
			// 프레임에 추가
			this.add(btn[i]);
			yPos += 40;
			final int idx = i;
			
//			// 이벤트 추가 - 익명 내부클래스 형태
//			btn[i].addActionListener(new ActionListener() {
//				
//				@Override
//				public void actionPerformed(ActionEvent e) {
//					lblColor.setBackground(color[idx]);
//				}
//			});
			
			btn[i].addActionListener(this);
		}
		
		// 라벨 추가
		lblColor = new JLabel();
		lblColor.setBounds(150, 20, 120, 250);
		lblColor.setBorder(new LineBorder(Color.DARK_GRAY));
		lblColor.setOpaque(true);
		this.add(lblColor);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// 이벤트가 발생한 오브젝트를 얻음
		Object ob = e.getSource();
		for(int i=0; i<btn.length; i++) {
			if(ob == btn[i]) {
				lblColor.setBackground(color[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		new Ex8ButtonArray("버튼배열");
	}
	
}
