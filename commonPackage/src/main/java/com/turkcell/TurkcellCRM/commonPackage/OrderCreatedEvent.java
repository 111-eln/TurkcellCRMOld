package com.turkcell.TurkcellCRM.commonPackage;

import com.turkcell.TurkcellCRM.commonPackage.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderCreatedEvent {
    private Address address;

    private List<Product> products;

    private int totalAmount;

}
