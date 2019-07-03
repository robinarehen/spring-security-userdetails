insert into USUARIOS (id_usuario, usuario, contrasenia, enabled) values (1, 'rarellano', '$2a$10$iPwRfYkeETRb8vYqtZd/1uxndPdoFlrvVjicZe3sFXlr7e4FBB5vC', true);
insert into USUARIOS (id_usuario, usuario, contrasenia, enabled) values (2, 'rhenriquez', '$2a$10$iPwRfYkeETRb8vYqtZd/1uxndPdoFlrvVjicZe3sFXlr7e4FBB5vC', true);

insert into ROLES (id_rol, nombre, descripcion) values (1, 'Admin', 'Administrador');
insert into ROLES (id_rol, nombre, descripcion) values (2, 'Dev', 'Desarrollador');

insert into ROLES_USUARIOS (id_rol_usuario, id_usuario, id_rol, descripcion) values (1, 1, 1, 'user: rarellano - rol: Admin');
insert into ROLES_USUARIOS (id_rol_usuario, id_usuario, id_rol, descripcion) values (2, 2, 2, 'user: rhenriquez - rol: dev');

insert into modulos (id_modulo, nombre, label, icono) values (1, 'Servicio al Cliente', 'Clientes', 'folder');

insert into paginas_moulo (id_pagina_modulo, id_modulo, label, url, icono) values (1, 1, 'Suscripciones', '/admin/admin-alone', 'list');
insert into paginas_moulo (id_pagina_modulo, id_modulo, label, url, icono) values (2, 1, 'Suscripciones', '/admin/admin-user', 'list');

insert into paginas_roles (id_pagina_rol, id_pagina_modulo, id_rol) values (1, 1, 1);
insert into paginas_roles (id_pagina_rol, id_pagina_modulo, id_rol) values (2, 2, 1);
insert into paginas_roles (id_pagina_rol, id_pagina_modulo, id_rol) values (3, 2, 2);