/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.com.linktic.prueba.producto.repository.facades;

import co.com.linktic.prueba.producto.model.ProductoEntity;
import java.util.List;

/**
 *
 * @author zergu
 */
public interface IProductoFacade {
    ProductoEntity crearProducto(ProductoEntity producto);
    ProductoEntity buscarProducto(int idProducto);
    List<ProductoEntity> retornarProductos();
    
}
