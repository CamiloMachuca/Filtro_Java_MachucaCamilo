insert into mision(descripcion, rango, recompensa) values("investigacion a una persona", "Azul", "nuevo equipo ninja"),
("infiltracion a un pais", "Negro", "Aumento de nivel"),
("Asesinato de una persona", "Rojo", "espada de oro"),
("Asesinato de un grupo de personas", "Rojo", "nuevas herramientas"),
("Infiltracion a una propiedad", "Negro", "Una dia de descanso"),
("Investigacion a una institucion", "Azul", "Aumento de rango"),
("Investigacon y asesinato de una persona", "Rojo", "una semana de descanso");

insert into misionNinja(id_ninja, id_mision, fechaInicio, fechaFin) values(1, 8, "2025-01-01", "2025-02-01"),
(2,1, "2024-01-02", "2025-02-01"),
(3,2, "2024-05-03", "2024-03-01"),
(4,3, "2024-05-03", "2024-03-01");

insert into misionNinja(id_ninja, id_mision, fechaInicio, fechaFin) values(1, 8, "2025-01-01", "2025-02-01");

insert into ninja(nombre, rango, aldea) values("camilo","verde", "aldea Negra" ),
("andres", "Azul", "aldea Negra"),
("Felipe", "Negro", "aldea Negra"),
("stiven", "Rojo", "aldea Negra");

insert into habilidad(id_ninja, nombreHabilidad, descripcion) values(1, "espada", "Tiene un buen manejo con las espadas"),
(2, "ocultamiento", "Tiene un arte para ocultarse"),
(3, "Armero", "Capacidad de manejar multiples armas");