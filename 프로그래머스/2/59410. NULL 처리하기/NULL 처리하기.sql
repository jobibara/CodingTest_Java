SELECT animal_type, NVL2(name,name, 'No name'), sex_upon_intake
FROM animal_ins
ORDER BY animal_id;