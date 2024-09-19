/*Join 1 a 1*/

SELECT * FROM users
INNER JOIN dni;

SELECT * FROM users
INNER JOIN dni
ON users.user_id = dni.user_id;

SELECT * FROM users
JOIN dni
ON users.user_id = dni.user_id;

/*Join 1 a n*/

SELECT * FROM users
JOIN company
ON users.company_id = company.company_id;

/*Join n a n*/

SELECT * FROM users_languages 
JOIN users ON users_languages.user_id = users.user_id 
JOIN languages ON users_languages.language_id = languages.language_id;