# Java-GUI-Programming  
## 1. 기본 자바 로직
<pre><code>import java.awt.Color;
import javax.swing.JFrame;

public class SwingGibon extends JFrame{

  public SwingGibon(String title) {
    super(title);
    this.setBounds(700, 100, 300, 300); // 시작위치 x, y, 크기 w, h
    // this.getContentPane().setBackground(Color.DARK_GRAY); // 프레임 위에 있는 패널의 색상변경
    this.getContentPane().setBackground(new Color(211, 225, 208)); // 프레임 위에 있는 패널의 색상변경
    this.setDesign(); // 디자인 코드
    this.setVisible(true); // 보이게 하기
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로그램을 종료해주는 메서드
  }

  public void setDesign() {
    // 레이아웃 없애기
    this.setLayout(null);
  
  }

  public static void main(String[] args) {
    new SwingGibon("기본창");
  }
}</code></pre>  

## 2. 자바 라이브러리
### 2.1 javax.swing 클래스  
  #### - JFrame  
    프레임 생성
  #### - JTable
    테이블 생성
  #### - JLabel
    패널에 문자열 생성
  #### - JTextField
    패널에 문자를 입력할 수 있는 빈칸 생성
  #### - JComboBox
    패널에 특정 선택지중 한가지를 선택할 수 있는 박스 생성  
  #### - JButton  
    패널에 퍼튼 생성
