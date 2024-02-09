package com.payment.Service;
import com.payment.Entity.Product;
import com.payment.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository ;


    public Product addProduct(Product product) {
        Product save = productRepository.save(product);
        return save ;
    }
}
