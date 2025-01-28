-- Tabla SOCIO
CREATE TABLE SOCIO (
    ID_Socio INT AUTO_INCREMENT PRIMARY KEY,
    Codigo VARCHAR(10) NOT NULL,
    Nombre VARCHAR(100) NOT NULL,
    Apellido VARCHAR(100) NOT NULL,
    Direccion VARCHAR(255),
    Telefono VARCHAR(15)
);

-- Tabla DIRECTOR
CREATE TABLE DIRECTOR (
    ID_Director INT AUTO_INCREMENT PRIMARY KEY,
    Nombre VARCHAR(100) NOT NULL,
    Apellido VARCHAR(100) NOT NULL
);

-- Tabla ACTOR
CREATE TABLE ACTOR (
    ID_Actor INT AUTO_INCREMENT PRIMARY KEY,
    Nombre VARCHAR(100) NOT NULL,
    Apellido VARCHAR(100) NOT NULL
);

-- Tabla GÉNERO
CREATE TABLE GENERO (
    ID_Genero INT AUTO_INCREMENT PRIMARY KEY,
    Nombre VARCHAR(50) NOT NULL
);

-- Tabla PELÍCULA
CREATE TABLE PELICULA (
    ID_Pelicula INT AUTO_INCREMENT PRIMARY KEY,
    Titulo VARCHAR(150) NOT NULL,
    Año INT,
    Duracion INT, -- Duración en minutos
    Calificacion DECIMAL(2, 1) -- Calificación de 0.0 a 10.0
);

-- Tabla CINTA
CREATE TABLE CINTA (
    ID_Cinta INT AUTO_INCREMENT PRIMARY KEY,
    Numero INT NOT NULL,
    ID_Pelicula INT NOT NULL,
    FOREIGN KEY (ID_Pelicula) REFERENCES PELICULA(ID_Pelicula) ON DELETE CASCADE
);

-- Tabla PRÉSTAMO
CREATE TABLE PRESTAMO (
    ID_Prestamo INT AUTO_INCREMENT PRIMARY KEY,
    ID_Socio INT NOT NULL,
    ID_Cinta INT NOT NULL,
    Fecha_Prestamo DATE NOT NULL,
    Fecha_Devolucion DATE,
    FOREIGN KEY (ID_Socio) REFERENCES SOCIO(ID_Socio) ON DELETE CASCADE,
    FOREIGN KEY (ID_Cinta) REFERENCES CINTA(ID_Cinta) ON DELETE CASCADE
);

-- Tabla LISTA_ESPERA
CREATE TABLE LISTA_ESPERA (
    ID_Lista INT AUTO_INCREMENT PRIMARY KEY,
    ID_Socio INT NOT NULL,
    ID_Pelicula INT NOT NULL,
    FOREIGN KEY (ID_Socio) REFERENCES SOCIO(ID_Socio) ON DELETE CASCADE,
    FOREIGN KEY (ID_Pelicula) REFERENCES PELICULA(ID_Pelicula) ON DELETE CASCADE
);

-- Tabla PREFERENCIAS_DIRECTOR
CREATE TABLE PREFERENCIAS_DIRECTOR (
    ID_Socio INT NOT NULL,
    ID_Director INT NOT NULL,
    PRIMARY KEY (ID_Socio, ID_Director),
    FOREIGN KEY (ID_Socio) REFERENCES SOCIO(ID_Socio) ON DELETE CASCADE,
    FOREIGN KEY (ID_Director) REFERENCES DIRECTOR(ID_Director) ON DELETE CASCADE
);

-- Tabla PREFERENCIAS_ACTOR
CREATE TABLE PREFERENCIAS_ACTOR (
    ID_Socio INT NOT NULL,
    ID_Actor INT NOT NULL,
    PRIMARY KEY (ID_Socio, ID_Actor),
    FOREIGN KEY (ID_Socio) REFERENCES SOCIO(ID_Socio) ON DELETE CASCADE,
    FOREIGN KEY (ID_Actor) REFERENCES ACTOR(ID_Actor) ON DELETE CASCADE
);

-- Tabla PREFERENCIAS_GÉNERO
CREATE TABLE PREFERENCIAS_GENERO (
    ID_Socio INT NOT NULL,
    ID_Genero INT NOT NULL,
    PRIMARY KEY (ID_Socio, ID_Genero),
    FOREIGN KEY (ID_Socio) REFERENCES SOCIO(ID_Socio) ON DELETE CASCADE,
    FOREIGN KEY (ID_Genero) REFERENCES GENERO(ID_Genero) ON DELETE CASCADE
);

-- Tabla DIRIGE
CREATE TABLE DIRIGE (
    ID_Director INT NOT NULL,
    ID_Pelicula INT NOT NULL,
    PRIMARY KEY (ID_Director, ID_Pelicula),
    FOREIGN KEY (ID_Director) REFERENCES DIRECTOR(ID_Director) ON DELETE CASCADE,
    FOREIGN KEY (ID_Pelicula) REFERENCES PELICULA(ID_Pelicula) ON DELETE CASCADE
);

-- Tabla REPARTO
CREATE TABLE REPARTO (
    ID_Actor INT NOT NULL,
    ID_Pelicula INT NOT NULL,
    PRIMARY KEY (ID_Actor, ID_Pelicula),
    FOREIGN KEY (ID_Actor) REFERENCES ACTOR(ID_Actor) ON DELETE CASCADE,
    FOREIGN KEY (ID_Pelicula) REFERENCES PELICULA(ID_Pelicula) ON DELETE CASCADE
);

-- Tabla TRATA
CREATE TABLE TRATA (
    ID_Genero INT NOT NULL,
    ID_Pelicula INT NOT NULL,
    PRIMARY KEY (ID_Genero, ID_Pelicula),
    FOREIGN KEY (ID_Genero) REFERENCES GENERO(ID_Genero) ON DELETE CASCADE,
    FOREIGN KEY (ID_Pelicula) REFERENCES PELICULA(ID_Pelicula) ON DELETE CASCADE
);
