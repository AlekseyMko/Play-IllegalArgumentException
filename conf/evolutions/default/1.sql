# --- Created by Aleksey Mykhailenko

# Creates initial tables for SNAPS application

# --- !Ups
CREATE TABLE ARTICLES (
    id   INT(11) NOT NULL AUTO_INCREMENT,
    text TEXT    NOT NULL,
    PRIMARY KEY (id)
);


CREATE TABLE COMMENTS (
    id         INT(11) NOT NULL AUTO_INCREMENT,
    article_id INT(11) NOT NULL,
    comment    TEXT    NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE LIKES (
    id         INT(11) NOT NULL AUTO_INCREMENT,
    article_id INT(11) NOT NULL,
    PRIMARY KEY (id)
);


INSERT INTO ARTICLES (text) VALUES ('article text');
INSERT INTO ARTICLES (text) VALUES ('enother article text');


INSERT INTO COMMENTS (article_id, comment) VALUES ('1', 'cool!');
INSERT INTO COMMENTS (article_id, comment) VALUES ('1', 'hey');
INSERT INTO COMMENTS (article_id, comment) VALUES ('2', 'good');
INSERT INTO COMMENTS (article_id, comment) VALUES ('2', 'morning');
INSERT INTO COMMENTS (article_id, comment) VALUES ('1', 'comment');


INSERT INTO LIKES (article_id) VALUES ('1');
INSERT INTO LIKES (article_id) VALUES ('2');
INSERT INTO LIKES (article_id) VALUES ('2');

# --- !Downs
DROP TABLE ARTICLES;
DROP TABLE COMMENTS;
DROP TABLE LIKES;


