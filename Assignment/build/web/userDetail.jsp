<%-- 
    Document   : informationUser
    Created on : Mar 3, 2023, 2:10:25 AM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            .right{
                margin-left: 200px;
            }
            .fooster{
                margin-top: 5%;
            }
        </style>
    </head>
    <body>
        <div class="container">
            <header>
                <%@include file="header.jsp" %>
                <div>
                    <a href="login?gmail=${a.getGmail()}&mod=1">Home</a> |      
                    User detail
                    
                </div>
            </header>

            <h1>User detail</h1>


            <table>
                <tr>
                    <td><b>Login:</b></td>
                    <td class="right">${a.getDisplayname()}  ${l.getDisplayname()}</td>
                </tr>
                <tr>
                    <td><b>Full name:</b></td>    
                    <td class="right">${a.getStdname()} ${l.getLname()}</td>
                </tr>
                <tr>
                    <td><b>Image:</b></td>
                    <td class="right"><img src="images/userdetail.png" width="150px" height="200px"></td>
                </tr>
                <tr>
                    <td><b>Email:</b></td>
                    <td class="right">${a.getGmail()} ${l.getGmail()}</td>
                </tr>
            </table>

                <div class="fooster">
                <%@include file="fooster.jsp" %>
            </div>


        </div>



        <!---->
    </body>
</html>
