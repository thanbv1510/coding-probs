-- https://leetcode.com/problems/find-total-time-spent-by-each-employee/
-- MySQL
SELECT
    event_day AS day,
    e.emp_id,
    SUM(e.out_time - e.in_time) AS total_time
FROM
    Employees e
GROUP BY
    e.emp_id, event_day