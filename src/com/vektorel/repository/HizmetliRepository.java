package com.vektorel.repository;

import com.vektorel.repository.entity.Hizmetli;
import com.vektorel.utility.StaticValues;

import java.util.List;

public class HizmetliRepository {
    public void save(Hizmetli hizmetli){
        StaticValues.hizmetliList.add(hizmetli);
    }
    public List<Hizmetli> findAll(){
        return StaticValues.hizmetliList;
    }
}
