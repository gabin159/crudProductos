# CRUD de Productos

## Descripción

Este proyecto consiste en un sistema CRUD (Create, Read, Update y Delete) para la gestión de productos de un inventario. Permite registrar, consultar, actualizar y eliminar productos mediante una interfaz web desarrollada con Spring Boot y Thymeleaf, utilizando PostgreSQL como sistema gestor de base de datos.


## Arquitectura del proyecto

El proyecto sigue una arquitectura por capas (MVC), donde cada componente tiene una responsabilidad específica.

```
crudProductos
│
├── src
│   ├── main
│   │
│   ├── java
│   │   └── com.fredy.crudProductos
│   │       │
│   │       ├── controller
│   │       │      └── ProductoController.java
│   │       │
│   │       ├── model
│   │       │      └── Producto.java
│   │       │
│   │       ├── repository
│   │       │      └── ProductoRepository.java
│   │       │
│   │       ├── service
│   │       │      └── ProductoService.java
│   │       │
│   │       └── CrudProductosApplication.java
│   │
│   └── resources
│       │
│       ├── static
│       │      └── style.css
│       │
│       ├── templates
│       │      └── index.html
│       │
│       └── application.properties
│
├── pom.xml
└── README.md
```



## Funcionalidades

- Registrar productos.
- Listar todos los productos.
- Buscar productos por nombre.
- Editar información de un producto.
- Eliminar productos.
-



## Requisitos

Antes de ejecutar el proyecto es necesario tener instalado:

- Java JDK 17
- Maven
- PostgreSQL
- Git
- Visual Studio Code

---

## Configuración de la base de datos

Crear una base de datos llamada
crudproductos



## Cómo ejecutar el proyecto

1. Clonar el repositorio.

```bash
git clone https://github.com/gabin159/crudProductos.git
```

2. Entrar al proyecto.

```bash
cd crudProductos
```

3. Abrir el proyecto con Visual Studio Code o IntelliJ.

4. Esperar a que Maven descargue las dependencias.

5. Ejecutar para correr el pryecto:

```
mvn spring-boot:run
```

6. Abrir el navegador en:

```
http://localhost:8080
```

---

## Justificación del trabajo

Para este proyecto decidí utilizar Spring Boot porque facilita el desarrollo de aplicaciones web mediante una estructura organizada y herramientas que reducen la configuración manual. Además, Spring Data JPA simplifica el acceso a la base de datos y Thymeleaf permite integrar fácilmente la información del backend con la interfaz.

La estructura del proyecto fue organizada siguiendo el patrón MVC (Modelo, Vista y Controlador), ya que separa claramente la lógica de negocio, el acceso a los datos y la interfaz de usuario. Esto hace que el código sea más fácil de mantener y comprender.

Durante el desarrollo uno de los principales retos fue la sincronización entre la entidad Java y la base de datos en PostgreSQL, especialmente cuando se modificaron algunos atributos del modelo. También fue necesario ajustar las rutas del controlador y las vistas de Thymeleaf para que las operaciones de guardar, editar y eliminar funcionaran correctamente.

Finalmente, el proyecto permitió fortalecer conocimientos sobre desarrollo web con Java, persistencia de datos utilizando JPA, uso de Git para el control de versiones y organización de proyectos siguiendo buenas prácticas de programación.

---

## Autor

Fredy Borda

Universidad Santo Tomás

Ingeniería de Sistemas