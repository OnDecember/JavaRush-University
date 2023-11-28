-- Write your code here:
SELECT *
FROM films JOIN (SELECT year_born, id
                 FROM film_directors
                 WHERE year_born < 1940) AS director ON director.id = director_id
WHERE genre = 'sci-fi';