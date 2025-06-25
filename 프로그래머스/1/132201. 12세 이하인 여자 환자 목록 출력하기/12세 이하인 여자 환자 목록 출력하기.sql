SELECT pt_name, pt_no, gend_cd, age, NVL2(tlno,tlno,'NONE')
FROM patient
WHERE age <= 12
AND gend_cd = 'W'
ORDER BY age desc, pt_name;