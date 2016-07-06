package com.tom.test.domain;

import javax.persistence.*;
import java.util.*;

/**
 * Created by tom on 6/9/2016.
 */
@Entity
public class Publisher extends AbstartDomainClass{

    private String name;
    private String description;
    private String imageUrl;

    @OneToMany(mappedBy = "publisher", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<Product> products = new HashSet<>();

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void addProduct(Product product){
        this.products.add(product);
    }
}
