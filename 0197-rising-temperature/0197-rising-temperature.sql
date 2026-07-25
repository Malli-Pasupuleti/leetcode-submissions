SELECT w2.id AS Id
FROM Weather w1
LEFT JOIN Weather w2
ON w2.recordDate = w1.recordDate + INTERVAL 1 DAY
WHERE w2.temperature > w1.temperature;