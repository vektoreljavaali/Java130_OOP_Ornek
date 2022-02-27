package com.vektorel;

import com.vektorel.repository.MudurRepository;
import com.vektorel.repository.entity.Mudur;

public class Runner {
    public static void main(String[] args) {
        // 1. Müdür
        Mudur mudur = new Mudur();
        mudur.setAd("Cemal");
        mudur.setAdres("Ankara");
        mudur.setTelefon("0 555 666 7777");
        // 2. Müdür
        Mudur mudur2 = new Mudur();
        mudur2.setAd("Sevim");
        mudur2.setAdres("İzmir");
        mudur2.setTelefon("0 545 545 5455");

        Mudur mudur3 = new Mudur();
        mudur3.setAd("Sevim");
        mudur3.setAdres("İzmir");
        mudur3.setTelefon("0 545 545 5455");
        // Veri Tabanı
        MudurRepository dbMudur = new MudurRepository();
        MudurRepository dbMudur2 = new MudurRepository();
        dbMudur.save(mudur);
        dbMudur.save(mudur2);
        dbMudur.save(mudur3);


        /**
         * Müdür Listesini alıyorum (dbMudur.findAll())
         * Peki bu listede sıra ile ne vardır?? Müdür nesnesine
         */
        for(Mudur item: dbMudur.findAll() ){
            System.out.println("Id...: "+ item.getId());
            System.out.println("Id...: "+ item.getSirano());
            System.out.println("Ad...: "+ item.getAd());
            System.out.println("------------------------------");

        }




    }
}
