select P.ID, COUNT(C.ID) CHILD_COUNT
from ECOLI_DATA C right join ECOLI_DATA P on c.PARENT_ID = P.ID
group by P.ID
order by P.ID;