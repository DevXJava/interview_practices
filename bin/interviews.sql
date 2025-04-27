#Third Highest Salary
SELECT DISTINCT amount FROM salary ORDER BY amount DESC LIMIT 2, 1;

#Second Highest Salary
SELECT DISTINCT amount from salary order by amount desc limit 1,1;

#Hihest Salary
SELECT DISTINCT amount from salary order by amount desc limit 0,1;

#Hihest Salary
select max(amount) as salary from salary where amount < (select max(amount) from salary);

#sum salary based on gender 
select sum(amount) as sum_sal,gender from salary inner join 
employee on employee.emp_no = salary.emp_no group by employee.gender having count(salary.emp_no)<150;