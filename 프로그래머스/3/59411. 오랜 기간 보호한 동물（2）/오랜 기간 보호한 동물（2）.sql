SELECT animal_id, name
FROM (SELECT i.animal_id, i.name
      FROM animal_ins i, animal_outs o
      WHERE i.animal_id = o.animal_id
      ORDER BY o.datetime - i.datetime desc) animal
WHERE rownum <= 2;