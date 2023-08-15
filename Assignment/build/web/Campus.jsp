<%-- 
    Document   : Campus
    Created on : Feb 28, 2023, 11:46:25 PM
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
        
        <div class="">

            <form id="campus" action="home" method="get">
                <table class="">
                    <tr class="">

                    <select name="select" onchange="Change()"> 

                        <% 
                
                       if(select.equals("1")){
                          out.print("<option  value='0'>Select Campus</option>");
                          out.print("<option  value='1' selected>FU Hòa Lạc</option>");
                          out.print("<option value='2'>FU Hồ Chí Minh</option>");
                          out.print("<option value='3'>FU Quy Nhơn</option>");
                          out.print("<option value='4'>FU Đà Nẵng</option>");
                          out.print("<option value='5'>FU Cần Thơ</option>");
                           }
                           else if(select.equals("2")){
                          out.print("<option  value='0'>Select Campus</option>");
                          out.print("<option  value='1'>FU Hòa Lạc</option>");
                          out.print("<option value='2' selected>FU Hồ Chí Minh</option>");
                          out.print("<option value='3'>FU Quy Nhơn</option>");
                          out.print("<option value='4'>FU Đà Nẵng</option>");
                          out.print("<option value='5'>FU Cần Thơ</option>");
                           }
                           else if(select.equals("3")){
                          out.print("<option  value='0'>Select Campus</option>");
                          out.print("<option  value='1'>FU Hòa Lạc</option>");
                          out.print("<option value='2'>FU Hồ Chí Minh</option>");
                          out.print("<option value='3' selected>FU Quy Nhơn</option>");
                          out.print("<option value='4'>FU Đà Nẵng</option>");
                          out.print("<option value='5'>FU Cần Thơ</option>");
                           }
                           else if(select.equals("4")){
                          out.print("<option value='0'>Select Campus</option>");
                          out.print("<option value='1'>FU Hòa Lạc</option>");
                          out.print("<option value='2'>FU Hồ Chí Minh</option>");
                          out.print("<option value='3'>FU Quy Nhơn</option>");
                          out.print("<option value='4'  selected>FU Đà Nẵng</option>");
                          out.print("<option value='5'>FU Cần Thơ</option>");
                           }
                    
                           else if(select.equals("5")){
                          out.print("<option value='0' >Select Campus</option>");
                          out.print("<option value='1'>FU Hòa Lạc</option>");
                          out.print("<option value='2'>FU Hồ Chí Minh</option>");
                          out.print("<option value='3'>FU Quy Nhơn</option>");
                          out.print("<option value='4'>FU Đà Nẵng</option>");
                          out.print("<option value='5' selected>FU Cần Thơ</option>");                    
                              
                          } else {
                          out.print("<option  value='0' selected>Select Campus</option>");
                          out.print("<option value='1'>FU Hòa Lạc</option>");
                          out.print("<option value='2'>FU Hồ Chí Minh</option>");
                          out.print("<option value='3'>FU Quy Nhơn</option>");
                          out.print("<option value='4'>FU Đà Nẵng</option>");
                          out.print("<option value='5'>FU Cần Thơ</option>");   
                              
                          }                        
                        %>

                    </select>
                    </tr>
                    <br>

                    <div class="images"><%=r%></div>


                </table>


            </form>

        </div>  

    </body>
    <script>
        function Change() {
            document.getElementById("campus").submit();
        }
    </script>
</html>
