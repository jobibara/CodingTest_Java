SELECT datetime
FROM animal_ins
WHERE datetime <= all (SELECT datetime
                      FROM animal_ins);