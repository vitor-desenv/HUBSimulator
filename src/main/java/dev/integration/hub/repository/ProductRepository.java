package dev.integration.hub.repository;

import dev.integration.hub.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

//conexao com banco de dados
//camada de persistência de dados
public interface ProductRepository extends JpaRepository<Product, Long> {



}
