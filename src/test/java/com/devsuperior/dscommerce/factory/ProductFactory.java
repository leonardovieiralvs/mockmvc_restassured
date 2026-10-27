package com.devsuperior.dscommerce.factory;

import com.devsuperior.dscommerce.entities.Product;

public class ProductFactory {

    public static Product createProduct() {

        return new Product(1L, "Meu produto", "Lorem ipsum Description", 50.0, "https://imgUrl.com.br");
    }
}
