SELECT * FROM users
RIGHT JOIN dni
ON users.user_id = dni.user_id;

SELECT * FROM users_languages 
RIGHT JOIN users ON users_languages.user_id = users.user_id 
RIGHT JOIN languages ON users_languages.language_id = languages.language_id;