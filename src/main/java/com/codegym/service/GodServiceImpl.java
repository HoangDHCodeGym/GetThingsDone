package com.codegym.service;

import com.codegym.model.Thing;
import com.codegym.repository.ThingRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class GodServiceImpl implements GodService {
    @Autowired
    private ThingRepository repository;
    @Override
    public List<Thing> findAll() {
        return repository.findAll();
    }

    @Override
    public Thing findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public void save(Thing thing) {
        repository.save(thing);
    }

    @Override
    public void removeById(Long id) {
        repository.removeById(id);
    }
}
