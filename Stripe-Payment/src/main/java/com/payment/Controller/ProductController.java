package com.payment.Controller;
import com.payment.Entity.Product;
import com.payment.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payments")
public class ProductController {
    @Value("${stripe.api.key}")
    private String stripeApiKey;

    @Autowired
    private ProductService productService;
    //http://localhost:8080/payments/product?productId=1
    @PostMapping("/product")
    public ResponseEntity<Product> initiatePayment(@RequestBody Product product){
      Product pro = productService.addProduct(product);
        return new ResponseEntity<>(pro, HttpStatus.CREATED);
    }
    @GetMapping
    public List<Product> getAllProducts() {
      //  return productRepository.findAll();
         return null ;
    }
   }
