SELECT author_id, author_name, category, sum(sales) total_sales
FROM (SELECT a.author_id, a.author_name, b.category, s.sales * b.price sales
        FROM author a, book b, book_sales s
       WHERE a.author_id = b.author_id
         AND b.book_id = s.book_id
         AND TO_CHAR(sales_date, 'yyyymm') = '202201')
GROUP BY author_id, author_name, category
ORDER BY author_id, category DESC;
