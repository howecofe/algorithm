select
    A.ID,
    CASE
        WHEN A.P <= 0.25 THEN 'CRITICAL'
        WHEN A.P <= 0.5 THEN 'HIGH'
        WHEN A.P <= 0.75 THEN 'MEDIUM'
        ELSE 'LOW'
    END COLONY_NAME
from (
    select
        ID,
        PERCENT_RANK() OVER (order by SIZE_OF_COLONY desc) P
    from ECOLI_DATA
    ) A
order by A.ID;