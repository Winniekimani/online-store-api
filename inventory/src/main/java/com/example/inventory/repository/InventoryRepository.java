package com.example.inventory.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.inventory.entity.Inventory;

public  interface InventoryRepository extends MongoRepository<Inventory,String>{

    Optional<Inventory> findByProductCode(String productCode);

}
