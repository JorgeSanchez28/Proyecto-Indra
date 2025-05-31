drop database Indra;
Create database Indra;
use Indra;

create table Organizador (
Organizador_ID int primary key ,
Nombre varchar(50) ,
Contacto_correo varchar(50) ,
Contacto_teléfono varchar(50)
);

create table Categoría (
Categoría_ID int primary key ,
Nombre varchar(50)
);

create table Ubicación (
Ubicación_ID int primary key , 
Dirección varchar(50) ,
Ciudad varchar(50) ,
País varchar(50)
);

create table Evento (
Evento_id  int  primary key,
Nombre varchar(50),
Fecha date ,
Duración int ,
Descripción varchar(250) ,
Organizador_ID int ,
Categoría_ID int ,
Ubicación_ID int ,
foreign key (Ubicación_ID) references Ubicación(Ubicación_ID) ,
foreign key (Categoría_ID) references Categoría(Categoría_ID) , 
foreign key (Organizador_ID) references Organizador(Organizador_ID)
);

create table Usuario (
Usuario_ID int primary key ,
Nombre varchar(50) ,
Correo varchar(50) ,
Contraseña varchar(50)
);

create table Inscripción (
Inscripción_ID int primary key ,
Fecha_inscripción date ,
Usuario_ID int ,
Evento_ID int ,
foreign key (Usuario_ID) references Usuario(Usuario_ID) ,
foreign key (Evento_ID) references Evento(Evento_ID)
);

-- Ejemplo de Inserts
INSERT INTO Evento (Evento_id, Nombre, Fecha, Duración, Descripción, Organizador_ID, Categoría_ID, Ubicación_ID) 
VALUES (1, 'Huerto Urbano', '2025-06-15', 4, 'Taller sobre cultivo sostenible en huertos urbanos.', 1, 1, 1);

INSERT INTO Evento (Evento_id, Nombre, Fecha, Duración, Descripción, Organizador_ID, Categoría_ID, Ubicación_ID) 
VALUES (2, 'Conferencia de Energía Renovable', '2025-07-10', 6, 'Expertos discuten sobre el futuro de la energía renovable.', 2, 2, 2);

INSERT INTO Evento (Evento_id, Nombre, Fecha, Duración, Descripción, Organizador_ID, Categoría_ID, Ubicación_ID) 
VALUES (3, 'Manifestación por la Sostenibilidad', '2025-08-20', 3, 'Marcha pacífica en apoyo a políticas ambientales.', 3, 3, 3);


-- Ejemplo de Select
SELECT * FROM Eventos WHERE Categoría_ID = 3;

-- Ejemplo de Delete
DELETE FROM Eventos WHERE Evento_id = 2;

-- Ejemplo de Update
UPDATE Eventos 
SET Duración = 5 
WHERE Nombre = 'Huerto Urbano';

-- Ejemplo de Índice
CREATE INDEX idx_categoria_eventos ON Eventos (Categoría_ID);

-- Ejemplo de Partición
ALTER TABLE Eventos 
PARTITION BY RANGE (Fecha) (
    PARTITION p2025_early VALUES LESS THAN ('2025-07-01'),
    PARTITION p2025_mid VALUES LESS THAN ('2025-09-01'),
    PARTITION p2025_late VALUES LESS THAN (MAXVALUE)
);

-- Ejemplo de Vista
CREATE VIEW vista_eventos_simple AS
SELECT Nombre, Fecha FROM Eventos;

SELECT * FROM vista_eventos_simple;


