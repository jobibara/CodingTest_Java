SELECT user_id, nickname, sum(price) total_sales
FROM used_goods_board b, used_goods_user u
WHERE writer_id = user_id
AND status = 'DONE'
GROUP BY user_id, nickname
HAVING sum(price) >= 700000
ORDER BY total_sales;
