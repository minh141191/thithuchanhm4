package com.example.thithuchhanhm4.service.impl;

import com.example.thithuchhanhm4.model.Country;
import com.example.thithuchhanhm4.repository.ICountryRepository;
import com.example.thithuchhanhm4.service.ICountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService implements ICountryService<Country> {
    @Autowired
    private ICountryRepository countryRepository;
    @Override
    public List<Country> findAll() {
        return countryRepository.findAll();
    }
}
