package day0922;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex3OracleConnect {
	
	public Ex3OracleConnect() {
		// 오라클 드라이버 클래스 실행
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("오라클 드라이버 클래스 성공!!!");
		} catch (ClassNotFoundException e) {
			System.out.println("오라클 드라이버가 없어요 :" + e.getMessage());
		}
	}
	
	//sawon 테이블의 전체 갯수 가져오기
	public void countSawon() {
		// 오라클 서버에 연결
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		try {
			conn = DriverManager.getConnection(url, "angel", "a1234");
			System.out.println("오라클 서버 연결 성공");
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select count(*) cnt from sawon");
//			rs.next()는 다음 데이터로 이동을 하면서 true반환, 없을경우 false반환
			if(rs.next()) {
				// 데이터를 가져올때는 열인덱스번호로 가져오거나 칼럼명으로 가져온다
				int cnt = rs.getInt(1);
				System.out.println("sawon 테이블 총 갯수 :" + cnt);
				cnt = rs.getInt("cnt"); // 열 이름으로 가져오기
				System.out.println("sawon 테이블 총 갯수 :" + cnt);
			}
		} catch (SQLException e) {
			System.out.println("오라클 서버 연결 실패 : " + e.getMessage());
		} finally {
			try {
				if(rs!=null) rs.close();
				if(stmt!=null) stmt.close();
				if(conn!=null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		Ex3OracleConnect ex = new Ex3OracleConnect();
		ex.countSawon();
	}
}
