-- Write your code here:
SELECT
    department,
    position,
    COUNT(*) as total
FROM employee
GROUP BY department, position
HAVING position = 'frontend developer' and total > 1
LIMIT 1;