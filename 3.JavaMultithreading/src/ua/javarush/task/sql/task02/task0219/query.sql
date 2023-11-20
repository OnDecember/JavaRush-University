-- Write your code here:
SELECT
    CASE
        WHEN euro IS NUll THEN 'good'
        ELSE 'bad'
    END
FROM cars;