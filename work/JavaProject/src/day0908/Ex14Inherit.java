package day0908;

import javax.swing.JFrame;

public class Ex14Inherit {

	public static void main(String[] args) {
		// JFrame 생성(타이틀 전송) - 창제목은 상속공부
		// 사이즈 지정 : setSize - 가로 300, 세로 300
		// 시작위치지정 : setLocation - x 300, y 100
		// 보이게 하기 : setVisible -
		JFrame jf = new JFrame("상속공부");
		jf.setBounds(300, 300, 300, 300);
		jf.setVisible(true);
	}

}
