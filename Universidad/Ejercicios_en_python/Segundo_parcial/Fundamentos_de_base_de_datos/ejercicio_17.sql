-- Tabla MATRONAS
CREATE TABLE MATRONAS (
    ID_Matrona INT AUTO_INCREMENT PRIMARY KEY,
    Nombre VARCHAR(100) NOT NULL,
    Apellidos VARCHAR(100) NOT NULL,
    Telefono VARCHAR(20),
    Centro_Atencion VARCHAR(100) -- Centro de salud donde atiende embarazadas
);

-- Tabla CENTROS
CREATE TABLE CENTROS (
    ID_Centro INT AUTO_INCREMENT PRIMARY KEY,
    Nombre VARCHAR(100) NOT NULL,
    Direccion VARCHAR(200),
    Tipo_Centro ENUM('Salud', 'Clases') NOT NULL -- Tipo del centro: Salud o Clases
);

-- Tabla HORARIOS (horarios de consulta de las matronas)
CREATE TABLE HORARIOS (
    ID_Horario INT AUTO_INCREMENT PRIMARY KEY,
    ID_Matrona INT NOT NULL,
    Dia_Semana ENUM('Lunes', 'Martes', 'Miércoles', 'Jueves', 'Viernes', 'Sábado', 'Domingo') NOT NULL,
    Horario TIME NOT NULL,
    ID_Centro INT NOT NULL,
    FOREIGN KEY (ID_Matrona) REFERENCES MATRONAS(ID_Matrona) ON DELETE CASCADE,
    FOREIGN KEY (ID_Centro) REFERENCES CENTROS(ID_Centro) ON DELETE CASCADE
);

-- Tabla CLASES
CREATE TABLE CLASES (
    ID_Clase INT AUTO_INCREMENT PRIMARY KEY,
    ID_Matrona INT NOT NULL,
    ID_Centro INT NOT NULL,
    Dia_Semana ENUM('Lunes', 'Martes', 'Miércoles', 'Jueves', 'Viernes', 'Sábado', 'Domingo') NOT NULL,
    Hora TIME NOT NULL,
    FOREIGN KEY (ID_Matrona) REFERENCES MATRONAS(ID_Matrona) ON DELETE CASCADE,
    FOREIGN KEY (ID_Centro) REFERENCES CENTROS(ID_Centro) ON DELETE CASCADE
);

-- Tabla EMBARAZADAS
CREATE TABLE EMBARAZADAS (
    ID_Embarazada INT AUTO_INCREMENT PRIMARY KEY,
    NSS VARCHAR(20) NOT NULL, -- Número de la seguridad social
    Nombre VARCHAR(100) NOT NULL,
    Apellidos VARCHAR(100) NOT NULL,
    Direccion VARCHAR(200),
    Fecha_Alta DATE NOT NULL, -- Fecha en la que se dio de alta
    Semana_Gestacion_Inicial INT NOT NULL, -- Semana de gestación en la que se dio de alta
    Matrona_Asignada INT NOT NULL,
    FOREIGN KEY (Matrona_Asignada) REFERENCES MATRONAS(ID_Matrona) ON DELETE CASCADE
);

-- Tabla ASISTENCIAS (relación entre embarazadas y clases)
CREATE TABLE ASISTENCIAS (
    ID_Asistencia INT AUTO_INCREMENT PRIMARY KEY,
    ID_Embarazada INT NOT NULL,
    ID_Clase INT NOT NULL,
    Fecha DATE NOT NULL,
    Edad INT NOT NULL,
    Semana_Gestacion INT NOT NULL,
    Numero_Hijos INT NOT NULL,
    FOREIGN KEY (ID_Embarazada) REFERENCES EMBARAZADAS(ID_Embarazada) ON DELETE CASCADE,
    FOREIGN KEY (ID_Clase) REFERENCES CLASES(ID_Clase) ON DELETE CASCADE
);
