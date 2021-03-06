DROP DATABASE IF EXISTS mensajeros;
CREATE DATABASE mensajeros;
USE mensajeros;

CREATE TABLE usuario(
dni  char(8) NOT NULL,
nombre varchar(15),
apellido varchar(15),
cargo varchar(20),
fechaIngreso date  null,
clave    char(5)

);
insert into usuario values ('25102570', 'Hebert', 'Gonzales', 'Administrador', curdate(),'12345');
insert into usuario values ('25102570', 'Julio', 'Huaman', 'Chofer', curdate(), '10000');
insert into usuario values ('25657656', 'Jesus', 'Ccopa', 'Secretario', curdate(), '12345');
insert into usuario values ('45656500', 'Daniel', 'Huari', 'Contador', curdate(), '12345');
insert into usuario values ('12556520', 'Carlos', 'Landa', 'Psicologo', curdate(), '12345');
insert into usuario values ('88992570', 'Frank', 'Gonzales', 'Administrador', curdate(), '12345');
insert into usuario values ('93457656', 'Roberto', 'Ccopa', 'Profesor', curdate(), '12345');
insert into usuario values ('76856500', 'Jose', 'Huari', 'Contador', curdate(), '12345');
insert into usuario values ('02556520', 'Luis', 'Landa', 'Psicologo', curdate(), '12345');



select * from usuario;

CREATE TABLE tb_categoriaDonante (
	id_categoria int primary key auto_increment,
	nombre varchar(50),
	descripcion varchar(150)
);
insert into tb_categoriaDonante values (null,'Particular', 'Empresa Estatal');


CREATE TABLE Donante(
codigo  int auto_increment,
razonSocial varchar(25),
nomRepresenante varchar(15),
apeRepresenante varchar(15),
cargoRepresenante varchar(15),
tipoDonante    int DEFAULT 2,
fechaRegistro date  null,
direccion varchar(25),
telefono varchar(9),
primary key (codigo)

);
insert into Donante values 
( null,'Empresa S.A.', 'Martin', 'Vizcarra',  'Gerente General', 1,  curdate(),'Jr. Lima 201', '990009989');
insert into Donante values
 ( null,'Ecoteva', 'Alejandro', 'Toledo',  'Gerente', 1,  curdate(),'Jr. Cuzco 208', '990011200');
insert into Donante values 
( null,'Odebrech', 'Alan', 'Garcia Peraz',  'Secretario', 1,  curdate(),'Jr. Sauces 201', '990001111');
insert into Donante values 
( null,'Nacionalismo SAC', 'Ollanta', 'Humala',  'Presidente', 1,  curdate(),'Jr.Callao201', '888009989');
select * from Donante;


CREATE TABLE tb_mercancias 
(
  idProducto int primary key,
  nomProducto varchar(40) not null,
  cantxUnidad varchar(20) not null,
  kilogramosEnUnidad double,
  unidadesEnExistencia int,
  unidadesEnEntrada int 
);

INSERT INTO tb_mercancias  VALUES('1', 'Dharamsala', '10 cajas x 20 bolsas', '18', '39', '0');
INSERT INTO tb_mercancias  VALUES('2', 'Yogurt',  '24 - bot. 12 l', '19', '17', '40');
INSERT INTO tb_mercancias  VALUES('3', 'Libros', '12 - bot. 550 ml', '10', '13', '70');
INSERT INTO tb_mercancias  VALUES('4', 'Especias Cajun del chef Anton', '48 - frascos 6 l', '22', '53', '0');
INSERT INTO tb_mercancias  VALUES('5', 'Mezcla Gumbo del chef Anton',  '36 cajas', '21', '0', '0');
INSERT INTO tb_mercancias  VALUES('6', 'Mermelada de grosellas de la abuela', '12 - frascos 8 l', '25', '120', '0');
INSERT INTO tb_mercancias  VALUES('7', 'Peras secas organicas del tio Bob',  '12 - paq. 1 kg', '30', '15', '0');
INSERT INTO tb_mercancias  VALUES('8', 'Salsa de arandanos Northwoods',  '12 - frascos 12 l', '40', '6', '0');
INSERT INTO tb_mercancias  VALUES('9', 'Buey Mishi Kobe', '18 - paq. 500 g', '97', '29', '0');



-- PROCEDURES
delimiter $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `registrar`(dni char(8),
							nombre varchar(15),
                            apellido varchar(15),
                            cargo varchar(20),
                            fechaIngreso date  ,
                            clave    char(5)
                            
                             )
BEGIN

 insert into usuario values (dni, nombre, apellido, cargo,fechaIngreso ,clave);
 
END
$$ delimiter ;

delimiter $$
create procedure eliminar (pdni char(8))
                             
                             
BEGIN

 delete from usuario where dni = pdni;
 
END
$$ delimiter ;

delimiter $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `actualizar`(dni char(8),pnombre varchar(15),papellido varchar(15),pcargo varchar(20),pfechaIngreso date,pclave char(5))
BEGIN
	update usuario set nombre = pnombre, apellido = papellido, cargo = pcargo , fechaingreso = pfechaIngreso , clave = pclave 
    where dni = dni;
END
delimiter $$;