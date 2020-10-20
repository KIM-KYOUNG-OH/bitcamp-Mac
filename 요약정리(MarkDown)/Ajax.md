# Ajax(Asynchronous JavaScript And XML)  
XMLHttpRequest객체를 사용하여 비동기적 페이지 업데이트 작업을 수행하는 것  
## 1. XMLHttpRequest 객체
- 웹서버와 데이터 교환에 사용
- 웹페이지 전체를 다시 로드하지 않고 웹페이지 일부만 업데이트할 수 있음
### 1-1. open(), send()  
- 서버에 요청을 보냄  
```javascript  
var xhttp = new XMLHttpRequest();
xhttp.open("GET", "ajax_info.txt", true); //("GET" or "POST", file location, async 비동기 or 동기)
xhttp.send();
```  
### 1-2. onreadystatechange 속성  
- onreadystatechange 함수는 readyState가 변경될 때마다 호출된다.  
- readyState는 XMLHttpRequest의 상태를 가진다  
### 1-3. redayState  
0: request not initialized  
1: server connection established  
2: request received  
3: processing request  
4: request finished and response is ready  
### 1-4. status  
200: "OK"  
403: "Forbidden"  
404: "Page not found"  
### 1-5. responseText  
서버 응답을 js문자열로 반환  
### 1-6. responseXML  
서버 응답을 XML DOM객체로 반환  
## 2. 예시  
```javascript
function loadDoc() {
  var xhttp = new XMLHttpRequest();
  xhttp.onreadystatechange = function() {
    if (this.readyState == 4 && this.status == 200) {
    myFunction(this);
    }
  };
  xhttp.open("GET", "cd_catalog.xml", true);
  xhttp.send();
}
function myFunction(xml) {
  var i;
  var xmlDoc = xml.responseXML;
  var table="<tr><th>Artist</th><th>Title</th></tr>";
  var x = xmlDoc.getElementsByTagName("CD");
  for (i = 0; i <x.length; i++) {
    table += "<tr><td>" +
    x[i].getElementsByTagName("ARTIST")[0].childNodes[0].nodeValue +
    "</td><td>" +
    x[i].getElementsByTagName("TITLE")[0].childNodes[0].nodeValue +
    "</td></tr>";
  }
  document.getElementById("demo").innerHTML = table;
}
```  

