# JSP  
## 1. 서버와 클라이언트  
client와 server간에 요청과 응답반복  

## 2. CGI(Common Gateway Interface) 프로그램  
- 웹 서버 안에서 동적인 웹페이지를 요청받을 때마다 실행처리됨  

## 3. servlet  
- 자바를 서버쪽에 사용하는 기술 중 하나  
- 클라이언트 요청마다 실행되는 CGI와는 다르게 스레드로 각 요청을 서비스  
- 이식성이 좋다(= 플랫폼의 종류에 상관없이 실행가능)  

## 4. JSP(JavaServer Pages)  
- 서블릿은 자바언어안에 HTML코드를 넣어야해서 불편해서 등장
- 자바 언어 기반으로 동적 웹페이지를 구축할 수 있는 Server-Side Script언어(자바 Servlet기반)  
- Servlet과 반대로 HTML문서 안에 필요할 때만 자바코드가 들어감
(<% %> 이용함)  

5. JSP엔진(JSP Container)  
-Web Server가 JSP를 처리하기 위해 필요한 Container  
ex) Apache Tomcat  

6. JSP 처리과정  
1) client가 URL을 통해 JSP페이지 요청  
2) Servlet 컨테이너가 JSP페이지를 검색  
3) 자바파일로 컴파일후  
4) 서블릿객체 생성  
5) 서블릿 컨테이너에 로딩되어 실행  
6) 웹서버를 통해 응답  
