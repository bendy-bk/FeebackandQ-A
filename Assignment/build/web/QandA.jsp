<%-- 
    Document   : QandA
    Created on : Mar 7, 2023, 1:12:38 PM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            .stdid {
                display: none;
            }
            .getIf {
                display:  none;
            }
        </style>
    </head>
    <body>
        <div class="container">
            <div class="header">
                <%@include file="header.jsp" %>
            </div >
            <b style="font-size: 20px"> Q&A</b> |        
            <a href='userdetail?gmail=${a.getGmail()}'> 
                <span>${a.getDisplayname()}</span>
            </a>
            | <a href="logout?">logout</a>


            <div style="color: red">${mess}</div>
            <div class="main">
                Question: <br>

                <form action="qanda" method="post">
                    <!--Question-->
                    <input  class="getIf" type="text" name="info" value="${a.getGmail()}">
                    <input class="stdid" type="text" name="studentid" value="${q.getStdid()}">

                    <textarea rows="5" cols="60" name="question" >${q.getQdetail()}</textarea>
                    <br>
                    <input type="submit" name="update" value="Update">
                    <br>
                    <br>



                    Reply: <br>

                    <textarea rows="5" cols="60" name="reply">${r}</textarea>
                    <br>
                    <input type="submit" name="reply" value="ShowReply">

                </form>

                <!--                <form action="qanda" method="get">
                                    <input  class="getIf" type="text" name="info" value="${a.getGmail()}">
                                    <input class="stdid" type="text" name="studentid" value="${q.getStdid()}">
                                    Reply: <br>
                
                                    <textarea rows="5" cols="60" name="reply">${r}</textarea>
                                    <br>
                                    <input type="submit" name="reply" value="ShowReply">
                
                                </form>-->

            </div>


            <div class="fooster">
                <%@include file="fooster.jsp" %>
            </div>
        </div>
    </body>
    <!--    <script>
            var textarea = document.getElementById("myTextarea");
            textarea.focus();
            textarea.setSelectionRange(0, 0);
        </script>-->
</html>
