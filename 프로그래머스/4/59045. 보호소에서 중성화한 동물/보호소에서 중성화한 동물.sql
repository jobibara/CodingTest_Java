SELECT i.animal_id, i.animal_type, i.name
FROM animal_ins i, animal_outs o
WHERE i.sex_upon_intake IN ('Intact Male', 'Intact Female')
AND o.sex_upon_outcome IN ('Neutered Male', 'Spayed Female')
AND i.animal_id = o.animal_id
ORDER BY i.animal_id;