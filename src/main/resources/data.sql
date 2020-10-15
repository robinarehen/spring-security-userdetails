insert into USUARIOS (id_usuario, usuario, contrasenia, enabled) values (1, 'rarellano', '$2a$10$iPwRfYkeETRb8vYqtZd/1uxndPdoFlrvVjicZe3sFXlr7e4FBB5vC', true);
insert into USUARIOS (id_usuario, usuario, contrasenia, enabled) values (2, 'rhenriquez', '$2a$10$iPwRfYkeETRb8vYqtZd/1uxndPdoFlrvVjicZe3sFXlr7e4FBB5vC', true);

insert into ROLES (id_rol, nombre, descripcion) values (1, 'Admin', 'Administrador');
insert into ROLES (id_rol, nombre, descripcion) values (2, 'Dev', 'Desarrollador');

insert into ROLES_USUARIOS (id_rol_usuario, id_usuario, id_rol, descripcion) values (1, 1, 1, 'user: rarellano - rol: Admin');
insert into ROLES_USUARIOS (id_rol_usuario, id_usuario, id_rol, descripcion) values (2, 2, 2, 'user: rhenriquez - rol: dev');

insert into modulos (id_modulo, nombre, label, icono) values (1, 'Servicio Roles', 'Roles', 'folder');
insert into modulos (id_modulo, nombre, label, icono) values (2, 'Servicio Usuarios', 'Usuarios', 'folder');
insert into modulos (id_modulo, nombre, label, icono) values (3, 'Servicio Modulos', 'Modulos', 'folder');

insert into paginas_moulo (id_pagina_modulo, id_modulo, label, url, icono) values (1, 1, 'Admin Roles', '/roles', 'list');
insert into paginas_moulo (id_pagina_modulo, id_modulo, label, url, icono) values (2, 2, 'Admin Usuarios', '/usuarios', 'list');
insert into paginas_moulo (id_pagina_modulo, id_modulo, label, url, icono) values (3, 3, 'Admin Modulos', '/modulos', 'list');
insert into paginas_moulo (id_pagina_modulo, id_modulo, label, url, icono) values (4, 1, 'Crear Roles', '/roles/crear', 'list');
insert into paginas_moulo (id_pagina_modulo, id_modulo, label, url, icono) values (5, 2, 'Crear Usuarios', '/usuarios/crear', 'list');

insert into paginas_roles (id_pagina_rol, id_pagina_modulo, id_rol) values (1, 1, 1);
insert into paginas_roles (id_pagina_rol, id_pagina_modulo, id_rol) values (2, 2, 1);
insert into paginas_roles (id_pagina_rol, id_pagina_modulo, id_rol) values (3, 3, 1);
insert into paginas_roles (id_pagina_rol, id_pagina_modulo, id_rol) values (4, 4, 1);
insert into paginas_roles (id_pagina_rol, id_pagina_modulo, id_rol) values (5, 5, 1);
insert into paginas_roles (id_pagina_rol, id_pagina_modulo, id_rol) values (6, 1, 2);

/*
The passwords is: abc123abc
*/
