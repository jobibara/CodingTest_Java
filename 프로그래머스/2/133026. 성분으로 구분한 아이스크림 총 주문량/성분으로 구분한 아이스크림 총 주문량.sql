SELECT ingredient_type, sum(total_order) TOTAL_ORDER
FROM first_half f, icecream_info i
WHERE f.flavor = i.flavor
GROUP BY ingredient_type
ORDER BY TOTAL_ORDER;
