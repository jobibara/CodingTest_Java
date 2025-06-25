SELECT book_id, TO_CHAR(published_date, 'YYYY-MM-DD')
FROM book
WHERE category = '인문'
AND TO_CHAR(published_date, 'YYYY') = 2021
ORDER BY published_date;