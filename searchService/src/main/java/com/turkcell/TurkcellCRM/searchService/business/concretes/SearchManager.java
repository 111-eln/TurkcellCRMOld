package com.turkcell.TurkcellCRM.searchService.business.concretes;

import com.turkcell.TurkcellCRM.searchService.business.abstracts.SearchService;
import com.turkcell.TurkcellCRM.searchService.entities.Customer;
import com.turkcell.TurkcellCRM.searchService.repositories.SearchRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SearchManager implements SearchService {
    public SearchRepository searchRepository;

    @Override
    public void add(Customer customer) {
        searchRepository.save(customer);
    }
}
