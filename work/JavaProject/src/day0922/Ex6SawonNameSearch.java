package day0922;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Scanner;

public class Ex6SawonNameSearch {

	public Ex6SawonNameSearch() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
//			System.out.println("오라클 드라이버 클래스 성공!!!");
		} catch (ClassNotFoundException e) {
			System.out.println("오라클 드라이버가 없어요 :" + e.getMessage());
		}
	}
	
	public void searchSawon() {
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 이름을 입력해주세요 :");
		String find = sc.nextLine();
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		int count = 0;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "angel";
		String password = "a1234";
		String sql = "select name, pay,paytax,ipsaday from sawon"
				+ " where name like '%" + find + "%'";
		
		try {
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			System.out.println(find + "를 포함한 명단 출력");
			while(rs.next()) {
				String name = rs.getString(1);
				int pay = rs.getInt(2);
				int paytax = rs.getInt(3);
				Date ipsaday = rs.getDate(4);

				count++;
				System.out.println(name +"\t"+ nf.format(pay) +"\t"+ nf.format(paytax) +"\t"+ ipsaday);
			}
			if(count == 0) {
				System.out.println("이름에 " + find + "를 포함한 사람이 없습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		Ex6SawonNameSearch ex = new Ex6SawonNameSearch();
		ex.searchSawon();
	}

}
