SELECT f.flavor
FROM first_half f, icecream_info i
WHERE f.flavor = i.flavor
AND i.ingredient_type = 'fruit_based'
AND f.total_order > 3000
ORDER BY total_order desc