CREATE TABLE ATGCORE_O.cts_store_order_price_info
( amount_info_id varchar2(40) not null,
  rewards_points number(10) not null,
  CONSTRAINT cts_store_order_price_info_pk PRIMARY KEY (amount_info_id),
  CONSTRAINT cts_store_order_price_info_fk
    FOREIGN KEY (amount_info_id)
    references ATGCORE_O.dcspp_amount_info(amount_info_id)
);
