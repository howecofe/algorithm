WITH RECURSIVE HOUR_LIST AS (
    SELECT 0 AS HOUR
    UNION
    SELECT HOUR + 1
    FROM HOUR_LIST
    WHERE HOUR < 23
)

SELECT
    A.HOUR,
    IFNULL(B.COUNT, 0) AS COUNT
FROM
    HOUR_LIST AS A
    LEFT JOIN (
        SELECT
            HOUR(DATETIME) AS HOUR,
            COUNT(ANIMAL_ID) AS COUNT
        FROM
            ANIMAL_OUTS
        GROUP BY
            HOUR) AS B
    ON A.HOUR = B.HOUR
ORDER BY
    A.HOUR;