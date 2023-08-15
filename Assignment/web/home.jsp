<%-- 
    Document   : home
    Created on : Feb 21, 2023, 8:16:33 PM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>FPT University Academic Portal</title>
        <link href="CSS/home.css" rel="stylesheet" type="text/css"/>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
              rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
              crossorigin="anonymous">
        <style>
            body{
                background-image: url("images/background.png");
                background-repeat: no-repeat;
                background-size: cover;
            }
            .containerAll{
                margin: auto;
                margin-top: 7%;
                width: 60%;
                height: 80%;
                background-image: url("images/bglogin.png");
                background-repeat: no-repeat;
                background-size: cover;
            }



            #none {
                display: none;
            }


        </style>
    </head>


    <body>
        <%
       //nhan ket qua tra ve tu server
        
          String select="";
          if(request.getAttribute("select")!=null)
          select=(String)request.getAttribute("select");
          
          
          String r="";
          if(request.getAttribute("r")!=null)
          r=(String)request.getAttribute("r");
//          out.print(request.getAttribute("r"));
          
        %>


        <div class="containerAll">
            <table>
                <tbody>
                    <tr class="row main">

                        <td class="col">
                            <div class="left-main" id="item">
                                <%@include file="Campus.jsp" %>
                            </div>
                        </td>
                        <td class="col">
                            <form id="login" action="login" method="post">
                                <div class="right-main" id="item"> 
                                    <input id="none" type="text" value="<%=select%>" name="select" >
                                    <%@include file="Login.jsp" %>
                                </div>
                            </form>
                        </td>
                    </tr>
                </tbody>
            </table>



        </div>

        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js"
                integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" 
        crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" 
                integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13"
        crossorigin="anonymous"></script>
    </body>

</html>
