-- �л�
CREATE TABLE `test`.`Student` (
	`hakbun` CHAR(4)      NOT NULL COMMENT '�й�', -- �й�
	`name`   VARCHAR(20)  NOT NULL COMMENT '�̸�', -- �̸�
	`kor`    TINYINT      NOT NULL DEFAULT 0 COMMENT '����', -- ����
	`eng`    TINYINT      NOT NULL DEFAULT 0 COMMENT '����', -- ����
	`mat`    TINYINT      NOT NULL DEFAULT 0 COMMENT '����', -- ����
	`edp`    TINYINT      NOT NULL DEFAULT 0 COMMENT '����', -- ����
	`tot`    SMALLINT     NULL     DEFAULT 0 COMMENT '����', -- ����
	`avg`    DECIMAL(5,2) NULL     DEFAULT 0.00 COMMENT '���', -- ���
	`grade`  CHAR(1)      NULL     COMMENT '����' -- ����
)
COMMENT '�л�';

-- �л�
ALTER TABLE `test`.`Student`
	ADD CONSTRAINT `PK_Student` -- �л�
		PRIMARY KEY (
			`hakbun` -- �й�
		);