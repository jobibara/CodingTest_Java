SELECT '/home/grep/src/' || f.board_id || '/'|| f.file_id || f.file_name || f.file_ext 
FROM used_goods_file f, used_goods_board b
WHERE f.board_id = b.board_id 
AND views >=all (SELECT views
                    FROM used_goods_board)
ORDER BY f.file_id DESC;