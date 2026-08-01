package com.fredy.crudProductos.model;

import jakarta.persistence.*;

/**
 * Clase Producto.
 *
 * Representa la tabla "productos" en la base de datos.
 */
@Entity
@Table(name = "productos")
public class Producto {

    // ID autogenerado por PostgreSQL.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Nombre del producto.
    private String nombre;

  

    // Categoría a la que pertenece el producto.
    private String Categoria;

    // Precio del producto.
    private double precio;

    // Cantidad disponible del producto.
    private int stock;


    // Constructor vacío (Spring Boot lo necesita).
    public Producto() {
    }


    // Constructor con parámetros.
    public Producto(String nombre, String categoria,
                    double precio, int stock) {

        this.nombre = nombre;
     
        this.Categoria = categoria;
        this.precio = precio;
        this.stock = stock;
    }


    // ---------------- GETTERS Y SETTERS ----------------


    // ID
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    // Nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    // Categoría
    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String categoria) {
        this.Categoria = categoria;
    }


    // Precio
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


    // Stock
    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

}