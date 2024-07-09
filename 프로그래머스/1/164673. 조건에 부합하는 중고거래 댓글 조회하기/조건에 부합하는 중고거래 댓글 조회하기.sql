-- catesian product
select
    b.TITLE, b.BOARD_ID, r.REPLY_ID, r.WRITER_ID, r.CONTENTS, DATE_FORMAT(r.CREATED_DATE, '%Y-%m-%d') as CREATED_DATE
from
    USED_GOODS_BOARD as b, USED_GOODS_REPLY as r
where
    b.BOARD_ID = r.BOARD_ID
    and b.CREATED_DATE like '2022-10-%'
order by
    CREATED_DATE, b.TITLE;