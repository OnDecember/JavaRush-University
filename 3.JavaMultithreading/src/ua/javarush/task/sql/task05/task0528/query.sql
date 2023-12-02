-- Write your code here:
SELECT DISTINCT publisher.name
FROM publisher LEFT JOIN book b ON publisher.id = b.publisher_id
LEFT JOIN author a ON b.author_id = a.id
WHERE a.full_name = 'Mark Twain';