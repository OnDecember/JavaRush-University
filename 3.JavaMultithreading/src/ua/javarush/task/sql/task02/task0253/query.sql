-- Write your code here:
SELECT
    name,
    SUM(price) as sum
FROM cars
GROUP BY name
HAVING sum > 200000;