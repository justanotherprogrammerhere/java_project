CREATE TABLE user_details
(
   id          INT NOT NULL AUTO_INCREMENT,
   email       VARCHAR(255),
   first_name  VARCHAR(255),
   last_name   VARCHAR(255),
   password    VARCHAR(255),
   PRIMARY KEY (id)
);
