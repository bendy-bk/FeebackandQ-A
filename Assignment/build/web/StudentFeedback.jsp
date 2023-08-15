<%-- 
    Document   : StudentFeedback
    Created on : Feb 25, 2023, 1:57:32 PM
    Author     : hp
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Model.Account" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Feedback</title>
        <!--<link href="CSS/StudentFeedback.css" rel="stylesheet" type="text/css"/>-->
        <style>

            /*
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/CascadeStyleSheet.css to edit this template
            */
            /* 
                Created on : Feb 25, 2023, 11:43:57 PM
                Author     : hp
            */

            .body1 td{
                color:black ;
                background-color: #0066ff;
                padding: 2px;
                border-left: 2px solid white;
            }

            .body2{
                background-color: white;
            }
            .body2 td{
                margin: 1px 0;
                background-color: white;
                border-bottom: 1px solid gainsboro;
            }

            .contanier{

                margin: 0 15%;
            }


            table{
                margin: 0px;
                width: 100%;
            }

            .fooster {
                margin-top: 35px;
            }
            .line2 {
                text-align: center;
            }


            .fooster {
                margin-top: 35px;
            }
            .line2 {
                text-align: center;
            }
           
        </style>
    </head>
    <body>
        <div class="contanier">
            <div >
                <%@include file="header.jsp" %> 
                <div class="breadcrumb">
                    <table Cellspacing="0">
                        <!--<tbody>-->
                        <tr>
                            
                            <td>
                                <a href="login?gmail=${a.getGmail()}&mod=1">Home</a>|
                                Student FeedBack</td>
                            <td>

                                <a href='userdetail?gmail=${a.getGmail()}'> 
                                    <span>${a.getDisplayname()}</span>
                                </a>                            
                                | 
                                <a href="logout">
                                    <span>logout</span>
                                </a> |
                                <span>
                                    CAMPUS: FPTU-Hòa Lạc
                                </span>


                            </td>
                        </tr>
                        </tbody>
                    </table>
                </div>
            </div>


            <div class="main">


                <table Cellspacing="0">
                    <tbody>

                        <tr >   
                            <td>
                                <h2>List of feedback for 
                                    <span> ${a.getStdname()} (${a.getMsv()})</span>
                                    <!--<span> ${a1.getStdname()} (${a1.getMsv()})</span>-->
                                </h2>
                                <div></div>
                                <table Cellspacing="0">
                                    <tbody class="body1" >
                                        <tr>
                                            <td>GROUPNAME</td>
                                            <td>OPENDAY</td>
                                            <td>LECTURER</td>
                                            <td>SUBJECTS</td>
                                            <td>CLOSINGDATE</td>
                                            <td>DO FEEDBACK</td>
                                        </tr>

                                    </tbody>
                                    <tbody class="body2">
                                        <c:forEach items="${data}" var="item">
                                            <tr>
                                                <td>${item.getGroupname()}</td>
                                                <td>${item.getBegindate()}</td>
                                                <td>${item.getLecturename()}</td>
                                                <td>${item.getSubname()}</td>
                                                <td>${item.getEnddate()}</td>
                                                <td>
                                                    <a href="comment?stdid=${item.getStdid()}&gid=${item.getGid()}">Edit Comment</a>
                                                    |
                                                    <a href="retake?fb=${item.getFbid()}">Re Take</a>
<!--                                                    <a href="retake?stdid=${item.getStdid()}&gid=${item.getGid()}&gname=${item.getGroupname()}
                                                       &subname=${item.getSubname()}&lname=${item.getLecturename()}&detail=${item.getDetail()}">Re Take</a>-->
                                                </td>
                                            </tr> 
                                        </c:forEach>

                                    </tbody>
                                </table>

                            </td>
                        </tr>

                        <tr>
                            <td>
                                <table class="fooster" Cellspacing="0"> 
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
