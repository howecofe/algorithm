# SELECT
#     D.ID,
#     C.FISH_NAME,
#     D.LENGTH
# FROM
#     FISH_NAME_INFO AS C
#     JOIN (
#         SELECT A.ID, A.FISH_TYPE, A.LENGTH
#         FROM
#             FISH_INFO AS A
#             JOIN (
#                 SELECT
#                     FISH_TYPE,
#                     MAX(LENGTH) AS LENGTH
#                 FROM
#                     FISH_INFO
#                 GROUP BY
#                     FISH_TYPE) AS B
#             ON A.FISH_TYPE = B.FISH_TYPE AND A.LENGTH = B.LENGTH) AS D
#     ON C.FISH_TYPE = D.FISH_TYPE
# ORDER BY
#     D.ID;
    
SELECT
    A.ID,
    B.FISH_NAME,
    A.LENGTH
FROM
    FISH_INFO AS A
    JOIN FISH_NAME_INFO AS B
    ON A.FISH_TYPE = B.FISH_TYPE
WHERE
    (A.FISH_TYPE, A.LENGTH) IN (
        SELECT FISH_TYPE, MAX(LENGTH)
        FROM FISH_INFO
        GROUP BY FISH_TYPE)
ORDER BY
    A.ID;