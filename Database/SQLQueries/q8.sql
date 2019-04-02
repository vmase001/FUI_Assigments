select fname, lname, dno
from employee
where salary in (select max(salary)
                from employee)
group by dno, fname, lname                