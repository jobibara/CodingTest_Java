SELECT DISTINCT c.car_id
FROM car_rental_company_car c, car_rental_company_rental_history h
WHERE c.car_id = h.car_id
AND car_type = '세단'
AND TO_CHAR(start_date, 'MM') = '10'
ORDER BY car_id desc;