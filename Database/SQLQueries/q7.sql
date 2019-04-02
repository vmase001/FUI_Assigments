select dname, count(*)
from department, employee
where dnumber = dno and sex ='M' and dno in (select dno
                                           from employee
                                           group by dno
                                           having avg(salary) > 30000)
group by dname                                           