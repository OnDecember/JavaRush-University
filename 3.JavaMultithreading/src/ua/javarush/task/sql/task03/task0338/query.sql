-- Write your code here:
SELECT *
FROM authors
WHERE authors.full_name NOT LIKE (SELECT CONCAT(authors.first_name, ' ', authors.last_name)
                                  FROM authors
                                  WHERE authors.last_name = 'Shakespeare');