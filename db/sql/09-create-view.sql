CREATE VIEW "public".breed_count AS
WITH "CTE_Count" (id, val) AS (
  SELECT "breedId", COUNT(*)
  FROM dog
  GROUP BY "breedId"
)

SELECT c.breed, b.val
FROM dog as a
JOIN "CTE_Count" as b ON b.id = a."breedId"
JOIN "breedLookup" as c ON c.id = a."breedId"
GROUP BY c.breed, b.val, a."breedId"
ORDER BY a."breedId";
