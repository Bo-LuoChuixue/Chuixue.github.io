USE tedu;
DROP TABLE IF EXISTS user;
CREATE TABLE user
(
    id       INT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(20),
    password VARCHAR(20),
    nickname VARCHAR(20),
    age      TINYINT
) CHARSET = UTF8;

INSERT INTO user(username, password, nickname, age)
VALUES ('Lucy', '123456', 'lucy', 25);

CREATE TABLE IF NOT EXISTS article(
    id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(20),
    author VARCHAR(20),
    content TEXT
)CHARSET=UTF8;

