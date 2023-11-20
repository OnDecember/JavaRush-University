-- Write your code here:
SELECT
    name,
    MIN(price) as min,
    MAX(price) as max
FROM cars
GROUP BY name;