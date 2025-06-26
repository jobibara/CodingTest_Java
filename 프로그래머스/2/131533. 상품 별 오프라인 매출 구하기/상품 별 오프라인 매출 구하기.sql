SELECT product_code, sum(sales_amount * price) sales
FROM product p, offline_sale o
WHERE p.product_id = o.product_id
GROUP BY product_code
ORDER BY sum(sales_amount * price) desc, product_code;