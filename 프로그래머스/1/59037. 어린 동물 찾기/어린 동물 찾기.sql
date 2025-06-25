SELECT animal_id, name
FROM animal_ins
WHERE intake_condition != 'Aged'
order by animal_id;