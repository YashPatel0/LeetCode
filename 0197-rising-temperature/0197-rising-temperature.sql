# Write your MySQL query statement below
# self join 
SELECT 
    w1.id
FROM 
    Weather w1 /* for current day */
JOIN 
    Weather w2 /* for previous day */
ON 
    w1.recordDate = DATE_ADD(w2.recordDate, INTERVAL 1 DAY)
WHERE 
    w1.temperature > w2.temperature;