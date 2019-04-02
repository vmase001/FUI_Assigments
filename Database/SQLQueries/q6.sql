select distinct fname, lname
from project, dept_locations, employee, works_on
where plocation = 'Houston' and dlocation != 'Houston' and dnumber = dnum and essn = ssn and dno = dnumber