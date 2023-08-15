<%-- 
    Document   : LecturerReply
    Created on : Mar 8, 2023, 2:25:12 PM
    Author     : hp
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            input:focus{
                outline: none;
            }
            /*            .table{
                           border: solid black 1px; 
                        }*/

            .table td{
                border: solid black 1px;
            }
        </style>
    </head>
    <body>
        <div class="container">
            <div>
                <%@include file="header.jsp" %>

            </div>
                <div style="display: flex">
                <div style="margin-right: 100px">
                    <b style="font-size: 20px"> Reply Question</b> 
                </div>

                <div>
                    <a href='userdetail?gmail-l=${l.getGmail()}'> 
                        <span>${l.getDisplayname()}</span>
                    </a>|
                    <a href="logout">logout</a>|<span>
                        CAMPUS: FPTU-Hòa Lạc
                    </span>
                </div>
            </div>

                        <div style="color: red;">${mess}</div>

            <div>

                <table class="table">
                    <tr>
                        <td>Question</td>
                        <td>Ansewr</td>
                    </tr>
                    <c:forEach items="${data}" var="item">
                        <form action="lecturereply" method="post">
                            <tr>
                                <td>${item.getQdetail()}</td>
                                <td><input type="text" name="reply" value="${item.getAdetail()}"></td> 
                            <input style="display: none" type="text" name="mail_l" value="${l.getGmail()}">
                            <input style="display: none" type="text" name="stdid" value="${item.getStdid()}"> 

                            <td><input style="border: none;background-color: aqua" type="submit" value="Update" name="update"></td>
                            </tr> 
                        </form> 
                    </c:forEach>

                </table>


            </div>



            <div>
                <%@include file="fooster.jsp" %>
            </div>

        </div>

    </body>
</html>
