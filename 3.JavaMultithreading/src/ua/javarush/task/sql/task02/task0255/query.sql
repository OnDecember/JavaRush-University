-- Write your code here:
SELECT
    name,
    MIN(price),
    MAX(price) as max_price
FROM cars
GROUP BY name
HAVING max_price < 200000