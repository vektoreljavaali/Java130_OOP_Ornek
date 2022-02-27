package com.vektorel.service;

import com.vektorel.repository.HizmetliRepository;
import com.vektorel.repository.entity.Hizmetli;

import java.util.List;

public class HizmetliService {

    private HizmetliRepository repository;

    public HizmetliService(){
        repository = new HizmetliRepository();
    }

    public void save(Hizmetli hizmetli){
        repository.save(hizmetli);
    }

    public List<Hizmetli> findAll(){
        return repository.findAll();
    }
}
