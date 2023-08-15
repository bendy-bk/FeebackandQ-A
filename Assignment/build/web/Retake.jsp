<%-- 
    Document   : Retake
    Created on : Feb 25, 2023, 11:15:19 PM
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
                margin: 0 10%;
            }


            #border td{
                border-bottom: 2px solid blanchedalmond;
                color:black ;

            }

            .table2 div{

                border-bottom: 1px silver solid;
            }


        </style>

    </head>
    <body>

        <div class="container">
            <header>
                <%@include file="header.jsp" %>


                <div style="display: flex">
                    <div>
                        <a href="login?gmail=${a.getGmail()}&mod=1">Home</a> |
                        <a href="myfap?gmail=${a.getGmail()}&mod=1">Student Feedback</a> |
                        Do Feedback
                    </div>
                    <div style="margin-left:150px ">

                        <a href='userdetail?gmail=${a.getGmail()}'>${a.getDisplayname()}</a>
                        <a href="logout">
                            <span>logout</span>
                        </a> |
                        <span>
                            CAMPUS: FPTU-Hòa Lạc
                        </span>
                    </div>
                </div>
            </header>
            <form  action="retake" method="get">
                <input style="display: none" type="text" name="fb" value="${fb.getFbid()}">
                <table Cellspacing="0" >
                    <tbody>
                        <tr>
                            <td>
                                <div>
                                    <b>
                                        <h2>Edit Feedback</h2>

                                    </b>
                                    <p style="color: red">${msg}</p>
                                    <table class="table1" id="border">
                                        <tbody>
                                            <tr >
                                                <td>
                                                    Batch(Lớp):
                                                    <!--<a href="url">-->
                                                    <span id="class">${fb.getGroupname()}</span>
                                                    <!--</a>-->
                                                </td>
                                                <td>
                                                    Month(Tháng):
                                                    <span id="month">2</span>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td>
                                                    Subjet(Môn học):
                                                    <span id="subject">${fb.getSubname()}</span>
                                                </td>
                                                <td>
                                                    Teacher(Giảng viên):
                                                    <!--<a href="userdetail?gmail-l=${fb.getLecturemail()}">-->
                                                    <a href="userdetail?gmail=${a.getGmail()}">
                                                        <span id="lecturer">${fb.getLecturename()}</span>
                                                    </a>
                                                </td>
                                            </tr>
                                        </tbody>
                                    </table>

                                    <div>
                                        <p>
                                            <font style="font-style: italic; font-weight: bold">
                                            Tick the phrase, which best suits the teacher (Đánh dấu vào ô thích hợp)
                                            </font> 
                                        </p>                   

                                        <table Cellspacing="0" class="table2" id="border" style="border-top:1px solid black ; border-left:1px solid black ;
                                               border-right:1px solid black ">
                                            <tbody>
                                                <tr class="part1">
                                                    <td>
                                                        <font style="font-weight: bold">
                                                        Regarding the teacher's punctuality 
                                                        </font>   <br>                                                      
                                                        <!--<p style="color: red; margin: 0;">${m1}</p>-->                                                       
                                                        <font style="font-style: italic">
                                                        (Sự đúng giờ của giảng viên trong giờ học)

                                                        </font>
                                                        <br>
                                                        <div>
                                                            <input type="radio" value="4" id="listcheck1" name="listfb1">
                                                            <label>Always punctual (Luôn đúng giờ)</label>
                                                        </div>

                                                        <div>
                                                            <input type="radio" value="3"id="listcheck1-1" name="listfb1">
                                                            <label>Mostly punctual (Phần lớn đúng giờ)</label>
                                                        </div>

                                                        <div>
                                                            <input type="radio" value="2" id="listcheck1-2" name="listfb1">
                                                            <label>Rarely punctual (Ít khi đúng giờ)</label>
                                                        </div>


                                                        <input type="radio" value="1"id="listcheck1-3" name="listfb1">
                                                        <label>Not at all punctual (Không bao giờ đúng giờ)</label>

                                                        

                                                    </td>
                                                    <td>
                                                        <font style="font-weight: bold">
                                                        Teaching skills of teacher
                                                        </font>
                                                        <!--<p style="color: red; margin: 0;">${m2}</p>-->
                                                        <br>
                                                        <font style="font-style: italic">
                                                        (Kỹ năng sư phạm của giảng viên)
                                                        </font>
                                                        <br>
                                                        <div>
                                                            <input type="radio" value="4" id="listcheck2" name="listfb2">
                                                            <label>Very Good (Tốt)</label>
                                                        </div>

                                                        <div>
                                                            <input type="radio" value="3"id="listcheck2-1" name="listfb2">
                                                            <label>Good (Khá)</label>
                                                        </div>

                                                        <div>
                                                            <input type="radio" value="2" id="listcheck2-2" name="listfb2">
                                                            <label>Average (Trung bình)</label> 
                                                        </div>


                                                        <input type="radio" value="1"id="listcheck2-3" name="listfb2">
                                                        <label>Poor (Kém)</label>
                                                        
                                                        
                                                    </td>
                                                </tr>
                                                <tr class="part2">
                                                    <td>
                                                        <font style="font-weight: bold">  
                                                        The teacher adequately covers the topics required by the syllabus
                                                        </font>
                                                        <!--<p style="color: red; margin: 0;">${m3}</p>-->
                                                        <br>
                                                        <font style="font-style: italic">
                                                        (Đảm bảo khối lượng môn học theo chương trình)
                                                        </font>
                                                        <div>
                                                            <input type="radio" value="4" id="listcheck3" name="listfb3">
                                                            <label>Fully covered (Đảm bảo hoàn toàn)</label>
                                                        </div>

                                                        <div>
                                                            <input type="radio" value="3"id="listcheck3-1" name="listfb3">
                                                            <label>Mostly covered (Đảm bảo phần lớn)</label>
                                                        </div>

                                                        <div>
                                                            <input type="radio" value="2" id="listcheck3-2" name="listfb3">
                                                            <label>Partially covered (Chỉ đảm bảo một phần)</label>
                                                        </div>


                                                        <input type="radio" value="1"id="listcheck3-3" name="listfb3">
                                                        <label>Not at all covered (Không đảm bảo)</label>

                            
                                                    </td>
                                                    <td>
                                                        <font style="font-weight: bold">  
                                                        Support from the teacher - guidance for practical exercises, answering questions out side of class
                                                        </font>
                                                        <!--<p style="color: red; margin: 0;">${m4}</p>-->
                                                        <br>
                                                        <font style="font-style: italic">
                                                        (Hỗ trợ của giảng viên trong và ngoài giờ - trả lời Email, hướng dẫn thực hành, giải đáp thắc mắc…)
                                                        </font>
                                                        <div>
                                                            <input type="radio" value="4" id="listcheck4" name="listfb4">
                                                            <label>Very Good (Tốt)</label>
                                                        </div>

                                                        <div>
                                                            <input type="radio" value="3"id="listcheck4-1" name="listfb4">
                                                            <label>Good (Khá)</label>
                                                        </div>

                                                        <div>
                                                            <input type="radio" value="2" id="listcheck4-2" name="listfb4">
                                                            <label>Average (Trung bình)</label>
                                                        </div>


                                                        <input type="radio" value="1"id="listcheck4-3" name="listfb4">
                                                        <label>Poor (Kém)</label>
                                                         
                                                        
                                                    </td>
                                                </tr>
                                                <tr class="part3">
                                                    <td>
                                                        <font style="font-weight: bold">  
                                                        Teacher's response to student's questions in class
                                                        </font>
                                                        <!--<p style="color: red; margin: 0;">${m5}</p>-->
                                                        <br>
                                                        <font style="font-style: italic">
                                                        (Đáp ứng của giảng viên về những thắc mắc của học viên trong giờ học)
                                                        </font>
                                                        <div>
                                                            <input type="radio" value="4" id="listcheck5" name="listfb5">
                                                            <label>Answered immediately or just after the session (Trả lời ngay hoặc trả lời vào cuối buổi học)</label>
                                                        </div>

                                                        <div>
                                                            <input type="radio" value="3"id="listcheck5-1" name="listfb5">
                                                            <label>Answered in the next session (Trả lời vào buổi học sau)</label>  
                                                        </div>

                                                        <div>
                                                            <input type="radio" value="2" id="listcheck5-2" name="listfb5">
                                                            <label>Some queries left unanswered (Một số câu hỏi không được trả lời)</label>

                                                        </div>

                                                        <input type="radio" value="1"id="listcheck5-3" name="listfb5">
                                                        <label>Most queries left unanswered (Phần lớn câu hỏi không được trả lời)</label>
                                                        
                                                     
                                                    </td>
                                                    <td></td>
                                                </tr>
                                            </tbody>
                                        </table>
                                        <br>
                                        <textarea rows="5" cols="70" name="comment">${fb.getDetail()}</textarea>
                                        <br>
                                        <input style="margin-bottom: 30px" type="submit" name="sendfeedback" value="Send Feedback">
                                        <!--<hr>-->
                                    </div>




                                </div>
                            </td>
                        </tr>

                    </tbody>
                </table>

            </form>
            <div>
                <%@include file="fooster.jsp" %>
            </div>
        </div>
    </body>
    <script>
        function checked() {
            value = ${r.getListfb1()};
            if (value === 4) {
                document.getElementById("listcheck1").checked = true;
            }
            if (value === 3) {
                document.getElementById("listcheck1-1").checked = true;
            }
            if (value === 2) {
                document.getElementById("listcheck1-2").checked = true;
            }
            if (value === 1) {
                document.getElementById("listcheck1-3").checked = true;
            }

            value = ${r.getListfb2()};
            if (value === 4) {
                document.getElementById("listcheck2").checked = true;
            }
            if (value === 3) {
                document.getElementById("listcheck2-1").checked = true;
            }
            if (value === 2) {
                document.getElementById("listcheck2-2").checked = true;
            }
            if (value === 1) {
                document.getElementById("listcheck2-3").checked = true;
            }


            value = ${r.getListfb3()};
            if (value === 4) {
                document.getElementById("listcheck3").checked = true;
            }
            if (value === 3) {
                document.getElementById("listcheck3-1").checked = true;
            }
            if (value === 2) {
                document.getElementById("listcheck3-2").checked = true;
            }
            if (value === 1) {
                document.getElementById("listcheck3-3").checked = true;
            }

            value = ${r.getListfb4()};
            if (value === 4) {
                document.getElementById("listcheck4").checked = true;
            }
            if (value === 3) {
                document.getElementById("listcheck4-1").checked = true;
            }
            if (value === 2) {
                document.getElementById("listcheck4-2").checked = true;
            }
            if (value === 1) {
                document.getElementById("listcheck4-3").checked = true;
            }

            value = ${r.getListfb5()};
            if (value === 4) {
                document.getElementById("listcheck5").checked = true;
            }
            if (value === 3) {
                document.getElementById("listcheck5-1").checked = true;
            }
            if (value === 2) {
                document.getElementById("listcheck5-2").checked = true;
            }
            if (value === 1) {
                document.getElementById("listcheck5-3").checked = true;
            }
        }

        checked();




    </script>

</html>
