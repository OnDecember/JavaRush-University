-- Write your code here:
SELECT
    name,
    AVG(price) as avg,
    SUM(price)
FROM cars
GROUP BY name
HAVING avg > 100000