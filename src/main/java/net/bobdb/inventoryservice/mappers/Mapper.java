package net.bobdb.inventoryservice.mappers;

import net.bobdb.inventoryservice.dto.InventoryRequest;
import net.bobdb.inventoryservice.models.Inventory;
import org.springframework.stereotype.Service;

@Service
public class Mapper {
    public Inventory mapToObject(InventoryRequest inventoryRequest) {
        return Inventory.builder()
                .skuCode(inventoryRequest.getSkuCode())
                .quantity(inventoryRequest.getQuantity())
                .build();
    }

    public static InventoryRequest mapToDto(Inventory inventory) {
        return InventoryRequest.builder()
                .skuCode(inventory.getSkuCode())
                .quantity(inventory.getQuantity())
                .build();
    }
}
