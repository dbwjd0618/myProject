<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- header 선언 -->
<%@ include file="/WEB-INF/views/common/header.jsp"%>
<!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css"> -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

<style>
  .create{
    margin: -34px 0px;
    float: right;
    color: black;
    border: none;
	background-color: white;
  }

  .create:hover{
    cursor: pointer;
    color: #3b4eda;
  }
  
  .modal-title{
  	float:left;
  }
  
  .modal-header{
  	background-color: #fff6da;
  }
  .btn-lg{
  	float:right;
  }
</style>

<div class="ftco-blocks-cover-1">
	<div class="site-section-cover half-bg">
		<div class="container">
			<div class="row align-items-center justify-content-center">
				<div class="col-lg-8">
					<h1 class="mb-5 text-primary font-weight-bold" data-aos="fade-up">Here is <span>${param.boardCode}</span> Gallary.</h1>
				</div>
			</div>
		</div>
	</div>
</div>

<div class="site-section">
	<div class="container">
		<h2>Yujeong's</h2>
		<!-- 글쓰기 시작 -->
		<button type="button" class="create" data-toggle="modal" 
				data-target="#myModal">글쓰기</button>
				
		<!-- Modal -->
		<div class="modal fade" id="myModal" role="dialog">
			<div class="modal-dialog modal-lg">
			
			<!-- Modal content -->
			<div class="modal-content">
				<div class="modal-header">
					<h4 class="modal-title">Gallary Write</h4>
					<button type="button" class="close" data-dismiss="modal">&times;</button>
				</div>
				<div class="modal-body">
					<form action="">
						<table style="width:100%; margin: 10px 20px;" >
							<tr>
								<td>제목</td>
								<td><input type="text" name="postTitle" style="width:90%;" placeholder="제목을 입력하세요"/></td>
							</tr>
							<tr>
								<td>첨부파일</td>
								<td><input type="file" name="originFilename" /></td>
							</tr>
							<tr>
								<td></td>
								<td><button type="button" id="addFile">파일추가</button></td>
							</tr>
							<tr>
								<td>내용</td>
								<td><textarea name="content" id="textarea" cols="86" rows="10" placeholder="내용을 입력하세요"></textarea></td>
							</tr>
						</table>
						<button type="button" class="btn btn-warning btn-lg">완료</button>
					</form>
				</div>
			</div>
			
			</div>
		</div>
  		<!-- 글쓰기 끝 -->
  
		<div class="row">
			<div class="col-lg-4 col-md-6 mb-4">
				<div class="post-entry-1 h-100">
					<a href="view.html"> <img src="${pageContext.request.contextPath }/resources/images/img_1.jpg" alt="Image"
						class="img-fluid">
					</a>
					<div class="post-entry-1-contents">

						<h2>
							<a href="view.html">여기가 제목이 될거에융</a>
						</h2>
						<span class="meta d-inline-block mb-3">July 17, 2019 <span
							class="mx-2">by</span> <a href="#">Admin</a></span>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.
							Dolores eos soluta, dolore harum molestias consectetur.</p>
					</div>
				</div>
			</div>

			<div class="col-lg-4 col-md-6 mb-4">
				<div class="post-entry-1 h-100">
					<a href="view.html"> <img src="${pageContext.request.contextPath }/resources/images/img_2.jpg" alt="Image"
						class="img-fluid">
					</a>
					<div class="post-entry-1-contents">

						<h2>
							<a href="view.html">Lorem ipsum dolor sit amet</a>
						</h2>
						<span class="meta d-inline-block mb-3">July 17, 2019 <span
							class="mx-2">by</span> <a href="#">Admin</a></span>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.
							Dolores eos soluta, dolore harum molestias consectetur.</p>
					</div>
				</div>
			</div>


			<div class="col-lg-4 col-md-6 mb-4">
				<div class="post-entry-1 h-100">
					<a href="view.html"> <img src="${pageContext.request.contextPath }/resources/images/img_3.jpg" alt="Image"
						class="img-fluid">
					</a>
					<div class="post-entry-1-contents">

						<h2>
							<a href="view.html">Lorem ipsum dolor sit amet</a>
						</h2>
						<span class="meta d-inline-block mb-3">July 17, 2019 <span
							class="mx-2">by</span> <a href="#">Admin</a></span>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.
							Dolores eos soluta, dolore harum molestias consectetur.</p>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

<div class="site-section">
	<div class="container">
		<h2>Member's</h2>
		<!-- 글쓰기 시작 -->
		<button type="button" class="create" data-toggle="modal" 
				data-target="#myModal">글쓰기</button>
				
		<!-- Modal -->
		<div class="modal fade" id="myModal" role="dialog">
			<div class="modal-dialog modal-lg">
			
			<!-- Modal content -->
			<div class="modal-content">
				<div class="modal-header">
					<h4 class="modal-title">Gallary Write</h4>
					<button type="button" class="close" data-dismiss="modal">&times;</button>
				</div>
				<div class="modal-body">
					<form action="">
						<table style="width:100%; margin: 10px 20px;" >
							<tr>
								<td>제목</td>
								<td><input type="text" name="postTitle" style="width:90%;" placeholder="제목을 입력하세요"/></td>
							</tr>
							<tr>
								<td>첨부파일</td>
								<td><input type="file" name="originFilename" /></td>
							</tr>
							<tr>
								<td></td>
								<td><button type="button" id="addFile">파일추가</button></td>
							</tr>
							<tr>
								<td>내용</td>
								<td><textarea name="content" id="textarea" cols="86" rows="10" placeholder="내용을 입력하세요"></textarea></td>
							</tr>
						</table>
						<button type="button" class="btn btn-warning btn-lg">완료</button>
					</form>
				</div>
			</div>
			
			</div>
		</div>
  		<!-- 글쓰기 끝 -->
		
		
		
		<div class="row">
			<div class="col-lg-4 col-md-6 mb-4">
				<div class="post-entry-1 h-100">
					<a href="view.html"> <img src="${pageContext.request.contextPath }/resources/images/img_1.jpg" alt="Image"
						class="img-fluid">
					</a>
					<div class="post-entry-1-contents">

						<h2>
							<a href="view.html">Lorem ipsum dolor sit amet</a>
						</h2>
						<span class="meta d-inline-block mb-3">July 17, 2019 <span
							class="mx-2">by</span> <a href="#">Admin</a></span>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.
							Dolores eos soluta, dolore harum molestias consectetur.</p>
					</div>
				</div>
			</div>
			<div class="col-lg-4 col-md-6 mb-4">
				<div class="post-entry-1 h-100">
					<a href="view.html"> <img src="${pageContext.request.contextPath }/resources/images/img_2.jpg" alt="Image"
						class="img-fluid">
					</a>
					<div class="post-entry-1-contents">

						<h2>
							<a href="view.html">Lorem ipsum dolor sit amet</a>
						</h2>
						<span class="meta d-inline-block mb-3">July 17, 2019 <span
							class="mx-2">by</span> <a href="#">Admin</a></span>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.
							Dolores eos soluta, dolore harum molestias consectetur.</p>
					</div>
				</div>
			</div>

			<div class="col-lg-4 col-md-6 mb-4">
				<div class="post-entry-1 h-100">
					<a href="view.html"> <img src="${pageContext.request.contextPath }/resources/images/img_3.jpg" alt="Image"
						class="img-fluid">
					</a>
					<div class="post-entry-1-contents">

						<h2>
							<a href="view.html">Lorem ipsum dolor sit amet</a>
						</h2>
						<span class="meta d-inline-block mb-3">July 17, 2019 <span
							class="mx-2">by</span> <a href="#">Admin</a></span>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.
							Dolores eos soluta, dolore harum molestias consectetur.</p>
					</div>
				</div>
			</div>
		</div>
	</div>

</div>

<!-- footer 선언 -->
<%@ include file="/WEB-INF/views/common/footer.jsp"%>