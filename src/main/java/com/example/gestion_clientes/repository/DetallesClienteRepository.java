package com.example.gestion_clientes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gestion_clientes.model.DetallesCliente;

public interface DetallesClienteRepository extends JpaRepository<DetallesCliente, Integer> {
}