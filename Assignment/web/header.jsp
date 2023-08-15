<%-- 
    Document   : header
    Created on : Feb 25, 2023, 1:58:07 PM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            .header {
                display: flex;
            }
            .flex{
                margin-left: 200px; 
            }
            .images {
                display: flex;
/*                margin-left: 20%;*/
            }
            
            img{
                margin-right: 20px;
                border-radius: 2px;
            }
            
        </style>
            
            
    </head>
    <body>
        <div class="header">
            <div >
               <h1>FPT University Academic Portal</h1> 
            </div>
            
            <div class="flex">
                <b>FAP mobile app (myFAP) is ready at</b>
                <div class="images">
                    <img src="images/ios.png" width="120px" height="50px" alt=""/>

                    <img src="images/chplay.png" width="120px" height="50px" alt=""/>
                </div>  
            </div>
                
            </div>
    </body>
</html>
