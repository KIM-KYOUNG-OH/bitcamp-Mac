package day0923;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import oracle.db.OracleConnect;

public class PersonDao {
	OracleConnect db;
	public PersonDao() {
		db = OracleConnect.getInstance();
	}
	
	// 전체 데이터 리턴하는 메서드
	public List<PersonDto> getAllPersons() {
		List<PersonDto> list = new ArrayList<PersonDto>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from person2 order by num asc";
		
		//db 연결
		conn = db.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			// 실행
			rs = pstmt.executeQuery();
			while(rs.next()) {
				// 이때 dto 선언은 반드시 while문 안에서 해야한다
				PersonDto dto = new PersonDto();
				// db에서 데이터 가져오기
				int num = rs.getInt("num");
				int java = rs.getInt("java");
				int spring = rs.getInt("spring");
				String name = rs.getString("name");
				String blood = rs.getString("blood");
				double height = rs.getDouble("height");
				Date birthday = rs.getDate("birthday");
				
				// dto에 넣기
				dto.setNum(num);
				dto.setName(name);
				dto.setBirthday(birthday);
				dto.setBlood(blood);
				dto.setHeight(height);
				dto.setJava(java);
				dto.setSpring(spring);
				
				// list에 dto추가
				list.add(dto);
						
			}
		} catch (SQLException e) {
			System.out.println("select 오류 : " + e.getMessage());
		} finally {
			db.dbClose(rs, pstmt, conn);
		}
		return list;
	}
}
