<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script src = " http://code.jquery.com/jquery-1.11.0.min.js"></script>



<script></script>
</head>
<body>

<form action="login.do" method="post">
	email<input type="text" id="email" name="email"><br>
	pwd<input type="text" id="pwd" name="pwd"><br>
	lat<input type="text" id="lat" name="lat"><br>
	lon<input type="text" id="lon" name="lon">
	<button>로그인</button>
</form>


<form action="register.do" method="post">
	이멜<input type="text" id="email" name="email"><br>
	비번<input type="text" id="pwd" name="pwd">
	성<input type="text" id="gender" name="gender">
	나이<input type="text" id="age" name="age">
	이름<input type="text" id="name" name="name">
	<button>회원가입</button>
</form>

<form method="post" action="registerContents.do" enctype="multipart/form-data">
    <input type="file" name="img" id="img">
    Pdix<input type="text" id="pidx" name="pidx">
    date<input type="text" id="dt" name="dt">

	udix<input type="text" id="uidx" name="uidx">
	lat<input type="text" id="lat" name="lat">
	lon<input type="text" id="lon" name="lon">
	cmt<input type="text" id="cmt" name="cmt">
	<button>올리기</button>
</form>


<form action="heartupdate.do" method="POST">
	pidx<input type="text" id="pidx" name="pidx">
	uidx<input type="text" id="uidx" name="uidx">
	<input type="hidden" value='false' id="dt" name="dt">
	
	조아용<input type="text" id="heart" name="heart">
	<button>조아용</button>
</form>


<h1>reply</h1>
<form action="registerReply.do" method="POST">
	pidx<input type="text" id="pidx" name="pidx">
	uidx<input type="text" id="uidx" name="uidx">
	reply<input type="text" id="reply" name="reply">
	
	<button>SUBMIT</button>
</form>

<h1>reply view</h1>
<form action="replyView.do" method="POST">
	pidx<input type="text" id="pidx" name="pidx">
	<button>SUBMIT</button>
</form>




<%-- 

<c:choose>
	<c:when test="${center !=null }">
		<jsp:include page="center/${center }.jsp"></jsp:include>
	</c:when>
	<c:otherwise>
		<jsp:include page="login.jsp"></jsp:include>
	</c:otherwise>
</c:choose>

 --%>
 
 <form action="mainView.do" method="POST">
 	lat<input type="text" id="lat" name="lat" ><br> 
	lon<input type="text" id="lon" name="lon" ><br> 
 	page<input type="text" id="page" name="page" ><br>
 	<input type="submit" value=" 제출">
 </form>

 
</body>

<script>


<<<<<<< HEAD
=======
/* $(document).ready(function(){  
	
	$.ajax({
		url:'yw.do',
		success:function(data){
			alert(data)
		},
		error:function(){
			alert("fail")
		}		
	}); 
	
}); */

>>>>>>> 474dc5e7526474220ab7d49608c5ae51e7c919e2
</script>
</html>