package day0909;

interface WindowEvent{
	public void windowClose();
	public void windowIcon();
	public void windowOpen();
}

public class Ex11InnerClass {
	// windowEvent 를 익명 내부 클래스 형태로 구현하시오
	// 변수명은 win 내부 익명클래스
	WindowEvent win = new WindowEvent() {
		
		@Override
		public void windowOpen() {
			System.out.println("윈도우 오픈");
		}
		
		@Override
		public void windowIcon() {
			System.out.println("윈도우 아이콘화");
		}
		
		@Override
		public void windowClose() {
			System.out.println("윈도우 닫기");
		}
	};
	
	// WindowEvent를 구현하는 내부클래스 SubWindow를 구현하시오
	public class SubWindow implements WindowEvent{
		@Override
		public void windowOpen() {
			System.out.println("open!!");
		}
		@Override
		public void windowIcon() {
			System.out.println("Icon!!");
		}
		@Override
		public void windowClose() {
			System.out.println("close!!!");
		}
	}
			
	public static void main(String[] args) {
		// 익명 내부클래스 선언후 메소드 호출
		Ex11InnerClass ex = new Ex11InnerClass();
		ex.win.windowOpen();
		ex.win.windowIcon();
		ex.win.windowClose();
		// SubWindow 내부클래스 선언후 메소드 호출
		Ex11InnerClass.SubWindow sub = ex.new SubWindow();
		sub.windowOpen();
		sub.windowIcon();
		sub.windowClose();
	}
}
