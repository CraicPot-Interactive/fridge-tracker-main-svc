CREATE TABLE login(
 loginId BIGINT NOT NULL,
 userName VARCHAR(50) NOT NULL,
 password VARCHAR(50) NOT NULL
);

CREATE TABLE users(
userId BIGINT NOT NULL,
firstName VARCHAR(50),
surname VARCHAR(50),
emailAddress VARCHAR(50),
dateOfBirth DATE NOT NULL,
loginId BIGINT NOT NULL
);