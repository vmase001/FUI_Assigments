select fname, lname
from employee
where salary >= 10000 + (select min (salary)
                        from employee)