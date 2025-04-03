-- ctrl + enter : 커서 실행

-- 테스트 계정 생성
-- 설치할때 만들었음
-- CREATE USER 'sunflower'@'%' IDENTIFIED BY '123456';

-- 권한 부여
GRANT ALL PRIVILEGES ON *.* TO 'sunflower'@'%' WITH GRANT OPTION;

-- 스키마 생성
CREATE DATABASE aloha;

-- 테이블 생성
CREATE TABLE Posts (
    post_id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    content TEXT,
    author VARCHAR(100) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
) COMMENT = '게시글';

-- 데이터 추가
INSERT INTO Posts (title, content, author) 
		   VALUES ('게시글 제목', '게시글 내용', '작성자');

-- 데이터 조회
SELECT * FROM Posts;

-- 데이터 수정
UPDATE Posts SET title = '수정된 제목' WHERE post_id = 1;

-- 데이터 삭제
DELETE FROM Posts WHERE post_id = 1;

-- 테이블 수정
ALTER TABLE Posts ADD views INT DEFAULT 0;

-- 테이블 구조 확인
DESC posts;

-- 테이블 삭제
DROP TABLE Posts;