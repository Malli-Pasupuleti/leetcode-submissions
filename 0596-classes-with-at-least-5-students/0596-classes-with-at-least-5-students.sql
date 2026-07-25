SELECT class
FROM Courses 
GROUP BY class
HAVING COUNT(*) >= 5
ORDER BY class DESC;