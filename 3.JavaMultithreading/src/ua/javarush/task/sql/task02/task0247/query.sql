-- Write your code here:
SELECT
    department,
    position,
    COUNT(*) as total
FROM employee
GROUP BY department, position
HAVING total = 1;