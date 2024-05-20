SELECT
    A.ID,
    CASE
        WHEN B.CNT IS NULL THEN 0
        ELSE CNT
    END CHILD_COUNT
FROM
    ECOLI_DATA AS A
    LEFT JOIN (
        SELECT
            PARENT_ID,
            COUNT(*) AS CNT
        FROM
            ECOLI_DATA
        WHERE PARENT_ID IS NOT NULL
        GROUP BY
            PARENT_ID) AS B
    ON A.ID = B.PARENT_ID
ORDER BY
    A.ID;
