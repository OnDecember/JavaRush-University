-- Write your code here:
SELECT
    name,
    prod_year,
    COUNT(*)
FROM cars
GROUP BY name, prod_year, price;