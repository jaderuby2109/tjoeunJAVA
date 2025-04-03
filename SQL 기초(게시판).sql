-- 게시판 테이블 생성
CREATE TABLE `board` (
	`no`			INT NOT NULL AUTO_INCREMENT PRIMARY KEY COMMENT '게시글 번호',
	`title`			VARCHAR(100) NOT NULL COMMENT '제목',
	`writer`		VARCHAR(100) NOT NULL COMMENT '작성자',
	`content`		TEXT NULL COMMENT '내용',
	`created_at`	TIMESTAMP NOT NULL DEFAULT now() COMMENT '등록일자',
	`updated_at`	TIMESTAMP NOT NULL DEFAULT now() COMMENT '수정일자'
) COMMENT = '게시판';

-- 등록
INSERT INTO board (title, writer, content) 
		   VALUES ('게시글 제목', 'ALOHA', '데이터베이스');

-- 전체 조회 (목록)
SELECT * FROM board;

-- 조회
SELECT * FROM board WHERE no = 1;

-- 수정
UPDATE board
   SET title = '수정'
      ,writer = '수정'
      ,content = '수정'
      ,updated_at = now()
WHERE no = 1;

-- 삭제
DELETE FROM board WHERE no = 1;