package com.example.thithuchhanhm4.repository;

import com.example.thithuchhanhm4.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICountryRepository extends JpaRepository<Country, Long> {
}
