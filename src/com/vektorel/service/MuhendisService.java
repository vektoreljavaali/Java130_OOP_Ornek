package com.vektorel.service;

import com.vektorel.repository.MuhendisRepository;
import com.vektorel.repository.entity.Muhendis;

import java.util.List;

public class MuhendisService {
    private MuhendisRepository repository;
    public MuhendisService(){
        repository = new MuhendisRepository();
    }
    public void save(Muhendis muhendis){
        repository.save(muhendis);
    }
    public List<Muhendis> findAll(){
        return repository.findAll();
    }
}
