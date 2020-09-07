DROP TABLE IF EXISTS `book`;

CREATE TABLE book(
    id INT PRIMARY KEY AUTO_INCREMENT,
    NAME VARCHAR(12) NOT NULL,
    author VARCHAR(12),
    price FLOAT,
    VERSION VARCHAR(12)
)
INSERT INTO book
VALUES
(NULL,'疯狂Java讲义','李刚',131.00,'第五版'),(NULL,'疯狂Android讲义','李刚',130.00,'第二版')