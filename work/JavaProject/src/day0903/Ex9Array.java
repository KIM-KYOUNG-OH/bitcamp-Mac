package day0903;

public class Ex9Array {

	public static void main(String[] args) {

		int[] data = {4,6,12,1,99,123,-100,900,5,11};
		// 최대값과 최소값을 구해보자
		// 일단 최대값과 최소값에는 첫번째 데이타를 넣어주자
		int max = data[0];
		int min = data[0];
		
		// 두번째부터 반복문을 돌려서 더 큰값이 나오거나
		// 더 작은 값이 나오면 최대값이나 최소값을 변경
		for(int i=1; i<data.length; i++) {
			if(max<data[i]) {
				max = data[i];
			}
			if(min>data[i]) {
				min = data[i];
			}
		}
		System.out.println("max = " + max);
		System.out.println("min = " + min);
	}

}
