
--table Student
INSERT [dbo].[Student] ([stdid], [stdname], [phone], [msv]) VALUES (1, N'Nguyễn Ngọc Đức', 3456789, N'HE151247')
INSERT [dbo].[Student] ([stdid], [stdname], [phone], [msv]) VALUES (2, N'Nguyễn Trung Quân', 3456789, N'HE160206')
INSERT [dbo].[Student] ([stdid], [stdname], [phone], [msv]) VALUES (3, N'Trần Đình Hiệp', 3456789, N'HE160555')
INSERT [dbo].[Student] ([stdid], [stdname], [phone], [msv]) VALUES (4, N'Tạ Văn Đại', 3456789, N'HE161138')
INSERT [dbo].[Student] ([stdid], [stdname], [phone], [msv]) VALUES (5, N'Tạ Ngọc Quân', 3456789, N'HE161199')
INSERT [dbo].[Student] ([stdid], [stdname], [phone], [msv]) VALUES (6, N'Lê Văn Tiến', 3456789, N'HE161878')
INSERT [dbo].[Student] ([stdid], [stdname], [phone], [msv]) VALUES (7, N'Chử Hữu Thành', 3456789, N'HE161893')
INSERT [dbo].[Student] ([stdid], [stdname], [phone], [msv]) VALUES (8, N'Nguyễn Tiến Đạt', 3456789, N'HE161924')
INSERT [dbo].[Student] ([stdid], [stdname], [phone], [msv]) VALUES (9, N'Lê Mạnh Trí', 3456789, N'HE163206')
INSERT [dbo].[Student] ([stdid], [stdname], [phone], [msv]) VALUES (10, N'Nguyễn Tiến Thành', 3456789, N'HE163528')
INSERT [dbo].[Student] ([stdid], [stdname], [phone], [msv]) VALUES (11, N'Ngô Hữu Nam', 3456788, N'HE161918')
INSERT [dbo].[Student] ([stdid], [stdname], [phone], [msv]) VALUES (12, N'Nguyễn Hoàng Gia', 3456788, N'HE161190')
INSERT [dbo].[Student] ([stdid], [stdname], [phone], [msv]) VALUES (13, N'Vũ Thị Ngọc Anh', 3456788, N'HE161882')
INSERT [dbo].[Student] ([stdid], [stdname], [phone], [msv]) VALUES (14, N'Lê Thế Khải', 3456788, N'HE163154')
INSERT [dbo].[Student] ([stdid], [stdname], [phone], [msv]) VALUES (15, N'Trần Mai Linh', 3456788, N'HE163233')


--table Account
INSERT [dbo].[Account] ([accid], [gmail], [password], [stdid], [lid], [displayname]) VALUES (1, N'ducnn@fpt.edu.vn', N'123', 1 ,NULL ,N'ducnnhe151247')
INSERT [dbo].[Account] ([accid], [gmail], [password], [stdid], [lid], [displayname]) VALUES (2, N'quannt@fpt.edu.vn', N'123',2 ,NULL ,N'quannthe160206')
INSERT [dbo].[Account] ([accid], [gmail], [password], [stdid], [lid], [displayname]) VALUES (3, N'hieptd@fpt.edu.vn', N'123', 3 ,NULL ,N'hieptdhe160555')
INSERT [dbo].[Account] ([accid], [gmail], [password], [stdid], [lid], [displayname]) VALUES (4, N'daitv@fpt.edu.vn', N'123', 4 ,NULL ,N'daitvhe161138')
INSERT [dbo].[Account] ([accid], [gmail], [password], [stdid], [lid], [displayname]) VALUES (5, N'quantn@fpt.edu.vn', N'123', 5 ,NULL ,N'quantnhe161199')
INSERT [dbo].[Account] ([accid], [gmail], [password], [stdid], [lid], [displayname]) VALUES (6, N'tienlv@fpt.edu.vn', N'123', 6 ,NULL ,N'tienlvhe161878')
INSERT [dbo].[Account] ([accid], [gmail], [password], [stdid], [lid], [displayname]) VALUES (7, N'thanhch@fpt.edu.vn', N'123', 7 ,NULL ,N'thanhchhe161893')
INSERT [dbo].[Account] ([accid], [gmail], [password], [stdid], [lid], [displayname]) VALUES (8, N'datnt@fpt.edu.vn', N'123', 8 ,NULL ,N'datnthe161924')
INSERT [dbo].[Account] ([accid], [gmail], [password], [stdid], [lid], [displayname]) VALUES (9, N'trilm@fpt.edu.vn', N'123', 9 ,NULL ,N'trilmhe163206')
INSERT [dbo].[Account] ([accid], [gmail], [password], [stdid], [lid], [displayname]) VALUES (10, N'thanhnt@fpt.edu.vn', N'123', 10 ,NULL ,N'thanhnthe163528')
INSERT [dbo].[Account] ([accid], [gmail], [password], [stdid], [lid], [displayname]) VALUES (11, N'namnh@fpt.edu.vn', N'123', 11 ,NULL ,N'namnhhe161918')
INSERT [dbo].[Account] ([accid], [gmail], [password], [stdid], [lid], [displayname]) VALUES (12, N'gianh@fpt.edu.vn', N'123', 12 ,NULL ,N'gianhhe161190')
INSERT [dbo].[Account] ([accid], [gmail], [password], [stdid], [lid], [displayname]) VALUES (13, N'anhvtn@fpt.edu.vn', N'123', 13 ,NULL ,N'anhvtnhe161882')
INSERT [dbo].[Account] ([accid], [gmail], [password], [stdid], [lid], [displayname]) VALUES (14, N'khailt@fpt.edu.vn', N'123', 14 ,NULL ,N'khailthe163154')
INSERT [dbo].[Account] ([accid], [gmail], [password], [stdid], [lid], [displayname]) VALUES (15, N'linhtm@fpt.edu.vn', N'123', 15 ,NULL ,N'linhtmhe163233')
-------------------lec
INSERT [dbo].[Account] ([accid], [gmail], [password], [stdid], [lid], [displayname]) VALUES (16, N'minhnt@fe.edu.vn', N'123', NULL ,1 ,N'minhnt')
INSERT [dbo].[Account] ([accid], [gmail], [password], [stdid], [lid], [displayname]) VALUES (17, N'tientd@fe.edu.vn', N'123', NULL ,2 ,N'tientd')
INSERT [dbo].[Account] ([accid], [gmail], [password], [stdid], [lid], [displayname]) VALUES (18, N'thuyttn@fe.edu.vn', N'123', NULL ,3 ,N'thuyttn')
INSERT [dbo].[Account] ([accid], [gmail], [password], [stdid], [lid], [displayname]) VALUES (19, N'oanhntn@fe.edu.vn', N'123', NULL ,4 ,N'oanhntn')

--Insert Subject
INSERT [dbo].[Subject] ([subid],[subname]) VALUES (1, N'IOT102(Internet of Things)')
INSERT [dbo].[Subject] ([subid],[subname]) VALUES (2, N'PRJ301(Java Web Application Development)')
INSERT [dbo].[Subject] ([subid],[subname]) VALUES (3, N'JPD123(Elementary Japanese 1-A1.2)')
INSERT [dbo].[Subject] ([subid],[subname]) VALUES (4, N'MAS291(Statistics and Probability)')

--Insert 
INSERT [dbo].[QandA] ([id], [Adetail] ,[stdid],[Qdetail] ) VALUES (1,N'',1,N'Co oi bao gio co diem aj')
INSERT [dbo].[QandA] ([id], [Adetail] ,[stdid],[Qdetail] ) VALUES (2,N'',2,N'Thay tien co dep trai khong ?')
INSERT [dbo].[QandA] ([id], [Adetail] ,[stdid],[Qdetail] ) VALUES (3,N'',3,N'bao gio co diem vay thay oi')
INSERT [dbo].[QandA] ([id], [Adetail] ,[stdid],[Qdetail] ) VALUES (4,N'',4,N'bao gio thi pe thay oi')
INSERT [dbo].[QandA] ([id], [Adetail] ,[stdid],[Qdetail] ) VALUES (5,N'',5,N'')
INSERT [dbo].[QandA] ([id], [Adetail] ,[stdid],[Qdetail] ) VALUES (6,N'',6,N'')
INSERT [dbo].[QandA] ([id], [Adetail] ,[stdid],[Qdetail] ) VALUES (7,N'',7,N'')
INSERT [dbo].[QandA] ([id], [Adetail] ,[stdid],[Qdetail] ) VALUES (8,N'',8,N'')
INSERT [dbo].[QandA] ([id], [Adetail] ,[stdid],[Qdetail] ) VALUES (9,N'',9,N'')
INSERT [dbo].[QandA] ([id], [Adetail] ,[stdid],[Qdetail] ) VALUES (10,N'',10,N'')
INSERT [dbo].[QandA] ([id], [Adetail] ,[stdid],[Qdetail] ) VALUES (11,N'',11,N'')
INSERT [dbo].[QandA] ([id], [Adetail] ,[stdid],[Qdetail] ) VALUES (12,N'',12,N'')
INSERT [dbo].[QandA] ([id], [Adetail] ,[stdid],[Qdetail] ) VALUES (13,N'',13,N'')
INSERT [dbo].[QandA] ([id], [Adetail] ,[stdid],[Qdetail] ) VALUES (14,N'',14,N'')
INSERT [dbo].[QandA] ([id], [Adetail] ,[stdid],[Qdetail] ) VALUES (15,N'',15,N'')


-- Insert group
INSERT [dbo].[Group] ([gid], [gname], [subid], [lid], [sem], [year]) VALUES (1, N'SE1709', 1, 1, N'SP', 2023)
INSERT [dbo].[Group] ([gid], [gname], [subid], [lid], [sem], [year]) VALUES (2, N'SE1708', 1, 1, N'SP', 2023)
INSERT [dbo].[Group] ([gid], [gname], [subid], [lid], [sem], [year]) VALUES (3, N'SE1707', 1, 1, N'SP', 2023)
INSERT [dbo].[Group] ([gid], [gname], [subid], [lid], [sem], [year]) VALUES (4, N'SE1706', 1, 1, N'SP', 2023)

INSERT [dbo].[Group] ([gid], [gname], [subid], [lid], [sem], [year]) VALUES (5, N'SE1709', 2, 2, N'SP', 2023)
INSERT [dbo].[Group] ([gid], [gname], [subid], [lid], [sem], [year]) VALUES (6, N'SE1708', 2, 2, N'SP', 2023)
INSERT [dbo].[Group] ([gid], [gname], [subid], [lid], [sem], [year]) VALUES (7, N'SE1707', 2, 2, N'SP', 2023)
INSERT [dbo].[Group] ([gid], [gname], [subid], [lid], [sem], [year]) VALUES (8, N'SE1706', 2, 2, N'SP', 2023)

INSERT [dbo].[Group] ([gid], [gname], [subid], [lid], [sem], [year]) VALUES (9, N'SE1709', 3, 3, N'SP', 2023)
INSERT [dbo].[Group] ([gid], [gname], [subid], [lid], [sem], [year]) VALUES (10, N'SE1708', 3, 3, N'SP', 2023)
INSERT [dbo].[Group] ([gid], [gname], [subid], [lid], [sem], [year]) VALUES (11, N'SE1707', 3, 3, N'SP', 2023)
INSERT [dbo].[Group] ([gid], [gname], [subid], [lid], [sem], [year]) VALUES (12, N'SE1706', 3, 3, N'SP', 2023)

INSERT [dbo].[Group] ([gid], [gname], [subid], [lid], [sem], [year]) VALUES (13, N'SE1709', 4, 4, N'SP', 2023)
INSERT [dbo].[Group] ([gid], [gname], [subid], [lid], [sem], [year]) VALUES (14, N'SE1708', 4, 4, N'SP', 2023)
INSERT [dbo].[Group] ([gid], [gname], [subid], [lid], [sem], [year]) VALUES (15, N'SE1707', 4, 4, N'SP', 2023)
INSERT [dbo].[Group] ([gid], [gname], [subid], [lid], [sem], [year]) VALUES (16, N'SE1706', 4, 4, N'SP', 2023)

delete from [Group]

--table lecture
INSERT [dbo].[Lecturer] ([lid], [lname],[mgv]) VALUES (1, N'Ngô Trường Minh', N'LC1')
INSERT [dbo].[Lecturer] ([lid], [lname],[mgv]) VALUES (2, N'Tạ Đình Tiến', N'LC2')
INSERT [dbo].[Lecturer] ([lid], [lname],[mgv]) VALUES (3, N'Nguyễn Thị Thu Thủy', N'LC3')
INSERT [dbo].[Lecturer] ([lid], [lname],[mgv]) VALUES (4, N'Nguyễn Thị Ngọc Oanh', N'LC4')
--insert student_group
INSERT [dbo].[Student_Group] ([stdid], [gid]) VALUES (1, 1)
INSERT [dbo].[Student_Group] ([stdid], [gid]) VALUES (1, 5)
INSERT [dbo].[Student_Group] ([stdid], [gid]) VALUES (1, 9)
INSERT [dbo].[Student_Group] ([stdid], [gid]) VALUES (1, 13)

INSERT [dbo].[Student_Group] ([stdid], [gid]) VALUES (2, 1)
INSERT [dbo].[Student_Group] ([stdid], [gid]) VALUES (2, 5)
INSERT [dbo].[Student_Group] ([stdid], [gid]) VALUES (2, 9)
INSERT [dbo].[Student_Group] ([stdid], [gid]) VALUES (3, 13)

INSERT [dbo].[Student_Group] ([stdid], [gid]) VALUES (3, 2)
INSERT [dbo].[Student_Group] ([stdid], [gid]) VALUES (3, 5)
INSERT [dbo].[Student_Group] ([stdid], [gid]) VALUES (3, 10)
INSERT [dbo].[Student_Group] ([stdid], [gid]) VALUES (3, 15)

