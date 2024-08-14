SELECT * FROM users;

SELECT CONCAT("Nombre: ", user_name," ", "Apellidos: ", user_lastname) FROM users;

SELECT CONCAT("Nombre: ", user_name," ", "Apellidos: ", user_lastname) AS "Nombre completo" FROM users;
