-- https://leetcode.com/problems/rank-scores/
SELECT 
    s.score, 
    DENSE_RANK() OVER(ORDER BY s.score DESC) AS 'rank' 
FROM Scores AS s 
ORDER BY s.score DESC;