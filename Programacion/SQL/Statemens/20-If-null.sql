SELECT * FROM users;

SELECT user_name, user_lastname, IFNULL(user_date, 0) FROM users;