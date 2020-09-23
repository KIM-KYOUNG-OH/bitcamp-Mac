package day0914;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import day0914.Ex3SwingImage.MyImage;

public class Ex7ImageMunje extends JFrame implements ActionListener{
	JButton btnLeft, btnRight, btnUp, btnDown;
	String imageName = "/Users/kimgyeong-o/bitcampJAVA/image/귀여운 아이콘/c5.png";
	int xPos = 300;
	int yPos = 300;
	Image image;
	ImageMove im;
	
	public Ex7ImageMunje(String title) {
		super(title);
		this.setBounds(700, 100, 800, 800); // 시작위치 x, y, 크기 w, h
//		this.getContentPane().setBackground(Color.DARK_GRAY); // 프레임 위에 있는 패널의 색상변경
		this.getContentPane().setBackground(new Color(211, 225, 208)); // 프레임 위에 있는 패널의 색상변경
		this.setDesign(); // 디자인 코드
		this.setVisible(true); // 보이게 하기
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로그램을 종료해주는 메서드
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		if(ob == btnLeft) {
			xPos-=20;
		}else if(ob == btnRight) {
			xPos += 20;
		}else if(ob == btnUp) {
			yPos-=20;
		}else if(ob == btnDown) {
			yPos+=20;
		}
		im.repaint();
	}
	
	public void setDesign() {
		this.setLayout(null);
		
		btnUp = new JButton("위쪽");
		btnUp.setBounds(30,20,100,30);
		this.add(btnUp);
		
		btnDown = new JButton("아래쪽");
		btnDown.setBounds(150,20,100,30);
		this.add(btnDown);
		
		btnLeft = new JButton("왼쪽");
		btnLeft.setBounds(270,20,100,30);
		this.add(btnLeft);
		
		btnRight = new JButton("오른쪽");
		btnRight.setBounds(390,20,100,30);
		this.add(btnRight);
		
		image = new ImageIcon(imageName).getImage();
		im = new ImageMove();
		im.setBounds(0, 0, 800, 800);
		this.add(im);
		
		btnLeft.addActionListener(this);
		btnRight.addActionListener(this);
		btnUp.addActionListener(this);
		btnDown.addActionListener(this);
		
	}
	
	class ImageMove extends Canvas{
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			g.drawImage(image, xPos, yPos, 120, 150, this);
		}
	}
	
	public static void main(String[] args) {
		new Ex7ImageMunje("이미지 이동");
	}

	

}
