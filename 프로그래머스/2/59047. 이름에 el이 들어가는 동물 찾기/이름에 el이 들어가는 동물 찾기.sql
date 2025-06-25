SELECT animal_id, name
FROM animal_ins
WHERE animal_type = 'Dog'
AND lower(name) like '%el%'
ORDER BY name;