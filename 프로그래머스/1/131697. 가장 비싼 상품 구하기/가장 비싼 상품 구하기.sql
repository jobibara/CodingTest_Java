-- 코드를 입력하세요
SELECT price max_price
FROM (SELECT *
     FROM product
     ORDER BY price desc)
WHERE rownum = 1;