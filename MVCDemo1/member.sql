-- ȸ��
CREATE TABLE `test`.`Member` (
	`userid`   VARBINARY(20) NOT NULL COMMENT '���̵�', -- ���̵�
	`username` VARBINARY(20) NOT NULL COMMENT '�̸�', -- �̸�
	`userage`  TINYINT       NOT NULL COMMENT '����', -- ����
	`gender`   VARBINARY(10) NOT NULL COMMENT '����', -- ����
	`city`     VARBINARY(50) NULL     COMMENT '����' -- ����
)
COMMENT 'ȸ��';

-- ȸ��
ALTER TABLE `test`.`Member`
	ADD CONSTRAINT `PK_Member` -- ȸ�� �⺻Ű
		PRIMARY KEY (
			`userid` -- ���̵�
		);