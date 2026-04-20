package dev.integration.hub.repository;

import dev.integration.hub.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//conexão com banco de dados
//camada de persistência de dados
public interface ProductRepository extends JpaRepository<Product, Long> {



}
