/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.linktic.prueba.producto.repository.facades.Implements;

import co.com.linktic.prueba.producto.Exceptions.NotExistException;
import co.com.linktic.prueba.producto.model.ProductoEntity;
import co.com.linktic.prueba.producto.repository.facades.IProductoFacade;
import co.com.linktic.prueba.producto.repository.repositories.ProductRepository;
import java.util.List;
import java.util.Optional;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Component;

/**
 *
 * @author zergu
 */
@Log4j2
@Component
public class ProductoImplement implements IProductoFacade{

    private final ProductRepository productoRepository;
    
    

    public ProductoImplement(ProductRepository productoRepository) {
        this.productoRepository=productoRepository;
    }
    
    @Override
    public ProductoEntity crearProducto(ProductoEntity producto) {
        try {
            return productoRepository.save(producto);
        } catch (Exception e) {
            log.error("Error de registro de producto ",e.getMessage());
            return null;
        }
    }

    @Override
    public ProductoEntity buscarProducto(int idProducto) {
        try {
            Optional<ProductoEntity> resp= productoRepository.findById(idProducto);
            if(resp.isPresent())
            {
                return resp.get();
            }
            else
            {
                throw new NotExistException("El producto con id "+idProducto+" No existe en el registro");
            }
        } catch (Exception e) {
            log.error("Error de busqueda de producto ",e.getMessage());
            return null;
        }
    }

    @Override
    public List<ProductoEntity> retornarProductos() {
        try {
            return productoRepository.findAll();
        } catch (Exception e) {
            log.error("Error de busqueda de productos ",e.getMessage());
            return null;
        }
    }
    
}
