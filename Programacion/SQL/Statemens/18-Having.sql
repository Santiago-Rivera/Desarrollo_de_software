SELECT * FROM users;

SELECT * FROM users HAVING user_date > 19;

SELECT COUNT(user_date) FROM users HAVING COUNT(user_date) > 0;