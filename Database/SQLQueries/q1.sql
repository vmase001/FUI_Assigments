select fname, lname
from employee
where employee.dno in (select dnumber
                      from department
                      where dname = 'Research')