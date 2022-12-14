-- Posts table
-- !Ups

CREATE TABLE Posts (
id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
title varchar(100) NOT NULL,
content varchar(200) NOT NULL
);

INSERT INTO Posts values (1, 'Abhilash', 'Engineer');
-- !Downs

DROP TABLE Posts
