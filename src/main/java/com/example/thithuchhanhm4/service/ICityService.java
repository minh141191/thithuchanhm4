package com.example.thithuchhanhm4.service;

import java.util.List;
import java.util.Optional;

public interface ICityService <T>{
    List<T> findAll();

    Optional<T> findById(Long id);

    void save(T t);

    void remove(Long id);
}
