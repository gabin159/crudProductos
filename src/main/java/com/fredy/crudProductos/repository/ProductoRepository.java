package com.fredy.crudProductos.repository;

import com.fredy.crudProductos.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Repositorio para realizar operaciones sobre los productos.
 */
@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {

    // Busca productos por nombre o código sin importar mayúsculas o minúsculas.
    List<Producto> findByNombreContainingIgnoreCaseOrCodigoContainingIgnoreCase(
            String nombre, String codigo);

}