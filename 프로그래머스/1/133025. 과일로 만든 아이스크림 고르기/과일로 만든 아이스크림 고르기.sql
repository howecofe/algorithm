select F.FLAVOR
from FIRST_HALF F, ICECREAM_INFO I
where F.FLAVOR = I.FLAVOR
and I.INGREDIENT_TYPE = 'fruit_based'
group by F.FLAVOR
having sum(F.TOTAL_ORDER) > 3000
order by sum(F.TOTAL_ORDER) desc;