SELECT user_id, product_id
FROM online_sale
GROUP BY user_id, product_id
HAVING count(*) >= 2
ORDER BY user_id, product_id desc;