package dev.integration.hub.service;

import dev.integration.hub.model.Product;
import dev.integration.hub.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    //Method List All
    public List<Product> getAll(){
        return productRepository.findAll();
    }

    //Method Created
    public Product save(Product product){
        return productRepository.save(product);
    }

    //Method Delete
    public void deleteProduct(Long id){
        productRepository.deleteById(id);
    }

}
