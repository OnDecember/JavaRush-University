-- Write your code here:
SELECT *
FROM film_directors
WHERE film_directors.full_name LIKE (SELECT CONCAT(film_directors.first_name, ' ', film_directors.last_name)
                                     FROM film_directors
                                     LIMIT 1);