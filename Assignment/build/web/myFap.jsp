<%-- 
    Document   : myFap
    Created on : Mar 5, 2023, 2:55:07 PM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            body{
                text-align: center;
                background-image: url(images/bgLogin.jpeg);
                background-repeat: no-repeat;
                background-size: cover;
            }
            .container div{
                margin: 50px;
            }

            input{
                width: 300px;
                height: 100px;
                font-size: 30px;
                border: none;
                background: blue;
                color: white;
                cursor: pointer;
            }

            input:hover{
                background: green;
            }
            
            .getIf {
                display: none ;
                 
            }
            .getStdid{
                display: none ;
             } 
             
             .getlecturer{
                display: none;
             }

        </style>
    </head>
    <body>
        <form action="myfap" method="post">
            
            <!--student-->
            <input  class="getIf" type="text" name="if" value="${a.getGmail()}">          
            <input class="getStdid" type="text" name="stdid" value="${a.getStdid()}">
            <!--Lecturer-->
            <input class="getIf" type="text" name="iflecturer" value="${l.getGmail()}">
            <input class=getlecturer type="text" name="lid" value="${l.getLid()}">
            
            
            
            <div class="container">
                <div class="feedback">
                    
                    <input type="submit" name="op1" value="FEEDBACK">                   
                </div>

                <div class="QvaA">
                     
                    <input type="submit" name="op1" value="QandA">

                </div>
<!--                <div class="Attandence">
                     <input class="getIf" type="text" name="if" value="${a.getGmail()}">
                    <input type="submit" name="op3" value="Attandence">

                </div>-->

            </div>
        </form>


    </body>
</html>
