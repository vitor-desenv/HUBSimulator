package dev.integration.hub.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import javax.annotation.processing.Generated;

@Entity //criar uma tabela
@Table(name = "products") // nome da tabela
@Getter
@Setter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String productSku;
    private String title;
    private String description;
    private String ncm;
    private Integer stockOn;
    private String warrantyTime;

    //Construtor
    public Product(Long id, String productSku, String title, String description, String ncm, Integer stockOn, String warrantyTime) {
        this.id = id;
        this.productSku = productSku;
        this.title = title;
        this.description = description;
        this.ncm = ncm;
        this.stockOn = stockOn;
        this.warrantyTime = warrantyTime;
    }
}
