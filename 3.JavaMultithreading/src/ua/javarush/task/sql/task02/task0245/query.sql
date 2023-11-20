-- Write your code here:
SELECT
    name,
    COUNT(*) AS total
FROM cars
GROUP BY name
HAVING total > 1;