<%-- 
    Document   : Login
    Created on : Feb 15, 2023, 4:39:26 PM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <!--<form id="login" action="home" method="post">-->
    <big class="login"> Sign in </big>
    <br>

    <div class="buttom">
        <table>
            <tr>
                <td style="color: floralwhite; font-size: 22px;">Account:</td>
                <td><input type="email"  name="gmail" required><br></td>
            </tr>
            <tr>
                <td style="color: floralwhite; font-size: 22px;">Password:</td>
                <td><input type="password"  name="password" required><br></td>
            </tr>

        </table>

    </div>

    <div class="cooki">
        <div style="color: floralwhite; font-size: 15px">
            <input type="checkbox" id="remember" name="remember" >
            Remember
        </div >
        
    </div>

    <div class="submit">                    
        <input type="submit" name="submit" value="Login"><br>
    </div>

    <div class="other">
        <a href="forgotpassword.jsp">
            <p style="color: floralwhite; font-size: 10px;">Forgot password?</p>

        </a>
        <!--  <p>Sign up</p>-->
    </div>

    <!--</form>-->
</body>
</html>
