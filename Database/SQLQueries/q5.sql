select fname, lname
from employee
where ssn in (select essn
              from works_on
              where pno in (select pnumber
                           from project
                           where plocation = 'Bellaire'))
             intersect 

select fname, lname
from employee
where ssn in (select essn
              from works_on
              where pno in (select pnumber
                           from project
                           where plocation = 'Sugarland'))