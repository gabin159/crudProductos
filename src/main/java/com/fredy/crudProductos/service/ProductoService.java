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

    // Guarda o actualiza un producto.
    public Producto guardar(Producto producto) {
        return productoRepository.save(producto);
    }

    // Obtiene todos los productos registrados.
    public List<Producto> listarTodos() {
        return productoRepository.findAll();
    }

    // Busca un producto por su ID.
    public Producto buscarPorId(Long id) {
        return productoRepository.findById(id).orElse(null);
    }

    // Busca productos por nombre o código.
    public List<Producto> buscar(String texto) {
        if (texto == null || texto.isBlank()) {
            return listarTodos();
        }

        return productoRepository.findByNombreContainingIgnoreCaseOrCodigoContainingIgnoreCase(texto, texto);
    }

    // Elimina un producto por su ID.
    public void eliminar(Long id) {
        productoRepository.deleteById(id);
    }
}