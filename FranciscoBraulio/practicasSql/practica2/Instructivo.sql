 Instructivo

1- Abrir la terminal de Debian en Windows:

2- Ingresar como usuario PostgreSQL:
Ejecuta el comando sudo -i -u postgres para cambiar al usuario postgres. La terminal cambiará al formato postgres@nombre_maquina.

3- Acceder a PostgreSQL:
Conéctate a PostgreSQL con el comando psql -U postgres -W e ingresa la contraseña cuando la solicite.

4- rear la base de datos y el esquema:
Dentro de PostgreSQL, ejecuta:
create database vehiculosdb;
create schema flota;

5- Crear las tablas:
Crea la tabla marca con:
create table flota.marca (id serial primary key, nombre text, pais_origen text, año_fundacion int);
Luego, crea la tabla modelo con referencia a marca:
create table flota.modelo (id serial primary key, nombre text, año int, marca_id int references flota.marca(id));

6- Insertar registros:
Agrega 10 registros a la tabla marca:
insert into flota.marca (nombre, pais_origen, año_fundacion) values ('Toyota', 'Japón', 1937), ('Ford', 'EE.UU.', 1903), ('Chevrolet', 'EE.UU.', 1911), ('Volkswagen', 'Alemania', 1937), ('Honda', 'Japón', 1948), ('BMW', 'Alemania', 1916), ('Nissan', 'Japón', 1933), ('Renault', 'Francia', 1899), ('Fiat', 'Italia', 1899), ('Hyundai', 'Corea del Sur', 1967);

7- Agrega 10 registros a la tabla modelo:
insert into flota.modelo (nombre, año, marca_id) values ('Corolla', 2022, 1), ('Camry', 2023, 1), ('Mustang', 2021, 2), ('F-150', 2023, 2), ('Spark', 2020, 3), ('Jetta', 2022, 4), ('Civic', 2021, 5), ('X5', 2023, 6), ('Altima', 2022, 7), ('Clio', 2020, 8);

8- Consultar los datos:
Para visualizar los registros de la tabla marca
select * from flota.marca;
Para visualizar los registros de la tabla modelo:
select * from flota.modelo;

9- Salir de PostgreSQL:
Escribe \q para salir de la terminal de PostgreSQL.