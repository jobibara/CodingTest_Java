SELECT DISTINCT car_id, CASE WHEN car_id IN (SELECT car_id
                                      FROM car_rental_company_rental_history
                                     WHERE TO_CHAR(start_date, 'yyyymmdd')
                                              <= '20221016' 
                                       AND TO_CHAR(end_date, 'yyyymmdd')
                                              >= '20221016') THEN '대여중'
                    WHEN car_id NOT IN (SELECT car_id
                                      FROM car_rental_company_rental_history
                                     WHERE TO_CHAR(start_date, 'yyyymmdd')
                                              <= '20221016' 
                                       AND TO_CHAR(end_date, 'yyyymmdd')
                                              >= '20221016') THEN '대여 가능'
                                       END
FROM car_rental_company_rental_history
ORDER BY car_id DESC;