SELECT *,
CASE
    WHEN user_date > 18 THEN 'Es mayor de edad'
    WHEN user_date >= 18 THEN "Acaba de cumplic la mayoria de edad"
    ELSE "Es menor de edad"
END AS user_datetext
FROM users;