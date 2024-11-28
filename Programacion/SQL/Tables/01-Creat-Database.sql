CREATE TABLE pernos (
    id int,
    name VARCHAR(100),
    lastname VARCHAR(100),
    age int, 
    email VARCHAR(50),
    created date
);

CREATE TABLE person2(
    id int NOT NULL,
    name VARCHAR(100) NOT NULL,
    lastname VARCHAR(100) NOT NULL,
    age VARCHAR(50),
    created date
);

CREATE TABLE person3(
    id int NOT NULL,
    name VARCHAR(100) NOT NULL,
    lastname VARCHAR(100) NOT NULL,
    age VARCHAR(50),
    created datetime,
    UNIQUE(id)
);

CREATE TABLE person4(
    id int NOT NULL,
    name VARCHAR(100) NOT NULL,
    lastname VARCHAR(100) NOT NULL,
    age VARCHAR(50),
    created datetime,
    UNIQUE(id),
    PRIMARY KEY(id)
);

CREATE TABLE person5(
    id int NOT NULL,
    name VARCHAR(100) NOT NULL,
    lastname VARCHAR(100) NOT NULL,
    age VARCHAR(50),
    created datetime,
    UNIQUE(id),
    PRIMARY KEY(id),
    CHECK(age>=18)
);

CREATE TABLE person6(
    id int NOT NULL,
    name VARCHAR(100) NOT NULL,
    lastname VARCHAR(100) NOT NULL,
    age VARCHAR(50),
    created datetime DEFAULT CURRENT_TIMESTAMP(),
    UNIQUE(id),
    PRIMARY KEY(id),
    CHECK(age>=18)
);

CREATE TABLE person7(
    id int NOT NULL AUTO_INCREMENT,
    name VARCHAR(45) NOT NULL,
    lastname VARCHAR(45),
    age int,
    email VARCHAR(45),
    ceated datetime DEFAULT CURRENT_TIMESTAMP(),
    UNIQUE (id),
    PRIMARY KEY(id),
    CHECK(age>=18)
);