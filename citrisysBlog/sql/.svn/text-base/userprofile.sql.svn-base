
CREATE TABLE cb_user_rel_blog (
	user_id 		varchar2(254)	NOT NULL REFERENCES dps_user(id),
	blogs 			varchar2(254)	NOT NULL REFERENCES cb_blog(blog_id),
	PRIMARY KEY(user_id, blogs)
);

CREATE INDEX cb_user_rel_blog_user_idx ON cb_user_rel_blog(user_id, blogs);

CREATE TABLE cb_user_rel_comment (
	user_id 		varchar2(254)	NOT NULL REFERENCES dps_user(id),
	comments 		varchar2(254)	NOT NULL REFERENCES cb_comment(comment_id),
	PRIMARY KEY(user_id, comments)
);

CREATE INDEX cb_user_rel_comment_user_idx ON cb_user_rel_comment(user_id, comments);