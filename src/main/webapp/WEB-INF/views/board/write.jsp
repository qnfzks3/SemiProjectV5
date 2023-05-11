<%@ page pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<c:if test="${empty sessionScope.UID}"> <%--만약 sessionScope이 비었다면 = uid 가 비어있다면 - 로그인이 안되어있다면--%>
    <script>location.href="/";</script>   <%--처음페이지로 이동하도록(write페이지 못 이용하도록)--%>
</c:if>


<div id="main">
    <script src="https://www.google.com/recaptcha/api.js"></script>  <%--recaptcha 쓰기위해 써줘야한다.--%>


    <div class="mt-5">
        <i class="fa-solid fa-pen-to-square fa-2xl"> 게시판 </i>
        <hr>
    </div>

    <div class="row mt-5">
        <div class="row offset-2 col-4">   <%--반반 나눠준다. col-4--%>
            <h5><i class="fa fa-plus-circle"></i>새글쓰기</h5>
        </div>

        <div class="col-4 text-end">        <%--   <i class="fa fa-list"></i> 아이콘  --%>
            <button type="button" class="btn btn-light">
                <i class="fa fa-list"></i>목록으로</button>
        </div>


        <div class="row mt-2 offset-2 col-8">
            <form class="card card-body bg-light" name="bdfrm" id="bdfrm">  <%--본문 내용 form으로--%>

                <div class="row"> <%--제목란--%>
                    <label class="col-3 form-label text-danger text-end" for="title">제목</label>
                    <div class="col-6">
                        <input type="text" name="title" id="title" class="form-control border-danger">
                    </div>
                </div>



                <div class="row mt-2">
                    <label class="col-3 col-form-label text-danger text-end" for="userid">작성자</label>
                    <div class="col-6">
                        <input type="text" name="userid" id="userid" class="form-control border-danger bg-light"
                               value="abc123" readonly>
                    </div>
                </div>


                <div class="row mt-2">
                    <label class="col-3 col-form-label text-danger text-end" for="content">본문 내용</label>
                    <div class="col-6">
                        <textarea name="content" id="content" class="form-control border-danger" rows="15"></textarea>
                            <%--rows 는  쓸수 있는 줄수 name을 만약 잘못쓰면 js,model에서 가져올때 name으로 가져오기때문에 오류가 난다.--%>
                    </div>
                </div>



                <div class="row mt-2">
                    <label class="col-3 col-form-label text-danger text-end" for="g-recaptcha">자동입력 방지</label>
                    <div class="col-6">
                        <div class="g-recaptcha" data-sitekey="6LdB4OskAAAAAJHQbds3wgd3wxTf0hCWk18sBQ-d"></div>
                        <input type="hidden" name="grecaptcha" id="g-recaptcha">

                    </div>
                </div>




                <div class="row mt-4 justify-content-center">
                    <hr class="w-75 text-center">
                    <div class="col-6 ">
                    <button type="button" id="writebtn" class="btn btn-primary">
                        <i class="fa fa-check"></i> 입력완료
                    </button>

                    <button type="button" id="cancelbtn" class="btn btn-danger">
                        <i class="fa fa-remove"></i> 입력취소
                    </button>

                    </div>

                </div>






            </form>

        </div>




    </div>




</div>

<script src="/assets/js/board.js"></script>
