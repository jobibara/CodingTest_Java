SELECT member_id, member_name, gender, TO_CHAR(date_of_birth, 'YYYY-MM-DD') date_of_birth
FROM member_profile
WHERE not tlno is null
AND gender = 'W'
AND TO_CHAR(date_of_birth, 'MM') = '03'
ORDER BY member_id;