CREATE TABLE Users
(
	userid VARCHAR(12) PRIMARY KEY,
	name VARCHAR(20) NOT NULL,
	gender VARCHAR(10),
	city VARCHAR(30)
);

INSERT INTO Users VALUES('jimin', '한지민', '여', '서울');
COMMIT;