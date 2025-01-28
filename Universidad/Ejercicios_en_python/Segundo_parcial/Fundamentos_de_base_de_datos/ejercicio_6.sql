USE ejercicio_6;

-- Tabla de Departamentos
CREATE TABLE Departamento (
    id_departamento INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL
);

-- Tabla de Áreas de Conocimiento
CREATE TABLE AreaConocimiento (
    id_area INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    id_departamento INT NOT NULL,
    FOREIGN KEY (id_departamento) REFERENCES Departamento(id_departamento)
);

-- Tabla de Titulaciones
CREATE TABLE Titulacion (
    id_titulacion INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL
);

-- Tabla de Asignaturas
CREATE TABLE Asignatura (
    id_asignatura INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    codigo VARCHAR(20) NOT NULL,
    tipo ENUM('Optativa', 'Obligatoria') NOT NULL,
    curso INT NOT NULL,
    creditos_teoricos DECIMAL(3, 1) NOT NULL,
    creditos_laboratorio DECIMAL(3, 1) NOT NULL,
    duracion VARCHAR(50) NOT NULL,
    id_area INT NOT NULL,
    FOREIGN KEY (id_area) REFERENCES AreaConocimiento(id_area)
);

-- Tabla de Profesores
CREATE TABLE Profesor (
    id_profesor INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    apellidos VARCHAR(100) NOT NULL,
    despacho VARCHAR(20) NOT NULL,
    id_area INT NOT NULL,
    FOREIGN KEY (id_area) REFERENCES AreaConocimiento(id_area)
);

-- Tabla de Horarios de Consulta
CREATE TABLE HorarioConsulta (
    id_horario INT AUTO_INCREMENT PRIMARY KEY,
    id_profesor INT NOT NULL,
    dia ENUM('Lunes', 'Martes', 'Miércoles', 'Jueves', 'Viernes') NOT NULL,
    hora_inicio TIME NOT NULL,
    hora_fin TIME NOT NULL,
    FOREIGN KEY (id_profesor) REFERENCES Profesor(id_profesor)
);

-- Tabla de relación entre Asignaturas y Titulaciones
CREATE TABLE AsignaturaTitulacion (
    id_asignatura INT NOT NULL,
    id_titulacion INT NOT NULL,
    libre_configuracion BOOLEAN NOT NULL,
    PRIMARY KEY (id_asignatura, id_titulacion),
    FOREIGN KEY (id_asignatura) REFERENCES Asignatura(id_asignatura),
    FOREIGN KEY (id_titulacion) REFERENCES Titulacion(id_titulacion)
);

-- Tabla de relación entre Profesores y Asignaturas
CREATE TABLE ProfesorAsignatura (
    id_profesor INT NOT NULL,
    id_asignatura INT NOT NULL,
    PRIMARY KEY (id_profesor, id_asignatura),
    FOREIGN KEY (id_profesor) REFERENCES Profesor(id_profesor),
    FOREIGN KEY (id_asignatura) REFERENCES Asignatura(id_asignatura)
);
