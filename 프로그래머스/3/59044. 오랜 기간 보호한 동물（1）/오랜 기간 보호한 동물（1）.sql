select NAME, DATETIME
from ANIMAL_INS
where ANIMAL_ID not in (
    select ANIMAL_ID
    from ANIMAL_OUTS
)
order by DATETIME
limit 3;


# 1. 서브쿼리 사용
# SELECT NAME, DATETIME
# FROM
#     ANIMAL_INS
# WHERE ANIMAL_ID NOT IN (
#         SELECT ANIMAL_ID
#         FROM ANIMAL_OUTS
#     )
# ORDER BY
#     DATETIME
# LIMIT 3;