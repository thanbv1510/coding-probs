-- https://leetcode.com/problems/swap-salary
UPDATE Salary AS s SET s.sex = IF(s.sex = 'f', 'm', 'f');