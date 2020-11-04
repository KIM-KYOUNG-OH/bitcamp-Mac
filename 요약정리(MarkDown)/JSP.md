# JSP  
## 1. 탄생 배경  

### 1-1. 서버와 클라이언트  
client와 server간에 요청과 응답반복  

### 1-2. CGI(Common Gateway Interface) 프로그램  
- 웹 서버 안에서 동적인 웹페이지를 요청받을 때마다 실행처리됨  

### 1-3. servlet  
- 자바를 서버쪽에 사용하는 기술 중 하나  
- 클라이언트 요청마다 실행되는 CGI와는 다르게 스레드로 각 요청을 서비스  
- 이식성이 좋다(= 플랫폼의 종류에 상관없이 실행가능)  

## 2. JSP(JavaServer Pages)  
- 서블릿은 자바언어안에 HTML코드를 넣어야해서 불편해서 등장
- 자바 언어 기반으로 동적 웹페이지를 구축할 수 있는 Server-Side Script언어(자바 Servlet기반)  
- Servlet과 반대로 HTML문서 안에 필요할 때만 자바코드가 들어감
(<% %> 이용함)  

### 2-1. JSP엔진(JSP Container)  
-Web Server가 JSP를 처리하기 위해 필요한 Container  
ex) Apache Tomcat  

### 2-2. JSP 처리과정  
1) client가 URL을 통해 JSP페이지 요청  
2) Servlet 컨테이너가 JSP페이지를 검색  
3) 자바파일로 컴파일후  
4) 서블릿객체 생성  
5) 서블릿 컨테이너에 로딩되어 실행  
6) 웹서버를 통해 응답  

## 3. JSP 구성요소  
- Directive  
- 스크립트: scriptlet, 표현식, 선언부  
- 표현언어  
- 기본객체(Implicit Object)  
- 정적 데이터  
- 액션태그  
- 커스텀태그, 표준 태그 라이브러리(JSTL)  

## 3-1. 디렉티브(Directive)  
JSP 페이지에 대한 설정정보 지정 때 사용됨
- <%@ %>
- page, taglib, include  

## 3-2. 스크립트  
JSP에서 문서내용을 동적으로 생성하기 위해 사용되는 것  
- 표현식(Expression): 값 출력  
- Scriptlet: 자바코드실행  
- 선언부(Declaration): 자바 메서드를 만듬  

## 3-3. 기본객체(Implicit Object)  
웹 어플리케이션 프로그래밍을 하는데 필요한 기능 제공  
ex) request, response, session, application, page....  

## 3-4. 표현 언어  
'${'와 '}'사이에 정해진 문법을 따르는 식을 사용함으로서 복잡한 코드를 간결하게 줄일 수 있다.  

## 3-5. 표준 액션태그와 태그라이브러리
표준 액션태그 : <jsp:액션태그이름>  
태그라이브러리 : 자주 사용하는 커스텀태그를 모아 표준화한 것(JSTL: JavaServer Pages Standard Tag Library)  





















