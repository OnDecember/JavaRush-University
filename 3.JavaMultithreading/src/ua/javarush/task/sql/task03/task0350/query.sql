-- Write your code here:
WITH tempTable(averageGrossed) AS ( SELECT AVG(grossed)
                                    FROM films),
    tempTable2(averageYearReleased) AS ( SELECT AVG(year_released)
                    FROM films)
SELECT title, genre, year_released, grossed
FROM films, tempTable, tempTable2
WHERE grossed > tempTable.averageGrossed AND year_released > tempTable2.averageYearReleased
GROUP BY year_released;