CREATE TABLE ATGCORE_O.cts_store_order_price_info
( amount_info_id varchar2(40) not null,
  rewards_points number(10) not null,
  CONSTRAINT cts_store_order_price_info_pk PRIMARY KEY (amount_info_id),
  CONSTRAINT cts_store_order_price_info_fk
    FOREIGN KEY (amount_info_id)
    references ATGCORE_O.dcspp_amount_info(amount_info_id)
);



create table cts_rec_viewed_prod (
	id	varchar2(40)	not null,
	product_id	varchar2(40)	null,
	site_id	varchar2(40)	null,
	time_stamp	date	not null
,constraint rec_viewed_prod_p primary key (id));


create table cts_rec_viewed (
	user_id	varchar2(40)	not null,
	sequence_id	integer	not null,
	rec_viewed_prod	varchar2(40)	not null
,constraint crs_rec_viewed_p primary key (user_id,sequence_id));








create table cts_points (
	points_id	varchar2(40)	not null,
	available	number	(10),
	reserved	number	(10),
constraint cts_points primary key (points_id));


create table cts_user_points (
user_id	varchar2(40)	not null,
points_id	varchar2(40)	not null);




create table cts_points_pg (
payment_group_id	varchar2(40)	not null,
points_item_id	varchar2(40)	not null,	
constraint cts_points_pg primary key (payment_group_id));