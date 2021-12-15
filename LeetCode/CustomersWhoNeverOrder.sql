--  https://leetcode.com/problems/customers-who-never-order/
SELECT c.name AS Customers
FROM customers AS c
         LEFT JOIN orders AS o ON c.id = o.customerId
WHERE o.customerId IS NULL;