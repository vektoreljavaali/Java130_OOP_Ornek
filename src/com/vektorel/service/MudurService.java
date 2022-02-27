package com.vektorel.service;

import com.vektorel.repository.MudurRepository;
import com.vektorel.repository.entity.Mudur;

import java.util.List;

public class MudurService {
    private MudurRepository repository;
    public MudurService(){
        repository = new MudurRepository();
    }
    public void save(Mudur mudur){
        repository.save(mudur);
    }
    public List<Mudur> findAll(){
        return repository.findAll();
    }
}
