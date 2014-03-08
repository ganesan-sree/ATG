-- drop table cb_blog_rel_post;

-- drop table cb_blog;

-- drop table cb_post_author;

-- drop table cb_post_rel_comment;

-- drop table cb_post;

-- drop table cb_comment;

CREATE TABLE cb_comment (
	comment_id 		varchar2(254)	NOT NULL,
	description 		varchar2(254)	NULL,
	user_id 		varchar2(254)	NULL REFERENCES dps_user(id),
	PRIMARY KEY(comment_id)
);

CREATE TABLE cb_post (
	post_id 		varchar2(254)	NOT NULL,
	title 			varchar2(254)	NULL,
	content 		varchar2(254)	NULL,
	PRIMARY KEY(post_id)
);

CREATE TABLE cb_post_rel_comment (
	post_id 		varchar2(254)	NOT NULL REFERENCES cb_post(post_id),
	comments 		varchar2(254)	NOT NULL REFERENCES cb_comment(comment_id),
	PRIMARY KEY(post_id, comments)
);

CREATE INDEX cb_post_rel_comment_post_idx ON cb_post_rel_comment(post_id, comments);

CREATE TABLE cb_post_author (
	post_id 		varchar2(254)	NOT NULL REFERENCES cb_post(post_id),
	author 			varchar2(254)	NULL REFERENCES dps_user(id),
	PRIMARY KEY(post_id)
);

CREATE INDEX cb_post_author_post_idx ON cb_post_author(post_id);

CREATE TABLE cb_blog (
	blog_id 		varchar2(254)	NOT NULL,
	blog_title 		varchar2(254)	NULL,
	blog_url 		varchar2(254)	NULL,
	PRIMARY KEY(blog_id)
);

CREATE TABLE cb_blog_rel_post (
	blog_id 		varchar2(254)	NOT NULL REFERENCES cb_blog(blog_id),
	posts 			varchar2(254)	NOT NULL REFERENCES cb_post(post_id),
	PRIMARY KEY(blog_id, posts)
);

CREATE INDEX cb_blog_rel_post_blog_idx ON cb_blog_rel_post(blog_id, posts);

