package com.vektorel.repository;

import com.vektorel.repository.entity.Muhendis;
import com.vektorel.utility.StaticValues;

import java.util.List;

public class MuhendisRepository {

    public void save(Muhendis muhendis){
        StaticValues.muhendisList.add(muhendis);
    }
    public List<Muhendis> findAll(){
        return StaticValues.muhendisList;
    }
}
