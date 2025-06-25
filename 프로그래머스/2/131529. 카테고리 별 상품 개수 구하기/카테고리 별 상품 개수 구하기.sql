SELECT substr(product_code,0,2) category, count(product_id) products
FROM product
GROUP BY substr(product_code,0,2)
ORDER BY category;