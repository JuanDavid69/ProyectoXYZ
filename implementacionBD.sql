DROP TABLE IF EXISTS sedes CASCADE;
CREATE TABLE sedes
(
	id_sede SERIAL PRIMARY KEY,
	direccion VARCHAR(30) NOT NULL,
	ciudad VARCHAR(30) NOT NULL,
	telefono VARCHAR(30) NOT NULL

);

DROP TABLE IF EXISTS usuarios CASCADE;
CREATE TABLE usuarios
(
	cedula VARCHAR(30) PRIMARY KEY,
	password VARCHAR(30),
	estado VARCHAR(30) NOT NULL,
	nombre VARCHAR(60) NOT NULL,
	cargo VARCHAR(30),
	salario FLOAT NOT NULL,
	direccion VARCHAR(50),
	id_sede SERIAL,
	telefono VARCHAR(30),

	FOREIGN KEY (id_sede) REFERENCES sedes (id_sede) ON DELETE CASCADE
);

DROP TABLE IF EXISTS inventario CASCADE;
CREATE TABLE inventario
(
	id_producto SERIAL PRIMARY KEY,
	producto VARCHAR(30) NOT NULL,
	cantidad VARCHAR(30) NOT NULL,
	precio_unidad FLOAT NOT NULL
);

DROP TABLE IF EXISTS ventas CASCADE;
CREATE TABLE ventas
(
	id_venta SERIAL PRIMARY KEY,
	id_producto SERIAL,
	id_vendedor VARCHAR(30) NOT NULL,
	cantidad VARCHAR(30) NOT NULL,
	fecha DATE NOT NULL,
	total FLOAT NOT NULL,

	FOREIGN KEY (id_producto) REFERENCES inventario (id_producto) ON DELETE CASCADE,
	FOREIGN KEY (id_vendedor) REFERENCES usuarios (cedula) ON DELETE CASCADE
);

DROP TABLE IF EXISTS cotizaciones CASCADE;
CREATE TABLE cotizaciones
(
	id_cotizacion SERIAL PRIMARY KEY,
	id_producto SERIAL,
	id_vendedor VARCHAR(30) NOT NULL,
	cantidad VARCHAR(30) NOT NULL,
	fecha DATE NOT NULL,
	total FLOAT NOT NULL,

	FOREIGN KEY (id_producto) REFERENCES inventario (id_producto) ON DELETE CASCADE,
	FOREIGN KEY (id_vendedor) REFERENCES usuarios (cedula) ON DELETE CASCADE
);

DROP TABLE IF EXISTS ordenes CASCADE;
CREATE TABLE ordenes
(
	id_orden SERIAL PRIMARY KEY,
	id_jefe VARCHAR(30) NOT NULL,

	FOREIGN KEY (id_jefe) REFERENCES usuarios (cedula) ON DELETE CASCADE
);





INSERT INTO sedes VALUES (1,'Carrear 77A #2B-34','Cali', '123456');

INSERT INTO usuarios VALUES ('111','111' ,'activo','Santiago','Gerente' , 100000, 'Calle 5 #3C','1' , '654321');
INSERT INTO usuarios VALUES ('222','222' ,'activo','Miguel','Vendedor' , 50000, 'Carrear 80 #2B-102','1' , '123123');
INSERT INTO usuarios VALUES ('333','333' ,'activo','Juan','Jefe de taller' , 25000, 'Carrear 45 3D','1' , '567890');

INSERT INTO inventario VALUES (1,'Silla','20', 200);

INSERT INTO ventas VALUES (1,'1','222', '2', '04-02-2019', 400);

INSERT INTO cotizaciones VALUES (1, '1','222', '3', '04-02-2019', 600);

INSERT INTO ordenes VALUES (1, '333');