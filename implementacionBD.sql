DROP TABLE IF EXISTS sedes CASCADE;
CREATE TABLE sedes
(
	id_sede VARCHAR(30) PRIMARY KEY,
	nombre VARCHAR(30) NOT NULL,
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
	salario VARCHAR(30) NOT NULL,
	fecha DATE NOT NULL,
	direccion VARCHAR(50),
	id_sede VARCHAR(30),
	telefono VARCHAR(30),

	FOREIGN KEY (id_sede) REFERENCES sedes (id_sede) ON DELETE CASCADE
);

DROP TABLE IF EXISTS inventario CASCADE;
CREATE TABLE inventario
(
	id_producto VARCHAR PRIMARY KEY,
	producto VARCHAR(30) NOT NULL,
	cantidad INTEGER NOT NULL,
	precio_unidad FLOAT NOT NULL
);

DROP TABLE IF EXISTS ventas CASCADE;
CREATE TABLE ventas
(
	id_venta VARCHAR(30) PRIMARY KEY,
	id_vendedor VARCHAR(30) NOT NULL,
	fecha DATE,
	total FLOAT,

	FOREIGN KEY (id_vendedor) REFERENCES usuarios (cedula) ON DELETE CASCADE
);

DROP TABLE IF EXISTS cotizaciones CASCADE;
CREATE TABLE cotizaciones
(
	id_cotizacion VARCHAR(3) PRIMARY KEY,
	id_vendedor VARCHAR(30) NOT NULL,
	fecha DATE,
	total FLOAT,

	FOREIGN KEY (id_vendedor) REFERENCES usuarios (cedula) ON DELETE CASCADE
);

DROP TABLE IF EXISTS carritoVen CASCADE;
CREATE TABLE carritoVen	
(
	id_venta VARCHAR(30) NOT NULL,
	id_producto VARCHAR(30) NOT NULL,
	cantidad INTEGER NOT NULL,
	subtotal FLOAT NOT NULL,

	FOREIGN KEY (id_venta) REFERENCES ventas (id_venta) ON DELETE CASCADE,
	FOREIGN KEY (id_producto) REFERENCES inventario (id_producto) ON DELETE CASCADE
);

DROP TABLE IF EXISTS carritoCot CASCADE;
CREATE TABLE carritoCot
(
	id_cotizacion VARCHAR(30) NOT NULL,
	id_producto VARCHAR(30) NOT NULL,
	cantidad INTEGER NOT NULL,
	subtotal FLOAT NOT NULL,

	FOREIGN KEY (id_cotizacion) REFERENCES cotizaciones (id_cotizacion) ON DELETE CASCADE,
	FOREIGN KEY (id_producto) REFERENCES inventario (id_producto) ON DELETE CASCADE
);

DROP TABLE IF EXISTS ordenes CASCADE;
CREATE TABLE ordenes
(
	id_orden VARCHAR(30) PRIMARY KEY,
	id_jefe VARCHAR(30) NOT NULL,
	id_producto VARCHAR(30) NOT NULL,
	cantidad INTEGER,
	fecha DATE NOT NULL,
	estado VARCHAR(30) NOT NULL,

	FOREIGN KEY (id_producto) REFERENCES inventario (id_producto) ON DELETE CASCADE,
	FOREIGN KEY (id_jefe) REFERENCES usuarios (cedula) ON DELETE CASCADE
);





INSERT INTO sedes VALUES ('01', 'Sede sur', 'Carrear 77A #2B-34','Cali', '123456');

INSERT INTO usuarios VALUES ('111','111' ,'Activo','Santiago','Gerente' ,'$100000','31-07-2005' ,'Calle 5 #3C', '01' , '654321');
INSERT INTO usuarios VALUES ('222','222' ,'Activo','Miguel','Vendedor' , '$50000','20-01-2005', 'Carrear 80 #2B-102', '01' , '123123');
INSERT INTO usuarios VALUES ('333','333' ,'Activo','Juan','Jefe de taller' , '$25000','01-07-2011', 'Carrear 45 3D', '01' , '567890');

INSERT INTO inventario VALUES ('001', 'Silla', 20, 100);
INSERT INTO inventario VALUES ('002', 'Sillon', 10, 650);
INSERT INTO inventario VALUES ('003', 'Armario', 5, 1000);
INSERT INTO inventario VALUES ('004', 'Nochero', 30, 470);
INSERT INTO inventario VALUES ('005', 'Comedor', 15, 2200);
INSERT INTO inventario VALUES ('006', 'Tocador', 9, 700);
INSERT INTO inventario VALUES ('007', 'Escritorio', 11, 1500);

INSERT INTO ventas VALUES ('001', '222', '04-02-2019', 400);

INSERT INTO cotizaciones VALUES ('001', '222', '04-02-2019', 600);

INSERT INTO ordenes VALUES ('001', '333', '001', 5, '04-02-2019', 'Sin aprobar');