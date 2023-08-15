<%-- 
    Document   : LecturerFeedback
    Created on : Mar 7, 2023, 7:42:46 PM
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
/*            table {
                border: 1px solid black;
            }
            
            td {
                border-bottom: 1px black double;
            }*/
            
        </style>
    </head>
    <body>
        <div class="container">
            <div class="header">
                <%@include file="header.jsp" %>
            </div>
            <div style="display: flex"> 
                <b>Lecturer See Feedback</b>  
                <div style="margin-left: 100px">
                    <a href='userdetail?gmail-l=${l.getGmail()}'> 
                        <span>${l.getDisplayname()}</span>
                    </a>                            
                    | 
                    <a href="logout">
                        <span>logout</span>
                    </a> |
                    <span>
                        CAMPUS: FPTU-Hòa Lạc
                    </span>
                </div>

            </div>


            <div>
                <table Cellspacing="0" style="margin: 30px 0;" border="1">
                    <tr>
                        <!--<td>fbid</td>-->
                        <td>Group Name</td>
                        <td>Listfb1</td>
                        <td>Listfb2</td>
                        <td>Listfb3</td>
                        <td>Listfb4</td>
                        <td>Listfb5</td>
                        <td>GPA</td>
                        <td>Comment Of Student</td>

                    </tr>
                    <c:set var="allGPA"></c:set>
                    <c:forEach items="${data}" var="item">
                        <c:forEach items="${retake}" var="retake">
                            <c:if test="${item.getFbid() == retake.getFbid()}">
                                <tr>
                                    <!--<td>${item.getFbid()}</td>-->
                                    <td>${item.getGroupname()}</td> 
                                    <td>${retake.getListfb1()}</td>
                                    <td>${retake.getListfb2()}</td>
                                    <td>${retake.getListfb3()}</td>
                                    <td>${retake.getListfb4()}</td>
                                    <td>${retake.getListfb5()}</td>
                                    <td>${(retake.getListfb1()+retake.getListfb2()+retake.getListfb3()
                                          +retake.getListfb4()+ retake.getListfb5())/5} </td>                                 
                                    <td>${item.getDetail()}</td>                           
                                    
                                </tr>
                                
                            </c:if>
                        </c:forEach>
                    </c:forEach>
                </table>


                GPA = ${gpa}


            </div>

            <div class="fooster">
                <%@include file="fooster.jsp" %>
            </div>
        </div>
    </body>
</html>
