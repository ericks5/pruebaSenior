/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.com.linktic.prueba.producto.repository.repositories;

import co.com.linktic.prueba.producto.model.ProductoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author zergu
 */
@Repository
public interface ProductRepository extends JpaRepository<ProductoEntity, Integer>{
    
}
