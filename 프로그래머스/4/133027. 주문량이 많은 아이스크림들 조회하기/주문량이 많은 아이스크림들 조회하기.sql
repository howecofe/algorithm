select a.FLAVOR
from (
    select * from FIRST_HALF
    union all -- 중복 포함
    select * from JULY
) as a
group by FLAVOR -- 맛별로 그룹핑
order by sum(TOTAL_ORDER) desc -- 맛별 주문량 내림차순
limit 3; -- 상위 3개