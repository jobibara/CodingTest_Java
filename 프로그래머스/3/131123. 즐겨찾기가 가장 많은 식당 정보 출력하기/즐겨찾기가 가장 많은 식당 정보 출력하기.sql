SELECT DISTINCT r1.food_type, r1.rest_id, r1.rest_name, r1.favorites
FROM rest_info r1
WHERE r1.favorites >=all(SELECT favorites
                         FROM rest_info r3
                        WHERE r1.food_type = r3.food_type)
ORDER BY r1.food_type DESC;
