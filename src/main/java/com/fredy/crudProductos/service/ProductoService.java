package com.fredy.crudProductos.service;

import com.fredy.crudProductos.model.Producto;
import com.fredy.crudProductos.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    // Guardar o actualizar un producto
    public Producto guardar(Producto producto) {
        return productoRepository.save(producto);
    }

    // Listar todos los productos
    public List<Producto> listarTodos() {
        return productoRepository.findAll();
    }

    // Buscar un producto por ID
    public Producto buscarPorId(Long id) {
        return productoRepository.findById(id).orElse(null);
    }

    // Buscar productos únicamente por nombre
    public List<Producto> buscar(String texto) {

        if (texto == null || texto.trim().isEmpty()) {
            return listarTodos();
        }

        return productoRepository.findByNombreContainingIgnoreCase(texto);
    }

    // Eliminar un producto
    public void eliminar(Long id) {
        productoRepository.deleteById(id);
    }
}