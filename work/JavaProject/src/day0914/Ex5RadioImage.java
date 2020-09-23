package day0914;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

// 문제 : 5개의 라디오버튼(배열)을 선택할 때마다 이미지 변경하기
// 이미지는 자기 마음대로...(Ex3을 약간 수정해서 하세요)
public class Ex5RadioImage extends JFrame{

	JRadioButton []rb = new JRadioButton[5];
	DrawImage draw = new DrawImage();
	String []title = {"아이유", "소지섭", "박보영", "원빈", "한예슬"};
	
	String imageName1 = "/Users/kimgyeong-o/bitcampJAVA/image/연예인사진/10.JPG";
	String imageName2 = "/Users/kimgyeong-o/bitcampJAVA/image/연예인사진/11.JPG";
	String imageName3 = "/Users/kimgyeong-o/bitcampJAVA/image/연예인사진/12.JPG";
	String imageName4 = "/Users/kimgyeong-o/bitcampJAVA/image/연예인사진/17.JPG";
	String imageName5 = "/Users/kimgyeong-o/bitcampJAVA/image/연예인사진/14.JPG";
	
	Image image;
	
	public Ex5RadioImage(String title) {
		super(title);
		this.setBounds(700, 100, 500, 600); // 시작위치 x, y, 크기 w, h
//		this.getContentPane().setBackground(Color.DARK_GRAY); // 프레임 위에 있는 패널의 색상변경
		this.getContentPane().setBackground(new Color(211, 225, 208)); // 프레임 위에 있는 패널의 색상변경
		this.setDesign(); // 디자인 코드
		this.setVisible(true); // 보이게 하기
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로그램을 종료해주는 메서드
	}
	
	public void setDesign() {
		this.setLayout(null);
		// 라디오버튼
		ButtonGroup bg = new ButtonGroup();
		int xPos = 20;
		for(int i=0; i<rb.length; i++) {
			rb[i] = new JRadioButton(title[i], i==2?true:false);
			rb[i].setBounds(xPos, 30, 80, 30);
			rb[i].setOpaque(false);
			this.add(rb[i]);
			bg.add(rb[i]);
			xPos+=80;
			final int idx = i;
			
			// 익명내부클래스로 이벤트
			rb[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// i번째 이미지 생성
					switch (idx) {
					case 0:
						image = new ImageIcon(imageName1).getImage();
						break;
					case 1:
						image = new ImageIcon(imageName2).getImage();
						break;
					case 2:
						image = new ImageIcon(imageName3).getImage();
						break;
					case 3:
						image = new ImageIcon(imageName4).getImage();
						break;
					case 4:
						image = new ImageIcon(imageName5).getImage();
						break;
					}
					// 캔바스 paint 호출
					draw.repaint();
				}
			});
		}
		
		// DrawImage 추가
		image = new ImageIcon(imageName3).getImage();
		draw.setBounds(0, 100, 500, 500);
		this.add(draw);
	}
	
	// 이미지를 그리기 위한 내부 클래스
	class DrawImage extends Canvas{
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			g.drawImage(image, 60, 30, 300, 400, this);
		}
	}
	
	public static void main(String[] args) {
		new Ex5RadioImage("이미지선택");
	}
}
