package com.fredy.crudProductos.controller;

import com.fredy.crudProductos.model.Producto;
import com.fredy.crudProductos.service.ProductoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    // Muestra la página principal y permite buscar productos.
    @GetMapping
    public String index(@RequestParam(value = "buscar", required = false) String buscar,
                        Model model) {

        List<Producto> productos = productoService.buscar(buscar);

        model.addAttribute("productos", productos);
        model.addAttribute("producto", new Producto());
        model.addAttribute("buscar", buscar);

        return "index";
    }

    // Guarda un producto nuevo o actualiza uno existente.
    @PostMapping("/guardar")
    public String guardar(@Valid @ModelAttribute("producto") Producto producto,
                          BindingResult resultado,
                          Model model) {

        if (resultado.hasErrors()) {
            model.addAttribute("productos", productoService.listarTodos());
            return "index";
        }

        productoService.guardar(producto);
        return "redirect:/";
    }

    // Carga los datos de un producto para editarlo.
    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {

        Producto producto = productoService.buscarPorId(id);

        model.addAttribute("producto", producto);
        model.addAttribute("productos", productoService.listarTodos());

        return "index";
    }

    // Elimina un producto por su identificador.
    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {

        productoService.eliminar(id);
        return "redirect:/";
    }
}
