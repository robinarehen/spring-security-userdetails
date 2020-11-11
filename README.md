# spring-security-userdetails

En este proyecto se implementa la seguridad en los endpoint mediante la configuración invocada desde la base de datos.

# Referencia a Funciones JS
En el archivo `~/static/js/materialize.init.js` se definen funciones las cuales son utilizadas por los otros **JS** 
o se invocan desde los formularios. Ejemplo:

```
initMaterialize();

showToast(information);

validarForm(idForm);

mensajeCrear(message)
```

# Heroku
Actualmente la app se puede ver en funcionamiente en la plataforma de [Heroku](https://rah-developers.herokuapp.com/) ingresando desde el link. <br>
Para desplegar la aplicación en **Heroku** se crea el archivo `Procfile` en la raíz del proyecto, con la configuración que actualmente contiene.<br>
**Heroku** ofrece formas de desplegar en modo `CLI` o directamene desde **GitHub** que es la forma más facil.<br>
En la pagina oficial [Heroku-Home](https://www.heroku.com/home) bajar hasta el apartado **Work with the language you already love**, 
aqui podras ver en video las dos formas de desplejar.

# Deuda Técnica
1. Validar Campos obligatorios en el backend.
2. Mostrar un mensaje de error cuando el parametro `${errorMessage}` de la paginas `error.html` llega sin información.
