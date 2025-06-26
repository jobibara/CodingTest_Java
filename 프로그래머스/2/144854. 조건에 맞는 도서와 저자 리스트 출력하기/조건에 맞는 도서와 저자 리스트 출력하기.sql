SELECT book_id, author_name, TO_CHAR(published_date, 'YYYY-MM-DD')
FROM book b , author a
WHERE b.author_id = a.author_id 
AND category = '경제'
ORDER BY published_date;