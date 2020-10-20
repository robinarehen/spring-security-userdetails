insert into USUARIOS (id_usuario, usuario, contrasenia, enabled) values (1, 'rarellano', '$2a$10$iPwRfYkeETRb8vYqtZd/1uxndPdoFlrvVjicZe3sFXlr7e4FBB5vC', true);
insert into USUARIOS (id_usuario, usuario, contrasenia, enabled) values (2, 'rhenriquez', '$2a$10$iPwRfYkeETRb8vYqtZd/1uxndPdoFlrvVjicZe3sFXlr7e4FBB5vC', true);

insert into ROLES (id_rol, nombre, descripcion) values (1, 'Admin', 'Administrador');
insert into ROLES (id_rol, nombre, descripcion) values (2, 'Dev', 'Desarrollador');

insert into ROLES_USUARIOS (id_rol_usuario, id_usuario, id_rol, descripcion) values (1, 1, 1, 'user: rarellano - rol: Admin');
insert into ROLES_USUARIOS (id_rol_usuario, id_usuario, id_rol, descripcion) values (2, 2, 2, 'user: rhenriquez - rol: dev');

insert into modulos (id_modulo, nombre, label, icono) values (1, 'Servicio Modulos', 'Modulos', 'folder');
insert into modulos (id_modulo, nombre, label, icono) values (2, 'Servicio Roles', 'Roles', 'folder');
insert into modulos (id_modulo, nombre, label, icono) values (3, 'Servicio Usuarios', 'Usuarios','folder');

insert into paginas_moulo (id_pagina_modulo, id_modulo, label, url, icono) values (1, 1, 'Listar Modulos', '/modulos', 'list');
insert into paginas_moulo (id_pagina_modulo, id_modulo, label, url, icono) values (2, 2, 'Listar Roles', '/roles', 'list');
insert into paginas_moulo (id_pagina_modulo, id_modulo, label, url, icono) values (3, 3, 'Listar Usuarios', '/usuarios', 'list');
insert into paginas_moulo (id_pagina_modulo, id_modulo, label, url, icono) values (4, 1, 'Crear Modulos', '/modulos/crear', 'save');
insert into paginas_moulo (id_pagina_modulo, id_modulo, label, url, icono) values (5, 2, 'Crear Roles', '/roles/crear', 'save');
insert into paginas_moulo (id_pagina_modulo, id_modulo, label, url, icono) values (6, 3, 'Crear Usuarios', '/usuarios/crear', 'save');

/*Rol Admin*/
insert into paginas_roles (id_pagina_modulo, id_rol) values (1, 1);
insert into paginas_roles (id_pagina_modulo, id_rol) values (2, 1);
insert into paginas_roles (id_pagina_modulo, id_rol) values (3, 1);
insert into paginas_roles (id_pagina_modulo, id_rol) values (4, 1);
insert into paginas_roles (id_pagina_modulo, id_rol) values (5, 1);
insert into paginas_roles (id_pagina_modulo, id_rol) values (6, 1);

/*Rol Dev*/
insert into paginas_roles (id_pagina_modulo, id_rol) values (1, 2);
insert into paginas_roles (id_pagina_modulo, id_rol) values (2, 2);

/*
The passwords is: abc123abc
*/
