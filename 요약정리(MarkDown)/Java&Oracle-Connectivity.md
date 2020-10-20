# Java&Oracle-Connectivity  
## DBMS(Database Management System)  
  다수의 사용자들이 데이터베이스 내의 데이터들에 접근할 수 있도록 해주는 소프트웨어 도구의 집합
  
## 자바 & 오라클 연동 절차  
    1. jdbc 드라이버 로드
           Class.forName(“드라이버이름”); 
    2. 데이터베이스 연결객체 생성
           Connection conn = DriverManager.getConnection(url,id,password);
    3. statement 얻기
           Statement stmt = conn.createStatement(); 
    4. 질의문 실행 
           ResultSet rs = stmt.executeQuery("Select * from ......");
           Int n = stmt.executeUpdate(dalete or update or insert 문);
    5. ResultSet 해제 
           rs.close(); 
    6. Statement 해제 
           stmt.close(); 
    7. DB연결해제 
           conn.close(); 

## 기본 클래스 구성  
1. 오라클 connection 클래스  
    : 드라이버 실행, DB커넥션, DB연결해제
2. DTO 클래스(Data Transfer Object)  
    : 로직 없이 순수 데이터를 담는 오브젝트 (getter/setter)  
3. DAO 클래스(Data Access Object)  
    : DB 데이터에 접근해서 조작하는 기능을 전담하는 오브젝트 (CRUD)  
4. main 클래스  

