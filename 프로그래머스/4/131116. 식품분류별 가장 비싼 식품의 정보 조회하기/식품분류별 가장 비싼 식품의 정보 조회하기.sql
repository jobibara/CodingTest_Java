SELECT category, price max_price, product_name 
FROM food_product f1
WHERE category IN ('과자','국','김치','식용유')
AND price >=all (SELECT price
                  FROM food_product f2
                 WHERE f1.category = f2.category)
ORDER BY max_price DESC;