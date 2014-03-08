-- drop table dcs_home_delivery;

CREATE TABLE dcs_home_delivery (
	id 			varchar2(254)	NOT NULL REFERENCES dcspp_pay_group(payment_group_id),
	prefix 			varchar2(254)	NULL,
	first_name 		varchar2(254)	NULL,
	middle_name 		varchar2(254)	NULL,
	last_name 		varchar2(254)	NULL,
	suffix 			varchar2(254)	NULL,
	job_title 		varchar2(254)	NULL,
	company_name 		varchar2(254)	NULL,
	address_1 		varchar2(254)	NULL,
	address_2 		varchar2(254)	NULL,
	address_3 		varchar2(254)	NULL,
	city 			varchar2(254)	NULL,
	county 			varchar2(254)	NULL,
	state 			varchar2(254)	NULL,
	postal_code 		varchar2(254)	NULL,
	country 		varchar2(254)	NULL,
	phone_number 		varchar2(254)	NULL,
	fax_number 		varchar2(254)	NULL,
	email 			varchar2(254)	NULL,
	is_delivered 		number(1)	NULL,
	CHECK (is_delivered IN (0, 1)),
	PRIMARY KEY(id)
);

CREATE INDEX dcs_home_delivery_idx ON dcs_home_delivery(id);

CREATE TABLE dcs_paypal (
	id 			varchar2(254)	NOT NULL REFERENCES dcspp_pay_group(payment_group_id),
	prefix 			varchar2(254)	NULL,
	first_name 		varchar2(254)	NULL,
	middle_name 		varchar2(254)	NULL,
	last_name 		varchar2(254)	NULL,
	suffix 			varchar2(254)	NULL,
	job_title 		varchar2(254)	NULL,
	company_name 		varchar2(254)	NULL,
	address_1 		varchar2(254)	NULL,
	address_2 		varchar2(254)	NULL,
	address_3 		varchar2(254)	NULL,
	city 			varchar2(254)	NULL,
	county 			varchar2(254)	NULL,
	state 			varchar2(254)	NULL,
	postal_code 		varchar2(254)	NULL,
	country 		varchar2(254)	NULL,
	phone_number 		varchar2(254)	NULL,
	fax_number 		varchar2(254)	NULL,
	email 			varchar2(254)	NULL,
	paypal_message 		varchar2(254)	NULL,
	token 			varchar2(254)	NULL,
	payer_id 		varchar2(254)	NULL,
	PRIMARY KEY(id)
);

CREATE INDEX dcs_paypal_idx ON dcs_paypal(id);

CREATE TABLE dcs_paypal_status (
	status_id 		varchar2(254)	NOT NULL REFERENCES dcspp_pay_status(status_id),
	paypal_message 		varchar2(254)	NULL,
	auth_expiration 	DATE	NULL,
	PRIMARY KEY(status_id)
);

CREATE INDEX dcs_paypal_status_status_idx ON dcs_paypal_status(status_id);




