select CC.ID
from
    ECOLI_DATA CC join ECOLI_DATA C on CC.PARENT_ID = C.ID
    join ECOLI_DATA P on C.PARENT_ID = P.ID
where P.PARENT_ID is null
order by CC.ID;