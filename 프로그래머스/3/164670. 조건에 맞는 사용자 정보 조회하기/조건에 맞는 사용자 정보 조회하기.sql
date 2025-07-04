SELECT user_id, nickname, city || ' '|| street_address1 || ' ' || street_address2 전체주소, substr(tlno,1,3) || '-' || substr(tlno,4,4) || '-' || substr(tlno,8,4) 전화번호
FROM used_goods_user u
WHERE user_id IN (SELECT writer_id
                    FROM used_goods_board b
                   GROUP BY writer_id
                     HAVING count(*) >=3)
ORDER BY user_id DESC;

