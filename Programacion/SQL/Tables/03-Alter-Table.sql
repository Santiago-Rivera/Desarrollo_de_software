ALTER TABLE person8

ADD name_pets VARCHAR(150)

RENAME COLUMN name_pets TO description;

MODIFY COLUMN description VARCHAR(250)

DROP COLUMN description

SELECT * FROM person8;