/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.linktic.prueba.tienda.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

/**
 *
 * @author zergu
 */
@Table(name = "detalle_compra")
@Data
@Builder
public class DetalleCompraEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column("id_detalle")
    int idDetalle;
    @Column("cant_comprada")
    int cantComprada;

    @ManyToOne
    @JoinColumn(name = "idCompra")
    ComprasEntity compra;

    @ManyToOne
    @JoinColumn(name = "id")
    ProductoEntity producto;
}
