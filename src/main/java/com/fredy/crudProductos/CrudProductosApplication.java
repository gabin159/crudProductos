package com.fredy.crudProductos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class CrudProductosApplication {

    // Método main: es el que Java ejecuta primero al iniciar el programa
    public static void main(String[] args) {
        // Este método arranca el servidor embebido (Tomcat) y todo el contexto de Spring
        SpringApplication.run(CrudProductosApplication.class, args);
    }

}