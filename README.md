# ForoHub
ForoHub es una aplicación backend para gestionar foros de discusión, desarrollada como parte del curso de Alura.

## Características
Gestión de Tópicos: Crear, leer, actualizar y eliminar tópicos de discusión.
Autenticación y Autorización: Implementación de seguridad utilizando JSON Web Tokens (JWT).
Validaciones: Validación de datos de entrada mediante Jakarta Bean Validation.
Documentación de la API: Integración con Swagger para la generación automática de la documentación de la API.

## Tecnologías Utilizadas
Lenguaje de Programación: Java 21
Framework: Spring Boot 3.3.1
Base de Datos: MySQL 8.0
Gestión de Dependencias: Maven 4
IDE Recomendado: IntelliJ IDEA

## Requisitos Previos
Asegúrate de tener instalados los siguientes componentes en tu entorno de desarrollo:

- Java Development Kit (JDK): Versión 17
- Apache Maven: Versión 4
- PostgreSQL: Versión 17

## Configuración del Proyecto
### 1.- Clonar el Repositorio:

```
git clone https://github.com/Bastian-Fuentes/ForoHub.git
cd ForoHub
```

### 2.- Configuración de la Base de Datos:

Inicia sesión en Postgre y crea la base de datos (por defecto llamada forohub):

Actualiza el archivo src/main/resources/application.properties con las propiedades de conexión a la base de datos y el secreto para JWT:


La aplicación estará disponible en `http://localhost:8080`.

## Uso de la API

### Autenticación
Para autenticarse, envía una solicitud POST a /register con JSON Body con datos de usuario, en este caso Nombre, Correo y Contraseña. Una vez creado el usuario correctamente, enviar una solicitud POST a /login con las credenciales del usuario. Esto devolverá un token JWT que debe incluirse en el encabezado de autorización en todas las solicitudes futuras.

### Endpoints Principales
Crear Tópico: `POST /topicos`

Obtener Tópicos: `GET /topicos`

Eliminar Tópico: `DELETE /topicos/{id}`
