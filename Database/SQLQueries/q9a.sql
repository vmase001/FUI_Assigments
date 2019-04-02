create view ProjectInfo as
select pname, dname, (select count(*)
                     from works_on w1
                     where w1.pno = p1.pnumber) as numempl,
                     
                     (select sum(w2.hours)
                     from works_on w2
                     where w2.pno = p1.pnumber
                     group by pno) as totalhrs
from project p1, department d1
where p1.dnum = d1.dnumber and  (select count(*)
                                from works_on w2
                                where w2.pno = p1.pnumber
                                group by w2.pno) > 1