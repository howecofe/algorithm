select U.FLAVOR
from (
    select * from FIRST_HALF
    union all
    select * from JULY
) U
group by U.FLAVOR
order by SUM(U.TOTAL_ORDER) desc
limit 3;

# select F.FLAVOR
# from FIRST_HALF F join JULY J on F.FLAVOR = J.FLAVOR
# group by F.FLAVOR
# order by SUM(F.TOTAL_ORDER) + SUM(J.TOTAL_ORDER) desc
# limit 3;


# select U.FLAVOR
# from (
#     select * from FIRST_HALF
#     union all
#     select * from JULY
# ) U
# group by U.FLAVOR
# order by SUM(U.TOTAL_ORDER) desc
# limit 3;

# select a.FLAVOR
# from (
#     select * from FIRST_HALF
#     union all -- 중복 포함
#     select * from JULY
# ) as a
# group by FLAVOR -- 맛별로 그룹핑
# order by sum(TOTAL_ORDER) desc -- 맛별 주문량 내림차순
# limit 3; -- 상위 3개

# select f.flavor
# from first_half f join july j on f.flavor = j.flavor
# group by f.flavor
# order by (sum(f.total_order) + sum(j.total_order)) desc
# limit 3;