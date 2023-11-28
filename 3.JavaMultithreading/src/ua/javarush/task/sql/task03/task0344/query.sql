-- Write your code here:
SELECT title
FROM films LEFT JOIN (SELECT last_name, id
                      FROM film_directors
                      WHERE last_name = 'Spielberg') AS director ON films.director_id = director.id;