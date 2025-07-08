SELECT apnt_no, p.pt_name, p.pt_no, d.mcdp_cd, d.dr_name, apnt_ymd
FROM doctor d, patient p, appointment a
WHERE a.mddr_id = d.dr_id
AND a.pt_no = p.pt_no
AND apnt_cncl_yn = 'N'
AND d.mcdp_cd = 'CS'
AND TO_CHAR(apnt_ymd, 'yyyymmdd') = '20220413' 
ORDER BY apnt_ymd;