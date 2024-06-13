package com.example.gestion_clientes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gestion_clientes.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
}