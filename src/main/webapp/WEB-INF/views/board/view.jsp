<%@ page pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   <%--보통 조건 만족 할때 보이게 안보이게 조정하기위해 if--%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>


<div id="main">
    <div class="mt-5">
        <i class="fa-solid fa-pen-to-square fa-2xl"> 게시판 </i>
        <hr>
    </div>

    <div class="row mt-5">

        <div class="row offset-2 col-4" >   <%--반반 나눠준다. col-4--%>
            <button type="button" class="btn btn-light col-4" id="prevbtn"><i class="fa fa-chevron-left"></i> 이전 게시물</button>
            &nbsp;
            <button type="button" class="btn btn-light col-4" id="nextbtn">다음 게시물 <i class="fa fa-chevron-right"></i></button>
        </div>

        <div class="col-4 text-end">        <%--   <i class="fa fa-list"></i> 아이콘  --%>
            <button type="button" class="btn btn-success" id="newbtn">
                <i class="fa fa-list"></i>새글쓰기</button>
        </div>


    </div>


    <div class="row mt-2 offset-2 col-8">
        <table class="table ">
            <tr>
                <th class="vtit" colspan="2"> ${bd.title} </th>
            </tr>

            <tr class="vinfo">
                <td class="text-start">${bd.userid}</td>
                <td class="text-end">${bd.regdate}/${bd.thumbs}/${bd.views}</td>
            </tr>

            <tr>
                <td class="vcont" colspan="2">
                    ${bd.content}
                </td>
            </tr>

        </table>
    </div>

    <div class="row mt-5">


        <div class="row offset-2 col-4" >   <%--반반 나눠준다. col-4--%>
            <%--로그인이 안됬거나 userid와 작성자userid가 같아야아래 실행 eq 는 같은지 여부 판단 - true false --%>
            <c:if test="${not empty sessionScope.UID and sessionScope.UID eq bd.userid}">
                <button type="button" class="btn btn-warning col-4" id="prevbtn"><i class="fa fa-pencil"></i> 수정하기</button>
            &nbsp;
                <button type="button" class="btn btn-danger col-4"  id="nextbtn"><i class="fa fa-trash-o"></i> 삭제하기</button>
            </c:if>
        </div>


        <div class="col-4 text-end">        <%--   <i class="fa fa-list"></i> 아이콘  --%>
            <button type="button" class="btn btn-light" id="listbtn">
                <i class="fa fa-list"></i>목록으로</button>
        </div>


    </div>



</div>

<script src="/assets/js/board.js"></script>
