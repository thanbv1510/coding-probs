-- https://leetcode.com/problems/duplicate-emails/
SELECT p.email
from Person AS p
GROUP BY p.email
HAVING count(p.email) > 1