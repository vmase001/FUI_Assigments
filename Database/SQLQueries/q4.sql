select fname, lname
from works_on, project, employee, department
where hours > 10 and pname = 'ProductX' and pno = pnumber and ssn = essn and dname = 'Research' and dnum = dnumber