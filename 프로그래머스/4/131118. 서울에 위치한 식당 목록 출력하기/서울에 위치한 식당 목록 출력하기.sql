select I.REST_ID, I.REST_NAME, I.FOOD_TYPE, I.FAVORITES, I.ADDRESS, R.SCORE
from REST_INFO I, (
    select REST_ID, ROUND(AVG(REVIEW_SCORE), 2) SCORE
    from REST_REVIEW
    group by REST_ID
) R
where I.REST_ID = R.REST_ID
and I.ADDRESS like '서울%'
order by R.SCORE desc, I.FAVORITES desc;
