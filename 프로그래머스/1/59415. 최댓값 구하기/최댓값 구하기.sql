-- 코드를 입력하세요
SELECT datetime 시간
FROM (SELECT *
     FROM animal_ins
     ORDER BY datetime DESC)
WHERE rownum = 1;