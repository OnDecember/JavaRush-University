-- Write your code here:
SELECT author.full_name, COUNT(*) books
FROM author JOIN book on author.id = book.author_id
GROUP BY author.full_name
HAVING books > 1;