select
    A.CAR_ID,
    A.CAR_TYPE,
    TRUNCATE(A.DAILY_FEE * 30 * (1 - B.DISCOUNT_RATE * 0.01), 0) FEE
from
    CAR_RENTAL_COMPANY_CAR A,
    CAR_RENTAL_COMPANY_DISCOUNT_PLAN B
where
    A.CAR_TYPE = B.CAR_TYPE
    and A.CAR_TYPE in ('세단', 'SUV')
    and B.DURATION_TYPE	= '30일 이상'
    and A.CAR_ID not in (
        select CAR_ID
        from CAR_RENTAL_COMPANY_RENTAL_HISTORY
        where DATE_FORMAT(START_DATE, '%Y-%m-%d') <= '2022-11-30'
        and '2022-11-01' <= DATE_FORMAT(END_DATE, '%Y-%m-%d')
        )
    and 500000 <= A.DAILY_FEE * 30 * (1 - B.DISCOUNT_RATE * 0.01)
    and A.DAILY_FEE * 30 * (1 - B.DISCOUNT_RATE * 0.01) < 2000000
order by FEE desc, CAR_TYPE, CAR_ID desc;


# SELECT
#     A.CAR_ID,
#     A.CAR_TYPE,
#     TRUNCATE(A.DAILY_FEE * (1 - B.discount_rate * 0.01) * 30, 0) AS FEE
# FROM
#     CAR_RENTAL_COMPANY_CAR AS A
#     JOIN CAR_RENTAL_COMPANY_DISCOUNT_PLAN AS B
#     ON A.CAR_TYPE = B.CAR_TYPE
# WHERE
#     A.CAR_TYPE IN ('세단', 'SUV')
#     AND A.CAR_ID NOT IN (
#         SELECT CAR_ID
#         FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
#         WHERE
#             DATE_FORMAT(START_DATE, '%Y-%m-%d') <= '2022-11-30'
#             AND DATE_FORMAT(END_DATE, '%Y-%m-%d') >= '2022-11-01'
#     )
#     AND B.DURATION_TYPE = '30일 이상'
#     AND A.DAILY_FEE * (1 - B.discount_rate * 0.01) * 30 >= 500000
#     AND A.DAILY_FEE * (1 - B.discount_rate * 0.01) * 30 < 2000000
# ORDER BY
#     FEE DESC, A.CAR_TYPE ASC, A.CAR_ID DESC;