-- 학생
CREATE TABLE `test`.`Student` (
	`hakbun` CHAR(4)      NOT NULL COMMENT '학번', -- 학번
	`name`   VARCHAR(20)  NOT NULL COMMENT '이름', -- 이름
	`kor`    TINYINT      NOT NULL DEFAULT 0 COMMENT '국어', -- 국어
	`eng`    TINYINT      NOT NULL DEFAULT 0 COMMENT '영어', -- 영어
	`mat`    TINYINT      NOT NULL DEFAULT 0 COMMENT '수학', -- 수학
	`edp`    TINYINT      NOT NULL DEFAULT 0 COMMENT '전산', -- 전산
	`tot`    SMALLINT     NULL     DEFAULT 0 COMMENT '총점', -- 총점
	`avg`    DECIMAL(5,2) NULL     DEFAULT 0.00 COMMENT '평균', -- 평균
	`grade`  CHAR(1)      NULL     COMMENT '학점' -- 학점
)
COMMENT '학생';

-- 학생
ALTER TABLE `test`.`Student`
	ADD CONSTRAINT `PK_Student` -- 학생
		PRIMARY KEY (
			`hakbun` -- 학번
		);