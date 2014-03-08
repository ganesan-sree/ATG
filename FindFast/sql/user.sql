drop table ff_user;

CREATE TABLE ff_user (
        user_id                 varchar2(254)   NOT NULL REFERENCES dps_user(id),
        total_number_of_login_attempts varchar2(254)    NULL,
        last_login_activity_date DATE   NULL,
        is_locked               varchar2(254)   NULL,
        PRIMARY KEY(user_id)
);


