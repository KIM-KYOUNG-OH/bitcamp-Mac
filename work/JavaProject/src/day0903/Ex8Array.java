package day0903;

import java.text.DecimalFormat;

public class Ex8Array {
	public static void main(String[] args) {
		// 배열에 정수값을 초기값으로 넣은후 합계와 평균을 구해보자
		int []data = {5,8,12,23,9,19,67};
		int sum1 = 0;
		for(int i : data) {
			sum1 += i;
		}
		
		int sum2=0;
		for(int i=0; i<data.length; i++) {
			sum2 += data[i];
		}
		
		double avg1 = (double)sum1/data.length;
		double avg2 = (double)sum2/data.length;
		
		DecimalFormat df = new DecimalFormat("0.00"); // 소숫점이하 한자리 출력 양식 지정
		
		System.out.println("sum = " + sum1 + ", avg1 = " + avg1);
		System.out.println("sum2 = " + sum2 + ", avg2 = " + avg2);
		System.out.println(df.format(avg1));
	}
}
