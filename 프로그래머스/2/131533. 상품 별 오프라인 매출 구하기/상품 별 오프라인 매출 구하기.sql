select P.PRODUCT_CODE, SUM(P.PRICE * S.SALES_AMOUNT) SALES
from PRODUCT P join OFFLINE_SALE S on P.PRODUCT_ID = S.PRODUCT_ID
group by P.PRODUCT_CODE
order by SALES desc, P.PRODUCT_CODE;