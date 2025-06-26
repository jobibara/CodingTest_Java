SELECT TO_NUMBER(TO_CHAR(datetime, 'HH24')) hour, count(*)
FROM animal_outs a
WHERE TO_CHAR(datetime, 'HH24') BETWEEN '09' AND '19'
GROUP BY TO_CHAR(datetime, 'HH24')
ORDER BY hour;