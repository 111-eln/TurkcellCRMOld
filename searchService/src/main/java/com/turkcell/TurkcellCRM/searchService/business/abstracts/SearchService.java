package com.turkcell.TurkcellCRM.searchService.business.abstracts;

import com.turkcell.TurkcellCRM.searchService.entities.Customer;
import com.turkcell.CustomerCreatedEvent;

public interface SearchService {
    void  add(Customer customer);
}
