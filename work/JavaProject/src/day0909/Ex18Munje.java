package day0909;

import java.text.NumberFormat;
import java.util.Scanner;

class PayOuter{
	private String sawonName;
	private int gibonPay;
	private int timeSu;
	private int familySu;

	class InputInner {

		void inputData() {
			Scanner sc = new Scanner(System.in);
			System.out.println("사원명 : ");
			sawonName = sc.nextLine();
			System.out.println("기본급 : ");
			gibonPay = Integer.parseInt(sc.nextLine());
			System.out.println("초과시간수 : ");
			timeSu = Integer.parseInt(sc.nextLine());
			System.out.println("가족수 : ");
			familySu = Integer.parseInt(sc.nextLine());
		}
	}

	class SudangInner extends InputInner{

		int getTimeSudang() {
			int temp = timeSu * 10000;
			return temp;
		}

		int getFamilySudang() {
			if(familySu <= 3) {
				return 200000;
			}else {
				return 300000;
			}
		}

		int getTax() {
			double temp = (gibonPay * 3) / 100.0;
			return (int)temp;
		}

		int getPay() {
			int temp = gibonPay + getTimeSudang() + getFamilySudang() - getTax();
			return temp;
		}

		void writeData() {
			NumberFormat nf = NumberFormat.getCurrencyInstance();
			System.out.println("------------------------------------------------------------------------------------");
			System.out.println("사원명\t기본급\t초과시간수\t시간수당\t가족수\t가족수당\t\t세금\t\t실수령액");
			System.out.println("------------------------------------------------------------------------------------");
			System.out.println(sawonName+"\t"+nf.format(gibonPay)+"\t"+timeSu+"\t"+nf.format(getTimeSudang())
					+"\t"+familySu+"\t"+nf.format(getFamilySudang())+"\t"+
					nf.format(getTax())+"\t\t"+nf.format(getPay()));
			System.out.println("------------------------------------------------------------------------------------");

		}
	}

}

public class Ex18Munje {

	public static void main(String[] args) {
		PayOuter.SudangInner ex = new PayOuter().new SudangInner();
		ex.inputData();
		ex.writeData();
	}

}
