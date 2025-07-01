SELECT category, sum(sales) total_sales
FROM book b, book_sales s
WHERE TO_CHAR(sales_date, 'YYYY-MM') = '2022-01'
AND b.book_id = s.book_id
GROUP BY category
ORDER BY category;