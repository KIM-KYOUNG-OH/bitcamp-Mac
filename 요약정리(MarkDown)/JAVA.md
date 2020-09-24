# JAVA
#### - 문자열을 Date타입으로 변환하는 방법  
  ``` java    
  String birth = "1999-09-09";
  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
  Date birthday = null;
  try {
    birthday = sdf.parse(birth);
  } catch (ParseException e1) {
    e1.printStackTrace();
  }  
  ```  
