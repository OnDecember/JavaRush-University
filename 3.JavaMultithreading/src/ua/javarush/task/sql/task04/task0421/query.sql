-- Write your code here:
SELECT DATE(NOW()),
       ADDDATE(NOW(), INTERVAL 3 DAY),
       SUBDATE(NOW(), INTERVAL 3 DAY);