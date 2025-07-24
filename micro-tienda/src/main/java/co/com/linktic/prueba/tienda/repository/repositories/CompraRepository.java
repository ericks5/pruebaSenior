/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.com.linktic.prueba.tienda.repository.repositories;

import co.com.linktic.prueba.producto.model.ComprasEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author zergu
 */
public interface CompraRepository extends JpaRepository<ComprasEntity, Integer>{
    
}
