package com.example.gestion_clientes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gestion_clientes.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}