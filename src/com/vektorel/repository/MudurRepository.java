package com.vektorel.repository;

import com.vektorel.repository.entity.Mudur;
import com.vektorel.utility.StaticValues;

import java.util.ArrayList;
import java.util.List;

/**
 * Repository Amacı Nedir?
 * Herhangi bir sınıf için, verilerin işlemesini yapar
 * ;Müdür sınıfı özelinde konuşur isek,
 * Müdür' ün bir yere kayıt edilmesi
 * Müdür' ün güncellenmesi, silinmesi
 * Müdür' ile ilgili aramaların yapılması
 * Sıralı bir şekilde müdür listesinin çekilmesi
 * işlemlerini burada yaparız.
 */
public class MudurRepository {

   /// Mudur[] mudurDizisi = new Mudur[50];
   //private List<Mudur> mudurListesi;

    /**
     * Constructor.
     * BestPractice
     */
   public MudurRepository(){
       //mudurListesi = new ArrayList<>();
   }

    /**
     * Müdür listesine eklemek için kullanılır.
     * @param mudur
     */
   public void save(Mudur mudur){
       StaticValues.mudurList.add(mudur);
   }
    /**
     * Müdürlistesine kullanıcıya döner
     * @return
     */
   public List<Mudur> findAll(){
       return StaticValues.mudurList;
   }

}
