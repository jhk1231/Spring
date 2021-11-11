-- 회원
CREATE TABLE `test`.`Member` (
	`userid`   VARBINARY(20) NOT NULL COMMENT '아이디', -- 아이디
	`username` VARBINARY(20) NOT NULL COMMENT '이름', -- 이름
	`userage`  TINYINT       NOT NULL COMMENT '나이', -- 나이
	`gender`   VARBINARY(10) NOT NULL COMMENT '성별', -- 성별
	`city`     VARBINARY(50) NULL     COMMENT '도시' -- 도시
)
COMMENT '회원';

-- 회원
ALTER TABLE `test`.`Member`
	ADD CONSTRAINT `PK_Member` -- 회원 기본키
		PRIMARY KEY (
			`userid` -- 아이디
		);