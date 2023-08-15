-- Account student
select a.gmail, a.password , a.displayname, s.stdname, s.msv from 
Account a join Student s
on a.stdid = s.stdid 


-- Account Lecturer
select a.gmail, a.password , a.displayname, l.lname, l.mgv from 
Account a join Lecturer l
on a.lid = l.lid and a.gmail='minhnt@fe.edu.vn'
and a.password = '123'

-- if Student
select * from Account a
where a.lid = '' and a.gmail='?'

select *  
from Account a join Student s
on a.stdid = s.stdid 
and a.gmail='hieptd@fpt.edu.vn'

--question
select * from QandA where stdid=1

update QandA set Qdetail='bao gio thi thay oi?'
                 
update QandA set Adetail='hello' where stdid=1

select * from 
Account a join Student s
on a.stdid = s.stdid 
and a.gmail ='ducnn@fpt.edu.vn'


select * from Account a join Lecturer l 
on a.lid = l.lid and a.gmail='minhnt@fe.edu.vn'



INSERT [dbo].[Users] ([account], [Password], [name] , [gender],[address],[dateofbirth] )
VALUES ('','','','','','')

select * from Users

select * from QandA  where stdid=1 


--
select * from 
feedback f join student s
on f.stdid = s.stdid
and s.stdid=2 
join [Group] g on g.gid = f.gid

select * from Lecturer
select * from [Group] where gid=1
select * from [subject] where subid=1
select * from [account] where lid=1
select * from feedback where stdid=1
select * from feedback where stdid=2
select * from feedback where stdid=2 
--
select * from 
feedback f where f.lid=1

select * from 
feedback f where f.stdid =1 and f.gid=1


update Feedback set detail='hello word' where stdid = 1 and gid=1

--

select * from 
Account a join Student s
on a.stdid = s.stdid and s.stdname = N'Trần Đình Hiệp'
and a.gmail='hieptd@fpt.edu.vn' and s.msv='HE160555'
and s.phone=3456789


select * from 
Account a join Student s
on a.stdid = s.stdid 
and a.gmail='hieptd@fpt.edu.vn' and s.msv='he160555'
and s.phone=3456789

select * from [Group] where gid=1


update [Retake] set listfb1= 1,listfb2='',listfb3='', listfb4='',listfb5='' where fbid = 5


create trigger tr1
on [Feedback]
for insert
as 
begin
	insert into Retake(fbid)
	select fbid from inserted
end

select *  from Account a join Lecturer l
on a.lid = l.lid 
and a.gmail='minhnt@fe.edu.vn'

select * from Feedback 

select * from retake 



select * from feedback f join retake r on f.fbid = r.fbid 
where f.lid = 1

SELECT Sum(listfb1 + listfb2 + listfb3 + listfb4 + listfb5) / 5
FROM retake
where fbid = 1


select * from account where stdid =1



INSERT [dbo].[Student] ([stdid], [stdname], [phone] , [msv] )
VALUES ('16','them','000000000','them160555')

INSERT [dbo].[Account] ([gmail], [Password], [stdid] , [lid], [accid], [displayname] )
VALUES ('them@gamil.com','123','16',Null,'20','themstudent')


select avg(GPA) from Retake 
