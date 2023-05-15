package com.digitar120.productmicroservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.digitar120.productmicroservice.entity.ProductEntity;

@Repository
public interface ProductRepository extends MongoRepository<ProductEntity, String>{

}
