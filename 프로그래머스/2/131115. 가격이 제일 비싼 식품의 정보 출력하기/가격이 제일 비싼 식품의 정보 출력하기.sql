SELECT *
FROM food_product
WHERE price >= all (SELECT price
                   FROM food_product);