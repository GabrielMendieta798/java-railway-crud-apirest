package com.gabriel.apirest.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabriel.apirest.apirest.Entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long>{

}
