SELECT * FROM users
LEFT JOIN dni
ON users.user_id = dni.user_id;

SELECT * FROM users_languages 
LEFT JOIN users ON users_languages.user_id = users.user_id 
LEFT JOIN languages ON users_languages.language_id = languages.language_id;