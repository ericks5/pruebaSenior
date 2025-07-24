/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.linktic.prueba.tienda.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

/**
 *
 * @author zergu
 */
@Table(name = "producto")
@Data
@Builder
public class ProductoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column("id_producto")
    int id;
    @Column("nombre")
    String nombre;
    @Column("precio")
    float precio;
    @Column("descripcion")
    String descripcion;
    @Column("cant_stock")
    int cantStock;
    
    @OneToMany(mappedBy = "producto")
    List<DetalleCompraEntity> vendidos;

}
