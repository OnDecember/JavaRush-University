-- Write your code here:
SELECT last_name
FROM film_directors LEFT JOIN (SELECT grossed, director_id
                               FROM films
                               WHERE grossed > 100) AS film ON id = film.director_id
WHERE country = 'UK';