/*Relacion uno a uno*/
CREATE TABLE dni (
    dni_id int AUTO_INCREMENT PRIMARY KEY,
    dni_number int NOT NULL,
    user_id int,
    UNIQUE(dni_id),
    FOREIGN KEY(user_id) REFERENCES users(user_id)
);

/*Relacion uno a n*/

CREATE TABLE company(
    company_id int AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL
);

ALTER TABLE users
ADD company_id VARCHAR(100);

ALTER TABLE users
MODIFY COLUMN company_id int;

ALTER TABLE users 
ADD CONSTRAINT fk_company
FOREIGN KEY(company_id) REFERENCES company(company_id)

SELECT * FROM users;

/*Relacion n a n*/

CREATE TABLE languages(
    language_id int AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL
);

CREATE TABLE users_languages(
    users_language_id int AUTO_INCREMENT PRIMARY KEY,
    user_id int,
    language_id int,
    FOREIGN KEY(user_id) REFERENCES users(user_id),
    FOREIGN KEY(language_id) REFERENCES languages(language_id),
    UNIQUE (user_id, language_id)
);

/*INSERT Y UPDATE uno a uno de dni*/

INSERT INTO dni(dni_number, user_id) VALUES (123, 1);
INSERT INTO dni(dni_number, user_id) VALUES (456, 2);
INSERT INTO dni(dni_number, user_id) VALUES (789, 3);
INSERT INTO dni(dni_number) VALUES (10);
SELECT * FROM dni;

/*INSERT Y UPDATE uno a n de companys*/

INSERT INTO company(name) VALUES ("Apple");
INSERT INTO company(name) VALUES ("Tesla"); 
INSERT INTO company(name) VALUES ("Asus");

UPDATE users SET company_id = 1 WHERE user_id = 1;
UPDATE users SET company_id = 2 WHERE user_id = 2;
UPDATE users SET company_id = 3 WHERE user_id = 3;
SELECT * FROM users;

/*INSERT Y UPDATE n a n de languages*/

INSERT INTO languages(name) VALUES ("Java");
INSERT INTO languages(name) VALUES ("JavaScript");
INSERT INTO languages(name) VALUES ("TypeScript");
INSERT INTO languages(name) VALUES ("Swift");
INSERT INTO languages(name) VALUES ("Kotclin");
INSERT INTO languages(name) VALUES ("Python");

INSERT INTO users_languages(user_id, language_id) VALUES (1, 6);
INSERT INTO users_languages(user_id, language_id) VALUES (2, 2);
INSERT INTO users_languages(user_id, language_id) VALUES (3, 5);
INSERT INTO users_languages(user_id, language_id) VALUES (4, 4);

SELECT * FROM users_languages;
SELECT * FROM users;