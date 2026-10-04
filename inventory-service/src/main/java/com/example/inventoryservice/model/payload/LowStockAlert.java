/***
<p>
    Licensed under MIT License Copyright (c) 2026 Raja Kolli.
</p>
***/

package com.example.inventoryservice.model.payload;

public record LowStockAlert(String productCode, int availableQuantity) {}
