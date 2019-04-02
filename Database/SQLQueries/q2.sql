select ssn, fname, lname
from employee
where dno = 5
group by employee.ssn
having salary >= 35000