<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<!-- 부트스트랩 css -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<link rel="stylesheet" href="css/style.css">
<script src="https://kit.fontawesome.com/0ffbbfb20c.js" crossorigin="anonymous"></script>
<meta charset="UTF-8">

<!-- 부트스트랩 js -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
	crossorigin="anonymous"></script>
<script type="js/main.js"></script>
<script type="text/javascript" src="https://static.nid.naver.com/js/naverLogin_implicit-1.0.3.js" charset="utf-8"></script>
<title>로그인</title>

<style>
.login {
padding : 100px 0 100px 0;
}
.BreadCrumb {
padding : 30px 0 0 40px;
font-size: 1.2rem;
}
.uId {
margin : 0 10px 10px 0;
}
.uPw {
margin : 0 10px 20px 0;
}
.loginbutton {
margin : 0 10px 20px 10px;
}
#naver_id_login {
margin : 10px 0 20px 0;
}
</style>
</head>

<body>
<% String uId = null; 
	if(session.getAttribute("uId") != null){
		uId = (String)session.getAttribute("uId"); } %>
	<!-- Header start -->
	<header id="Top">
		<nav class="navbar navbar-light " style="background-color: #BBBBBB;">
			<div class="container-fluid">
				<a class="navbar-brand" href="mainpage.jsp"><img src="image/homepageIcon.png" style="padding:5px 0 5px 20px;"></a>
				<nav class="navbar navbar-light bg-#BBBBBB">
					<div class="container-fluid" >
						<form class="d-flex" action="searchallCategory.do">
							<input class="form-control form-outline-secondary me-3" type="text" name="content"
								placeholder="상품이름을 검색하세요." aria-label="Search" >
							<button class="btn btn-outline-secondary" type="submit" ><i class="fa-solid fa-magnifying-glass"></i></button>
						</form>
					</div>
				</nav>
				<% 
				if(uId == null){ %>
				<a class="nav-link" href="login.do" style="color:white;">로그인 <i class="fa-solid fa-right-to-bracket"></i></a>
				<%
			} else{
		%> 
				<a class="nav-link" href="logout.do" style="color:white;">로그아웃 <i class="fa-solid fa-right-from-bracket"></i></a>
		<%
				}
			%> 
				<a class="nav-link" href="adduser.do" style="color:white;">회원가입 <i class="fa-solid fa-user-plus"></i></a>
				<a class="nav-link" href="wishlist.do" style="color:white;">장바구니 <i class="fa-solid fa-bag-shopping"></i></a> 
				<a class="nav-link" href="mpInformation.do" style="color:white;">마이페이지 <i class="fa-solid fa-circle-user"></i></a>
				<a class="nav-link" href="orderpageCategory.do" style="color:white;">주문조회 <i class="fa-solid fa-circle-user"></i></a>
				<a class="nav-link" href="serviceCenter.do" style="color:white;">고객센터 <i class="fa-solid fa-house-user"></i></a>
				
				<button class="navbar-toggler" type="button"
					data-bs-toggle="collapse" data-bs-target="#navbarScroll"
					aria-controls="navbarScroll" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
			</div>
			<div class="container-fluid" style="background-color: #EEEEEE;">
				<div class="collapse navbar-collapse" id="navbarScroll">
					<ul class="navbar-nav me-auto my-2 my-lg-0 navbar-nav-scroll"
						style="-bs-scroll-height: 50px;">
						<li class="nav-item"><a class="nav-link active"
							aria-current="page" href="mainpage.do">Home</a></li>
						<li class="nav-item dropdown"><a
							class="nav-link dropdown-toggle" href="#"
							id="navbarScrollingDropdown" role="button"
							data-bs-toggle="dropdown" aria-expanded="false"> 전체 카테고리 </a>
							<ul class="dropdown-menu"
								aria-labelledby="navbarScrollingDropdown">
								<li><a class="dropdown-item" href="allCategory.do"> 상품 전체보기</a></li>
								<li><hr class="dropdown-divider"></li>
								<li><a class="dropdown-item" href="studentCategory.do"> 학생용 의자</a></li>
								<li><hr class="dropdown-divider"></li>
								<li><a class="dropdown-item" href="officeCategory.do"> 사무용 의자</a></li>
								<li><hr class="dropdown-divider"></li>
								<li><a class="dropdown-item" href="interiorCategory.do"> 인테리어 의자 </a></li>
								<li><hr class="dropdown-divider"></li>
								<li><a class="dropdown-item" href="stoolCategory.do"> 스툴 / 좌식의자 </a></li>
							</ul>
						</li>
						<li class="nav-item"><a class="nav-link active"
							aria-current="page" href="index.jsp"></a></li>
					</ul>
				</div>
			</div>
		</nav>
	</header>
	<!-- Header End -->
	
	<!-- Bread Crumb Start -->
	<div class = "BreadCrumb">
		<section class="breadCrumb">
			<nav aria-label="breadcrumb">
			  <ol class="breadcrumb">
			    <li class="breadcrumb-item"><a href="mainpage.jsp">Home</a></li>
			    <li class="breadcrumb-item active" aria-current="page">로그인</li>
			  </ol>
			</nav>
		</section>
	</div>
	<!-- Bread Crumb End -->
	
	<!-- 여기부터 넣으시면 됩니다 Start -->
	<div class = "login" align ="center">
	<H1>회원 로그인</H1><br><br>
	<form action="mainpage.do">
		<table>
			<tr>
				<td colspan="3"><hr class="dropdown-divider"><br><br></td>
			</tr>
			<tr>
				<td>
					<div class="uId">
						<input  class="form-control form-control-md" type="text" name="uId" placeholder="  ID">

					</div>
				</td>
				<td rowspan="2">
					<div class = "loginbutton">
						<input type="submit" class="btn btn-secondary btn-lg" value="로그인">
					</div>
				</td>
			</tr>
			<tr>
				<td>
					<div class="uPw">
						<input  class="form-control form-control-md" type="password" name="uPw" placeholder="  Password">
					</div>
				</td>
			</tr>
			<tr>
			<td colspan="3"><br><hr class="dropdown-divider"><br></td>
			</tr>
		</table>
	</form>
	  <!-- 네이버 로그인 버튼 노출 영역 -->
	  <div id="naver_id_login"></div>
	  <!-- //네이버 로그인 버튼 노출 영역 -->
	  <script type="text/javascript">
	  	var naver_id_login = new naver_id_login("o6FcncP1tGhBECam_m_E", "http://localhost:8080/Test/naver_callback.jsp");
	  	var state = naver_id_login.getUniqState();
	  	naver_id_login.setButton("", 5,50);
	  	naver_id_login.setDomain("http://localhost:8080/Test/naver_login.jsp");
	  	naver_id_login.setState(state);
	  	naver_id_login.setPopup();
	  	naver_id_login.init_naver_id_login();
	  </script>
	  <table>
	  		<tr>
				<td colspan="3"><hr class="dropdown-divider"></td>
			</tr>
		  <tr>
			  <td style="padding : 30px 10px 0 0;"><p><a href="finduser.do"><input type="button" class="btn btn-secondary" value="아이디/비밀번호 찾기"></a></p></td>
			  <td style="padding : 30px 10px 0 0;"></td>
			  <td style="padding : 30px 0 0 0;"><p><a href="adduser.do"><input type="button" class="btn btn-dark" value="회원가입"></a></p></td>
		  </tr>
	  </table>
	</div>
	<!-- End -->
	
	<!-- Footer start -->
	<footer >
		<div class="card" style="background-color: #696464; color: #E9E5DD;">
			<div class="card-body text-left mt-4" style="background-color: #696464;">
				<h3><a href="serviceCenter.do" style="text-decoration : none; color : white;">고객센터   <i class="fa-solid fa-house-user"></i></a></h3>
				<h6 class="card-title mt-3 mb-3">상담시간: 평일 09:00~17:30 (점심시간 12:00~13:00) / 주말 & 공휴일 휴무</h6><br>				
				<h1>
					<a href="facebook.com" style="text-decoration : none; color : white;"><i class="fa-brands fa-facebook"></i></a> 
					<a href="facebook.com" style="text-decoration : none; color : white;"><i class="fa-brands fa-instagram"></i></a>
					<a href="facebook.com" style="text-decoration : none; color : white;"><i class="fa-brands fa-youtube"></i></a>
					<a href="facebook.com" style="text-decoration : none; color : white;"><i class="fa-brands fa-twitter"></i></a>
				</h1>
				<br>
				<hr class="dropdown-divider"><br>
				<p class="card-text mt-4 mb-4">
				상호명 : (주) 시디즈<br>
				대표이사 : 이승민 <br>
				개인정보보호책임자 : 한수연<br>
				주소 : 서울 강동구 천호대로157길 14, 6층 (천호동, 나비빌딩)<br>
				사업자등록번호 : 156-80-12341 <br>
				사업자정보확인 통신판매업신고번호 : 제 5004-00123</p><br>
				<hr class="dropdown-divider">
			</div>
			<div class="card-body text-center">
				<p class="card-text mb-3">Copyright &copy; <script>document.write(new Date().getFullYear());</script> ALL rights reserved.</p>
			</div>
			<div class="card-footer text-center text-muted mt-2 mb-2"><br>
				<a href="#Top" class="btn btn-outline-secondary">맨 위로 가기 <i class="fa-solid fa-angles-up"></i></a>
			</div>
		</div>
	</footer>
	<!-- Footer End -->

</body>

<script type="text/javascript">
		let alertT = '<%=request.getAttribute("alertTxt")%>';
		
		if (alertT !== "null"){
		alert(alertT);	
		}
		
		</script>

</html>