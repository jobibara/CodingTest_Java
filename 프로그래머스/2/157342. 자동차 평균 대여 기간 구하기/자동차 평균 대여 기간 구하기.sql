SELECT car_id, TO_CHAR(round(avg((end_date + 1 - start_date)),1), 'FM9999.0') average_duration
FROM car_rental_company_rental_history
GROUP BY car_id
HAVING avg(end_date + 1 - start_date) >=7
ORDER BY TO_NUMBER(average_duration) desc, car_id desc;