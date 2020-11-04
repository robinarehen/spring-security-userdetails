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

# Deuda Técnica
1. Validar Campos obligatorios en el backend.
2. Mostrar un mensaje de error cuando el parametro `${errorMessage}` de la paginas `error.html` llega sin información.
