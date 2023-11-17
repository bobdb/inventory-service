package net.bobdb.inventoryservice.services;

import lombok.extern.slf4j.Slf4j;
import net.bobdb.inventoryservice.dto.InventoryRequest;
import net.bobdb.inventoryservice.dto.InventoryResponse;
import net.bobdb.inventoryservice.mappers.Mapper;
import net.bobdb.inventoryservice.models.Inventory;
import net.bobdb.inventoryservice.repositories.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class InventoryService {

    @Autowired
    InventoryRepository inventoryRepository;

    @Autowired
    Mapper mapper;

    public List<Inventory> findAll() {
        return inventoryRepository.findAll();
    }

    public void createInventory(InventoryRequest inventoryRequest) {
        Inventory inventory = mapper.mapToObject(inventoryRequest);
        inventoryRepository.save(inventory);
        log.info("Inventory Item " + inventoryRequest.getSkuCode() + " created" );
    }
}
