package day0903;

public class Ex10Array {

	public static void main(String[] args) {
		int[] data = {4,6,10,-12,20,103,399,11};
		System.out.println("총갯수 : " + data.length);
		//배열에서 양수와 음수가 각각몇개인지 출력하시오
		int pcnt = 0, mcnt = 0;
//		for(int i=0; i<data.length; i++) {
//			if(data[i]>0) {
//				pcnt++;
//			}else if(data[i]<0) {
//				mcnt++;
//			}
//		}
		
		for(int a : data) {
			if(a>0) {
				pcnt++;
			}else if(a<0) {
				mcnt++;
			}
		}
		System.out.println("양수의 갯수 : " + pcnt);
		System.out.println("음수의 갯수 : " + mcnt);
	}

}
