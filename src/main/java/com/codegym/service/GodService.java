package com.codegym.service;

import com.codegym.model.Thing;

import java.util.List;

public interface GodService {
    List<Thing> findAll();
    Thing findById(Long id);
    void save(Thing thing);
    void removeById(Long id);
}
