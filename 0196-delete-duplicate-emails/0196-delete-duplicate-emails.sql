# Write your MySQL query statement below
DELETE dup
FROM Person ori, Person dup
WHERE ori.email = dup.email
AND ori.id < dup.id;