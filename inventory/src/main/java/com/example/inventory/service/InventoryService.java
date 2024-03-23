package com.example.inventory.service;

import com.example.inventory.model.InventoryCreateDto;
import com.example.inventory.model.InventoryResponse;

public interface InventoryService {

    InventoryResponse createInventory(InventoryCreateDto inventoryCreateDto);

}
