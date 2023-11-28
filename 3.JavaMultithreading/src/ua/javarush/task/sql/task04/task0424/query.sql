-- Write your code here:
SELECT name,
       department
FROM employee
WHERE DAYOFYEAR(date_of_birth) BETWEEN 1 AND 200;