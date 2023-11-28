-- Write your code here:
SELECT *
FROM films
WHERE films.title LIKE (SELECT films.title
                        FROM films
                        WHERE films.title LIKE ('The%r')
                        LIMIT 1);