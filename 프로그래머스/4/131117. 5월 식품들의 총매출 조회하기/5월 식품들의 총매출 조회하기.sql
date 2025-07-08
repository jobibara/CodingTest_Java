SELECT product_id, product_name, sum(sales) total_sales
FROM (SELECT p.product_id, p.product_name, (amount * price) sales
        FROM food_product p, food_order o
       WHERE p.product_id = o.product_id
         AND TO_CHAR(produce_date, 'yyyymm') = '202205') t1
GROUP BY product_id, product_name
ORDER BY total_sales DESC, product_id;