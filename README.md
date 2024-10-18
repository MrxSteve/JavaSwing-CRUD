
# CRUD sencillo usando JavaSwing

Este es un proyecto de Java que utiliza Maven para la gestión de dependencias. El proyecto es una aplicación CRUD (Crear, Leer, Actualizar, Eliminar) que permite a los usuarios gestionar una lista de personas y cuenta con filtros para buscar.

## Instalación

Para instalar este proyecto en tu sistema local, sigue estos pasos:

1. Clona el repositorio a tu máquina local usando:
   ```bash
   git clone https://github.com/usuario/repositorio.git
   ```
2. Navega al directorio del proyecto con:
   ```bash
   cd ruta del proyecto
   ```
3. Para compilar el proyecto, necesitas crear una base de datos en MySQL, agregar una tabla y crear tu usuario. Aquí está el código SQL para hacerlo:

   ```sql
   CREATE DATABASE mi_base_de_datos;
   USE mi_base_de_datos;

   CREATE TABLE persona (
       id INT AUTO_INCREMENT PRIMARY KEY,
       nombre VARCHAR(100),
       correo VARCHAR(100),
       telefono VARCHAR(15)
   );

   GRANT ALL PRIVILEGES ON mi_base_de_datos.* TO 'user'@'localhost' IDENTIFIED BY 'password';
   FLUSH PRIVILEGES;
   ```

4. Abre el proyecto en tu IDE, ejecuta la clase Principal y ya podrás probar la aplicación.

## Uso

Una vez que el proyecto esté en ejecución, podrás agregar, modificar y eliminar personas de la lista. También puedes filtrar la lista de personas por nombre, correo electrónico o teléfono.

1. Para agregar, llena los campos (excepto el ID) y haz clic en el botón "Agregar".
2. Para modificar, escribe el ID de la persona que deseas modificar, llena los campos que quieras actualizar y luego haz clic en el botón "Modificar".
3. Para eliminar, escribe el ID de la persona que deseas eliminar y haz clic en el botón "Eliminar".
4. Para consultar, haz clic en el botón "Consultar" y se cargarán los datos desde la base de datos.
5. Para filtrar, selecciona el tipo de filtro, llena el campo correspondiente y luego haz clic en el botón "Buscar". 
