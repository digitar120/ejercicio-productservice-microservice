package com.digitar120.productmicroservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.digitar120.productmicroservice.entity.ProductEntity;
import com.digitar120.productmicroservice.repository.ProductRepository;

@RestController
@RequestMapping("/api/products")
public class ProductController {
	
	@Autowired
	private ProductRepository productRepository;
	
	// Método para listar productos desde GET
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<ProductEntity> getAllProducts() {
		return productRepository.findAll();
	}
	
	// Lo mismo, pero sin la anotación @ResponseStatus
	/*@GetMapping
	public ResponseEntity<List<ProductEntity>> getAllProduct() {
		List<ProductEntity> productEntities = product.repository.findAll();
		ReponseEntity<List<ProductEntity>> reponseEntity = new ResponseEntity<>(productEntities, HttpStatus.OK);
	}*/
	
	// Recepción de un objeto desde POST
	@PostMapping
	//@ResponseStatus(HttpStatus.OK)
	public void createProduct(@RequestBody ProductEntity productEntity) {
		productRepository.save(productEntity);
	}
	
	
}
