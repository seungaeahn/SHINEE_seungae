<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<!-- �α׾ƿ� ���¿��� ó�� ���� ȭ�� -->
		<title>SHINee Music Home</title>
		<link rel="stylesheet" type="text/css" href="css/login.css">
        <link rel="stylesheet" type="text/css" href="css/all.css">
	</head>
	<body>
		<%
			//user_id ���� ������ ���
			if(session.getAttribute("user_id") != null){
		%>
			<h3>�α��� ���¿��� ���� â�� ����پ��</h3>
			<p>myplaylist �������� �ڵ� ����������</p>
		<%
			} else {
				//�α׾ƿ� ���¿��� ���� ������ ����
		%>
	        <div class="container" style="margin-top:30px;">
	            <aside>
	                <button style="margin-top: 250px;">
	                    <img src="img/mypage.png" style="width:85px; padding:0;" alt="myPage Icon">
	                    <p><strong>mypage</strong></p>
	                </button>
	                <button style="margin-top: 50px;">
	                    <img src="img/lookaround.png" style="width:85px; padding:0;" alt="lookaround Icon">
	                    <p><strong>my<br>Playlist</strong></p>
	                </button>
	                <button id="gotoSearchButton" style="margin-top: 50px;">
	                    <img src="img/pixel_search.png" style="width:85px; padding:0;" alt="Search Icon">
	                    <p><strong>search</strong></p>
	                </button>
	            </aside>
	            <section>
	                <div class="bluetop" style="margin-top:20px; width:1200px;">
	                    <p style="margin-top:5px">Update My Info</p>
	                </div>
	                <div style="width:1200px; height:30px; background-color: gray;">
	                </div>
	                <article>
	                    <div style="text-align: center; margin-top:8%">
	                        <img src="img/dino.gif" alt="���̴Ϲ��� �ΰ�" style="width:300px;">
	                    </div>
	                    <div style="text-align: center; margin-top: 20px;">
	                        <h3>�α��� �� �̿����ּ���</h3><br>
	                        <button id="gotoLoginButton" style="width: 200px; padding: 10px; background-color: blue; color:white;">�α��� �ϱ�</button><br>
	                        <button id="joinButton" style="width: 200px; padding: 10px; margin-top: 5px;">ȸ������ �ϱ�</button>
	                    </div>
	                </article>
	            </section>
	        </div><!--container-->			
		<%
			} //else (�α׾ƿ� ���¿��� ������ â)
		%>
		<script>
			//�α����ϱ� ��ư ������ �α��� â���� �̵�
			document.getElementById("gotoLoginButton").addEventListener("click",()=>{
				window.location.href = "login.jsp";
			});
			//�˻���ư ������ �˻� â���� �̵�
			document.getElementById("gotoSearchButton").addEventListener("click",()=>{
				window.location.href = "search.jsp";
			})
		</script>
	</body>
</html><%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

</body>
</html>