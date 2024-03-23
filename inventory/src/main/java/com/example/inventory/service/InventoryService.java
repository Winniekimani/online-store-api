package com.example.inventory.service;

import java.util.List;

import com.example.inventory.model.InventoryCreateDto;
import com.example.inventory.model.InventoryResponse;

public interface InventoryService {

    InventoryResponse createInventory(InventoryCreateDto inventoryCreateDto);

    Boolean checkInventory(List<String> productCodes, List<Integer> productQuantities);

}
