package day0908;

import javax.swing.JFrame;

public class Ex15Inherit extends JFrame{

	public Ex15Inherit() {
		super("자바공부");
		// 창 크기 지정
		this.setSize(300, 300);
		// 시작 위치 지정
		this.setLocation(300, 300);
		//보이게 하기
		this.setVisible(true);
	}
	public static void main(String[] args) {
		Ex15Inherit ex = new Ex15Inherit();
	}

}
