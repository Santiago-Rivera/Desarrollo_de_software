SELECT * FROM users;

SELECT MAX(user_date) FROM users GROUP BY user_date;

SELECT COUNT(user_date), user_date FROM users GROUP BY user_date;

SELECT COUNT(user_date), user_date FROM users WHERE user_date < 46 GROUP BY user_date ORDER BY user_date ASC;