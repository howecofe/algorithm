select distinct D.ID, D.EMAIL, D.FIRST_NAME, D.LAST_NAME
from
    DEVELOPERS D,
    SKILLCODES S
where S.CATEGORY = 'Front End'
and D.SKILL_CODE & S.CODE
order by D.ID;

# SELECT
#     ID,
#     EMAIL,
#     FIRST_NAME,
#     LAST_NAME
# FROM
#     DEVELOPERS
# WHERE
#     ID IN (
#         SELECT
#             DISTINCT A.ID
#         FROM
#             DEVELOPERS AS A,
#             SKILLCODES AS B
#         WHERE 
#             A.SKILL_CODE & B.CODE != 0
#             AND B.CATEGORY = 'Front End'
#     )
# ORDER BY
#     ID;
    
# SELECT
#     DISTINCT ID,
#     EMAIL,
#     FIRST_NAME,
#     LAST_NAME
# FROM
#     DEVELOPERS
# WHERE 
#     SKILL_CODE & (
#         SELECT SUM(CODE) FROM SKILLCODES WHERE CATEGORY = 'Front End'
#     )
# ORDER BY
#     ID;