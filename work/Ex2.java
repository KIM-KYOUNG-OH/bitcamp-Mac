class Ex2
{
	public static void main(String []args)
	{
		System.out.println("첫 번째 숫자" + args[0]);
		System.out.println("두 번째 숫자" + args[1]);
		System.out.println("더하기");
		System.out.println(args[0]+args[1]);

		//String을 int 타입으로 변환
		int s1 = Integer.parseInt(args[0]);
		int s2 = Integer.parseInt(args[1]);

		System.out.println("더하기 계산 :" + (s1+s2));
		System.out.println("빼기 계산 :" + (s1-s2));
	}
}