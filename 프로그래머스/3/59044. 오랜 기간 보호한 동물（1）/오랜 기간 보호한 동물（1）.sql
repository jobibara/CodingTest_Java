SELECT name, datetime
FROM (
SELECT name, datetime
FROM animal_ins
WHERE animal_id NOT IN (SELECT animal_id
                          FROM animal_outs)
ORDER BY datetime) animal
WHERE rownum <= 3;