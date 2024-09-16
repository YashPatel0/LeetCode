# Write your MySQL query statement below
-- select distinct id from Views
-- where  author_id = viewer_id 
SELECT DISTINCT author_id as id
FROM Views
WHERE author_id = viewer_id
ORDER BY author_id ASC;
