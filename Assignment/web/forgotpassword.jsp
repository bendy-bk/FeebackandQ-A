<%-- 
    Document   : forgotpassword
    Created on : Mar 13, 2023, 12:43:03 PM
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
        <form action="forgotpassword" method="get" >
            <table>
                <tr>
                    <td>Gmail: </td>
                    <td><input type="text" name="gmail" value="${a.getGmail()}" required></td>
                </tr>
<!--                <tr>
                    <td>Name: </td>
                    <td><input type="text" name="name" value="" required></td>
                </tr>-->
                <tr>
                    <td>Msv: </td>
                    <td><input type="text" name="msv" value="${a.getMsv()}" required></td>
                </tr>
                <tr>
                    <td>Phone: </td>
                    <td><input type="text" name="phone" value="${a.getPhone()}" required></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" name="show" value="Show"></td>
                </tr>
                <tr>
                    <td>Password:</td>
                    <td><input type="text" name="password" value="${a.getPassword()}" readonly></td>
                </tr>
            </table>
            
            
            
            
           
        </form>
    </body>
</html>
