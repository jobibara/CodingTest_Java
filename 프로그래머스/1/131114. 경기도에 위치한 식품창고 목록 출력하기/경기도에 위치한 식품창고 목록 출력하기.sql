-- 코드를 입력하세요
SELECT warehouse_id, warehouse_name, address, NVL2(freezer_yn, freezer_yn, 'N')
FROM food_warehouse
WHERE address like '경기도%'
ORDER BY warehouse_id