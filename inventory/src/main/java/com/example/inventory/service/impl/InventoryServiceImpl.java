package com.example.inventory.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.example.inventory.entity.Inventory;
import com.example.inventory.model.InventoryCreateDto;
import com.example.inventory.model.InventoryResponse;
import com.example.inventory.repository.InventoryRepository;

import com.example.inventory.service.InventoryService;

@Service
public class InventoryServiceImpl implements InventoryService{


    private final InventoryRepository inventoryRepository;

    public InventoryServiceImpl(InventoryRepository inventoryRepository){
        this.inventoryRepository=inventoryRepository;
    }

   
    @Override
    public InventoryResponse createInventory(InventoryCreateDto inventoryCreateDto) {
       var savedObj =  inventoryRepository.save(mapToInventory(inventoryCreateDto));
       return mapToInventoryResponse(savedObj);

    }
    private Inventory mapToInventory(InventoryCreateDto source){
        Inventory target = new Inventory();
        BeanUtils.copyProperties(source, target);
        return target;

    }
    private InventoryResponse mapToInventoryResponse(Inventory source){
        InventoryResponse target = new InventoryResponse();
        BeanUtils.copyProperties(source, target);
        return target;

    }

   
}
