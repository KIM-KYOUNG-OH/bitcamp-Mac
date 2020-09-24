# Java&Oracle-Connectivity  
## DBMS(Database Management System)  
  다수의 사용자들이 데이터베이스 내의 데이터들에 접근할 수 있도록 해주는 소프트웨어 도구의 집합
  
## 자바 & 오라클 연동 절차  
    ① jdbc 드라이버 
           Class.forName(“드라이버이름”); 
    ② 커넥션 얻기
           conn = DriverManager.getConnection(url,id,password);
    ③ statement 얻기
           Statement stmt = conn.createStatement(); 
    ④ 질의문 실행 
           ResultSet rs = stmt.executeQuery("Select * from ......");
           Int n = stmt.executeUpdate(dalete or update or insert 문);
    ⑤ ResultSet 해제 
           rs.close(); 
    ⑥ Statement 해제 
           stmt.close(); 
    ⑦ DB연결해제 
           conn.close(); 

## 기본 클래스 구조  
  1. 오라클 connection 클래스  
      : 드라이버 실행, DB커넥션, DB연결해제
  2. DTO 클래스(Data Transfer Object)  
      : 로직 없이 순수 데이터를 담는 오브젝트 (getter/setter)  
  3. DAO 클래스(Data Access Object)  
      : DB 데이터에 접근해서 조작하는 기능을 전담하는 오브젝트 (CRUD)  
  4. main 클래스  
  
## 자바 GUI프로그램 연동  
