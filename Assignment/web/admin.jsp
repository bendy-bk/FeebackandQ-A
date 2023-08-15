<%-- 
    Document   : admin
    Created on : Mar 13, 2023, 6:26:42 PM
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
            <form action="admin" method="get">
                Gmail: <input type="text" name="gmail" value="">
                <br>Password: <input type="text" name="password" value="">
                <br>Student id: <input type="text" name="stdid" value="">
                <br>Account ID: <input type="text" name="accid" value="">
                <br>Display Name: <input type="text" name="displayname" value="">
                
                
                
                <br>Student Name: <input type="text" name="stdname" value="">
                <br>Phone: <input type="text" name="phone" value="">
                <br>MSV: <input type="text" name="msv" value="">
                
                <input type="submit" name="addStudent" value="ADD">
                
                
                
            </form>
        </div>
    </body>
</html>
