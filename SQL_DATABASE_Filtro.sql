

create table ninja(
id int auto_increment primary key,
nombre varchar(50),
rango varchar(50),
aldea varchar(70)
);
create table mision(
id int auto_increment primary key,
descripcion varchar(100),
rango varchar(100),
recompensa varchar(100)
);
create table misionNinja(
id int auto_increment primary key,
id_ninja int,
foreign key(id_ninja)references ninja(id),
id_mision int,
foreign key(id_mision)references mision(id),
fechaInicio date,
fechaFin date
);

create table habilidad(
id int auto_increment primary key,
id_ninja int,
foreign key(id_ninja)references ninja(id),
nombreHabilidad varchar(100),
descripcion varchar(100)
);

