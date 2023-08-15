<%-- 
    Document   : Comment
    Created on : Feb 25, 2023, 11:15:05 PM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <div class="container">
            <header>
                <div>
                    <%@include file="header.jsp" %>
                </div>
                <div style="display: flex"> 
                    <div>
                        <a href="login?gmail=${a.getGmail()}&mod=1">Home</a> |
                        <a href="myfap?gmail=${a.getGmail()}&mod=1">Student Feedback</a> |
                        Edit comment feedback
                    </div><!-- comment -->


                    <div style="margin-left:150px ">

                        <a href='userdetail?gmail=${a.getGmail()}'>${a.getDisplayname()}</a>
                        <a href="logout">
                            <span>logout</span>
                        </a> |
                        <span>
                            CAMPUS: FPTU-Hòa Lạc
                        </span>
                    </div>

                </div>

            </header>
            <div>
                <table>
                    <tbody>



                        <tr>
                            <td>
                                <div>
                                    <!--<form action="editcomment" method="post">-->
                                    <form action="comment" method="post">
                                        <input style="display: none" type="text" name="stdid" value="${f.getStdid()}">
                                        <input style="display: none" type="text" name="gid" value="${f.getGid()}">

                                        <div style="color: red">${msg}</div>
                                        <h2>Edit Comment</h2>
                                        Comment: <textarea rows="5" cols="70" name="comment">${f.getDetail()}</textarea>
                                        <br>
                                        <input type="submit" name="submit"  value="Edit comment" >
                                    </form>


                                </div>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <table class="fooster"> 
                                    <%@include file="fooster.jsp" %>
                                </table>
                            </td>

                        </tr>
                    </tbody>
                </table>
            </div>
        </div>



    </body>
</html>
