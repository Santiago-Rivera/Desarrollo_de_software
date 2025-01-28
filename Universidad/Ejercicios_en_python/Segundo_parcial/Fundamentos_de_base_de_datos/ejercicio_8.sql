-- Tabla AUTORES
CREATE TABLE AUTORES (
    ID_Autor INT AUTO_INCREMENT PRIMARY KEY,
    Nombre VARCHAR(100) NOT NULL,
    Apellidos VARCHAR(150) NOT NULL,
    Centro_Trabajo VARCHAR(150),
    Email VARCHAR(150),
    Temas_Trabajo TEXT
);
-- Tabla ARTICULOS
CREATE TABLE ARTICULOS (
    ID_Articulo INT AUTO_INCREMENT PRIMARY KEY,
    Titulo VARCHAR(200) NOT NULL,
    Palabras_Clave TEXT,
    Email_Contacto VARCHAR(150),
    Tiene_Copia BOOLEAN NOT NULL,
    Ubicacion_Copia VARCHAR(100) -- Laboratorio o despacho
);

-- Relación muchos a muchos entre ARTICULOS y AUTORES
CREATE TABLE AUTORES_ARTICULOS (
    ID_Autor INT NOT NULL,
    ID_Articulo INT NOT NULL,
    PRIMARY KEY (ID_Autor, ID_Articulo),
    FOREIGN KEY (ID_Autor) REFERENCES AUTORES(ID_Autor) ON DELETE CASCADE,
    FOREIGN KEY (ID_Articulo) REFERENCES ARTICULOS(ID_Articulo) ON DELETE CASCADE
);

-- Tabla INFORMES_TECNICOS
CREATE TABLE INFORMES_TECNICOS (
    ID_Informe INT AUTO_INCREMENT PRIMARY KEY,
    ID_Articulo INT NOT NULL,
    Numero INT NOT NULL,
    Centro_Publicacion VARCHAR(150) NOT NULL,
    Mes_Publicacion INT NOT NULL,
    Anio_Publicacion INT NOT NULL,
    FOREIGN KEY (ID_Articulo) REFERENCES ARTICULOS(ID_Articulo) ON DELETE CASCADE
);

-- Tabla CONGRESOS
CREATE TABLE CONGRESOS (
    ID_Congreso INT AUTO_INCREMENT PRIMARY KEY,
    Nombre VARCHAR(150) NOT NULL,
    Tipo VARCHAR(50) NOT NULL, -- Nacional o Internacional
    Frecuencia VARCHAR(50) NOT NULL, -- Anual, etc.
    Anio_Primer_Congreso INT,
    Pais VARCHAR(100) -- Solo para congresos internacionales
);

-- Tabla ACTAS_CONGRESOS
CREATE TABLE ACTAS_CONGRESOS (
    ID_Acta INT AUTO_INCREMENT PRIMARY KEY,
    ID_Articulo INT NOT NULL,
    ID_Congreso INT NOT NULL,
    Edicion INT NOT NULL,
    Ciudad VARCHAR(100) NOT NULL,
    Fecha_Inicio DATE NOT NULL,
    Fecha_Fin DATE NOT NULL,
    FOREIGN KEY (ID_Articulo) REFERENCES ARTICULOS(ID_Articulo) ON DELETE CASCADE,
    FOREIGN KEY (ID_Congreso) REFERENCES CONGRESOS(ID_Congreso) ON DELETE CASCADE
);

-- Tabla REVISTAS_CIENTIFICAS
CREATE TABLE REVISTAS_CIENTIFICAS (
    ID_Revista INT AUTO_INCREMENT PRIMARY KEY,
    Nombre VARCHAR(150) NOT NULL,
    Editor VARCHAR(100),
    Anio_Inicio_Publicacion INT,
    Frecuencia VARCHAR(50), -- Mensual, trimestral, etc.
    Temas TEXT
);

-- Tabla ARTICULOS_REVISTAS
CREATE TABLE ARTICULOS_REVISTAS (
    ID_Articulo INT NOT NULL,
    ID_Revista INT NOT NULL,
    Numero_Revista INT NOT NULL,
    Paginas VARCHAR(50), -- Por ejemplo: "512-519"
    Anio_Publicacion INT NOT NULL,
    PRIMARY KEY (ID_Articulo, ID_Revista),
    FOREIGN KEY (ID_Articulo) REFERENCES ARTICULOS(ID_Articulo) ON DELETE CASCADE,
    FOREIGN KEY (ID_Revista) REFERENCES REVISTAS_CIENTIFICAS(ID_Revista) ON DELETE CASCADE
);
