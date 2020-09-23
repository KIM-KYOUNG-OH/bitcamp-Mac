package day0922;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Ex5SawonBuseoSearch {
	
	public Ex5SawonBuseoSearch() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
//			System.out.println("오라클 드라이버 클래스 성공!!!");
		} catch (ClassNotFoundException e) {
			System.out.println("오라클 드라이버가 없어요 :" + e.getMessage());
		}
	}
	
	public void buseoSelect() {
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 부서명을 입력하세요 :");
		String buseo = sc.nextLine();
		// 일단 sql문을 완성해봅시다
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		int count = 0;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "angel";
		String password = "a1234";
		String sql = "select name, to_char(pay,'L9,999,999') pay,"
				+ " to_char(paytax,'L9,999,999') paytax from sawon"
				+ " where buseo='" +buseo+ "'";
		try {
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			System.out.println(buseo + "의 명단 출력");
			while(rs.next()) {
				String name = rs.getString("name");
				String pay = rs.getString("pay");
				String paytax = rs.getString("paytax");
				
				// 인원수 증가
				count++;
				System.out.println(name+"\t"+pay+"\t"+paytax);
			}
			if(count == 0) {
				System.out.println(buseo+" 부서에는 인원이 없습니다.");
			}else {
				System.out.println("총 : " + count + "명");
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
		Ex5SawonBuseoSearch ex = new Ex5SawonBuseoSearch();
		ex.buseoSelect();
	}
}
